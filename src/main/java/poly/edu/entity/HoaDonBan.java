/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.edu.entity;

import java.util.Date;

/**
 *
 * @author Minh Huy
 */
public class HoaDonBan {
    String maHDBan;
    String maNV;
    String maKH;
    Date ngayTao;
    int giamgia;
    double tongTien,thanhtienHD;
    boolean trangthai;

    public HoaDonBan() {
    }

    public HoaDonBan(String maHDBan, String maNV, String maKH, Date ngayTao, int giamgia, double tongTien, double thanhtienHD, boolean trangthai) {
        this.maHDBan = maHDBan;
        this.maNV = maNV;
        this.maKH = maKH;
        this.ngayTao = ngayTao;
        this.giamgia = giamgia;
        this.tongTien = tongTien;
        this.thanhtienHD = thanhtienHD;
        this.trangthai = trangthai;
    }

    public String getMaHDBan() {
        return maHDBan;
    }

    public void setMaHDBan(String maHDBan) {
        this.maHDBan = maHDBan;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public int getGiamgia() {
        return giamgia;
    }

    public void setGiamgia(int giamgia) {
        this.giamgia = giamgia;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public double getThanhtienHD() {
        return thanhtienHD;
    }

    public void setThanhtienHD(double thanhtienHD) {
        this.thanhtienHD = thanhtienHD;
    }

    public boolean isTrangthai() {
        return trangthai;
    }

    public void setTrangthai(boolean trangthai) {
        this.trangthai = trangthai;
    }
    
    public double getTongTienHD(double x){
    return x - (x * (giamgia/100));
    }
   
    
}
