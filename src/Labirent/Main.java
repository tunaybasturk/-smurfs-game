package Labirent;

import java.awt.Color;
import java.awt.HeadlessException;
import java.io.FileNotFoundException; 
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main extends JFrame {
 
    private secimEkrani1 seEkrani1;
    private static JLabel skorLabel = new JLabel();

    public Main() throws HeadlessException {
    }

    public Main(String title) throws HeadlessException {
        super(title);

    }

    public static void EkranGoster() {
        JFrame ekran = new JFrame("Labirent Oyunu");
        ekran.setFocusable(false);
        ekran.setSize(1920, 1080);
        skorLabel.setFont(new java.awt.Font("Tahoma", 0, 20));
        skorLabel.setBounds(25, 25, 150, 50);
        skorLabel.setVisible(true);
        LabirentMap panel = null;
        try {
            panel = new LabirentMap();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        ekran.add(panel.labelgosteren());
        panel.requestFocus();
        panel.addKeyListener(panel);
        panel.setFocusable(true);
        panel.setFocusTraversalKeysEnabled(false);
        panel.setBackground(Color.orange);
        ekran.add(panel);
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ekran.setVisible(true);
    }

    public static void main(String[] args) {

        EkranGoster();

    }

}
