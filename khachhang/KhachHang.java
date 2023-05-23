/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.khachhang;

/**
 *
 * @author ADMIN
 */
import java.io.*;
import java.util.*;

public class KhachHang {
    String soCMND;
    String ten;
    String gaDen;
    double giaTien;

    public KhachHang(String soCMND, String ten, String gaDen, double giaTien) {
        this.soCMND = soCMND;
        this.ten = ten;
        this.gaDen = gaDen;
        this.giaTien = giaTien;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGaDen() {
        return gaDen;
    }

    public void setGaDen(String gaDen) {
        this.gaDen = gaDen;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    public KhachHang() {
    }

    public String toString() {
        return "Số CMND: " + soCMND + ", Tên: " + ten + ", Ga đến: " + gaDen + ", Giá tiền: " + giaTien;
    }
}




