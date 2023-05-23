/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.khachhang;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 *
 * @author ADMIN
 */
class QuanLy {
    Queue<KhachHang> hangDoi;
    List<KhachHang> danhSachDaMua;

    public QuanLy() {
        hangDoi = new LinkedList<>();
        danhSachDaMua = new ArrayList<>();
    }

    public void themKhachHang(String soCMND, String ten, String gaDen, double giaTien) {
        if (!kiemTraTrungCMND(soCMND)) {
            KhachHang khachHangMoi = new KhachHang(soCMND, ten, gaDen, giaTien);
            hangDoi.add(khachHangMoi);
            System.out.println("Thêm khách hàng thành công vào hàng đợi mua vé.");
        } else {
            System.out.println("Số CMND đã tồn tại trong danh sách.");
        }
    }

    public void banVe() {
        if (!hangDoi.isEmpty()) {
            KhachHang khachHangDauHangDoi = hangDoi.poll();
            danhSachDaMua.add(khachHangDauHangDoi);
            System.out.println("Bán vé thành công cho khách hàng: " + khachHangDauHangDoi.ten);
        } else {
            System.out.println("Không có khách hàng trong hàng đợi.");
        }
    }

    public void hienThiDanhSachKhachHang() {
        if (!hangDoi.isEmpty()) {
            System.out.println("Danh sách khách hàng đang chờ mua vé:");
            for (KhachHang khachHang : hangDoi) {
                System.out.println(khachHang.toString());
            }
        } else {
            System.out.println("Không có khách hàng trong hàng đợi.");
        }
    }

    public void huyKhachHang(String soCMND) {
        Iterator<KhachHang> iterator = hangDoi.iterator();
        boolean found = false;
        while (iterator.hasNext()) {
            KhachHang khachHang = iterator.next();
            if (khachHang.soCMND.equals(soCMND)) {
                iterator.remove();
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Hủy khách hàng thành công.");
        } else {
            System.out.println("Không tìm thấy khách hàng trong hàng đợi.");
        }
    }

    public void thongKeTinhHinhBanVe() {
        int soKhachHangChoNhanVe = hangDoi.size();
        int soKhachHangDaNhanVe = danhSachDaMua.size();
        double tongTienThuVe = 0;
        for (KhachHang khachHang : danhSachDaMua) {
            tongTienThuVe += khachHang.giaTien;
        }
        System.out.println("Số khách hàng chờ nhận vé: " + soKhachHangChoNhanVe);
        System.out.println("Số khách hàng đã nhận vé: " + soKhachHangDaNhanVe);
        System.out.println("Tổng số tiền thu về: " + tongTienThuVe);
    }

    public void luuDanhSachVaoFile(String tenFile) {
        try {
            FileWriter fileWriter = new FileWriter(tenFile);
            for (KhachHang khachHang : danhSachDaMua) {
                fileWriter.write(khachHang.soCMND + "," + khachHang.ten + "," + khachHang.gaDen + "," + khachHang.giaTien + "\n");
            }
            fileWriter.close();
            System.out.println("Lưu danh sách khách hàng vào file thành công.");
        } catch (IOException e) {
            System.out.println("Lỗi khi lưu danh sách vào file.");
        }
    }

    public void hienThiDanhSachGaDenChoMuaVe() {
        Set<String> gaDenSet = new HashSet<>();
        for (KhachHang khachHang : hangDoi) {
            gaDenSet.add(khachHang.gaDen);
        }
        System.out.println("Danh sách các ga đến đang chờ mua vé:");
        for (String gaDen : gaDenSet) {
            System.out.println(gaDen);
        }
    }

    public void hienThiDanhSachGaDenVaSoVeTuongUng() {
        Map<String, Integer> gaDenSoVeMap = new HashMap<>();
        for (KhachHang khachHang : hangDoi) {
            if (gaDenSoVeMap.containsKey(khachHang.gaDen)) {
                int soVe = gaDenSoVeMap.get(khachHang.gaDen);
                gaDenSoVeMap.put(khachHang.gaDen, soVe + 1);
            } else {
                gaDenSoVeMap.put(khachHang.gaDen, 1);
            }
        }
        System.out.println("Danh sách các ga đến đang chờ mua vé và số vé tương ứng:");
        for (Map.Entry<String, Integer> entry : gaDenSoVeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " vé");
        }
    }

    public boolean kiemTraTrungCMND(String soCMND) {
        for (KhachHang khachHang : hangDoi) {
            if (khachHang.soCMND.equals(soCMND)) {
                return true;
            }
        }
        return false;
    }
}
