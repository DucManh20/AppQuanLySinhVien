/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package app;

import dao.SinhVienDao;
import database.DataValidator;
import database.MessageDialog;
import java.awt.Color;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.SinhVien;

/**
 *
 * @author Dell
 */
public class StudentManagermentPanel extends javax.swing.JPanel {

    DefaultTableModel tblModel;
    private MainForm parent;

    /**
     * Creates new form StudentManagermentPanel
     */
    public StudentManagermentPanel() {
        initComponents();
        initTable(); // khởi tạo bảng
        loadDataToTable(); // đổ dữ liệu ra bảng
    }

    private void initTable() {
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{"Mã Sinh Viên", "Họ Tên", "Email", "Số ĐT", "Giới Tính", "Địa Chỉ"});
        tblStudents.setModel(tblModel);
    }

    private void loadDataToTable() {
        List<SinhVien> list = SinhVienDao.findAll1();
        tblModel.setRowCount(0);
        for (SinhVien sv : list) {
            tblModel.addRow(new Object[]{
                sv.getMaSinhVien(), sv.getHoTen(), sv.getEmail(), sv.getSoDT(), sv.getGioiTinh(), sv.getDiaChi()
            });
        }
        tblModel.fireTableDataChanged(); // đảm bảo dữ liệu sau khi thay đổi được hiển thị trên bảng
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtStudentID = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaAddress = new javax.swing.JTextArea();
        rdbMale = new javax.swing.JRadioButton();
        rdbFemale = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        btnImage = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblStudents = new javax.swing.JTable();
        btnSreach = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jTextField4.setText("jTextField1");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Quản lý sinh viên");

        jLabel2.setText("Mã Sinh Viên:");

        jLabel3.setText("Họ tên:");

        jLabel4.setText("Email:");

        jLabel5.setText("Số Điện Thoại:");

        jLabel6.setText("Giới Tính:");

        jLabel7.setText("Địa Chỉ:");

        txaAddress.setColumns(20);
        txaAddress.setRows(5);
        jScrollPane1.setViewportView(txaAddress);

        buttonGroup1.add(rdbMale);
        rdbMale.setSelected(true);
        rdbMale.setText("Nam");

        buttonGroup1.add(rdbFemale);
        rdbFemale.setText("Nữ");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/10207-man-student-light-skin-tone-icon-64.png"))); // NOI18N

        btnImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/open-file-icon-16.png"))); // NOI18N
        btnImage.setText("Hình Ảnh");

        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/new-icon-16.png"))); // NOI18N
        btnNew.setText("Tạo mới");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Save-icon.png"))); // NOI18N
        btnSave.setText("Lưu");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Actions-document-edit-icon-16.png"))); // NOI18N
        btnUpdate.setText("Cập Nhật");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Actions-edit-delete-icon-16.png"))); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        tblStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã Sinh Viên", "Họ Tên", "Email", "Số Điện Thoại", "Giới Tính", "Địa Chỉ"
            }
        ));
        tblStudents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStudentsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblStudents);

        btnSreach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search-icon-16.png"))); // NOI18N
        btnSreach.setText("Tìm kiếm");
        btnSreach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSreachActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Actions-document-edit-icon-16.png"))); // NOI18N
        jButton1.setText("Sort");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                        .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(rdbMale)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rdbFemale)))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(71, 71, 71)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(96, 96, 96)
                                        .addComponent(btnImage)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnNew)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSreach)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPhone)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(rdbMale)
                            .addComponent(rdbFemale))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnImage)
                        .addGap(52, 52, 52)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew)
                    .addComponent(btnSave)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnSreach)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        txtEmail.setText("");
        txtName.setText("");
        txtPhone.setText("");
        txtStudentID.setText("");
        txaAddress.setText("");
        if (!rdbMale.isSelected()) {
            rdbMale.setSelected(true);
        }
        txtName.setBackground(Color.white);
        txtStudentID.setBackground(Color.white);
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmpty(txtStudentID, sb, "Không để trống mã sinh viên");
        DataValidator.validateEmpty(txtName, sb, "Không để trống tên");
        if (sb.length() > 0) {
            MessageDialog.showErrorDialog(parent, sb.toString(), "Lỗi");
            return;
        }
        SinhVien sv = new SinhVien();
        sv.setMaSinhVien(txtStudentID.getText());
        sv.setHoTen(txtName.getText());
        sv.setSoDT(txtPhone.getText());
        sv.setDiaChi(txaAddress.getText());
        sv.setEmail(txtEmail.getText());
        sv.setGioiTinh(rdbMale.isSelected() ? "Nam" : "Nữ");
        try {
            SinhVienDao.insert(sv);
            MessageDialog.showMessageDialog(parent, "Sinh viên đã được lưu", "Thông báo");
            loadDataToTable();
        } catch (Exception e) {
            MessageDialog.showErrorDialog(parent, e.getMessage(), "Lỗi");
        }


    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmpty(txtStudentID, sb, "Không để trống mã sinh viên");
        DataValidator.validateEmpty(txtName, sb, "Không để trống tên");
        if (sb.length() > 0) {
            MessageDialog.showErrorDialog(parent, sb.toString(), "Lỗi");
            return;
        }
        if (MessageDialog.showConfirmDialog(parent, "Bạn có chắc muốn thay đổi thông tin sinh viên không?", "Hỏi") == JOptionPane.NO_OPTION) {
            return;
        }
        SinhVien sv = new SinhVien();
        sv.setMaSinhVien(txtStudentID.getText());
        sv.setHoTen(txtName.getText());
        sv.setSoDT(txtPhone.getText());
        sv.setDiaChi(txaAddress.getText());
        sv.setEmail(txtEmail.getText());
        sv.setGioiTinh(rdbMale.isSelected() ? "Nam" : "Nữ");
        try {
            SinhVienDao.update(sv);
            MessageDialog.showMessageDialog(parent, "Sinh viên đã được cập nhật", "Thông báo");
            loadDataToTable();
        } catch (Exception e) {
            MessageDialog.showErrorDialog(parent, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmpty(txtStudentID, sb, "Không để trống mã sinh viên");
        if (sb.length() > 0) {
            MessageDialog.showErrorDialog(parent, sb.toString(), "Lỗi");
            return;
        }
        if (MessageDialog.showConfirmDialog(parent, "Bạn có chắc muốn xóa thông tin sinh viên không?", "Hỏi") == JOptionPane.NO_OPTION) {
            return;
        }
        SinhVien sv = new SinhVien();
        sv.setMaSinhVien(txtStudentID.getText());
        try {
            SinhVienDao.delete(sv);
            MessageDialog.showMessageDialog(parent, "Đã xóa thông tin sinh viên", "Thông báo");
            loadDataToTable();
        } catch (Exception e) {
            MessageDialog.showErrorDialog(parent, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSreachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSreachActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmpty(txtStudentID, sb, "Không để trống id");
        if (sb.length() > 0) {
            MessageDialog.showErrorDialog(parent, sb.toString(), "Lỗi");
            return;
        }
        try {
            SinhVien sv = new SinhVien();
            sv.setMaSinhVien(txtStudentID.getText());
            SinhVienDao.search(sv);
            txtEmail.setText(sv.getEmail());
            txtName.setText(sv.getHoTen());
            txtPhone.setText(sv.getSoDT());
            txaAddress.setText(sv.getDiaChi());
            if (sv.getGioiTinh().equals("Nam")) {
                rdbMale.setSelected(true);
            } else {
                rdbFemale.setSelected(true);
            }
        } catch (Exception e) {
            MessageDialog.showErrorDialog(parent, "Mã sinh viên không tồn tại", "Lỗi");
        }
    }//GEN-LAST:event_btnSreachActionPerformed

    private void tblStudentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStudentsMouseClicked
        // TODO add your handling code here:
        try {
            int row = tblStudents.getSelectedRow();
            if (row >= 0) {
                String id = (String) tblStudents.getValueAt(row, 0);
                SinhVien sv = new SinhVien();
                sv.setMaSinhVien(id);
                SinhVienDao.search(sv);
                if (sv != null) {
                    txtStudentID.setText(sv.getMaSinhVien());
                    txtName.setText(sv.getHoTen());
                    txtPhone.setText(sv.getSoDT());
                    txtEmail.setText(sv.getEmail());
                    txaAddress.setText(sv.getDiaChi());
                    if (sv.getGioiTinh().equals("Nam")) {
                        rdbMale.setSelected(true);
                    } else {
                        rdbFemale.setSelected(true);
                    }
                }
            }
        } catch (Exception e) {
            MessageDialog.showErrorDialog(parent, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_tblStudentsMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        List<SinhVien> ds = SinhVienDao.findAll1();
        Collections.sort(ds, (SinhVien o1, SinhVien o2) -> o2.getMaSinhVien().compareTo(o1.getMaSinhVien()));
        
         tblModel.setRowCount(0);
        for (SinhVien sv : ds) {
            tblModel.addRow(new Object[]{
                sv.getMaSinhVien(), sv.getHoTen(), sv.getEmail(), sv.getSoDT(), sv.getGioiTinh(), sv.getDiaChi()
            });
        }
        tblModel.fireTableDataChanged(); // đảm bảo dữ liệu sau khi thay đổi được hiển thị trên bảng
        

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnImage;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSreach;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JRadioButton rdbFemale;
    private javax.swing.JRadioButton rdbMale;
    private javax.swing.JTable tblStudents;
    private javax.swing.JTextArea txaAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtStudentID;
    // End of variables declaration//GEN-END:variables
}
