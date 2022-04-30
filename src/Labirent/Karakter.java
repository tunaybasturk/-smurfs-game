package Labirent;

import java.util.ArrayList;

public class Karakter {

    private String ID;
    private String Ad;
    private String Tur;
    private int x;
    private int y;

    public Karakter() {

    }

    public Karakter(String ID, String Ad, String Tur, int x, int y) {
        this.ID = ID;
        this.Ad = Ad;
        this.Tur = Tur;
        this.x = x;
        this.y = y;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getAd() {
        return Ad;
    }

    public void setAd(String Ad) {
        this.Ad = Ad;
    }

    public String getTur() {
        return Tur;
    }

    public void setTur(String Tur) {
        this.Tur = Tur;
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

    public static int[] EnkisaYol(Graf G, int x) {

        final int[] mesafe = new int[G.size()]; 
        final int[] onceki = new int[G.size()];  
        final boolean[] ziyaretettimi = new boolean[G.size()];

        for (int i = 0; i < mesafe.length; i++) {
            mesafe[i] = Integer.MAX_VALUE; 
        }
        mesafe[x] = 0;

        for (int i = 0; i < mesafe.length; i++) {
            final int sonraki = enKucukKose(mesafe, ziyaretettimi);
            ziyaretettimi[sonraki] = true;

            final int[] n = G.Komsular(sonraki);
            for (int j = 0; j < n.length; j++) {
                final int v = n[j];
                final int d = mesafe[sonraki] + G.agirlik(sonraki, v);
                if (mesafe[v] > d) {
                    mesafe[v] = d;
                    onceki[v] = sonraki;
                }
            }
        }
        return onceki;
    }

    private static int enKucukKose(int[] mesafe, boolean[] v) {
        int a = Integer.MAX_VALUE;
        int b = 0;   
        for (int i = 0; i < mesafe.length; i++) {
            if (!v[i] && mesafe[i] < a) {
                b = i;
                a = mesafe[i];
            }
        }
        return b;
    }

    public static ArrayList KisaYol(Graf G, int[] onceki, int t, int u) {
        final java.util.ArrayList yol = new java.util.ArrayList();
        int x = u;
        while (x != t) {
            yol.add(0, G.getLabel(x));
            x = onceki[x];
        }
        yol.add(0, G.getLabel(t));
        return yol;
    }

}
