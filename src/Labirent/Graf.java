/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labirent;

import static Labirent.Lokasyon1.cumleKordinant;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.util.Scanner;

public class Graf {

    private int[][] komsuMatris;  // adjacency matrix
    private Object[] labels;
    public static int lab[][] = new int[11][13];
    public int x;

    public Graf(int n) {
        komsuMatris = new int[n][n];
        labels = new Object[n];
    }

    public int size() {
        return labels.length;
    }

    public void setLabel(int vertex, Object label) {
        labels[vertex] = label;

    }

    public Object getLabel(int vertex) {
        return labels[vertex];
    }

    public void Komsu(int baslangic, int hedef, int w) {
        komsuMatris[baslangic][hedef] = w;
    }

    public boolean komsuMu(int baslangic, int hedef) {
        return komsuMatris[baslangic][hedef] > 0;
    }

    public void komsuSil(int baslangic, int hedef) {
        komsuMatris[baslangic][hedef] = 0;
    }

    public int agirlik(int baslangic, int hedef) {
        return komsuMatris[baslangic][hedef];
    }

    public int[] Komsular(int vertex) {
        int sayac = 0;
        for (int i = 0; i < komsuMatris[vertex].length; i++) {
            if (komsuMatris[vertex][i] > 0) {
                sayac++;
            }
        }
        final int[] sonuc = new int[sayac];
        sayac = 0;
        for (int i = 0; i < komsuMatris[vertex].length; i++) {
            if (komsuMatris[vertex][i] > 0) {
                sonuc[sayac++] = i;
            }
        }
        return sonuc;
    }

    public void print() {
        for (int j = 0; j < komsuMatris.length; j++) {
            System.out.print(labels[j] + ": ");
            for (int i = 0; i < komsuMatris[j].length; i++) {
                if (komsuMatris[j][i] > 0) {
                    System.out.print(labels[i] + ":" + komsuMatris[j][i] + " ");
                }
            }

            System.out.println();
        }
    }

