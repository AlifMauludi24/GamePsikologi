/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AlifM
 */
public class soal8 extends javax.swing.JFrame {

    /**
     * Creates new form soal8
     */
    public soal8() {
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

        koinemas = new javax.swing.JRadioButton();
        gakambil = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        koinperak = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        koinemas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        koinemas.setText("Mengambil koin emas pada kolam pertama");
        getContentPane().add(koinemas);
        koinemas.setBounds(10, 160, 340, 30);

        gakambil.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        gakambil.setText("Tidak mengambil apa apa");
        gakambil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gakambilActionPerformed(evt);
            }
        });
        getContentPane().add(gakambil);
        gakambil.setBounds(10, 220, 290, 40);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("<html>  Lalu Anda berjalan, di sebelah kanan Anda dan melihat sebuah istana. Anda masuk ke dalam istana tersebut. Dan di dalam istana terdapat dua buah kolam. Di kolam yang pertama terdapat sejumlah koin yang terbuat dari emas tapi airnya kotor. Di kolam kedua terdapat banyak sekali koin yang terbuat dari perak dengan air cukup bersih. Pada situasi tersebut apa yang Anda lakukan?   </html>");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 40, 380, 130);

        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setText("Lihat Hasilnya");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(270, 370, 140, 30);

        koinperak.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        koinperak.setText("Mengambil koin perak di kolam kedua");
        koinperak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                koinperakActionPerformed(evt);
            }
        });
        getContentPane().add(koinperak);
        koinperak.setBounds(10, 190, 330, 30);

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel1.setText("SOAL 8");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 120, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon("E:\\landscape-with-mounstains-in-flat-design_23-2147540322.jpg")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, -80, 430, 490);

        setBounds(500, 200, 445, 450);
    }// </editor-fold>//GEN-END:initComponents

    private void gakambilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gakambilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gakambilActionPerformed

    private void koinperakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_koinperakActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_koinperakActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String hasil8;

        if(koinemas.isSelected())
            hasil8 = "Jika mencari pasangan Anda lebih mengutamakan kekayaan.";
        else if(koinperak.isSelected())
            hasil8 = "Jika memilih pasangan lebih mengutamakan tampang / fisik.";
        else
            hasil8 = "Anda memilih pasangan apa adanya.";

        new Hasil8(hasil8).setVisible(true);
                  dispose();    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(soal8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(soal8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(soal8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(soal8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new soal8().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton gakambil;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton koinemas;
    private javax.swing.JRadioButton koinperak;
    // End of variables declaration//GEN-END:variables
}
