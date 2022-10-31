
package poly.edu.entity;


public class LoaiHang {
    String maLoai;
    String tenLoai;

    public LoaiHang() {
    }

    public LoaiHang(String maLoai, String tenLoai) {
        this.maLoai = maLoai;
        this.tenLoai = tenLoai;
    }

    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }
    
     @Override
    public String toString() {
        return this.tenLoai;
    }

    @Override
    public boolean equals(Object obj) {
        LoaiHang other = (LoaiHang) obj;
        return other.getMaLoai().equals(this.getMaLoai());
    }
    
}
