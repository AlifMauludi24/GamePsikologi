/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AlifM
 */
public class Soal3 extends javax.swing.JFrame {

    /**
     * Creates new form Soal3
     */
    public Soal3() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        guci = new javax.swing.JRadioButton();
        besi = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        plastik = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        buttonGroup1.add(guci);
        guci.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        guci.setText("Guci, keramik atau tanah liat");
        getContentPane().add(guci);
        guci.setBounds(20, 130, 200, 30);

        buttonGroup1.add(besi);
        besi.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        besi.setText("Besi");
        besi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                besiActionPerformed(evt);
            }
        });
        getContentPane().add(besi);
        besi.setBounds(20, 190, 160, 40);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("<html> \nLalu anda melihat sebuah pot yang sedang tergantung disekitar ruangan <br> <br>\n\nTerbuat dari apakah pot tersebut?\n\n</html>");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 60, 380, 60);

        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setText("Lihat Hasilnya");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(250, 250, 130, 30);

        buttonGroup1.add(plastik);
        plastik.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        plastik.setText("Plastik");
        plastik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plastikActionPerformed(evt);
            }
        });
        getContentPane().add(plastik);
        plastik.setBounds(20, 160, 140, 30);

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel1.setText("SOAL 3");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 120, 30);

        setBounds(500, 200, 416, 339);
    }// </editor-fold>//GEN-END:initComponents

    private void besiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_besiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_besiActionPerformed

    private void plastikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plastikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plastikActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String hasil3;

        if(guci.isSelected())
            hasil3 = "Rendah hati dan berperasaan. Wenak !";
        else if(plastik.isSelected())
            hasil3 = "Anda Fleksibel.";
        else
            hasil3 = "Anda Keras kepala dan egois.";

        new Hasil3(hasil3).setVisible(true);  
         dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Soal3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Soal3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Soal3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Soal3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Soal3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton besi;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton guci;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton plastik;
    // End of variables declaration//GEN-END:variables
}
