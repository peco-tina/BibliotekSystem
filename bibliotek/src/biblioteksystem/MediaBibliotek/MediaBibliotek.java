
package src.biblioteksystem.MediaBibliotek;

/**
 *
 * @author nemanjagligorijevic
 */
public class MediaBibliotek {

    private int MediaID;
    private int antal;
    private String  namn, år, genre, författare;

    public MediaBibliotek(int MediaID, String namn, String år, String genre, String författare, int antal)
    {
        this.MediaID=MediaID;
        this.antal=antal;
        this.namn=namn;
        this.år=år;
        this.genre=genre;
        this.författare=författare;
      
    }
    public int getMId(){
        return MediaID;   
    }
    public String getNamn(){
        return namn;
    }

    public String getÅr(){
        return år;
    }
    
    public String getgenre(){
        return genre;
    }
    
    public String getFörfattare(){
        return författare;
 
    }
       public int getAntal(){
        return antal;   
    
    
}
}
