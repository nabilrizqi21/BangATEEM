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
public class LogIn extends javax.swing.JFrame {
    
    String nomor="";
    int pilih ;

    /**
     * Creates new form LogIn
     */
    public LogIn() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jB3 = new javax.swing.JButton();
        jB0 = new javax.swing.JButton();
        jB2 = new javax.swing.JButton();
        jB1 = new javax.swing.JButton();
        jB4 = new javax.swing.JButton();
        jB5 = new javax.swing.JButton();
        jB6 = new javax.swing.JButton();
        jB7 = new javax.swing.JButton();
        jB8 = new javax.swing.JButton();
        jB9 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        hPin = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Masukkan PIN Anda");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 70, 170, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("WELOCOME");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 10, 110, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ATM BANK");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 30, 110, 30);

        jB3.setText("3");
        jB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB3ActionPerformed(evt);
            }
        });
        getContentPane().add(jB3);
        jB3.setBounds(160, 190, 39, 30);

        jB0.setText("0");
        jB0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB0ActionPerformed(evt);
            }
        });
        getContentPane().add(jB0);
        jB0.setBounds(220, 230, 39, 30);

        jB2.setText("2");
        jB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB2ActionPerformed(evt);
            }
        });
        getContentPane().add(jB2);
        jB2.setBounds(100, 190, 39, 30);

        jB1.setText("1");
        jB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB1ActionPerformed(evt);
            }
        });
        getContentPane().add(jB1);
        jB1.setBounds(40, 190, 39, 30);

        jB4.setText("4");
        jB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB4ActionPerformed(evt);
            }
        });
        getContentPane().add(jB4);
        jB4.setBounds(40, 230, 39, 30);

        jB5.setText("5");
        jB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB5ActionPerformed(evt);
            }
        });
        getContentPane().add(jB5);
        jB5.setBounds(100, 230, 39, 30);

        jB6.setText("6");
        jB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB6ActionPerformed(evt);
            }
        });
        getContentPane().add(jB6);
        jB6.setBounds(160, 230, 39, 30);

        jB7.setText("7");
        jB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB7ActionPerformed(evt);
            }
        });
        getContentPane().add(jB7);
        jB7.setBounds(40, 270, 39, 30);

        jB8.setText("8");
        jB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB8ActionPerformed(evt);
            }
        });
        getContentPane().add(jB8);
        jB8.setBounds(100, 270, 39, 30);

        jB9.setText("9");
        jB9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB9ActionPerformed(evt);
            }
        });
        getContentPane().add(jB9);
        jB9.setBounds(160, 270, 39, 30);

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.setLayout(null);
        jPanel1.add(hPin);
        hPin.setBounds(50, 120, 220, 70);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-10, -10, 330, 350);

        setSize(new java.awt.Dimension(314, 367));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB5ActionPerformed
        // TODO add your handling code here:
        nomor+="5";
        hPin.setText(nomor);
        pilih+=1;
        pengecekan();
    }//GEN-LAST:event_jB5ActionPerformed

    private void jB8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB8ActionPerformed
        // TODO add your handling code here:
        nomor+="8";
        hPin.setText(nomor);
        pilih+=1;
        pengecekan();
    }//GEN-LAST:event_jB8ActionPerformed

    private void jB9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB9ActionPerformed
        // TODO add your handling code here:
        nomor+="9";
        hPin.setText(nomor);
        pilih+=1;
        pengecekan();
    }//GEN-LAST:event_jB9ActionPerformed

    private void jB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB1ActionPerformed
        // TODO add your handling code here:
        nomor+="1";
        hPin.setText(nomor);
        pilih+=1;
        pengecekan();
    }//GEN-LAST:event_jB1ActionPerformed

    private void jB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB2ActionPerformed
        // TODO add your handling code here:
        nomor+="2";
        hPin.setText(nomor);
        pilih+=1;
        pengecekan();
    }//GEN-LAST:event_jB2ActionPerformed

    private void jB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB3ActionPerformed
        // TODO add your handling code here:
        nomor+="3";
        hPin.setText(nomor);
        pilih+=1;
        pengecekan();
    }//GEN-LAST:event_jB3ActionPerformed

    private void jB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB4ActionPerformed
        // TODO add your handling code here:
        nomor+="4";
        hPin.setText(nomor);
        pilih+=1;
        pengecekan();
    }//GEN-LAST:event_jB4ActionPerformed

    private void jB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB6ActionPerformed
        // TODO add your handling code here:
        nomor+="6";
        hPin.setText(nomor);
        pilih+=1;
        pengecekan();
    }//GEN-LAST:event_jB6ActionPerformed

    private void jB7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB7ActionPerformed
        // TODO add your handling code here:
        nomor+="7";
        hPin.setText(nomor);
        pilih+=1;
        pengecekan();
    }//GEN-LAST:event_jB7ActionPerformed

    private void jB0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB0ActionPerformed
        // TODO add your handling code here:
        nomor+="0";
        hPin.setText(nomor);
        pilih+=1;
        pengecekan();
    }//GEN-LAST:event_jB0ActionPerformed

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField hPin;
    private javax.swing.JButton jB0;
    private javax.swing.JButton jB1;
    private javax.swing.JButton jB2;
    private javax.swing.JButton jB3;
    private javax.swing.JButton jB4;
    private javax.swing.JButton jB5;
    private javax.swing.JButton jB6;
    private javax.swing.JButton jB7;
    private javax.swing.JButton jB8;
    private javax.swing.JButton jB9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void pengecekan() {
        if(pilih==4){
            String pin=hPin.getText();
            if("1234".equals(pin)){
                new Home().show();
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null,"PIN Anda Salah");
                hPin.setText("");
                pilih=0;
                nomor="";
            }
        }
    }
}
