/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulangan.atm;

import javax.swing.JOptionPane;

/**
 *
 * @author Nabil Rizki
 */
public class Penyetoran extends javax.swing.JFrame {

    /**
     * Creates new form pENYETORAN
     */
    public Penyetoran() {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        setor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Tranfer = new javax.swing.JButton();
        Tranfer1 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));
        jPanel1.setLayout(null);

        jPanel3.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("TRANSAKSI LAIN?");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(10, 130, 170, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("PENYETORAN");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(100, 0, 130, 40);
        jPanel3.add(setor);
        setor.setBounds(50, 70, 190, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Rp.");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(10, 70, 18, 30);

        jButton1.setText("SETOR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(10, 110, 90, 23);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("TIDAK");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(240, 190, 60, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("IYA");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(240, 160, 60, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("MASUKKAN NOMINAL");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(10, 30, 170, 40);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(50, 40, 310, 230);

        Tranfer.setText(">");
        Tranfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TranferActionPerformed(evt);
            }
        });
        jPanel1.add(Tranfer);
        Tranfer.setBounds(370, 230, 40, 23);

        Tranfer1.setText(">");
        Tranfer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tranfer1ActionPerformed(evt);
            }
        });
        jPanel1.add(Tranfer1);
        Tranfer1.setBounds(370, 200, 40, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 420, 310);

        setSize(new java.awt.Dimension(434, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Tranfer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tranfer1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_Tranfer1ActionPerformed

    private void TranferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TranferActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(null, "Terimakasih telah melakukan transaksi di ATM ");
        dispose();
    }//GEN-LAST:event_TranferActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String setoran = setor.getText();
        int jmlsetor = Integer.parseInt(setoran);
        int saldo = 100000000;
        int saldoakhir = saldo+jmlsetor;

        if(jmlsetor%100!=0){
            JOptionPane.showMessageDialog(null,"Mesin ATM BCA Tidak Menerima Uang KOin \nSilahkan Ulangi Lagi","Transaksi Gagal",0);

        }
        else if(jmlsetor<=50000){
            JOptionPane.showMessageDialog(null, "Besaran Minimal Pnyetoran adalah Rp 50000", "Transaksi Gagal",0);
        }

        else if(jmlsetor>=50000){
            JOptionPane.showMessageDialog(null, "Terimakasih Telah Melakukan Penyetoran. Sisa Saldo Anda adalah Rp "+saldoakhir);
        }

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
            java.util.logging.Logger.getLogger(Penyetoran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Penyetoran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Penyetoran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Penyetoran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Penyetoran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Tranfer;
    private javax.swing.JButton Tranfer1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField setor;
    // End of variables declaration//GEN-END:variables
}
