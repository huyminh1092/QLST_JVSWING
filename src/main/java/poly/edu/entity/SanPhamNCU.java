
package poly.edu.entity;

import java.util.Date;


public class SanPhamNCU {
    int maSP;
    String maNCU;
    String tenSP;
    Date hanSuDung;
    double gia;

    public SanPhamNCU() {
    }

    public SanPhamNCU(int maSP, String maNCU, String tenSP, Date hanSuDung, double gia) {
        this.maSP = maSP;
        this.maNCU = maNCU;
        this.tenSP = tenSP;
        this.hanSuDung = hanSuDung;
        this.gia = gia;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public String getMaNCU() {
        return maNCU;
    }

    public void setMaNCU(String maNCU) {
        this.maNCU = maNCU;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public Date getHanSuDung() {
        return hanSuDung;
    }

    public void setHanSuDung(Date hanSuDung) {
        this.hanSuDung = hanSuDung;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    
    @Override
    public String toString() {
        return this.tenSP;
    }

//    @Override
//    public boolean equals(Object obj) {
//        SanPhamNCU other = (SanPhamNCU) obj;
//        return other.getMaSP() == (this.getMaSP());
//    }
    
}
