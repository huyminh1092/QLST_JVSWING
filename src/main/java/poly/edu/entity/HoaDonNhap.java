
package poly.edu.entity;

import java.util.Date;


public class HoaDonNhap {
    String maHDNhap;
    String maNV;
    String maNCU;
    Date ngayNhap;
    double tongTienNhap;
    Boolean trangThai;

    public HoaDonNhap() {
    }

    public HoaDonNhap(String maHDNhap, String maNV, String maNCU, Date ngayNhap, double tongTienNhap, Boolean trangThai) {
        this.maHDNhap = maHDNhap;
        this.maNV = maNV;
        this.maNCU = maNCU;
        this.ngayNhap = ngayNhap;
        this.tongTienNhap = tongTienNhap;
        this.trangThai = trangThai;
    }

    
    public String getMaHDNhap() {
        return maHDNhap;
    }

    public void setMaHDNhap(String maHDNhap) {
        this.maHDNhap = maHDNhap;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMaNCU() {
        return maNCU;
    }

    public void setMaNCU(String maNCU) {
        this.maNCU = maNCU;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public double getTongTienNhap() {
        return tongTienNhap;
    }

    public void setTongTienNhap(double tongTienNhap) {
        this.tongTienNhap = tongTienNhap;
    }

    public Boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }
    
    
    
    
}
