package Labirent;


public class Dusman extends Karakter{
    private String DusmanID;
    private String DusmanAdi;
    private String DusmanTur;
    public Dusman()
    {
        
    }

    public Dusman(String DusmanID, String DusmanAdi, String DusmanTur, String ID, String Ad, String Tur, int x, int y) {
        super(ID, Ad, Tur, x, y);
        this.DusmanID = DusmanID;
        this.DusmanAdi = DusmanAdi;
        this.DusmanTur = DusmanTur;
    }

    public String getDusmanID() {
        return DusmanID;
    }

    public void setDusmanID(String DusmanID) {
        this.DusmanID = DusmanID;
    }

    public String getDusmanAdi() {
        return DusmanAdi;
    }

    public void setDusmanAdi(String DusmanAdi) {
        this.DusmanAdi = DusmanAdi;
    }

    public String getDusmanTur() {
        return DusmanTur;
    }

    public void setDusmanTur(String DusmanTur) {
        this.DusmanTur = DusmanTur;
    }
    
    
    
}