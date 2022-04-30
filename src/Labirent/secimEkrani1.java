package Labirent;

public class secimEkrani1 extends javax.swing.JFrame {

    GozlukluSirin gozlukluSirin = new GozlukluSirin();
    TembelSirin tembelSirin = new TembelSirin();
    private static int ozellik;

    public int getOzellik() { 
        return ozellik;
    } 

    public void setOzellik(int ozellik) {
        this.ozellik = ozellik;
    }

    public secimEkrani1() {
        initComponents();
        setTitle("Secim Ekrani");
        setSize(1920, 1080);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gozluklu = new javax.swing.JLabel();
        tembel = new javax.swing.JLabel();
        arkaPlan = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        gozluklu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/gozluklu.png"))); // NOI18N
        gozluklu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gozlukluMouseClicked(evt);
            }
        });
        getContentPane().add(gozluklu);
        gozluklu.setBounds(340, 400, 600, 500);

        tembel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/uykucu.png"))); // NOI18N
        tembel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tembelMouseClicked(evt);
            }
        });
        getContentPane().add(tembel);
        tembel.setBounds(960, 400, 600, 500);

        arkaPlan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/secimmekran.jpg"))); // NOI18N
        arkaPlan.setText("jLabel1");
        getContentPane().add(arkaPlan);
        arkaPlan.setBounds(0, 0, 1920, 1080);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 181, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 542, 181);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tembelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tembelMouseClicked

        gozlukluSirin.setDogruMu(false);
        tembelSirin.setDogruMu(true);
        this.ozellik = 0;
        this.setVisible(false);

        Main main = new Main();
        main.EkranGoster();
        

    }//GEN-LAST:event_tembelMouseClicked

    private void gozlukluMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gozlukluMouseClicked
        gozlukluSirin.setDogruMu(true);
        tembelSirin.setDogruMu(false);
        this.ozellik = 1;
        this.setVisible(false);
        Main main = new Main();
        main.EkranGoster();


    }//GEN-LAST:event_gozlukluMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */ 
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(secimEkrani1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(secimEkrani1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(secimEkrani1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(secimEkrani1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new secimEkrani1().setVisible(true);
            }
        });
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arkaPlan;
    private javax.swing.JLabel gozluklu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel tembel;
    // End of variables declaration//GEN-END:variables
}
