/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.phonghoc;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
class PhongThiNghiem extends PhongHoc {
    private String chuyenNganh;
    private int sucChua;
    private boolean coBonRua;

    public PhongThiNghiem(String maPhong, String dayNha, double dienTich, int soBongDen, String chuyenNganh, int sucChua, boolean coBonRua) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.chuyenNganh = chuyenNganh;
        this.sucChua = sucChua;
        this.coBonRua = coBonRua;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public int getSucChua() {
        return sucChua;
    }

    public void setSucChua(int sucChua) {
        this.sucChua = sucChua;
    }

    public boolean isCoBonRua() {
        return coBonRua;
    }

    public void setCoBonRua(boolean coBonRua) {
        this.coBonRua = coBonRua;
    }

    @Override
    public String toString() {
        return "PhongThiNghiem{" +
                "maPhong='" + getMaPhong() + '\'' +
                ", dayNha='" + getDayNha() + '\'' +
                ", dienTich=" + getDienTich() +
                ", soBongDen=" + getSoBongDen() +
                ", chuyenNganh='" + chuyenNganh + '\'' +
                ", sucChua=" + sucChua +
                ", coBonRua=" + coBonRua +
                '}';
    }
}

