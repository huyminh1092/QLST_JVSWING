
package poly.edu.entity;


public class HoaDonChiTietNhap {
    int maHDCTnhap;
    String maHDNnhap;
    String maSPnhap;
    String tenSPnhap;
    String donViTinh;
    double giaNhap;
    int soLuong;
    double tongTien;

    public HoaDonChiTietNhap() {
    }

    public HoaDonChiTietNhap(int maHDCTnhap, String maHDNnhap, String maSPnhap, String tenSPnhap, String donViTinh, double giaNhap, int soLuong, double tongTien) {
        this.maHDCTnhap = maHDCTnhap;
        this.maHDNnhap = maHDNnhap;
        this.maSPnhap = maSPnhap;
        this.tenSPnhap = tenSPnhap;
        this.donViTinh = donViTinh;
        this.giaNhap = giaNhap;
        this.soLuong = soLuong;
        this.tongTien = tongTien;
    }

    


    public int getMaHDCTnhap() {
        return maHDCTnhap;
    }

    public void setMaHDCTnhap(int maHDCTnhap) {
        this.maHDCTnhap = maHDCTnhap;
    }

    public String getMaHDNnhap() {
        return maHDNnhap;
    }

    public void setMaHDNnhap(String maHDNnhap) {
        this.maHDNnhap = maHDNnhap;
    }

    public String getMaSPnhap() {
        return maSPnhap;
    }

    public void setMaSPnhap(String maSPnhap) {
        this.maSPnhap = maSPnhap;
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

    public double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(double giaNhap) {
        this.giaNhap = giaNhap;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    public double thanhTien() {
        return soLuong * giaNhap;
    }
    
}
