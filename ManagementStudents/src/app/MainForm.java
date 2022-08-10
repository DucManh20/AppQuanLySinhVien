/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app;

import database.ShareData;
import javax.swing.ImageIcon;

/**
 *
 * @author Dell
 */
public class MainForm extends javax.swing.JFrame {

    private StudentManagermentPanel smp;
    private GPAManagementPanel gmp;

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();

        setLocationRelativeTo(null);
        
        processLoginSuccessful();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        tplMainBoard = new javax.swing.JTabbedPane();
        lblLoginName = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnLogout = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        menu5 = new javax.swing.JMenu();
        mnuManageStudent = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuManageGPA = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        btnInfo = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        tbrAboutUs = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblLoginName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenu1.setText("Hệ Thống");

        btnLogout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logout-icon-16.png"))); // NOI18N
        btnLogout.setText("Đăng Xuất");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jMenu1.add(btnLogout);
        jMenu1.add(jSeparator3);

        jMenuBar1.add(jMenu1);

        menu5.setText("Quản Lý");

        mnuManageStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/10207-man-student-light-skin-tone-icon-16.png"))); // NOI18N
        mnuManageStudent.setText("Quản Lý Sinh Viên");
        mnuManageStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuManageStudentActionPerformed(evt);
            }
        });
        menu5.add(mnuManageStudent);
        menu5.add(jSeparator2);

        mnuManageGPA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/gpa-icon.png"))); // NOI18N
        mnuManageGPA.setText("Quản Lý Điểm");
        mnuManageGPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuManageGPAActionPerformed(evt);
            }
        });
        menu5.add(mnuManageGPA);

        jMenuBar1.add(menu5);

        jMenu3.setText("Trợ Giúp");

        btnInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Actions-help-about-icon-16.png"))); // NOI18N
        btnInfo.setText("Nội Dung");
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });
        jMenu3.add(btnInfo);
        jMenu3.add(jSeparator4);

        tbrAboutUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Help-icon-16.png"))); // NOI18N
        tbrAboutUs.setText("Giới Thiệu");
        tbrAboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbrAboutUsActionPerformed(evt);
            }
        });
        jMenu3.add(tbrAboutUs);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tplMainBoard, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLoginName)
                .addGap(33, 33, 33)
                .addComponent(lblRole)
                .addGap(107, 107, 107))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLoginName)
                    .addComponent(lblRole))
                .addGap(5, 5, 5)
                .addComponent(tplMainBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        this.dispose();
        LoginForm form = new LoginForm();
        form.setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void mnuManageStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuManageStudentActionPerformed
        // TODO add your handling code here:
        if (smp == null) {
            smp = new StudentManagermentPanel();
             ImageIcon icon = new ImageIcon(getClass().getResource("/icon/10207-man-student-light-skin-tone-icon-16.png"));
            tplMainBoard.addTab("Quản lý sinh viên", icon, smp, "Quản lý sinh viên");
            tplMainBoard.setSelectedComponent(smp);
        }
    }//GEN-LAST:event_mnuManageStudentActionPerformed

    private void mnuManageGPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuManageGPAActionPerformed
        // TODO add your handling code here:
        if (gmp == null) {
            gmp = new GPAManagementPanel();
             ImageIcon icon = new ImageIcon(getClass().getResource("/icon/gpa-icon.png"));
            tplMainBoard.addTab("Quản lý điểm", icon, gmp, "Quản lý điểm");
            tplMainBoard.setSelectedComponent(gmp);
        }
    }//GEN-LAST:event_mnuManageGPAActionPerformed

    private void tbrAboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbrAboutUsActionPerformed
        // TODO add your handling code here:
         AboutUsDialog form = new AboutUsDialog(this, true);
        ImageIcon img = new ImageIcon("/icon/Button-Help-icon.png");
        form.setIconImage(img.getImage());
        form.setVisible(true);
    }//GEN-LAST:event_tbrAboutUsActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        // TODO add your handling code here:
        //ImageIcon icon = new ImageIcon(getClass().getResource("/icon/10207-man-student-light-skin-tone-icon-16.png"));
        InformationDialog form = new InformationDialog(this, true);
        form.setVisible(true);
    }//GEN-LAST:event_btnInfoActionPerformed

    private void processLoginSuccessful(){
        lblLoginName.setText(ShareData.nguoiDangNhap.getTenDangNhap());
        lblRole.setText(ShareData.nguoiDangNhap.getVaiTro());
        if(ShareData.nguoiDangNhap.getVaiTro().equals("Giảng Viên")){
            mnuManageGPA.setEnabled(true);
            mnuManageStudent.setEnabled(false);
        }else if(ShareData.nguoiDangNhap.getVaiTro().equals("Đào Tạo")){
            mnuManageGPA.setEnabled(false);
            mnuManageStudent.setEnabled(true);
        }else{
            mnuManageGPA.setEnabled(true);
            mnuManageStudent.setEnabled(true);
        }
    }
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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnInfo;
    private javax.swing.JMenuItem btnLogout;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JLabel lblLoginName;
    private javax.swing.JLabel lblRole;
    private javax.swing.JMenu menu5;
    private javax.swing.JMenuItem mnuManageGPA;
    private javax.swing.JMenuItem mnuManageStudent;
    private javax.swing.JMenuItem tbrAboutUs;
    private javax.swing.JTabbedPane tplMainBoard;
    // End of variables declaration//GEN-END:variables
}