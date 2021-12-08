package src.biblioteksystem.AnvändareBibliotek;

public class Användare {
     private int id;
    private String  namn, lösenord, email, adress, mobilnummer;
    
    public Användare(int id, String namn, String lösenord, String email, String adress, String mobilnummer)
    {
        this.id=id;
        this.namn=namn;
        this.lösenord=lösenord;
        this.email=email;
        this.adress=adress;
        this.mobilnummer=mobilnummer;
    }
    public int getid(){
        return id;   
    }
    public String getnamn(){
        return namn;
    }

    public String getlösenord(){
        return lösenord;
    }
    
    public String getemail(){
        return email;
    }
    
    public String getadress(){
        return adress;
    }
     public String getmobilnummer(){
        return mobilnummer;
    }
    
    
}

