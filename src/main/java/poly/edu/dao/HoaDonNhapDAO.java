
package poly.edu.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import poly.edu.entity.HoaDonNhap;
import poly.edu.helper.JDBCHelper;


public class HoaDonNhapDAO extends MainDAO<HoaDonNhap, String>{
    String Insert_Sql = "INSERT INTO HOADONNHAP (MaHDN, NgayNhap, MaNV, MaNCU, TrangThai) "
            + "Values (?, ?, ?, ?, ?)";
    String Update_Sql = "UPDATE HOADONNHAP SET  NgayNhap = ?, MaNV = ?, MaNCU = ?, TrangThai = ? "
            + "WHERE MaHDN = ?";
    String Delete_Sql = "DELETE FROM HOADONNHAP WHERE MaHDN = ?";
    String SelectAll = "Select * from HOADONNHAP where TrangThai = 'False'";
    String SelectById = "Select * from HOADONNHAP WHERE MaHDN = ?";
    String SelectAllHDN = "Select * from HOADONNHAP where MaHDN = ?";
    String SelectAllHaveTotalMoney = "select HOADONNHAP.*, sum(HOADONCHITIETNHAP.SoLuongNhap * HOADONCHITIETNHAP.GiaNhap) as TongTien from HOADONNHAP " +
" join HOADONCHITIETNHAP on HOADONNHAP.MaHDN = HOADONCHITIETNHAP.MaHDN where HOADONNHAP.TrangThai = 'True' " +
" group by HOADONNHAP.MaHDN, HOADONNHAP.MaNCU, HOADONNHAP.MaNV, HOADONNHAP.NgayNhap, HOADONNHAP.TrangThai";
    
    @Override
    public void insert(HoaDonNhap entity) {
        try {
            JDBCHelper.update(Insert_Sql, entity.getMaHDNhap(), entity.getNgayNhap(), entity.getMaNV(),
                    entity.getMaNCU(), entity.getTrangThai());
        } catch (SQLException ex) {
        }
    }

