/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package food.ordering.system;

import dao.userDao;

/**
 *
 * @author welcome
 */
public class ChangePassword extends javax.swing.JFrame {

    public String userEmail;
    
    /**
     * Creates new form ChangePassword
     */
    public ChangePassword() {
        initComponents();
    }
    
     public ChangePassword(String email) {
        initComponents();
        userEmail = email;
        btnupdate.setEnabled(false);
    }
     
     public void validateFields(){
         String oldPassword = txtoldpassword.getText();
         String newPassword = txtnewpassword.getText();
         String confirmPassword = txtconfirmpassword.getText();
         if(!oldPassword.equals("")&&!newPassword.equals("")&& !confirmPassword.equals("")&& newPassword.equals(confirmPassword)){
             btnupdate.setEnabled(true);
         }
         else
             btnupdate.setEnabled(false);
         
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
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtoldpassword = new javax.swing.JPasswordField();
        txtnewpassword = new javax.swing.JPasswordField();
        txtconfirmpassword = new javax.swing.JPasswordField();
        btnupdate = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/change Password.png"))); // NOI18N
        jLabel1.setText("Change Password");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 15, 177, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(709, 0, 35, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Old Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 99, 98, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("New Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 146, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Confirm Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, -1, -1));

        txtoldpassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtoldpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtoldpasswordKeyReleased(evt);
            }
        });
        getContentPane().add(txtoldpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 96, 264, -1));

        txtnewpassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtnewpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnewpasswordActionPerformed(evt);
            }
        });
        txtnewpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnewpasswordKeyReleased(evt);
            }
        });
        getContentPane().add(txtnewpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 143, 264, -1));

        txtconfirmpassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtconfirmpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtconfirmpasswordKeyReleased(evt);
            }
        });
        getContentPane().add(txtconfirmpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 197, 264, -1));

        btnupdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 241, -1, -1));

        btnclear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnclear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        getContentPane().add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 241, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/small-page-background3.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtnewpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnewpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnewpasswordActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
       String oldPassword = txtoldpassword.getText();
         String newPassword = txtnewpassword.getText();
         
         userDao.changePassword(userEmail, oldPassword, newPassword);
         setVisible(false);
         new ChangePassword(userEmail).setVisible(true);
        
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
        
        setVisible(false);
        new ChangePassword(userEmail).setVisible(true);
    }//GEN-LAST:event_btnclearActionPerformed

    private void txtoldpasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtoldpasswordKeyReleased
        // TODO add your handling code here:
        
        validateFields();
    }//GEN-LAST:event_txtoldpasswordKeyReleased

    private void txtnewpasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnewpasswordKeyReleased
        // TODO add your handling code here:
             validateFields();
    }//GEN-LAST:event_txtnewpasswordKeyReleased

    private void txtconfirmpasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtconfirmpasswordKeyReleased
        // TODO add your handling code here:
             validateFields();
    }//GEN-LAST:event_txtconfirmpasswordKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
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
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField txtconfirmpassword;
    private javax.swing.JPasswordField txtnewpassword;
    private javax.swing.JPasswordField txtoldpassword;
    // End of variables declaration//GEN-END:variables
}
