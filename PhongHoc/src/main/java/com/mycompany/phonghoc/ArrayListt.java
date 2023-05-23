/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.phonghoc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
class ArrayListt {
    private ArrayList<PhongHoc> danhSachPhongHoc;

    public ArrayListt() {
        danhSachPhongHoc = new ArrayList<>();
    }

    public void themPhongHoc(PhongHoc phongHoc) {
        if (!kiemTraTonTai(phongHoc.getMaPhong())) {
            danhSachPhongHoc.add(phongHoc);
            System.out.println("Them phong hoc thanh cong.");
        } else {
            System.out.println("Ma phong da ton tai khong the them phong hoc.");
        }
    }

    public void timPhongHoc(String maPhong) {
        for (PhongHoc phongHoc : danhSachPhongHoc) {
            if (phongHoc.getMaPhong().equals(maPhong)) {
                System.out.println(phongHoc.toString());
                return;
            }
        }
        System.out.println("Khong tim thay phong hoc voi ma phong " + maPhong);
    }

    public void inDanhSachPhongHoc() {
        for (PhongHoc phongHoc : danhSachPhongHoc) {
            System.out.println(phongHoc.toString());
        }
    }

    public void inDanhSachPhongHocDatChuan() {
        for (PhongHoc phongHoc : danhSachPhongHoc) {
            if (phongHoc instanceof PhongHocLyThuyet) {
                if (((PhongHocLyThuyet) phongHoc).isCoMayChieu()) {
                    System.out.println(phongHoc.toString());
                }
            } else if (phongHoc instanceof PhongMayTinh) {
                if (phongHoc.getDienTich() / ((PhongMayTinh) phongHoc).getSoMayTinh() >= 1.5) {
                    System.out.println(phongHoc.toString());
                }
            } else if (phongHoc instanceof PhongThiNghiem) {
                if (((PhongThiNghiem) phongHoc).isCoBonRua()) {
                    System.out.println(phongHoc.toString());
                }
            }
        }
    }

    public void sapXepTheoDayNha() {
        Collections.sort(danhSachPhongHoc, Comparator.comparing(PhongHoc::getDayNha));
    }

    public void sapXepTheoDienTich() {
        Collections.sort(danhSachPhongHoc, Comparator.comparing(PhongHoc::getDienTich));
    }

    public void sapXepTheoSoBongDen() {
        Collections.sort(danhSachPhongHoc, Comparator.comparing(PhongHoc::getSoBongDen));
    }

    public void capNhatSoMayTinh(String maPhong, int soMayTinh) {
        for (PhongHoc phongHoc : danhSachPhongHoc) {
            if (phongHoc instanceof PhongMayTinh && phongHoc.getMaPhong().equals(maPhong)) {
                ((PhongMayTinh) phongHoc).setSoMayTinh(soMayTinh);
                System.out.println("Cap nhat so may tinh thanh cong.");
                return;
            }
        }
        System.out.println("Khong tim thay phong may tinh voi ma phong " + maPhong);
    }

    public void xoaPhongHoc(String maPhong) {
        for (PhongHoc phongHoc : danhSachPhongHoc) {
            if (phongHoc.getMaPhong().equals(maPhong)) {
                danhSachPhongHoc.remove(phongHoc);
                System.out.println("Xoa phong hoc thanh cong.");
                return;
            }
        }
        System.out.println("Khong tim thay phong hoc voi ma phong " + maPhong);
    }

    public int demSoPhongHoc() {
        return danhSachPhongHoc.size();
    }

    public void inDanhSachPhongMayTinh(int soMayTinh) {
        for (PhongHoc phongHoc : danhSachPhongHoc) {
            if (phongHoc instanceof PhongMayTinh && ((PhongMayTinh) phongHoc).getSoMayTinh() == soMayTinh) {
                System.out.println(phongHoc.toString());
            }
        }
    }

    private boolean kiemTraTonTai(String maPhong) {
        for (PhongHoc phongHoc : danhSachPhongHoc) {
            if (phongHoc.getMaPhong().equals(maPhong)) {
                return true;
            }
        }
        return false;
    }
}