    public void oku() {
        try {

            int k = 0;
            int satırsayısı = 0;
            FileReader fileReader = new FileReader("src\\IMG\\Labirent.txt");
            String line;
            Scanner br = new Scanner(fileReader);
            String dusmancumle = new String();
            String dusmancumle1 = new String();

            br = new Scanner(new FileReader("src\\IMG\\Labirent.txt"));

            for (int i = 0; i < 2; i++) {
                line = br.nextLine();

            }
            for (int i = 0; i < 11; i++) {
                for (int j = 0; j < 13; j++) {
                    lab[i][j] = br.nextInt();
                }
            }
            br.close();
            for (int i = 0; i < 11; i++) {
                for (int j = 0; j < 13; j++) {

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Graf baglama() {

        final Graf nesne = new Graf(104);
        nesne.oku();

        for (int i = 0; i < 104; i++) {
            nesne.setLabel(i, i);
        }

        nesne.Komsu(0, 1, 1);
        nesne.Komsu(0, 11, 1);
        nesne.Komsu(1, 0, 1);
        nesne.Komsu(1, 2, 1);
        nesne.Komsu(2, 1, 1);
        nesne.Komsu(2, 13, 1);
        nesne.Komsu(2, 3, 1);
        nesne.Komsu(3, 2, 1);
        nesne.Komsu(3, 14, 1);
        nesne.Komsu(5, 16, 1);
        nesne.Komsu(5, 6, 1);
        nesne.Komsu(6, 5, 1);
        nesne.Komsu(6, 17, 1);
        nesne.Komsu(6, 7, 1);
        nesne.Komsu(7, 6, 1);
        nesne.Komsu(7, 18, 1);
        nesne.Komsu(7, 8, 1);
        nesne.Komsu(8, 7, 1);
        nesne.Komsu(8, 9, 1);
        nesne.Komsu(9, 8, 1);
        nesne.Komsu(9, 10, 1);
        nesne.Komsu(10, 9, 1);
        nesne.Komsu(10, 21, 1);
        nesne.Komsu(11, 0, 1);
        nesne.Komsu(11, 22, 1);
        nesne.Komsu(13, 2, 1);
        nesne.Komsu(13, 14, 1);
        nesne.Komsu(13, 24, 1);
        nesne.Komsu(14, 3, 1);
        nesne.Komsu(14, 13, 1);
        nesne.Komsu(14, 25, 1);
        nesne.Komsu(14, 15, 1);
        nesne.Komsu(15, 14, 1);
        nesne.Komsu(15, 16, 1);
        nesne.Komsu(16, 15, 1);
        nesne.Komsu(16, 5, 1);
        nesne.Komsu(16, 17, 1);
        nesne.Komsu(16, 27, 1);
        nesne.Komsu(17, 6, 1);
        nesne.Komsu(17, 16, 1);
        nesne.Komsu(17, 18, 1);
        nesne.Komsu(18, 7, 1);
        nesne.Komsu(18, 17, 1);
        nesne.Komsu(18, 29, 1);
        nesne.Komsu(21, 10, 1);
        nesne.Komsu(21, 32, 1);
        nesne.Komsu(22, 11, 1);
        nesne.Komsu(22, 23, 1);
        nesne.Komsu(22, 33, 1);
        nesne.Komsu(23, 22, 1);
        nesne.Komsu(23, 24, 1);
        nesne.Komsu(24, 23, 1);
        nesne.Komsu(24, 13, 1);
        nesne.Komsu(24, 25, 1);
        nesne.Komsu(24, 35, 1);
        nesne.Komsu(25, 24, 1);
        nesne.Komsu(25, 14, 1);
        nesne.Komsu(27, 16, 1);
        nesne.Komsu(27, 38, 1);
        nesne.Komsu(29, 18, 1);
        nesne.Komsu(29, 30, 1);
        nesne.Komsu(29, 40, 1);
        nesne.Komsu(30, 29, 1);
        nesne.Komsu(32, 21, 1);
        nesne.Komsu(32, 43, 1);
        nesne.Komsu(33, 22, 1);
        nesne.Komsu(33, 44, 1);
        nesne.Komsu(35, 24, 1);
        nesne.Komsu(35, 46, 1);
        nesne.Komsu(38, 27, 1);
        nesne.Komsu(38, 49, 1);
        nesne.Komsu(40, 29, 1);
        nesne.Komsu(40, 51, 1);
        nesne.Komsu(43, 32, 1);
        nesne.Komsu(43, 54, 1);
        nesne.Komsu(44, 33, 1);
        nesne.Komsu(44, 55, 1);
        nesne.Komsu(46, 35, 1);
        nesne.Komsu(46, 47, 1);
        nesne.Komsu(47, 46, 1);
        nesne.Komsu(47, 58, 1);
        nesne.Komsu(47, 48, 1);
        nesne.Komsu(48, 47, 1);
        nesne.Komsu(48, 59, 1);
        nesne.Komsu(48, 49, 1);
        nesne.Komsu(49, 48, 1);
        nesne.Komsu(49, 38, 1);
        nesne.Komsu(49, 60, 1);
        nesne.Komsu(51, 40, 1);
        nesne.Komsu(51, 62, 1);
        nesne.Komsu(53, 64, 1);
        nesne.Komsu(53, 54, 1);
        nesne.Komsu(54, 53, 1);
        nesne.Komsu(54, 43, 1);
        nesne.Komsu(54, 65, 1);
        nesne.Komsu(55, 44, 1);
        nesne.Komsu(55, 66, 1);
        nesne.Komsu(58, 47, 1);
        nesne.Komsu(58, 59, 1);
        nesne.Komsu(58, 69, 1);
        nesne.Komsu(59, 58, 1);
        nesne.Komsu(59, 48, 1);
        nesne.Komsu(59, 70, 1);
        nesne.Komsu(59, 60, 1);
        nesne.Komsu(60, 59, 1);
        nesne.Komsu(60, 49, 1);
        nesne.Komsu(60, 71, 1);
        nesne.Komsu(62, 63, 1);
        nesne.Komsu(62, 73, 1);
        nesne.Komsu(62, 51, 1);
        nesne.Komsu(63, 62, 1);
        nesne.Komsu(63, 64, 1);
        nesne.Komsu(63, 74, 1);
        nesne.Komsu(64, 63, 1);
        nesne.Komsu(64, 65, 1);
        nesne.Komsu(64, 75, 1);
        nesne.Komsu(64, 53, 1);
        nesne.Komsu(65, 64, 1);
        nesne.Komsu(65, 54, 1);
        nesne.Komsu(65, 76, 1);
        nesne.Komsu(66, 55, 1);
        nesne.Komsu(66, 77, 1);
        nesne.Komsu(68, 79, 1);
        nesne.Komsu(68, 69, 1);
        nesne.Komsu(69, 58, 1);
        nesne.Komsu(69, 68, 1);
        nesne.Komsu(69, 70, 1);
        nesne.Komsu(70, 69, 1);
        nesne.Komsu(70, 59, 1);
        nesne.Komsu(70, 71, 1);
        nesne.Komsu(71, 70, 1);
        nesne.Komsu(71, 60, 1);
        nesne.Komsu(71, 72, 1);
        nesne.Komsu(72, 71, 1);
        nesne.Komsu(72, 73, 1);
        nesne.Komsu(73, 72, 1);
        nesne.Komsu(73, 62, 1);
        nesne.Komsu(73, 74, 1);
        nesne.Komsu(74, 63, 1);
        nesne.Komsu(74, 73, 1);
        nesne.Komsu(74, 75, 1);
        nesne.Komsu(74, 85, 1);
        nesne.Komsu(75, 64, 1);
        nesne.Komsu(75, 74, 1);
        nesne.Komsu(75, 76, 1);
        nesne.Komsu(75, 86, 1);
        nesne.Komsu(76, 75, 1);
        nesne.Komsu(76, 65, 1);
        nesne.Komsu(76, 87, 1);
        nesne.Komsu(77, 66, 1);
        nesne.Komsu(77, 88, 1);
        nesne.Komsu(79, 68, 1);
        nesne.Komsu(79, 90, 1);
        nesne.Komsu(85, 74, 1);
        nesne.Komsu(85, 96, 1);
        nesne.Komsu(85, 86, 1);
        nesne.Komsu(86, 75, 1);
        nesne.Komsu(86, 85, 1);
        nesne.Komsu(86, 97, 1);
        nesne.Komsu(86, 87, 1);
        nesne.Komsu(87, 86, 1);
        nesne.Komsu(87, 76, 1);
        nesne.Komsu(87, 98, 1);
        nesne.Komsu(88, 89, 1);
        nesne.Komsu(88, 77, 1);
        nesne.Komsu(89, 90, 1);
        nesne.Komsu(89, 88, 1);
        nesne.Komsu(90, 89, 1);
        nesne.Komsu(90, 79, 1);
        nesne.Komsu(90, 91, 1);
        nesne.Komsu(91, 90, 1);
        nesne.Komsu(91, 92, 1);
        nesne.Komsu(92, 91, 1);
        nesne.Komsu(92, 93, 1);
        nesne.Komsu(93, 92, 1);
        nesne.Komsu(93, 94, 1);
        nesne.Komsu(94, 93, 1);
        nesne.Komsu(94, 95, 1);
        nesne.Komsu(95, 94, 1);
        nesne.Komsu(95, 96, 1);
        nesne.Komsu(96, 95, 1);
        nesne.Komsu(96, 97, 1);
        nesne.Komsu(96, 85, 1);
        nesne.Komsu(97, 96, 1);
        nesne.Komsu(97, 86, 1);
        nesne.Komsu(97, 98, 1);
        nesne.Komsu(98, 97, 1);
        nesne.Komsu(98, 87, 1);

        nesne.Komsu(76, 103, 1);
        nesne.Komsu(99, 2, 1);
        nesne.Komsu(100, 9, 1);
        nesne.Komsu(101, 44, 1);
        nesne.Komsu(102, 90, 1);
        nesne.Komsu(103, 76, 1);

        return nesne;

    }

}
