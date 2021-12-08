
package src.biblioteksystem.JFrameBibliotek;

import src.biblioteksystem.JFrameBibliotek.Låna1;
//import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import src.biblioteksystem.AnvändareBibliotek.Användare;
import static src.biblioteksystem.JFrameBibliotek.LoggaIn.AnvändarNamn;
import src.biblioteksystem.MediaBibliotek.MediaBibliotek;
import src.biblioteksystem.databas.Databas;
import src.biblioteksystem.MediaBibliotek.MediaBibliotek;
import src.biblioteksystem.JFrameBibliotek.LoggaIn;
import static src.biblioteksystem.JFrameBibliotek.Låna1.LäggaTillDag;
import src.biblioteksystem.MediaBibliotek.Sena;

/**
 *
 * @author nemanjagligorijevic
 */
public class SqlKommandon {
Connection con=Databas.getConnection();
    public SqlKommandon() {
       
    }
   
    
    public void lämnaTillbaka(String id){
    String MediaID=id;


        
        PreparedStatement aa=null;

        
        try {
  
                        aa=con.prepareStatement("delete from utlanad WHERE MediaId="+id);
                        String query = "UPDATE media SET antal = antal + 1 where MediaId="+id; 
                        PreparedStatement pstmt2 = con.prepareStatement(query);                         
                            
                                int i=aa.executeUpdate();
                                if (i>0) {
                                    JOptionPane.showMessageDialog(null, "Vara inlämnad");
                                    pstmt2.executeUpdate();
		} else {
                                    JOptionPane.showMessageDialog(null, "Det gick inte att lämna tillbaka. var vänlig skanna igen");
                                }
                                }catch(Exception e){
                                    JOptionPane.showMessageDialog(null, e);
                                }   
        
        
  
    } 
    
