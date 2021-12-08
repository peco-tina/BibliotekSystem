
package src.biblioteksystem.MediaBibliotek;

/**
 *
 * @author nemanjagligorijevic
 */
public class Sena {
    
    private int id, MediaID;

    private String  LånaDatum, nästa_förfall, användarnamn;
    
    public Sena(int id, int MediaID, String användarnamn, String LånaDatum, String nästa_förfall)
    {
        this.id=id;
        this.MediaID=MediaID;
        this.användarnamn=användarnamn;
        this.LånaDatum=LånaDatum;
        this.nästa_förfall=nästa_förfall;
     
      
    }
    public int getid(){
        return id;   
    }
    public int getMId(){
        return MediaID;
    }

    public String getAnvändarnamn(){
        return användarnamn;
    }
    
    public String getDatum(){
        return LånaDatum;
    }
    
    public String getNF(){
        return nästa_förfall;
 
    }

}
