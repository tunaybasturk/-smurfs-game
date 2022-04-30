package Labirent;

import java.io.BufferedReader;
import java.io.FileReader;

public class Lokasyon1 {

    private int x = 6;
    private int y = 5;
    private int azmanx, azmany;
    private int gargamelx, gargamely;
    static String[] cumleKordinant = new String[11];

    public Lokasyon1() {
        try {

            int k = 0;
            int satırsayısı = 0;
            FileReader fileReader = new FileReader("src\\IMG\\Labirent.txt");
            String line;
            BufferedReader br = new BufferedReader(fileReader);
            String dusmancumle = new String();
            String dusmancumle1 = new String();
            while ((line = br.readLine()) != null) {

                satırsayısı++;

            }
            br.close();

            br = new BufferedReader(new FileReader("src\\IMG\\Labirent.txt"));

            if (satırsayısı == 13) {
                while ((line = br.readLine()) != null) {

                    if (k == 0) {
                        dusmancumle = line;
                        k++;
                    }
                    if (k == 1) {
                        dusmancumle1 = line;
                        k++;
                    }
                    if (k >= 2 && k != 13) {
                        cumleKordinant[k - 2] = line;
                        k++;
                    }
                }
                br.close();
            }

            if (satırsayısı == 12) {
                while ((line = br.readLine()) != null) {

                    if (k == 0) {
                        dusmancumle = line;
                        k++;
                    }
                    if (k == 1) {
                        cumleKordinant[k - 1] = line;
                        k++;
                    } else {
                        k++; 
                    }
                }
                br.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        if (cumleKordinant[0].charAt(cumleKordinant[0].length() - 1) == 'A') {
            gargamelx = 3;
            gargamely = 0;
        } else if (cumleKordinant[0].charAt(cumleKordinant[0].length() - 1) == 'B') {
            gargamelx = 10;
            gargamely = 0;
        } else if (cumleKordinant[0].charAt(cumleKordinant[0].length() - 1) == 'C') {
            gargamelx = 0;
            gargamely = 5;
        } else if (cumleKordinant[0].charAt(cumleKordinant[0].length() - 1) == 'D') {
            gargamelx = 3;
            gargamely = 10;

        }
        if (cumleKordinant[1].charAt(cumleKordinant[1].length() - 1) == 'A') {
            azmanx = 3;
            azmany = 0;
        } else if (cumleKordinant[1].charAt(cumleKordinant[1].length() - 1) == 'B') {
            azmanx = 10;
            azmany = 0;

        } else if (cumleKordinant[1].charAt(cumleKordinant[1].length() - 1) == 'C') {
            azmanx = 0;
            azmany = 5;

        } else if (cumleKordinant[1].charAt(cumleKordinant[1].length() - 1) == 'D') {
            azmanx = 3;
            azmany = 10;
        }

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getAzmanx() {
        return azmanx;
    }

    public void setAzmanx(int azmanx) {
        this.azmanx = azmanx;
    }

    public int getAzmany() {
        return azmany;
    }

    public void setAzmany(int azmany) {
        this.azmany = azmany;
    }

    public int getGargamelx() {
        return gargamelx;
    }

    public void setGargamelx(int gargamelx) {
        this.gargamelx = gargamelx;
    }

    public int getGargamely() {
        return gargamely;
    }

    public void setGargamely(int gargamely) {
        this.gargamely = gargamely;
    }

}
