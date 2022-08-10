/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dell
 */
public class BangDiem {
    private int ma;
    private String maSinhVien;
    private float thanhPhan1, thanhPhan2, cuoiKy;

    public BangDiem() {
    }

    public BangDiem(int ma, String maSinhVien, float thanhPhan1, float thanhPhan2, float cuoiKy) {
        this.ma = ma;
        this.maSinhVien = maSinhVien;
        this.thanhPhan1 = thanhPhan1;
        this.thanhPhan2 = thanhPhan2;
        this.cuoiKy = cuoiKy;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public float getThanhPhan1() {
        return thanhPhan1;
    }

    public void setThanhPhan1(float thanhPhan1) {
        this.thanhPhan1 = thanhPhan1;
    }

    public float getThanhPhan2() {
        return thanhPhan2;
    }

    public void setThanhPhan2(float thanhPhan2) {
        this.thanhPhan2 = thanhPhan2;
    }

    public float getCuoiKy() {
        return cuoiKy;
    }

    public void setCuoiKy(float cuoiKy) {
        this.cuoiKy = cuoiKy;
    }
    
    
}