    @Override
    public void update(HoaDonNhap entity) {
        try {
            JDBCHelper.update(Update_Sql, entity.getNgayNhap(), entity.getMaNV(),
                    entity.getMaNCU(), entity.getTrangThai(), entity.getMaHDNhap());
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
    public List<HoaDonNhap> selectAll() {
        return this.selectBySql(SelectAll);
    }
    public List<HoaDonNhap> selectAllHaveTotal() {
        return this.selectBySqlHasTongTien(SelectAllHaveTotalMoney);
    }

    @Override
    public HoaDonNhap selectByID(String id) {
        List<HoaDonNhap> list = this.selectBySql(SelectById, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<HoaDonNhap> selectBySql(String sql, Object... args) {
        List<HoaDonNhap> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {                
                HoaDonNhap hdn = new HoaDonNhap();
                hdn.setMaHDNhap(rs.getString("MaHDN"));
                hdn.setNgayNhap(rs.getDate("NgayNhap"));
                hdn.setMaNV(rs.getString("MaNV"));
                hdn.setMaNCU(rs.getString("MaNCU"));
                hdn.setTrangThai(rs.getBoolean("TrangThai"));

                list.add(hdn);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    protected List<HoaDonNhap> selectBySqlHasTongTien(String sql, Object... args) {
        List<HoaDonNhap> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {                
                HoaDonNhap hdn = new HoaDonNhap();
                hdn.setMaHDNhap(rs.getString("MaHDN"));
                hdn.setNgayNhap(rs.getDate("NgayNhap"));
                hdn.setMaNV(rs.getString("MaNV"));
                hdn.setMaNCU(rs.getString("MaNCU"));
                hdn.setTrangThai(rs.getBoolean("TrangThai"));
                hdn.setTongTienNhap(rs.getDouble("TongTien"));
                list.add(hdn);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
     public List<HoaDonNhap> selectByNameNCUHasTongTien(String name) {
        String sql = "select a.*, sum(c.SoLuongNhap * c.GiaNhap) as TongTien from HOADONNHAP a join NHACUNGUNG b on a.MaNCU = b.MaNCU join HOADONCHITIETNHAP c on c.MaHDN = a.MaHDN " +
                        " where b.TenNCU like ? and a.TrangThai = 'True' group by a.MaHDN, a.MaNV, a.MaNCU, a.NgayNhap, a.TrangThai";
        return this.selectBySqlHasTongTien(sql, "%"+name+"%");
    }
     
     public HoaDonNhap selectByNameObNCUHasTongTien(String keyword) {
        String sql = "select a.*, sum(c.SoLuongNhap * c.GiaNhap) as TongTien from HOADONNHAP a join NHACUNGUNG b on a.MaNCU = b.MaNCU join HOADONCHITIETNHAP c on c.MaHDN = a.MaHDN " +
                        " where b.TenNCU like ? and a.TrangThai = 'True' group by a.MaHDN, a.MaNV, a.MaNCU, a.NgayNhap, a.TrangThai";
        List<HoaDonNhap> list = this.selectBySqlHasTongTien(sql, "%"+keyword+"%");
        if (list.isEmpty()) {
            return null;
        }
        return this.selectBySqlHasTongTien(sql, "%"+keyword+"%").get(0);
    }
    
    public List<HoaDonNhap> selectByNameNCUNoTongTien(String name) {
        String sql = "select a.* from HOADONNHAP a join NHACUNGUNG b on a.MaNCU = b.MaNCU where b.TenNCU like ? and a.TrangThai = 'False'";
        return this.selectBySql(sql, "%"+name+"%");
    }
    
    public HoaDonNhap selectByNameObNCUNoTongTien(String keyword) {
        String sql = "select a.* from HOADONNHAP a join NHACUNGUNG b on a.MaNCU = b.MaNCU where b.TenNCU like ? and a.TrangThai = 'False'";
        List<HoaDonNhap> list = this.selectBySql(sql, "%"+keyword+"%");
        if (list.isEmpty()) {
            return null;
        }
        return this.selectBySql(sql, "%"+keyword+"%").get(0);
    }
    
    public List<HoaDonNhap> selectByMonthNCUHasTongTien(int month, int year) {
        String sql = "select a.*, sum(c.SoLuongNhap * c.GiaNhap) as TongTien from HOADONNHAP a join HOADONCHITIETNHAP c on c.MaHDN = a.MaHDN " +
" where MONTH(NgayNhap) = ? and YEAR(NgayNhap) = ? and a.TrangThai = 'True' group by a.MaHDN, a.MaNV, a.MaNCU, a.NgayNhap, a.TrangThai";
        return this.selectBySqlHasTongTien(sql, month, year);
    }
     
     public HoaDonNhap selectByMotnhObNCUHasTongTien(int month, int year) {
        String sql = "select a.*, sum(c.SoLuongNhap * c.GiaNhap) as TongTien from HOADONNHAP a join HOADONCHITIETNHAP c on c.MaHDN = a.MaHDN " +
" where MONTH(NgayNhap) = ? and YEAR(NgayNhap) = ? and a.TrangThai = 'True' group by a.MaHDN, a.MaNV, a.MaNCU, a.NgayNhap, a.TrangThai";
        List<HoaDonNhap> list = this.selectBySqlHasTongTien(sql, month, year);
        if (list.isEmpty()) {
            return null;
        }
        return this.selectBySqlHasTongTien(sql, month, year).get(0);
    }
     
     public List<HoaDonNhap> selectByMonthNCUNoTongTien(int month, int year) {
        String sql = "select * from HOADONNHAP where MONTH(NgayNhap) = ? and YEAR(NgayNhap) = ? and TrangThai = 'False'";
        return this.selectBySql(sql, month, year);
    }
    
    public HoaDonNhap selectByMonthObNCUNoTongTien(int month, int year) {
        String sql = "select * from HOADONNHAP where MONTH(NgayNhap) = ? and YEAR(NgayNhap) = ? and TrangThai = 'False'";
        List<HoaDonNhap> list = this.selectBySql(sql, month, year);
        if (list.isEmpty()) {
            return null;
        }
        return this.selectBySql(sql, month, year).get(0);
    }
     
    public HoaDonNhap selectByMaSP(String maSP) {
        List<HoaDonNhap> list = this.selectBySql(SelectAllHDN, maSP);
        if (list.isEmpty()) {
            return null;
        }
        return this.selectBySql(SelectAllHDN, maSP).get(0);
    }
    
     public HoaDonNhap selectAllByID(String maHD) {
        List<HoaDonNhap> list = this.selectBySql(SelectAllHDN, maHD);
        if (list.isEmpty()) {
            return null;
        }
        return this.selectBySql(SelectAllHDN, maHD).get(0);
    }
     
    public List<HoaDonNhap> selectBySql1(String sql, Object... args) {
        List<HoaDonNhap> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                HoaDonNhap hdn = new HoaDonNhap();
                hdn.setTongTienNhap(rs.getDouble("TongTienNhap"));
                list.add(hdn);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public HoaDonNhap findTN(int ngay) {
        String sql = "select SUM(SoLuongNhap*GiaNhap) as 'TongTienNhap' from HOADONCHITIETNHAP inner join HOADONNHAP\n"
                + "on HOADONCHITIETNHAP.MaHDN=HOADONNHAP.MaHDN where MONTH(NgayNhap)=? and Year(NgayNhap) = 2021;";
        List<HoaDonNhap> list = this.selectBySql1(sql, ngay);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
    
}