    public ArrayList<MediaBibliotek> Lista(){
    ArrayList<MediaBibliotek> usersList = new ArrayList<>();

        try {
     
                        String query1="SELECT * FROM media";
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery(query1);
                        
                       MediaBibliotek media;
                       while (rs.next()){
                           media = new MediaBibliotek(rs.getInt("MediaID"), rs.getString("namn"), rs.getString("år"), rs.getString("genre"), rs.getString("författare") , rs.getInt("antal"));
                           usersList.add(media);
                       }     
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
        return usersList;
    
}
    
public void KundLoggaIn(String AnvändarNamn, String lösenordd){
       String namn = AnvändarNamn;
        
        PreparedStatement aa=null;
        
          String fieldAnvändarNamn = namn;
          String fieldLösenord = lösenordd;
        try {
                        aa=con.prepareStatement("SELECT * FROM anvandare WHERE namn = ? and losenord = ?");
                        aa.setString(1, namn);
                        aa.setString(2, lösenordd);
                        ResultSet rs = aa.executeQuery();
                         if(fieldAnvändarNamn.isEmpty()){
            JOptionPane.showMessageDialog(null, "Du måste skriva in ditt namn", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
                         if(fieldLösenord.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Du måste skriva in ditt lösenord", "Warning", JOptionPane.WARNING_MESSAGE);
            return;

        }
                        if (rs.next())
                        {
                           
                           AnvändarSida sida = new AnvändarSida(); 
                           sida.setVisible(true);
                        
                           
                        }else{
                            JOptionPane.showMessageDialog(null, "Fel användarnamn eller lösenord");
                        }
                         } catch(SQLException e){
                                    JOptionPane.showMessageDialog(null, e);                               
                         }
         JOptionPane.showMessageDialog(null, "Välkommen " + namn);
}

public void skapaNyttKonto(String namn, String lösenord, String email, String adress, String mobilnummer){
    PreparedStatement aa=null;
     try {
                        aa=con.prepareStatement("insert into anvandare(namn, losenord, email, adress, mobilnummer) values(?,?,?,?,?)");
                      
                                aa.setString(1, namn);
                                aa.setString(2, lösenord);
                                aa.setString(3, email);
                                aa.setString(4, adress);
                                aa.setString(5, mobilnummer);
          if(namn.isEmpty()){
            JOptionPane.showMessageDialog(null, "Du behöver skriva in ditt användarnamn", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
          if(lösenord.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Du behöver skriva in ditt lösenord", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
          }
                int i=aa.executeUpdate();
                                
                  
                                if (i>0) {
                                    JOptionPane.showMessageDialog(null, "Kontot har skapats.");          
		} else {
                                    JOptionPane.showMessageDialog(null, "Det gick inte att skapa konto");
                                }
                                }catch(Exception e){
                                   JOptionPane.showMessageDialog(null, "Det gick inte att skapa konto...........");
                                   JOptionPane.showMessageDialog(null, "Användarnamnet är upptage. Välj ett annat");
                                }
}

public ArrayList<Sena> mediaList(){
    ArrayList<Sena> mediaList = new ArrayList<>();

        try {
                        String query1="SELECT * FROM utlanad WHERE nästa_förfall <= CURDATE()-INTERVAL 1 DAY;";
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery(query1);
                        
                       Sena sena;
                       while (rs.next()){
                           sena=new Sena(rs.getInt("id"), rs.getInt("MediaID"), rs.getString("användarnamn"), rs.getString("LånaDatum"), rs.getString("nästa_förfall"));
                           mediaList.add(sena);
                           
                       }
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
        return mediaList;

    }

public ArrayList<Användare> användarLista(){
    ArrayList<Användare> användarLista = new ArrayList<>();

        try {
                        String query1="SELECT * FROM anvandare";
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery(query1);
                        
                       Användare an;
                       while (rs.next()){
                           an=new Användare(rs.getInt("id"), rs.getString("namn"), rs.getString("losenord"), rs.getString("adress"), rs.getString("email") , rs.getString("mobilnummer"));
                           användarLista.add(an);
                           
                       }
                               
        
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
        return användarLista;
}
public void uppdateraKonto(String AnvändarNamn, String lösenordd, String email, String adress, String mobilnummer, int rad, String värde){
    int rad1 = rad;
    String värde1 = värde;
    String namn = AnvändarNamn;
    String lösenord = lösenordd;
    String email1 = email;
    String adress1 = adress;
    String mobilnummer1 = mobilnummer;
try { 

                        String query = "UPDATE anvandare SET namn=?, losenord=?, email=?, adress=?, mobilnummer=? where id="+värde1; 
                        PreparedStatement aa = con.prepareStatement(query);
                      
                        aa.setString(1, namn);
                        aa.setString(2, lösenord);
                        aa.setString(3, email1);
                        aa.setString(4, adress1);
                        aa.setString(5, mobilnummer1);
                        aa.executeUpdate();

                        JOptionPane.showMessageDialog(null, "Du har uppdaterat ett konto.");
                     
                                }catch(Exception e){
                                    JOptionPane.showMessageDialog(null, e);
                                }    
    }     

public void taBort(String id){
    String idd = id;
PreparedStatement aa=null;

        try {
  
                        aa=con.prepareStatement("delete from anvandare where id= ? ");
                                
                                aa.setString(1, idd);

                                int i=aa.executeUpdate();
                        
                                if (i>0) {
                                    JOptionPane.showMessageDialog(null, "Konto togs bort");
                                            
		} else {
                                    JOptionPane.showMessageDialog(null, "Det gick inte att ta bort");
                                }
                                }catch(Exception e){
                                    JOptionPane.showMessageDialog(null, e);
                                }         

}

public void Låna(String antal, int rad, String värde, String MediaId, String användarnamn){
Låna1 ln = new Låna1();
ln.AktuellAnvändare();
        int radd = rad; 
        String antall = antal;
        String värdee = värde;
        String mediaid = MediaId;
        String namn = användarnamn;

        try {

                        String query = "UPDATE media SET antal = antal - 1 where antal>0 AND MediaId="+värde;
                        String query2 = "INSERT INTO utlanad (MediaId, användarnamn) values(?,?)";
                        PreparedStatement aa = con.prepareStatement(query);
                          aa.executeUpdate();
                        if (antall.equals("0")){
                            JOptionPane.showMessageDialog(null, "Tillfäligt slut");
                        } else {
                              JOptionPane.showMessageDialog(null, "Lyckats");
                        
                        PreparedStatement a = con.prepareStatement(query2);                      
                        a.setString(1, mediaid);
                        a.setString(2, namn); 
                        a.executeUpdate();
                        
                                 java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());
                                int dag =7;
                                
                                java.sql.Date futureDate = this.LäggaTillDag(sqlDate, dag);
                         JOptionPane.showMessageDialog(null,
                        "MediaId:  "+mediaid+"\n"+"Retur datum:  "+(futureDate),"Kvitto", JOptionPane.INFORMATION_MESSAGE);
                                 
                        }

                                }catch(Exception e){
                                    JOptionPane.showMessageDialog(null, e);
                                }
}

   public static Date LäggaTillDag(Date date, int days) {
        Calendar k = Calendar.getInstance();
        k.setTime(date);
        k.add(Calendar.DATE, days);
        return new Date(k.getTimeInMillis());
   }
 public void läggaTillMedia(String namn, String år, String genre, String författare){
     String namnn = namn;
     String årr = år;
     String genree = genre;
     String författaree = författare; 
             PreparedStatement aa=null;
        
        
        try {

                        aa=con.prepareStatement("insert into media(namn,år,genre,författare,antal) values(?,?,?,?,+1)");
                                
                                aa.setString(1, namnn);
                                aa.setString(2, årr);
                                aa.setString(3, genree);
                                aa.setString(4, författaree);
                            
                                int i=aa.executeUpdate();
                                if (i>0) {
                                    JOptionPane.showMessageDialog(null, "En media har lagts till");
                                            
		} else {
                                    JOptionPane.showMessageDialog(null, "Det gick inte att lägga till en media");
                                }
                                }catch(Exception e){
                                    JOptionPane.showMessageDialog(null, e);
                                }       
                                
    }                                
public void uppdateraMedia(String namnn, String årr, String genree, String författaree,String antall, int rad, String värde){
    String namn = namnn;
    String år = årr;
    String genre = genree;
    String författare = författaree; 
    String antal = antall;
    int radd = rad; 
    String värdee = värde;
    try {


                        String query = "UPDATE media SET namn=?, år=?, genre=?, författare=?, antal=? where MediaId="+värdee; 
                        PreparedStatement aa = con.prepareStatement(query);
                      
                        aa.setString(1, namn);
                        aa.setString(2, år);
                        aa.setString(3, genre);
                        aa.setString(4, författare);
                        aa.setString(5, antal);
                        aa.executeUpdate();
                        
                        
                        JOptionPane.showMessageDialog(null, "Du har uppdaterat en media.");
                     
                                }catch(Exception e){
                                    JOptionPane.showMessageDialog(null, e);
                                }

    }

public void taBortMedia(String id){
    String idd = id;
    PreparedStatement aa=null;     
        
        try {
  
                        aa=con.prepareStatement("delete from media where MediaId = ? ");
                                
                                aa.setString(1, idd);

                                int i=aa.executeUpdate();
                                 
                        
                                if (i>0) {
                                    JOptionPane.showMessageDialog(null, "Media har tagits bort");
                                            
		} else {
                                    JOptionPane.showMessageDialog(null, "Det gick inte ta bort median");
                                }
                                }catch(Exception e){
                                    JOptionPane.showMessageDialog(null, e);
                                }         

}
}
