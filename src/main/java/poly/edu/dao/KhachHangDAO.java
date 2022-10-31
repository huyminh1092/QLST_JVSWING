
package poly.edu.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import poly.edu.entity.KhachHang;
import poly.edu.helper.JDBCHelper;


public class KhachHangDAO extends MainDAO<KhachHang, String>{
    String Insert_SQL = "INSERT INTO  KHACHHANG (MaKH, TenKH, GioiTinh, NgaySinh, SDT, NgayDK, MaNVTao, MaKhuyenMai, Hinh) "
            + " Values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    String Update_SQL =  "UPDATE KhachHang SET TenKH = ?, GioiTinh = ?, NgaySinh = ?, SDT = ?, NgayDK = ?, MaNVTao = ?, "
            + " MaKhuyenMai = ?, Hinh = ? WHERE MaKH = ? ";
    String Delete_Sql = "DELETE FROM KhachHang WHERE MaKH=?";
    String SelectAll_Sql = "SELECT * FROM KhachHang";
    String SelectByID_Sql = "SELECT * FROM KhachHang WHERE MaKH=?";
    String SelectByNameAndMaHD = "select * from KHACHHANG join HOADONBAN " +
"on KHACHHANG.MaKH = HOADONBAN.MaKH " +
"where TenKH like ? and MaHDB = ?";

    @Override
    public void insert(KhachHang entity) {
        try {
            JDBCHelper.update(Insert_SQL, entity.getMaKH(), entity.getHoTen(), entity.getGioiTinh(), entity.getNgaySinh(),
                    entity.getsDT(), entity.getNgayDK(), entity.getMaNV(), entity.getMaGiamGia(), entity.getHinh());
        } catch (SQLException ex) {
        }
    }

    @Override
    public void update(KhachHang entity) {
        try {
            JDBCHelper.update(Update_SQL, entity.getHoTen(), entity.getGioiTinh(), entity.getNgaySinh(),
                    entity.getsDT(), entity.getNgayDK(), entity.getMaNV(), entity.getMaGiamGia(), entity.getHinh(), entity.getMaKH());
        } catch (SQLException ex) {
        }
    }

    @Override
    public void delete(String id) {
        try {
            JDBCHelper.update(Delete_Sql, id);
        } catch (SQLException ex) {
        }
    }

    @Override
    public List<KhachHang> selectAll() {
        return this.selectBySql(SelectAll_Sql);
    }

    @Override
    public KhachHang selectByID(String id) {
        List<KhachHang> list = this.selectBySql(SelectByID_Sql, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<KhachHang> selectBySql(String sql, Object... args) {
        List<KhachHang> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {                
                KhachHang kh = new KhachHang();
                kh.setMaKH(rs.getString("MaKH"));
                kh.setHoTen(rs.getString("TenKH"));
                kh.setGioiTinh(rs.getBoolean("GioiTinh"));
                kh.setNgaySinh(rs.getDate("NgaySinh"));
                kh.setsDT(rs.getString("SDT"));
                kh.setNgayDK(rs.getDate("NgayDK"));
                kh.setMaNV(rs.getString("MaNVTao"));
                kh.setMaGiamGia(rs.getInt("MaKhuyenMai"));
                kh.setHinh(rs.getString("Hinh"));
                
                list.add(kh);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public List<KhachHang> selectByKetword(String keyword) {
        String sql = "Select * from KhachHang where TenKH like ?";
        return this.selectBySql(sql, "%"+keyword+"%");
    }
    public KhachHang selectByName(String keyword) {
        String sql = "Select * from KhachHang where TenKH like ?";
        List<KhachHang> list = this.selectBySql(sql, "%"+keyword+"%");
        if (list.isEmpty()) {
            return null;
        }
        return this.selectBySql(sql, "%"+keyword+"%").get(0);
    }
     public KhachHang selectByNameAndMaHD(String name, String maHD) {
        List<KhachHang> list = this.selectBySql(SelectByNameAndMaHD, name, maHD);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
    
}
