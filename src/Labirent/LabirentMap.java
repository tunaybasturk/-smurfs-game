package Labirent;

import static Labirent.Graf.lab;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import jdk.nashorn.internal.ir.BreakNode;
import jdk.nashorn.internal.parser.TokenType;

public class LabirentMap extends JPanel implements ActionListener, KeyListener {

    Lokasyon1 lokasyon1 = new Lokasyon1();
    public int oyuncux = lokasyon1.getX(), oyuncuy = lokasyon1.getY();
    public int azmanx = lokasyon1.getAzmanx(), azmany = lokasyon1.getAzmany();
    public int gargamelx = lokasyon1.getGargamelx(), gargamely = lokasyon1.getGargamely();
    private int sirinex = 13, siriney = 7;
    private int oyuncuHareketW = 80;
    private int oyuncuHareketA = 90;
    private int oyuncuHareketS = 80;
    private int oyuncuHareketD = 90;
    Timer timer = new Timer(5, this);
    TembelSirin tembelSirin = new TembelSirin();
    GozlukluSirin gozlukluSirin = new GozlukluSirin();
    secimEkrani1 secEkrani1 = new secimEkrani1();
    Altin altin = new Altin(5);
    private int[][] matrisAltin = new int[5][5];
    Mantar mantar = new Mantar(1);
    private int[][] matrisMantar = new int[2][2];
    private int sayac = 0, sayac1 = 0, sayac2 = 0, sayac3 = 0, sayac4 = 0, sayac5 = 0, sayac6 = 0, sayac7 = 0, sayac8 = 0, mantarSayac = 0, mantarSayac1 = 0, mantarSayac2 = 0, mantarSayac3 = 0;
    Zaman zaman = new Zaman();
    Zaman zaman1 = new Zaman();
    JLabel skorLabel = new JLabel();
    Azman azman = new Azman(azmanx, azmany);
    Gargamel gargamel = new Gargamel(gargamelx, gargamely);
    int x;
    int y;
    int gargamelyeri;

    Karakter karakter = new Karakter();

    public JLabel labelgosteren() {
        skorLabel.setFont(new java.awt.Font("Tahoma", 0, 22));
        skorLabel.setBounds(15, 15, 275, 50);
        skorLabel.setVisible(true);
        return skorLabel;
    }
    private BufferedImage image, sirine, altinResim, mantarResim, aKapisi, bKapisi, cKapisi, dKapisi, gargamelImage, azmanImage;

    private int[][] labirent = new int[11][13];

