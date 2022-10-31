
package poly.edu.entity;

import java.util.Date;


public class SanPham {
    String maSP;
    String tenSP;
    String maLH;
    String tenLH;
    String tenNCU;
    double giaNhap;
    double giaBan;
    String viTri;
    int soLuong;
    Date ngayNhap;
    Date hSD;
    String hinh;
    String ghiChu;
    int giamGia;
    String DonVi;

    public SanPham() {
    }

    public SanPham(String maSP, String tenSP, String maLH, String tenLH, String tenNCU, double giaNhap, double giaBan, String viTri, int soLuong, Date ngayNhap, Date hSD, String hinh, String ghiChu, int giamGia, String DonVi) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.maLH = maLH;
        this.tenLH = tenLH;
        this.tenNCU = tenNCU;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.viTri = viTri;
        this.soLuong = soLuong;
        this.ngayNhap = ngayNhap;
        this.hSD = hSD;
        this.hinh = hinh;
        this.ghiChu = ghiChu;
        this.giamGia = giamGia;
        this.DonVi = DonVi;
    }

    

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getMaLH() {
        return maLH;
    }

    public void setMaLH(String maLH) {
        this.maLH = maLH;
    }

    public String getTenLH() {
        return tenLH;
    }

    public void setTenLH(String tenLH) {
        this.tenLH = tenLH;
    }

    public String getTenNCU() {
        return tenNCU;
    }

    public void setTenNCU(String tenNCU) {
        this.tenNCU = tenNCU;
    }

    public double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(double giaNhap) {
        this.giaNhap = giaNhap;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public Date gethSD() {
        return hSD;
    }

    public void sethSD(Date hSD) {
        this.hSD = hSD;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public int getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(int giamGia) {
        this.giamGia = giamGia;
    }

    public String getDonVi() {
        return DonVi;
    }

    public void setDonVi(String DonVi) {
        this.DonVi = DonVi;
    }
    
    
    
    
}
