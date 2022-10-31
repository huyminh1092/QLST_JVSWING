
package poly.edu.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import poly.edu.entity.NhanVien;
import poly.edu.helper.JDBCHelper;


public class NhanVienDAO extends MainDAO <NhanVien, String>{
    String Insert_SQL = "INSERT INTO NHANVIEN (MaNV ,TenNV ,GioiTinh, NgaySinh, SDT, Email, Pass, VaiTro, Hinh) "
            + " Values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    String Update_SQL = "UPDATE NHANVIEN SET TenNV = ?, GioiTinh = ?, NgaySinh = ?, SDT = ?, Email = ?, Pass = ?, VaiTro = ?, Hinh = ? " +
            " WHERE MaNV = ? ";
    String Delete_Sql = "DELETE FROM NhanVien WHERE MaNV=?";
    String SelectAll_Sql = "SELECT * FROM NhanVien";
    String SelectByID_Sql = "SELECT * FROM NhanVien WHERE MaNV=?";
    String SelectByNameAndMaHD = "Select * from KhachHang where MaHD = ? and TenNV like ?";

    @Override
    public void insert(NhanVien entity) {
        try {
            JDBCHelper.update(Insert_SQL, entity.getMaNV(), entity.getHoTen(), entity.isGioiTinh(), entity.getNgaySinh(),
                    entity.getSDT(), entity.getEmail(), entity.getPassWord(), entity.getVaiTro(), entity.getHinh());
        } catch (SQLException ex) {
        }
    }

    @Override
    public void update(NhanVien entity) {
         try {
            JDBCHelper.update(Update_SQL, entity.getHoTen(), entity.isGioiTinh(), entity.getNgaySinh(), entity.getSDT(),
                     entity.getEmail(), entity.getPassWord(), entity.getVaiTro(), entity.getHinh(), entity.getMaNV());
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
    public List<NhanVien> selectAll() {
        return this.selectBySql(SelectAll_Sql);
    }

    @Override
    public NhanVien selectByID(String id) {
        List<NhanVien> list = this.selectBySql(SelectByID_Sql, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<NhanVien> selectBySql(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {                
                NhanVien nv = new NhanVien();
                nv.setMaNV(rs.getString("MaNV"));
                nv.setHoTen(rs.getString("TenNV"));
                nv.setGioiTinh(rs.getBoolean("GioiTinh"));
                nv.setNgaySinh(rs.getDate("NgaySinh"));
                nv.setSDT(rs.getString("SDT"));
                nv.setEmail(rs.getString("Email"));
                nv.setPassWord(rs.getString("Pass"));
                nv.setVaiTro(rs.getString("VaiTro"));
                nv.setHinh(rs.getString("Hinh"));
                
                list.add(nv);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<NhanVien> selectByKetword(String keyword) {
        String sql = "Select * from NhanVien where TenNV like ?";
        return this.selectBySql(sql, "%"+keyword+"%");
    }
    public NhanVien selectByName(String keyword) {
        String sql = "Select * from NhanVien where TenNV like ?";
        List<NhanVien> list = this.selectBySql(sql, "%"+keyword+"%");
        if (list.isEmpty()) {
            return null;
        }
        return this.selectBySql(sql, "%"+keyword+"%").get(0);
    }
    public NhanVien selectByNameAndMaHD(String name, String maHD) {
        List<NhanVien> list = this.selectBySql(SelectByNameAndMaHD, name, maHD);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
    
}
