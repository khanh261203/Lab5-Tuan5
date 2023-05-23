/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.khachhang;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
        QuanLy quanLyHangDoi = new QuanLy();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("----- Hệ thống quản lý hàng đợi mua vé tại nhà ga -----");
            System.out.println("1. Thêm khách hàng mới vào hàng đợi mua vé");
            System.out.println("2. Bán một vé cho khách hàng");
            System.out.println("3. Hiển thị danh sách khách hàng");
            System.out.println("4. Hủy một khách hàng ra khỏi danh sách");
            System.out.println("5. Thống kê tình hình bán vé");
            System.out.println("6. Lưu danh sách vào file");
            System.out.println("7. Hiển thị danh sách các ga đang chờ mua vé");
            System.out.println("8. Hiển thị danh sách các ga đang chờ mua vé và số vé tương ứng");
            System.out.println("0. Thoát chương trình");
            System.out.println("-------------------------------------------------------");
            System.out.print("Chọn mục: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner.nextLine();
                    System.out.print("Nhập số CMND khách hàng: ");
                    String soCMND = scanner.nextLine();
                    System.out.print("Nhập tên khách hàng: ");
                    String ten = scanner.nextLine();
                    System.out.print("Nhập ga đến: ");
                    String gaDen = scanner.nextLine();
                    System.out.print("Nhập giá tiền: ");
                    double giaTien = scanner.nextDouble();
                    quanLyHangDoi.themKhachHang(soCMND, ten, gaDen, giaTien);
                    break;
                case 2:
                    quanLyHangDoi.banVe();
                    break;
                case 3:
                    quanLyHangDoi.hienThiDanhSachKhachHang();
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.print("Nhập số CMND khách hàng cần hủy: ");
                    String cmndHuy = scanner.nextLine();
                    quanLyHangDoi.huyKhachHang(cmndHuy);
                    break;
                case 5:
                    quanLyHangDoi.thongKeTinhHinhBanVe();
                    break;
                case 6:
                    scanner.nextLine();
                    System.out.print("Nhập tên file: ");
                    String tenFile = scanner.nextLine();
                    quanLyHangDoi.luuDanhSachVaoFile(tenFile);
                    break;
                case 7:
                    quanLyHangDoi.hienThiDanhSachGaDenChoMuaVe();
                    break;
                case 8:
                    quanLyHangDoi.hienThiDanhSachGaDenVaSoVeTuongUng();
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        }

        scanner.close();
    }
}
