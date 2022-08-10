/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import database.JDBCUtil;
import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.SinhVien;

/**
 *
 * @author Dell
 */
public class SinhVienDao {

    public static void insert(SinhVien sv) {
        Connection con;
        try {
            // tạo kết nối
            con = (Connection) JDBCUtil.getConnection();
            String sql = "INSERT INTO `sinh_vien`(`MaSinhVien`, `HoTen`, `Email`, `SoDT`, `GioiTinh`, `DiaChi`) VALUES ('"
                    + sv.getMaSinhVien() + "' , '" + sv.getHoTen() + "', '" + sv.getEmail() + "', '" + sv.getSoDT() + "', '" + sv.getGioiTinh() + "' , '" + sv.getDiaChi() + "')";
            //tạo đối tượng statement
            System.out.println(sql);
            Statement st = (Statement) con.createStatement();
            //thuc hien cau lenh
            st.execute(sql);
            System.out.println("Thanh cong");
            //dong ket noi
            con.close();
        } catch (SQLException e) {
        }
    }

    public static void update(SinhVien sv) {
        Connection con;
        try {
            // tạo kết nối
            con = (Connection) JDBCUtil.getConnection();
            String sql = "UPDATE sinh_vien"
                    + " SET HoTen = '" + sv.getHoTen() + "', Email = '" + sv.getEmail() + "', SoDT = '" + sv.getSoDT() + "', GioiTinh = '" + sv.getGioiTinh() + "', DiaChi = '" + sv.getDiaChi() + "'"
                    + " WHERE MaSinhVien = '" + sv.getMaSinhVien() + "'";
            //tạo đối tượng statement
            System.out.println(sql);
            Statement st = (Statement) con.createStatement();
            //thuc hien cau lenh
            st.execute(sql);
            System.out.println("Thanh cong");
            //dong ket noi
            con.close();
        } catch (SQLException e) {
        }
    }

    public static void delete(SinhVien sv) {
        Connection con;
        try {
            // tạo kết nối
            con = (Connection) JDBCUtil.getConnection();
            String sql = "DELETE from sinh_vien WHERE MaSinhVien = '" + sv.getMaSinhVien() + "'";
            //tạo đối tượng statement
            System.out.println(sql);
            Statement st = (Statement) con.createStatement();
            //thuc hien cau lenh
            st.execute(sql);
            System.out.println("Thanh cong");
            //dong ket noi
            con.close();
        } catch (SQLException e) {
        }
    }

    public static void search(SinhVien sv) {
        Connection con;
        try {
            // tạo kết nối
            con = (Connection) JDBCUtil.getConnection();
            String sql = "SELECT * FROM sinh_vien WHERE MaSinhVien = '" + sv.getMaSinhVien() + "'";
            //tạo đối tượng statement
            System.out.println(sql);
            //thuc hien cau lenh
            Statement st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                sv.setHoTen(rs.getString("HoTen"));
                sv.setDiaChi(rs.getString("DiaChi"));
                sv.setEmail(rs.getString("Email"));
                sv.setGioiTinh(rs.getString("GioiTinh"));
                sv.setSoDT(rs.getString("SoDT"));
            }
            System.out.println("Thanh cong");
            //dong ket noi
            con.close();
        } catch (SQLException e) {
        }
    }

    public static List findAll1() {
        List<SinhVien> ds = new ArrayList<>();
        Connection con;
        try {
            // tạo kết nối
            con = (Connection) JDBCUtil.getConnection();
            String sql = "SELECT * FROM sinh_vien";
            //tạo đối tượng statement
            System.out.println(sql);
            //thuc hien cau lenh
            Statement st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                SinhVien sv = new SinhVien();
                sv.setMaSinhVien(rs.getString("MaSinhVien"));
                sv.setHoTen(rs.getString("HoTen"));
                sv.setDiaChi(rs.getString("DiaChi"));
                sv.setEmail(rs.getString("Email"));
                sv.setGioiTinh(rs.getString("GioiTinh"));
                sv.setSoDT(rs.getString("SoDT"));
                ds.add(sv);
            }
            System.out.println("Thanh cong");
            //dong ket noi
            con.close();
        } catch (SQLException e) {
        }
        return ds;
    }
}
