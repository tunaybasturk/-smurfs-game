package Labirent;


public class Oyuncu extends Karakter {

    private String OyuncuID;
    private String OyuncuAdi;
    private String OyuncuTur;
    private int Skor = 20;

    public Oyuncu() {

    }

    public Oyuncu(String OyuncuID, String OyuncuAdi, String OyuncuTur, int Skor, String ID, String Ad, String Tur, int x, int y) {
        super(ID, Ad, Tur, x, y);
        this.OyuncuID = OyuncuID;
        this.OyuncuAdi = OyuncuAdi;
        this.OyuncuTur = OyuncuTur;
        this.Skor = Skor;
    }

    public String PuaniGoster() {
        return "OYUNCUNUN SKORU : " + this.Skor;
    }

    public String getOyuncuID() {
        return OyuncuID;
    }

    public void setOyuncuID(String OyuncuID) {
        this.OyuncuID = OyuncuID;
    }

    public String getOyuncuAdi() {
        return OyuncuAdi;
    }

    public void setOyuncuAdi(String OyuncuAdi) {
        this.OyuncuAdi = OyuncuAdi;
    }

    public String getOyuncuTur() {
        return OyuncuTur;
    }

    public void setOyuncuTur(String OyuncuTur) {
        this.OyuncuTur = OyuncuTur;
    }

    public int getSkor() {
        return Skor;
    }

    public void setSkor(int Skor) {
        this.Skor = Skor;
    }
    

}
