package Labirent;


import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;

public class GozlukluSirin extends Oyuncu {

    private BufferedImage gozlukluResim; 
    private boolean dogruMu;
    private int ilerlemeHizi;

    public GozlukluSirin() {
        try {
            this.gozlukluResim = ImageIO.read(new FileImageInputStream(new File("src\\IMG\\gozluklu.png")));
        } catch (IOException ex) {
            Logger.getLogger(GozlukluSirin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public GozlukluSirin(BufferedImage gozlukluResim, boolean dogruMu, int ilerlemeHizi) {
        this.gozlukluResim = gozlukluResim;
        this.dogruMu = dogruMu;
        this.ilerlemeHizi = ilerlemeHizi;
    }

    public GozlukluSirin(BufferedImage gozlukluResim, boolean dogruMu, int ilerlemeHizi, String OyuncuID, String OyuncuAdi, String OyuncuTur, int Skor, String ID, String Ad, String Tur, int x, int y) {
        super(OyuncuID, OyuncuAdi, OyuncuTur, Skor, ID, Ad, Tur, x, y);
        this.gozlukluResim = gozlukluResim;
        this.dogruMu = dogruMu;
        this.ilerlemeHizi = ilerlemeHizi;
    }

    @Override
    public String PuaniGoster() {
        return super.PuaniGoster(); //To change body of generated methods, choose Tools | Templates.
    }

    public BufferedImage getGozlukluResim() {
        return gozlukluResim;
    }

    public void setGozlukluResim(BufferedImage gozlukluResim) {
        this.gozlukluResim = gozlukluResim;
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
