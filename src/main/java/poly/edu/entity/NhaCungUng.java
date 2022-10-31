
package poly.edu.entity;


public class NhaCungUng {
    String maNCU;
    String tenNCU;
    String sTK;
    String maSoThue;
    String sDT;
    String email;
    String diaChi;

    public NhaCungUng() {
    }

    public NhaCungUng(String maNCU, String tenNCU, String sTK, String maSoThue, String sDT, String email, String diaChi) {
        this.maNCU = maNCU;
        this.tenNCU = tenNCU;
        this.sTK = sTK;
        this.maSoThue = maSoThue;
        this.sDT = sDT;
        this.email = email;
        this.diaChi = diaChi;
    }

    public String getMaNCU() {
        return maNCU;
    }

    public void setMaNCU(String maNCU) {
        this.maNCU = maNCU;
    }

    public String getTenNCU() {
        return tenNCU;
    }

    public void setTenNCU(String tenNCU) {
        this.tenNCU = tenNCU;
    }

    public String getsTK() {
        return sTK;
    }

    public void setsTK(String sTK) {
        this.sTK = sTK;
    }

    public String getMaSoThue() {
        return maSoThue;
    }

    public void setMaSoThue(String maSoThue) {
        this.maSoThue = maSoThue;
    }

    public String getsDT() {
        return sDT;
    }

    public void setsDT(String sDT) {
        this.sDT = sDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    @Override
    public String toString() {
        return this.tenNCU;
    }

    @Override
    public boolean equals(Object obj) {
        NhaCungUng other = (NhaCungUng) obj;
        return other.getMaNCU().equals(this.getMaNCU());
    }
    
    
}
