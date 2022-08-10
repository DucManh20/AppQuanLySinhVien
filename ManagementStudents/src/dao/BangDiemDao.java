/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import database.JDBCUtil;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.BangDiem;

/**
 *
 * @author Dell
 */
public class BangDiemDao {

    public static void insert(BangDiem bd) {
        Connection con;
        try {
            // tạo kết nối
            con = (Connection) JDBCUtil.getConnection();
            String sql = "INSERT INTO `bang_diem`(`MaSinhVien`, `ThanhPhan1`, `ThanhPhan2`, `CuoiKy`) VALUES ("
                    + "'" + bd.getMaSinhVien() + "', " + bd.getThanhPhan1() + ", " + bd.getThanhPhan2() + ", " + bd.getCuoiKy() + ")";
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

    public static void update(BangDiem bd) {
        Connection con;
        try {
            // tạo kết nối
            con = (Connection) JDBCUtil.getConnection();
            String sql = "UPDATE bang_diem" + ""
                    + " SET " + "ThanhPhan1 = " + bd.getThanhPhan1() + ", ThanhPhan2 = " + bd.getThanhPhan2() + ", CuoiKy = " + bd.getCuoiKy()
                    + " WHERE MaSinhVien = '" + bd.getMaSinhVien() + "'";
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

    public static void delete(BangDiem bd) {
        Connection con;
        try {
            // tạo kết nối
            con = (Connection) JDBCUtil.getConnection();
            String sql = "DELETE from bang_diem" + ""
                    + " WHERE MaSinhVien = '" + bd.getMaSinhVien() + "'";
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

    public static void search(BangDiem bd) {
        Connection con;
        try {
            // tạo kết nối
            con = (Connection) JDBCUtil.getConnection();
            String sql = "SELECT * FROM bang_diem WHERE MaSinhVien = '" + bd.getMaSinhVien() + "'";
            //tạo đối tượng statement
            System.out.println(sql);
            //thuc hien cau lenh
            Statement st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                bd.setMa(rs.getInt("Ma"));
                //bd.setMaSinhVien(rs.getString("MaSinhVien"));
                bd.setThanhPhan1(rs.getFloat("ThanhPhan1"));
                bd.setThanhPhan2(rs.getFloat("ThanhPhan2"));
                bd.setCuoiKy(rs.getFloat("CuoiKy"));
            }
            System.out.println("Thanh cong");
            //dong ket noi
            con.close();
        } catch (SQLException e) {
        }
    }

    public static List findAll1() {
        List<BangDiem> ds = new ArrayList<>();
        Connection con;
        try {
            // tạo kết nối
            con = (Connection) JDBCUtil.getConnection();
            String sql = "SELECT * FROM bang_diem";
            //tạo đối tượng statement
            System.out.println(sql);
            //thuc hien cau lenh
            Statement st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                BangDiem bd = new BangDiem();
                bd.setMa(rs.getInt("Ma"));
                bd.setMaSinhVien(rs.getString("MaSinhVien"));
                bd.setThanhPhan1(rs.getFloat("ThanhPhan1"));
                bd.setThanhPhan2(rs.getFloat("ThanhPhan2"));
                bd.setCuoiKy(rs.getFloat("CuoiKy"));
                ds.add(bd);
            }
            System.out.println("Thanh cong");
            //dong ket noi
            con.close();
        } catch (SQLException e) {
        }
        return ds;
    }
}
