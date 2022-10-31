/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.edu.entity;

/**
 *
 * @author Minh Huy
 */
public class HoaDonChiTietBan {
    int maHDCTban;
    String maHDNban;
    String maSPham;
    String tenSPnhap;
    String donViTinh;
    double giaBan;
    int giamgia;
    int soLuong;
    double thanhTien;

    public HoaDonChiTietBan() {
    }

    public HoaDonChiTietBan(int maHDCTban, String maHDNban, String maSPham, String tenSPnhap, String donViTinh, double giaBan, int giamgia, int soLuong, double thanhTien) {
        this.maHDCTban = maHDCTban;
        this.maHDNban = maHDNban;
        this.maSPham = maSPham;
        this.tenSPnhap = tenSPnhap;
        this.donViTinh = donViTinh;
        this.giaBan = giaBan;
        this.giamgia = giamgia;
        this.soLuong = soLuong;
        this.thanhTien = thanhTien;
    }

   

    public int getMaHDCTban() {
        return maHDCTban;
    }

    public void setMaHDCTban(int maHDCTban) {
        this.maHDCTban = maHDCTban;
    }

    public String getMaHDNban() {
        return maHDNban;
    }

    public void setMaHDNban(String maHDNban) {
        this.maHDNban = maHDNban;
    }

    public String getMaSPham() {
        return maSPham;
    }

    public void setMaSPham(String maSPham) {
        this.maSPham = maSPham;
    }

    

    public String getTenSPnhap() {
        return tenSPnhap;
    }

    public void setTenSPnhap(String tenSPnhap) {
        this.tenSPnhap = tenSPnhap;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public int getGiamgia() {
        return giamgia;
    }

    public void setGiamgia(int giamgia) {
        this.giamgia = giamgia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }
    
     public double TotalMoney(){
     return (giaBan*soLuong)-((giaBan*soLuong)*giamgia/100);
     
     }
    
}
