package Labirent;


import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.imageio.stream.ImageInputStream;


public class TembelSirin extends Oyuncu{
    private BufferedImage tembelResim;
    private boolean dogruMu;
    private int ilerlemeHizi;
    public TembelSirin()
  {
        try {
            this.tembelResim=ImageIO.read(new FileImageInputStream(new File("src\\IMG\\uykucu.png")));
        } catch (IOException ex) {
            Logger.getLogger(TembelSirin.class.getName()).log(Level.SEVERE, null, ex);
        }
  }

    @Override
    public String PuaniGoster() {
        return super.PuaniGoster(); //To change body of generated methods, choose Tools | Templates.
    }
   

    public TembelSirin(BufferedImage tembelResim, boolean dogruMu) {
        this.tembelResim = tembelResim;
        this.dogruMu = dogruMu;
    }
    
    public TembelSirin(BufferedImage tembelResim, boolean dogruMu, int ilerlemeHizi, String OyuncuID, String OyuncuAdi, String OyuncuTur, int Skor, String ID, String Ad, String Tur, int x, int y) {
        super(OyuncuID, OyuncuAdi, OyuncuTur, Skor, ID, Ad, Tur, x, y);
        this.tembelResim = tembelResim;
        this.dogruMu = dogruMu;
        this.ilerlemeHizi = ilerlemeHizi;
    }
    

    public BufferedImage getTembelResim() {
        return tembelResim;
    }

    public void setTembelResim(BufferedImage tembelResim) {
        this.tembelResim = tembelResim;
    }

    public boolean isDogruMu() {
        return dogruMu;
    }

    public void setDogruMu(boolean dogruMu) {
        this.dogruMu = dogruMu;
    }

    public int getIlerlemeHizi() {
        return ilerlemeHizi;
    }

    public void setIlerlemeHizi(int ilerlemeHizi) {
        this.ilerlemeHizi = ilerlemeHizi;
    }
    
    
    
}
