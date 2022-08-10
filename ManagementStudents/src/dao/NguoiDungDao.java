/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import database.JDBCUtil;
import java.sql.*;
import model.NguoiDung;

/**
 *
 * @author Dell
 */
public class NguoiDungDao {
    public NguoiDung checkLogin(String tenDangNhap, String matKhau) {
        Connection con = null;
        try {
            // tạo kết nối
            con = (Connection) JDBCUtil.getConnection();
            String sql = "SELECT * FROM `nguoi_dung` WHERE TenDangNhap = ? and MatKhau = ?";
            //tạo đối tượng statement
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, tenDangNhap);
            pstmt.setString(2, matKhau);
            System.out.println(sql);
            //thuc hien cau lenh
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                NguoiDung nd = new NguoiDung();
                nd.setTenDangNhap(tenDangNhap);
                //nd.setMatKhau(matKhau);
                nd.setVaiTro(rs.getString("vaitro"));
                return nd;
            }
        } catch (SQLException e) {
        }
        return null;
    }
}