    public LabirentMap() throws FileNotFoundException {

        try {
            this.image = ImageIO.read(new FileImageInputStream(new File("src\\IMG\\uykucu.png")));
        } catch (IOException ex) {
            Logger.getLogger(LabirentMap.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            this.sirine = ImageIO.read(new FileImageInputStream(new File("src\\IMG\\sirine.png")));
        } catch (IOException ex) {
            Logger.getLogger(LabirentMap.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            this.altinResim = ImageIO.read(new FileImageInputStream(new File("src\\IMG\\gold.png")));
        } catch (IOException ex) {
            Logger.getLogger(LabirentMap.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            this.mantarResim = ImageIO.read(new FileImageInputStream(new File("src\\IMG\\mantar.png")));
        } catch (IOException ex) {
            Logger.getLogger(LabirentMap.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            this.aKapisi = ImageIO.read(new FileImageInputStream(new File("src\\IMG\\A.png")));

        } catch (IOException ex) {
            Logger.getLogger(LabirentMap.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            this.bKapisi = ImageIO.read(new FileImageInputStream(new File("src\\IMG\\B.png")));

        } catch (IOException ex) {
            Logger.getLogger(LabirentMap.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            this.cKapisi = ImageIO.read(new FileImageInputStream(new File("src\\IMG\\C.png")));

        } catch (IOException ex) {
            Logger.getLogger(LabirentMap.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            this.dKapisi = ImageIO.read(new FileImageInputStream(new File("src\\IMG\\D.png")));

        } catch (IOException ex) {
            Logger.getLogger(LabirentMap.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            this.gargamelImage = ImageIO.read(new FileImageInputStream(new File("src\\IMG\\gargamel.png")));
        } catch (IOException ex) {
            Logger.getLogger(LabirentMap.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            this.azmanImage = ImageIO.read(new FileImageInputStream(new File("src\\IMG\\azman.png")));
        } catch (IOException ex) {
            Logger.getLogger(LabirentMap.class.getName()).log(Level.SEVERE, null, ex);
        }
        timer.start();
        try {

            int k = 0;
            int satırsayısı = 0;
            FileReader fileReader = new FileReader("src\\IMG\\Labirent.txt");
            String line;
            Scanner br = new Scanner(fileReader);

            br = new Scanner(new FileReader("src\\IMG\\Labirent.txt"));

            for (int i = 0; i < 2; i++) {
                line = br.nextLine();

            }
            for (int i = 0; i < 11; i++) {
                for (int j = 0; j < 13; j++) {
                    labirent[i][j] = br.nextInt();
                }
            }
            br.close();
            for (int i = 0; i < 11; i++) {
                for (int j = 0; j < 13; j++) {
                    //    System.out.print(lab[i][j] + " ");
                }
                //    System.out.println("");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public int[][] AltınBul() {
        ArrayList<Integer> altınınx = new ArrayList<>();
        ArrayList<Integer> altınıny = new ArrayList<>();
        for (int i = 0; i < labirent.length; i++) {
            for (int j = 0; j < labirent[0].length; j++) {
                if (labirent[i][j] != 0) {
                    if (i == 0 && j == 3) {

                    } else if (i == 0 && j == 10) {

                    } else if (i == 5 && j == 0) {

                    } else if (i == 10 && j == 3) {

                    } else if (i == 7 && j == 12) {

                    } else if (i == oyuncuy && j == oyuncux) {

                    } else {
                        altınınx.add(j);
                        altınıny.add(i);
                    }

                }
            }

        }
        int[][] altınyeri = new int[5][5];
        for (int i = 0; i < 5; i++) {
            Random random = new Random();
            int x = random.nextInt(altınınx.size());
            altınyeri[i][0] = altınınx.get(x);
            altınyeri[i][1] = altınıny.get(x);
        }
        return altınyeri;

    }

    public int[][] mantarBul() {
        ArrayList<Integer> mantarınx = new ArrayList<>();
        ArrayList<Integer> mantarıny = new ArrayList<>();
        for (int i = 0; i < labirent.length; i++) {
            for (int j = 0; j < labirent[0].length; j++) {
                if (labirent[i][j] != 0) {
                    if (i == 0 && j == 3) {

                    } else if (i == 0 && j == 10) {

                    } else if (i == 5 && j == 0) {

                    } else if (i == 10 && j == 3) {

                    } else if (i == 7 && j == 12) {

                    } else if (i == oyuncuy && j == oyuncux) {

                    } else {
                        mantarınx.add(j);
                        mantarıny.add(i);
                    }

                }
            }

        }
        int[][] mantaryeri = new int[2][2];
        for (int i = 0; i < 1; i++) {
            Random random = new Random();
            int x = random.nextInt(mantarınx.size());
            mantaryeri[i][0] = mantarınx.get(x);
            mantaryeri[i][1] = mantarıny.get(x);
        }

        return mantaryeri;

    }

    ArrayList<Integer> azmanyolu = new ArrayList<>();
    ArrayList<Integer> gargamelyolu = new ArrayList<>();

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        labelgosteren();
        g.translate(350, 65);
        for (int i = 0; i < labirent.length; i++) {
            Color color;
            for (int j = 0; j < labirent[0].length; j++) {
                switch (labirent[i][j]) {
                    case 0:
                        g.setColor(Color.BLACK);
                        break;
                    case 1:
                        g.setColor(Color.WHITE);
                        break;
                    default:
                        g.setColor(Color.BLUE);
                        break;
                }
                if (i == 0 && j == 3) {
                    g.setColor(Color.CYAN);

                }
                if (i == 0 && j == 10) {
                    g.setColor(Color.CYAN);
                }
                if (i == 5 && j == 0) {
                    g.setColor(Color.CYAN);
                }
                if (i == 10 && j == 3) {
                    g.setColor(Color.CYAN);
                }
                if (i == 7 && j == 12) {
                    g.setColor(Color.CYAN);
                }
                g.fillRect(j * 90, i * 80, 90, 80);
                g.setColor(Color.BLACK);
                g.drawRect(j * 90, i * 80, 90, 80);
                if (i == 0 && j == 3) {
                    g.drawImage(aKapisi, j * 90, i * 80, 90, 80, this);
                }
                if (i == 0 && j == 10) {
                    g.drawImage(bKapisi, j * 90, i * 80, 90, 80, this);
                }
                if (i == 5 && j == 0) {
                    g.drawImage(cKapisi, j * 90, i * 80, 90, 80, this);
                }
                if (i == 10 && j == 3) {
                    g.drawImage(dKapisi, j * 90, i * 80, 90, 80, this);
                }
            }
        }

        x = (oyuncuy - 1) * 11 + (oyuncux - 1);

        if (azman.getX() == 0 && azman.getY() == 5) {
            y = 101;

        } else if (azman.getX() == 3 && azman.getY() == 0) {
            y = 99;

        } else if (azman.getX() == 10 && azman.getY() == 0) {
            y = 100;

        } else if (azman.getX() == 3 && azman.getY() == 10) {
            y = 102;

        } else if (azman.getX() == 12 && azman.getY() == 7) {
            y = 103;

        } else {
            if (azman.getX() > 0 && azman.getY() > 0) {
                y = (azman.getX() - 1) * 11 + (azman.getY() - 1);
            }

        }

        if (gargamel.getX() == 0 && gargamel.getY() == 5) {
            gargamelyeri = 101;

        } else if (gargamel.getX() == 3 && gargamel.getY() == 0) {
            gargamelyeri = 99;
        } else if (gargamel.getX() == 10 && gargamel.getY() == 0) {
            gargamelyeri = 100;

        } else if (gargamel.getX() == 3 && gargamel.getY() == 10) {
            gargamelyeri = 102;

        } else if (gargamel.getX() == 12 && gargamel.getY() == 7) {
            gargamelyeri = 103;

        } else {
            if (gargamel.getX() > 0 && gargamel.getY() > 0) {
                gargamelyeri = (gargamel.getX() - 1) * 11 + (gargamel.getY() - 1);
            }

        }

        g.setColor(Color.CYAN);
        g.fillRect(azman.getX() * 90, azman.getY() * 80 * 80, 90, 80);

        azmanyolu = Karakter.KisaYol(Graf.baglama(), Karakter.EnkisaYol(Graf.baglama(), y), y, x);
        gargamelyolu = Karakter.KisaYol(Graf.baglama(), Karakter.EnkisaYol(Graf.baglama(), gargamelyeri), gargamelyeri, x);

        for (int i = 0; i < azmanyolu.size(); i++) {
            g.setColor(Color.YELLOW);
            g.fillRect(((azmanyolu.get(i) % 11) + 1) * 90, ((azmanyolu.get(i) / 11) + 1) * 80, 90, 80);
        }
        for (int i = 0; i < gargamelyolu.size(); i++) {
            g.setColor(Color.BLUE);
            g.fillRect(((gargamelyolu.get(i) % 11) + 1) * 90, ((gargamelyolu.get(i) / 11) + 1) * 80, 90, 80);
        }
        if (y == 99) {
            g.drawImage(azmanImage, azman.getX() * 90, azman.getY() * 80, 90, 80, this);
        } else if (y == 100) {
            g.drawImage(azmanImage, azman.getX() * 90, azman.getY() * 80, 90, 80, this);
        } else if (y == 101) {
            g.drawImage(azmanImage, azman.getX() * 90, azman.getY() * 80, 90, 80, this);
        } else if (y == 102) {
            g.drawImage(azmanImage, azman.getX() * 90, azman.getY() * 80, 90, 80, this);
        } else {
            g.drawImage(azmanImage, azman.getY() * 90, azman.getX() * 80, 90, 80, this);
        }
        if (gargamelyeri == 99) {
            g.drawImage(gargamelImage, gargamel.getX() * 90, gargamel.getY() * 80, 90, 80, this);
        } else if (gargamelyeri == 100) {
            g.drawImage(gargamelImage, gargamel.getX() * 90, gargamel.getY() * 80, 90, 80, this);

        } else if (gargamelyeri == 101) {
            g.drawImage(gargamelImage, gargamel.getX() * 90, gargamel.getY() * 80, 90, 80, this);

        } else if (gargamelyeri == 102) {
            g.drawImage(gargamelImage, gargamel.getX() * 90, gargamel.getY() * 80, 90, 80, this);

        } else {
            g.drawImage(gargamelImage, gargamel.getY() * 90, gargamel.getX() * 80, 90, 80, this);

        }
        //  dijikstra();
        if (secEkrani1.getOzellik() == 0) {
            g.drawImage(tembelSirin.getTembelResim(), oyuncux * 90, oyuncuy * 80, 90, 80, this);

        }
        if (secEkrani1.getOzellik() == 1) {

            g.drawImage(gozlukluSirin.getGozlukluResim(), oyuncux * 90, oyuncuy * 80, 90, 80, this);
        }

        g.drawImage(sirine, sirinex * 90, siriney * 80, 90, 80, this);

        // altinCiz(g);
        if (mantarSayac == 0) {
            zaman1.start();
            mantarSayac++;

        }
        if (mantarSayac1 == 0) {
            matrisMantar = mantarBul();
        }
        if ((zaman.saniye % 10 >= 2 && zaman.saniye % 10 <= 9)) {

            //MANTAR
            if (matrisMantar[0][0] == oyuncux && matrisMantar[0][1] == oyuncuy && mantarSayac2 == 0 && secEkrani1.getOzellik() == 0) {
                mantarSayac2 = 1;

                tembelSirin.setSkor(tembelSirin.getSkor() + 50);
                skorLabel.setText(tembelSirin.PuaniGoster());
            }
            if (matrisMantar[0][0] == oyuncux && matrisMantar[0][1] == oyuncuy && mantarSayac2 == 0 && secEkrani1.getOzellik() == 1) {
                mantarSayac2 = 1;

                gozlukluSirin.setSkor(gozlukluSirin.getSkor() + 50);
                skorLabel.setText(gozlukluSirin.PuaniGoster());
            }
            if (mantarSayac2 == 0) {
                g.drawImage(mantarResim, matrisMantar[0][0] * 90, matrisMantar[0][1] * 80, 90, 80, this);
            }

            mantarSayac1 = 1;

        } else {
            mantarSayac1 = 0;
            mantarSayac2 = 0;
        }
        if (sayac == 0) {
            zaman.start();
            sayac++;

        }
        if (sayac2 == 0) { 
            matrisAltin = AltınBul();
        }
        if ((zaman.saniye % 10 >= 4 && zaman.saniye % 10 <= 9)) {

            //MANTAR
            if (matrisAltin[4][0] == oyuncux && matrisAltin[4][1] == oyuncuy && sayac1 == 0 && secEkrani1.getOzellik() == 0) {
                sayac1 = 1;
                tembelSirin.setSkor(tembelSirin.getSkor() + 5);
                skorLabel.setText(tembelSirin.PuaniGoster());

            }
            if (matrisAltin[4][0] == oyuncux && matrisAltin[4][1] == oyuncuy && sayac1 == 0  && secEkrani1.getOzellik() == 1) {
                sayac1 = 1;
                gozlukluSirin.setSkor(gozlukluSirin.getSkor() + 5);
                skorLabel.setText(gozlukluSirin.PuaniGoster());

            }
            if (sayac1 == 0) {
                g.drawImage(altinResim, matrisAltin[4][0] * 90, matrisAltin[4][1] * 80, 90, 80, this);
            }

            sayac2 = 1;

            if (matrisAltin[3][0] == oyuncux && matrisAltin[3][1] == oyuncuy && sayac3 == 0 && secEkrani1.getOzellik() == 0) {
                sayac3 = 1;
                tembelSirin.setSkor(tembelSirin.getSkor() + 5);
                skorLabel.setText(tembelSirin.PuaniGoster());

            }
            if (matrisAltin[3][0] == oyuncux && matrisAltin[3][1] == oyuncuy && sayac3 == 0 && secEkrani1.getOzellik() == 1) {
                sayac3 = 1;
                gozlukluSirin.setSkor(gozlukluSirin.getSkor() + 5);
                skorLabel.setText(gozlukluSirin.PuaniGoster());

            }
            if (sayac3 == 0) {
                g.drawImage(altinResim, matrisAltin[3][0] * 90, matrisAltin[3][1] * 80, 90, 80, this);
            }

            sayac2 = 1;

            if (matrisAltin[2][0] == oyuncux && matrisAltin[2][1] == oyuncuy && sayac4 == 0 && secEkrani1.getOzellik() == 0) {
                sayac4 = 1;
                tembelSirin.setSkor(tembelSirin.getSkor() + 5);
                skorLabel.setText(tembelSirin.PuaniGoster());

            }
            if (matrisAltin[2][0] == oyuncux && matrisAltin[2][1] == oyuncuy && sayac4 == 0 && secEkrani1.getOzellik() == 1) {
                sayac4 = 1;
                gozlukluSirin.setSkor(gozlukluSirin.getSkor() + 5);
                skorLabel.setText(gozlukluSirin.PuaniGoster());

            }
            if (sayac4 == 0) {
                g.drawImage(altinResim, matrisAltin[2][0] * 90, matrisAltin[2][1] * 80, 90, 80, this);
            }

            sayac2 = 1;

            if (matrisAltin[1][0] == oyuncux && matrisAltin[1][1] == oyuncuy && sayac5 == 0 && secEkrani1.getOzellik() == 0) {
                sayac5 = 1;
                tembelSirin.setSkor(tembelSirin.getSkor() + 5);
                skorLabel.setText(tembelSirin.PuaniGoster());

            }
            if (matrisAltin[1][0] == oyuncux && matrisAltin[1][1] == oyuncuy && sayac5 == 0 && secEkrani1.getOzellik() == 1) {
                sayac5 = 1;
                gozlukluSirin.setSkor(gozlukluSirin.getSkor() + 5);
                skorLabel.setText(gozlukluSirin.PuaniGoster());

            }
            if (sayac5 == 0) {
                g.drawImage(altinResim, matrisAltin[1][0] * 90, matrisAltin[1][1] * 80, 90, 80, this);
            }

            sayac2 = 1;

            if (matrisAltin[0][0] == oyuncux && matrisAltin[0][1] == oyuncuy && sayac6 == 0 && secEkrani1.getOzellik() == 0) {
                sayac6 = 1;
                tembelSirin.setSkor(tembelSirin.getSkor() + 5);
                skorLabel.setText(tembelSirin.PuaniGoster());

            }
            if (matrisAltin[0][0] == oyuncux && matrisAltin[0][1] == oyuncuy && sayac6 == 0 && secEkrani1.getOzellik() == 1) {
                sayac6 = 1;
                gozlukluSirin.setSkor(gozlukluSirin.getSkor() + 5);
                skorLabel.setText(gozlukluSirin.PuaniGoster());

            }
            if (sayac6 == 0) {
                g.drawImage(altinResim, matrisAltin[0][0] * 90, matrisAltin[0][1] * 80, 90, 80, this);
            }

            sayac2 = 1;

        } else {
            sayac2 = 0;
            sayac1 = 0;
            sayac3 = 0;
            sayac4 = 0;
            sayac5 = 0;
            sayac6 = 0;
        }
        g.setColor(Color.BLACK);
        g.fillRect(1 * 90, 10 * 80, 90, 80);
        g.fillRect(2 * 90, 10 * 80, 90, 80);
        g.fillRect(4 * 90, 10 * 80, 90, 80);
    }

    public void ekrangoster() {
        if (tembelSirin.getSkor() <= 0) {
            Kaybetme kaybetme = new Kaybetme();
            kaybetme.setVisible(true);
            Main main = new Main();
            main.dispose();

        }
        if (gozlukluSirin.getSkor() <= 0) {
            Kaybetme kaybetme = new Kaybetme();
            kaybetme.setVisible(true);
            Main main = new Main();
            main.dispose();
        }
        if (oyuncux == 12 && oyuncuy == 7 && gozlukluSirin.getSkor() > 0 && secEkrani1.getOzellik() == 1) {

            BitisEkrani bitisEkrani = new BitisEkrani(gozlukluSirin.getSkor());
            bitisEkrani.setVisible(true);
            Main main = new Main();
            main.dispose();
        }
        if (oyuncux == 12 && oyuncuy == 7 && tembelSirin.getSkor() > 0 && secEkrani1.getOzellik() == 0) {

            BitisEkrani bitisEkrani = new BitisEkrani(tembelSirin.getSkor());
            bitisEkrani.setVisible(true);
            Main main = new Main();
            main.dispose();
        }
    }

    @Override
    public void repaint() {
        super.repaint();

    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int c = e.getKeyCode();
        if (secEkrani1.getOzellik() == 0) {
            if (c == KeyEvent.VK_W) {
                if (oyuncuy <= 0) {
                    oyuncuy = 0;
                }
                if (labirent[oyuncuy - 1][oyuncux] != 0) {

                    oyuncuy--;
                    gargamelyolu = Karakter.KisaYol(Graf.baglama(), Karakter.EnkisaYol(Graf.baglama(), gargamelyeri), gargamelyeri, (oyuncuy - 1) * 11 + (oyuncux - 1));
                    azmanyolu = Karakter.KisaYol(Graf.baglama(), Karakter.EnkisaYol(Graf.baglama(), y), y, (oyuncuy - 1) * 11 + (oyuncux - 1));
                    if (azmanyolu.size() > 1) {
                        azman.setX((azmanyolu.get(1) / 11) + 1);
                        azman.setY((azmanyolu.get(1) % 11) + 1);
                    }
                    if (gargamelyolu.size() >= 2) {
                        gargamel.setX((gargamelyolu.get(2) / 11) + 1);
                        gargamel.setY((gargamelyolu.get(2) % 11) + 1);
                    }

                    if (oyuncux == gargamel.getY() && oyuncuy == gargamel.getX()) {
                        gargamel.setX(gargamelx);
                        gargamel.setY(gargamely);
                        tembelSirin.setSkor(tembelSirin.getSkor() - 15);
                        skorLabel.setText(tembelSirin.PuaniGoster());
                    }
                    if (oyuncux == azman.getY() && oyuncuy == azman.getX()) {
                        azman.setX(azmanx);
                        azman.setY(azmany);
                        tembelSirin.setSkor(tembelSirin.getSkor() - 5);
                        skorLabel.setText(tembelSirin.PuaniGoster());
                    }

                    ekrangoster();

                }

            } else if (labirent[oyuncuy - 1][oyuncux] == 0) {
                oyuncuy = oyuncuy;

            }
            if (oyuncuy <= 0) {
                oyuncuy = 0;
            }

            if (c == KeyEvent.VK_A) {

                if (oyuncux <= 0) {
                    oyuncux = 0;
                } else {
                    if (labirent[oyuncuy][oyuncux - 1] != 0) {

                        oyuncux--;
                        gargamelyolu = Karakter.KisaYol(Graf.baglama(), Karakter.EnkisaYol(Graf.baglama(), gargamelyeri), gargamelyeri, (oyuncuy - 1) * 11 + (oyuncux - 1));
                        azmanyolu = Karakter.KisaYol(Graf.baglama(), Karakter.EnkisaYol(Graf.baglama(), y), y, (oyuncuy - 1) * 11 + (oyuncux - 1));
                        if (azmanyolu.size() > 1) {
                            azman.setX((azmanyolu.get(1) / 11) + 1);
                            azman.setY((azmanyolu.get(1) % 11) + 1);
                        }
                        if (gargamelyolu.size() >= 2) {
                            gargamel.setX((gargamelyolu.get(2) / 11) + 1);
                            gargamel.setY((gargamelyolu.get(2) % 11) + 1);
                        }

                        if (oyuncux == gargamel.getY() && oyuncuy == gargamel.getX()) {
                            gargamel.setX(gargamelx);
                            gargamel.setY(gargamely);
                            tembelSirin.setSkor(tembelSirin.getSkor() - 15);
                            skorLabel.setText(tembelSirin.PuaniGoster());

                        }
                        if (oyuncux == azman.getY() && oyuncuy == azman.getX()) {
                            azman.setX(azmanx);
                            azman.setY(azmany);
                            tembelSirin.setSkor(tembelSirin.getSkor() - 5);
                            skorLabel.setText(tembelSirin.PuaniGoster());
                        }

                        ekrangoster();
                    }
                    if (labirent[oyuncuy][oyuncux - 1] == 0) {
                        oyuncux = oyuncux;
                    }
                    if (oyuncux <= 0) {
                        oyuncux = 0;
                    }
                }
            }

            if (c == KeyEvent.VK_S) {

                if (oyuncuy >= 10) {
                    oyuncuy = 10;
                } else {
                    if (labirent[oyuncuy + 1][oyuncux] != 0) {

                        oyuncuy++;
                        gargamelyolu = Karakter.KisaYol(Graf.baglama(), Karakter.EnkisaYol(Graf.baglama(), gargamelyeri), gargamelyeri, (oyuncuy - 1) * 11 + (oyuncux - 1));
                        azmanyolu = Karakter.KisaYol(Graf.baglama(), Karakter.EnkisaYol(Graf.baglama(), y), y, (oyuncuy - 1) * 11 + (oyuncux - 1));
                        if (azmanyolu.size() > 1) {
                            azman.setX((azmanyolu.get(1) / 11) + 1);
                            azman.setY((azmanyolu.get(1) % 11) + 1);
                        }
                        if (gargamelyolu.size() >= 2) {
                            gargamel.setX((gargamelyolu.get(2) / 11) + 1);
                            gargamel.setY((gargamelyolu.get(2) % 11) + 1);
                        }

                        if (oyuncux == gargamel.getY() && oyuncuy == gargamel.getX()) {
                            gargamel.setX(gargamelx);
                            gargamel.setY(gargamely);
                            tembelSirin.setSkor(tembelSirin.getSkor() - 15);
                            skorLabel.setText(tembelSirin.PuaniGoster());

                        }
                        if (oyuncux == azman.getY() && oyuncuy == azman.getX()) {
                            azman.setX(azmanx);
                            azman.setY(azmany);
                            tembelSirin.setSkor(tembelSirin.getSkor() - 5);
                            skorLabel.setText(tembelSirin.PuaniGoster());
                        }

                        ekrangoster();

                    } else if (labirent[oyuncuy + 1][oyuncux] == 0) {
                        oyuncuy = oyuncuy;
                    }

                    if (oyuncuy >= 10) {
                        oyuncuy = 10;
                    }
                }
            }

            if (c == KeyEvent.VK_D) {

                if (oyuncux >= 12) {
                    oyuncux = 12;
                }
                if (labirent[oyuncuy][oyuncux + 1] != 0) {
                    oyuncux++;

                    gargamelyolu = Karakter.KisaYol(Graf.baglama(), Karakter.EnkisaYol(Graf.baglama(), gargamelyeri), gargamelyeri, (oyuncuy - 1) * 11 + (oyuncux - 1));
                    azmanyolu = Karakter.KisaYol(Graf.baglama(), Karakter.EnkisaYol(Graf.baglama(), y), y, (oyuncuy - 1) * 11 + (oyuncux - 1));
                    if (azmanyolu.size() > 1) {
                        azman.setX((azmanyolu.get(1) / 11) + 1);
                        azman.setY((azmanyolu.get(1) % 11) + 1);
                    }

                    if (gargamelyolu.size() >= 2) {
                        gargamel.setX((gargamelyolu.get(2) / 11) + 1);
                        gargamel.setY((gargamelyolu.get(2) % 11) + 1);
                    }

                    if (oyuncux == gargamel.getY() && oyuncuy == gargamel.getX()) {
                        gargamel.setX(gargamelx);
                        gargamel.setY(gargamely);
                        tembelSirin.setSkor(tembelSirin.getSkor() - 15);
                        skorLabel.setText(tembelSirin.PuaniGoster());

                    }
                    if (oyuncux == azman.getY() && oyuncuy == azman.getX()) {
                        azman.setX(azmanx);
                        azman.setY(azmany);
                        tembelSirin.setSkor(tembelSirin.getSkor() - 5);
                        skorLabel.setText(tembelSirin.PuaniGoster());
                    }

                    ekrangoster();

                }
                if (oyuncux != 12 && oyuncuy != 7) {
                    if (labirent[oyuncuy][oyuncux + 1] == 0) {
                        oyuncux = oyuncux;
                    }
                }

                if (oyuncux >= 12) {
                    oyuncux = 12;
                }
            }
        }

        if (secEkrani1.getOzellik() == 1) {
            if (c == KeyEvent.VK_W) {

                if (oyuncuy <= 0) {
                    oyuncuy = 0;
                }
                if (labirent[oyuncuy - 1][oyuncux] != 0 && labirent[oyuncuy - 2][oyuncux] != 0) {

                    oyuncuy -= 2;
                    gargamelyolu = Karakter.KisaYol(Graf.baglama(), Karakter.EnkisaYol(Graf.baglama(), gargamelyeri), gargamelyeri, (oyuncuy - 1) * 11 + (oyuncux - 1));
                    azmanyolu = Karakter.KisaYol(Graf.baglama(), Karakter.EnkisaYol(Graf.baglama(), y), y, (oyuncuy - 1) * 11 + (oyuncux - 1));
                    if (azmanyolu.size() > 1) {
                        azman.setX((azmanyolu.get(1) / 11) + 1);
                        azman.setY((azmanyolu.get(1) % 11) + 1);
                    }
                    if (gargamelyolu.size() >= 2) {
                        gargamel.setX((gargamelyolu.get(2) / 11) + 1);
                        gargamel.setY((gargamelyolu.get(2) % 11) + 1);
                    }

                    if (oyuncux == gargamel.getY() && oyuncuy == gargamel.getX()) {
                        gargamel.setX(gargamelx);
                        gargamel.setY(gargamely);
                        gozlukluSirin.setSkor(gozlukluSirin.getSkor() - 15);
                        skorLabel.setText(gozlukluSirin.PuaniGoster());

                    }
                    if (oyuncux == azman.getY() && oyuncuy == azman.getX()) {
                        azman.setX(azmanx);
                        azman.setY(azmany);
                        gozlukluSirin.setSkor(gozlukluSirin.getSkor() - 5);
                        skorLabel.setText(gozlukluSirin.PuaniGoster());
                    }

                    ekrangoster();

                } else if (labirent[oyuncuy - 1][oyuncux] != 0 && labirent[oyuncuy - 2][oyuncux] == 0) {

                    oyuncuy--;
                    gargamelyolu = Karakter.KisaYol(Graf.baglama(), Karakter.EnkisaYol(Graf.baglama(), gargamelyeri), gargamelyeri, (oyuncuy - 1) * 11 + (oyuncux - 1));
                    azmanyolu = Karakter.KisaYol(Graf.baglama(), Karakter.EnkisaYol(Graf.baglama(), y), y, (oyuncuy - 1) * 11 + (oyuncux - 1));
                    if (azmanyolu.size() > 1) {
                        azman.setX((azmanyolu.get(1) / 11) + 1);
                        azman.setY((azmanyolu.get(1) % 11) + 1);
                    }
                    if (gargamelyolu.size() >= 2) {
                        gargamel.setX((gargamelyolu.get(2) / 11) + 1);
                        gargamel.setY((gargamelyolu.get(2) % 11) + 1);
                    }

                    if (oyuncux == gargamel.getY() && oyuncuy == gargamel.getX()) {
                        gargamel.setX(gargamelx);
                        gargamel.setY(gargamely);
                        gozlukluSirin.setSkor(gozlukluSirin.getSkor() - 15);
                        skorLabel.setText(gozlukluSirin.PuaniGoster());

                    }
                    if (oyuncux == azman.getY() && oyuncuy == azman.getX()) {
                        azman.setX(azmanx);
                        azman.setY(azmany);
                        gozlukluSirin.setSkor(gozlukluSirin.getSkor() - 5);
                        skorLabel.setText(gozlukluSirin.PuaniGoster());
                    }

                    ekrangoster();
                } else if (labirent[oyuncuy - 1][oyuncux] == 0) {
                    oyuncuy = oyuncuy;

                }
                if (oyuncuy <= 0) {
                    oyuncuy = 0;
                }
            }
            if (c == KeyEvent.VK_A) {

                if (oyuncux <= 0) {
                    oyuncux = 0;
                } else {
                    if (labirent[oyuncuy][oyuncux - 1] != 0 && labirent[oyuncuy][oyuncux - 2] != 0) {

                        oyuncux -= 2;
                        gargamelyolu = Karakter.KisaYol(Graf.baglama(), Karakter.EnkisaYol(Graf.baglama(), gargamelyeri), gargamelyeri, (oyuncuy - 1) * 11 + (oyuncux - 1));
                        azmanyolu = Karakter.KisaYol(Graf.baglama(), Karakter.EnkisaYol(Graf.baglama(), y), y, (oyuncuy - 1) * 11 + (oyuncux - 1));
                        if (azmanyolu.size() > 1) {
                            azman.setX((azmanyolu.get(1) / 11) + 1);
                            azman.setY((azmanyolu.get(1) % 11) + 1);
                        }
                        if (gargamelyolu.size() >= 2) {
                            gargamel.setX((gargamelyolu.get(2) / 11) + 1);
                            gargamel.setY((gargamelyolu.get(2) % 11) + 1);
                        }

                        if (oyuncux == gargamel.getY() && oyuncuy == gargamel.getX()) {
                            gargamel.setX(gargamelx);
                            gargamel.setY(gargamely);
                            gozlukluSirin.setSkor(gozlukluSirin.getSkor() - 15);
                            skorLabel.setText(gozlukluSirin.PuaniGoster());

                        }
                        if (oyuncux == azman.getY() && oyuncuy == azman.getX() ) {
                            azman.setX(azmanx);
                            azman.setY(azmany);
                            gozlukluSirin.setSkor(gozlukluSirin.getSkor() - 5);
                            skorLabel.setText(gozlukluSirin.PuaniGoster());
                        }

                        ekrangoster();

                    } else if (labirent[oyuncuy][oyuncux - 1] != 0 && labirent[oyuncuy][oyuncux - 2] == 0) {

                        oyuncux--;
                        gargamelyolu = Karakter.KisaYol(Graf.baglama(), Karakter.EnkisaYol(Graf.baglama(), gargamelyeri), gargamelyeri, (oyuncuy - 1) * 11 + (oyuncux - 1));
                        azmanyolu = Karakter.KisaYol(Graf.baglama(), Karakter.EnkisaYol(Graf.baglama(), y), y, (oyuncuy - 1) * 11 + (oyuncux - 1));
                        if (azmanyolu.size() > 1) {
                            azman.setX((azmanyolu.get(1) / 11) + 1);
                            azman.setY((azmanyolu.get(1) % 11) + 1);
                        }
                        if (gargamelyolu.size() >= 2) {
                            gargamel.setX((gargamelyolu.get(2) / 11) + 1);
                            gargamel.setY((gargamelyolu.get(2) % 11) + 1);
                        }

                        if (oyuncux == gargamel.getY() && oyuncuy == gargamel.getX()) {
                            gargamel.setX(gargamelx);
                            gargamel.setY(gargamely);
                            gozlukluSirin.setSkor(gozlukluSirin.getSkor() - 15);
                            skorLabel.setText(gozlukluSirin.PuaniGoster());

                        }
                        if (oyuncux == azman.getY() && oyuncuy == azman.getX()) {
                            azman.setX(azmanx);
                            azman.setY(azmany);
                            gozlukluSirin.setSkor(gozlukluSirin.getSkor() - 5);
                            skorLabel.setText(gozlukluSirin.PuaniGoster());
                        }

                        ekrangoster();
                    } else if (labirent[oyuncuy][oyuncux - 1] == 0) {
                        oyuncux = oyuncux;
                    }
                    if (oyuncux <= 0) {
                        oyuncux = 0;
                    }
                }
            }
            if (c == KeyEvent.VK_S) {

                if (oyuncuy >= 10) {
                    oyuncuy = 10;
                } else {
                    if (labirent[oyuncuy + 1][oyuncux] != 0 && labirent[oyuncuy + 2][oyuncux] != 0) {

                        oyuncuy += 2;
                        gargamelyolu = Karakter.KisaYol(Graf.baglama(), Karakter.EnkisaYol(Graf.baglama(), gargamelyeri), gargamelyeri, (oyuncuy - 1) * 11 + (oyuncux - 1));
                        azmanyolu = Karakter.KisaYol(Graf.baglama(), Karakter.EnkisaYol(Graf.baglama(), y), y, (oyuncuy - 1) * 11 + (oyuncux - 1));
                        if (azmanyolu.size() > 1) {
                            azman.setX((azmanyolu.get(1) / 11) + 1);
                            azman.setY((azmanyolu.get(1) % 11) + 1);
                        }
                        if (gargamelyolu.size() >= 2) {
                            gargamel.setX((gargamelyolu.get(2) / 11) + 1);
                            gargamel.setY((gargamelyolu.get(2) % 11) + 1);
                        }

                        if (oyuncux == gargamel.getY() && oyuncuy == gargamel.getX()) {
                            gargamel.setX(gargamelx);
                            gargamel.setY(gargamely);
                            gozlukluSirin.setSkor(gozlukluSirin.getSkor() - 15);
                            skorLabel.setText(gozlukluSirin.PuaniGoster());

                        }
                        if (oyuncux == azman.getY() && oyuncuy == azman.getX()) {
                            azman.setX(azmanx);
                            azman.setY(azmany);
                            gozlukluSirin.setSkor(gozlukluSirin.getSkor() - 5);
                            skorLabel.setText(gozlukluSirin.PuaniGoster());
                        }

                        ekrangoster();

                    } else if (labirent[oyuncuy + 1][oyuncux] != 0 && labirent[oyuncuy + 2][oyuncux] == 0) {

                        oyuncuy++;
                        gargamelyolu = Karakter.KisaYol(Graf.baglama(), Karakter.EnkisaYol(Graf.baglama(), gargamelyeri), gargamelyeri, (oyuncuy - 1) * 11 + (oyuncux - 1));
                        azmanyolu = Karakter.KisaYol(Graf.baglama(), Karakter.EnkisaYol(Graf.baglama(), y), y, (oyuncuy - 1) * 11 + (oyuncux - 1));
                        if (azmanyolu.size() > 1) {
                            azman.setX((azmanyolu.get(1) / 11) + 1);
                            azman.setY((azmanyolu.get(1) % 11) + 1);
                        }
                        if (gargamelyolu.size() >= 2) {
                            gargamel.setX((gargamelyolu.get(2) / 11) + 1);
                            gargamel.setY((gargamelyolu.get(2) % 11) + 1);
                        }

                        if (oyuncux == gargamel.getY() && oyuncuy == gargamel.getX()) {
                            gargamel.setX(gargamelx);
                            gargamel.setY(gargamely);
                            gozlukluSirin.setSkor(gozlukluSirin.getSkor() - 15);
                            skorLabel.setText(gozlukluSirin.PuaniGoster());

                        }
                        if (oyuncux == azman.getY() && oyuncuy == azman.getX()) {
                            azman.setX(azmanx);
                            azman.setY(azmany);
                            gozlukluSirin.setSkor(gozlukluSirin.getSkor() - 5);
                            skorLabel.setText(gozlukluSirin.PuaniGoster());
                        }

                        ekrangoster();

                    } else if (labirent[oyuncuy + 1][oyuncux] == 0) {
                        oyuncuy = oyuncuy;
                    }

                    if (oyuncuy >= 10) {
                        oyuncuy = 10;
                    }
                }
            }
            if (c == KeyEvent.VK_D) {//13 7

                if (oyuncux >= 12) {

                    oyuncux = 12;

                }
                if (oyuncuy == 7 && oyuncux == 11) {

                    oyuncux++;
                    gargamelyolu = Karakter.KisaYol(Graf.baglama(), Karakter.EnkisaYol(Graf.baglama(), gargamelyeri), gargamelyeri, (oyuncuy - 1) * 11 + (oyuncux - 1));
                    azmanyolu = Karakter.KisaYol(Graf.baglama(), Karakter.EnkisaYol(Graf.baglama(), y), y, (oyuncuy - 1) * 11 + (oyuncux - 1));
                    if (azmanyolu.size() > 1) {
                        azman.setX((azmanyolu.get(1) / 11) + 1);
                        azman.setY((azmanyolu.get(1) % 11) + 1);
                    }
                    if (gargamelyolu.size() >= 2) {
                        gargamel.setX((gargamelyolu.get(2) / 11) + 1);
                        gargamel.setY((gargamelyolu.get(2) % 11) + 1);
                    }

                    if (oyuncux == gargamel.getY() && oyuncuy == gargamel.getX()) {
                        gargamel.setX(gargamelx);
                        gargamel.setY(gargamely);
                        gozlukluSirin.setSkor(gozlukluSirin.getSkor() - 15);
                        skorLabel.setText(gozlukluSirin.PuaniGoster());

                    }
                    if (oyuncux == azman.getY() && oyuncuy == azman.getX()) {
                        azman.setX(azmanx);
                        azman.setY(azmany);
                        gozlukluSirin.setSkor(gozlukluSirin.getSkor() - 5);
                        skorLabel.setText(gozlukluSirin.PuaniGoster());
                    }

                    ekrangoster();

                }
                if (labirent[oyuncuy][oyuncux + 1] != 0 && labirent[oyuncuy][oyuncux + 2] != 0) {

                    oyuncux += 2;
                    gargamelyolu = Karakter.KisaYol(Graf.baglama(), Karakter.EnkisaYol(Graf.baglama(), gargamelyeri), gargamelyeri, (oyuncuy - 1) * 11 + (oyuncux - 1));
                    azmanyolu = Karakter.KisaYol(Graf.baglama(), Karakter.EnkisaYol(Graf.baglama(), y), y, (oyuncuy - 1) * 11 + (oyuncux - 1));
                    if (azmanyolu.size() > 1) {
                        azman.setX((azmanyolu.get(1) / 11) + 1);
                        azman.setY((azmanyolu.get(1) % 11) + 1);
                    }
                    if (gargamelyolu.size() >= 2) {
                        gargamel.setX((gargamelyolu.get(2) / 11) + 1);
                        gargamel.setY((gargamelyolu.get(2) % 11) + 1);
                    }

                    if (oyuncux == gargamel.getY() && oyuncuy == gargamel.getX()) {
                        gargamel.setX(gargamelx);
                        gargamel.setY(gargamely);
                        gozlukluSirin.setSkor(gozlukluSirin.getSkor() - 15);
                        skorLabel.setText(gozlukluSirin.PuaniGoster());

                    }
                    if (oyuncux == azman.getY() && oyuncuy == azman.getX()) {
                        azman.setX(azmanx);
                        azman.setY(azmany);
                        gozlukluSirin.setSkor(gozlukluSirin.getSkor() - 5);
                        skorLabel.setText(gozlukluSirin.PuaniGoster());
                    }

                    ekrangoster();

                } else if (labirent[oyuncuy][oyuncux + 1] != 0 && labirent[oyuncuy][oyuncux + 2] == 0) {

                    oyuncux++;
                    gargamelyolu = Karakter.KisaYol(Graf.baglama(), Karakter.EnkisaYol(Graf.baglama(), gargamelyeri), gargamelyeri, (oyuncuy - 1) * 11 + (oyuncux - 1));
                    azmanyolu = Karakter.KisaYol(Graf.baglama(), Karakter.EnkisaYol(Graf.baglama(), y), y, (oyuncuy - 1) * 11 + (oyuncux - 1));
                    if (azmanyolu.size() > 1) {
                        azman.setX((azmanyolu.get(1) / 11) + 1);
                        azman.setY((azmanyolu.get(1) % 11) + 1);
                    }
                    if (gargamelyolu.size() >= 2) {
                        gargamel.setX((gargamelyolu.get(2) / 11) + 1);
                        gargamel.setY((gargamelyolu.get(2) % 11) + 1);
                    }

                    if (oyuncux == gargamel.getY() && oyuncuy == gargamel.getX()) {
                        gargamel.setX(gargamelx);
                        gargamel.setY(gargamely);
                        gozlukluSirin.setSkor(gozlukluSirin.getSkor() - 15);
                        skorLabel.setText(gozlukluSirin.PuaniGoster());

                    }
                    if (oyuncux == azman.getY() && oyuncuy == azman.getX()) {
                        azman.setX(azmanx);
                        azman.setY(azmany);
                        gozlukluSirin.setSkor(gozlukluSirin.getSkor() - 5);
                        skorLabel.setText(gozlukluSirin.PuaniGoster());
                    }

                    ekrangoster();

                } else if (labirent[oyuncuy][oyuncux + 1] == 0) {

                    oyuncux = oyuncux;
                }

                if (oyuncux >= 12) {

                    oyuncux = 12;

                }
            }

        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        repaint();
    }

}
