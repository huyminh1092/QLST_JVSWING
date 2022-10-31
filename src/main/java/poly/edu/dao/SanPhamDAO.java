
package poly.edu.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import poly.edu.entity.HoaDonNhap;
import poly.edu.entity.SanPham;
import poly.edu.helper.JDBCHelper;


public class SanPhamDAO extends MainDAO<SanPham, String>{
    String Insert_sql = "INSERT INTO  SANPHAM (MaSP, TenSP, TenLoaiHang, MaLoaiHang, TenNCU, GiaNhap, ViTri, "
            + " SoLuongHang, GiaBan, NgayNhap, HanSuDung, Hinh, GhiChu, GiamGia, DonViTinh) Values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    String Update_sql = "UPDATE SANPHAM SET TenSP = ?, TenLoaiHang = ?, MaLoaiHang = ?, TenNCU = ?, GiaNhap = ?, ViTri = ?, "
            + " SoLuongHang = ?, GiaBan = ?, NgayNhap = ?, HanSuDung = ?, Hinh = ?, GhiChu = ?, GiamGia = ?, DonViTinh = ? Where MaSP = ?";
    String Delete_sql = "DELETE from SANPHAM where MaSP = ?";
    String SelectByID = "Select * from SANPHAM where MaSP = ?";
    String SelectAll =  "Select * from SANPHAM";
    String SelectByNameSP = "select * from SANPHAM where TenSP = ?";

    @Override
    public void insert(SanPham entity) {
        try {
            JDBCHelper.update(Insert_sql, entity.getMaSP(), entity.getTenSP(), entity.getTenLH(), entity.getMaLH(),
                    entity.getTenNCU(), entity.getGiaNhap(), entity.getViTri(), entity.getSoLuong(), entity.getGiaBan(),
                    entity.getNgayNhap(), entity.gethSD(), entity.getHinh(), entity.getGhiChu(), entity.getGiamGia(), entity.getDonVi());
        } catch (SQLException ex) {
        }
    }

    @Override
    public void update(SanPham entity) {
         try {
            JDBCHelper.update(Update_sql, entity.getTenSP(), entity.getTenLH(), entity.getMaLH(),
                    entity.getTenNCU(), entity.getGiaNhap(), entity.getViTri(), entity.getSoLuong(), entity.getGiaBan(),
                    entity.getNgayNhap(), entity.gethSD(), entity.getHinh(), entity.getGhiChu(), entity.getGiamGia(), entity.getDonVi(), entity.getMaSP());
        } catch (SQLException ex) {
        }
    }

    @Override
    public void delete(String id) {
        try {
            JDBCHelper.update(Delete_sql, id);
        } catch (SQLException ex) {
        }
    }

    @Override
    public List<SanPham> selectAll() {
        return this.selectBySql(SelectAll);
    }

    @Override
    public SanPham selectByID(String id) {
    
    List<SanPham> list = this.selectBySql(SelectByID, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
    
    public SanPham selectByNameSP(String name) {
    List<SanPham> list = this.selectBySql(SelectByNameSP, name);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<SanPham> selectBySql(String sql, Object... args) {
        List<SanPham> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {                
                SanPham kh = new SanPham();
                kh.setMaSP(rs.getString("MaSP"));
                kh.setTenSP(rs.getString("TenSP")); 
                kh.setTenLH(rs.getString("TenLoaiHang"));
                kh.setMaLH(rs.getString("MaLoaiHang"));
                kh.setTenNCU(rs.getString("TenNCU"));
                kh.setGiaNhap(rs.getDouble("GiaNhap"));
                kh.setViTri(rs.getString("ViTri"));
                kh.setSoLuong(rs.getInt("SoLuongHang"));
                kh.setGiaBan(rs.getDouble("GiaBan"));
                kh.setNgayNhap(rs.getDate("NgayNhap"));
                kh.sethSD(rs.getDate("HanSuDung"));
                kh.setHinh(rs.getString("Hinh"));
                kh.setGhiChu(rs.getString("GhiChu"));
                kh.setGiamGia(rs.getInt("GiamGia"));
                kh.setDonVi(rs.getString("DonViTinh"));
                
                list.add(kh);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public List<SanPham> selectByKetword(String keyword) {
        String sql = "Select * from SANPHAM where TenSP like ?";
        return this.selectBySql(sql, "%"+keyword+"%");
    }
    public SanPham selectByName(String keyword) {
        String sql = "Select * from SANPHAM where TenSP like ?";
        List<SanPham> list = this.selectBySql(sql, "%"+keyword+"%");
        if (list.isEmpty()) {
            return null;
        }
        return this.selectBySql(sql, "%"+keyword+"%").get(0);
    }
    public List<SanPham> selectByLoaiHang(String maLH) {
        String sql = "Select * from SANPHAM where MaLoaiHang = ?";
        return this.selectBySql(sql, maLH);
    }
    
    public List<SanPham> selectByLoaiHangTheoTen(String tenLH) {
        String sql = "Select * from SANPHAM where TenLoaiHang = ?";
        return this.selectBySql(sql, tenLH);
    }
    
    public List<SanPham> selectBySql1(String sql, Object... args) {
    List<SanPham> list = new ArrayList<>();
     try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {                
                SanPham kh = new SanPham();
                kh.setSoLuong(rs.getInt("TongSoLuong"));
                list.add(kh);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public SanPham getTongSL(){
        String sql="select Sum(SoLuongHang) as 'TongSoLuong' from SANPHAM";
    List<SanPham> list = this.selectBySql1(sql);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
   
    
}
