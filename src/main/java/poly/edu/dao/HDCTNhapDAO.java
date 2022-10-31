
package poly.edu.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import poly.edu.entity.HoaDonChiTietNhap;
import poly.edu.helper.JDBCHelper;


public class HDCTNhapDAO extends MainDAO<HoaDonChiTietNhap, Integer>{
    String Insert_Sql = "INSERT INTO HOADONCHITIETNHAP (MaSP, MaHDN, SoLuongNhap, GiaNhap, DonViTinh, TenSP) "
            + "Values (?, ?, ?, ?, ?, ?)";
    String Update_Sql = "UPDATE HOADONCHITIETNHAP SET  MaSP = ?, MaHDN = ?, SoLuongNhap = ?, GiaNhap = ?, "
            + "DonViTinh = ?, TenSP = ? Where ID = ?";
    String Delete_Sql = "DELETE FROM HOADONCHITIETNHAP WHERE ID = ?";
    String SelectAll = "Select * from HOADONCHITIETNHAP";
    String SelectById = "Select * from HOADONCHITIETNHAP WHERE ID = ?";
    String SelectByMaSP = "Select * from HOADONCHITIETNHAP WHERE MaSP = ?";
    String SelectAllHDCT = "Select * from HOADONCHITIETNHAP WHERE MaHDN = ?";
    String selectAllByMaSP = "select a.* from HOADONCHITIETNHAP a  join HOADONNHAP b  on a.MaHDN = b.MaHDN " +
                    "join SANPHAM c on a.MaSP = c.MaSP  " +
                    "where a.MaSP = ? and b.MaHDN = ?";

    @Override
    public void insert(HoaDonChiTietNhap entity) {
        try {
            JDBCHelper.update(Insert_Sql, entity.getMaSPnhap(), entity.getMaHDNnhap(), entity.getSoLuong(), entity.getGiaNhap(),
                    entity.getDonViTinh(), entity.getTenSPnhap());
        } catch (SQLException ex) {
        }
    }

    @Override
    public void update(HoaDonChiTietNhap entity) {
        try {
            JDBCHelper.update(Update_Sql, entity.getMaSPnhap(), entity.getMaHDNnhap(), entity.getSoLuong(), entity.getGiaNhap(),
                    entity.getDonViTinh(), entity.getTenSPnhap(), entity.getMaHDCTnhap());
        } catch (SQLException ex) {
        }        
    }

    @Override
    public void delete(Integer id) {
        try {
            JDBCHelper.update(Delete_Sql, id);
        } catch (SQLException ex) {
        }
    }

    @Override
    public List<HoaDonChiTietNhap> selectAll() {
        return this.selectBySql(SelectAll);
    }

    @Override
    public HoaDonChiTietNhap selectByID(Integer id) {
         List<HoaDonChiTietNhap> list = this.selectBySql(SelectById, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<HoaDonChiTietNhap> selectBySql(String sql, Object... args) {
        List<HoaDonChiTietNhap> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {                
                HoaDonChiTietNhap hdctn = new HoaDonChiTietNhap();
                hdctn.setMaHDCTnhap(rs.getInt("ID"));
                hdctn.setMaSPnhap(rs.getString("MaSP"));
                hdctn.setMaHDNnhap(rs.getString("MaHDN"));
                hdctn.setSoLuong(rs.getInt("SoLuongNhap"));
                hdctn.setGiaNhap(rs.getDouble("GiaNhap"));
                hdctn.setDonViTinh(rs.getString("DonViTinh"));
                hdctn.setTenSPnhap(rs.getString("TenSP"));
                
                list.add(hdctn);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
     public HoaDonChiTietNhap selectByMaSpAndMaHD(String maSP, String maHD) {
         List<HoaDonChiTietNhap> list = this.selectBySql(selectAllByMaSP, maSP, maHD);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
    
    public HoaDonChiTietNhap selectByMaSP(String maSP) {
         List<HoaDonChiTietNhap> list = this.selectBySql(SelectByMaSP, maSP);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
     public List<HoaDonChiTietNhap> selectByMaHD(String maHD) {
        return this.selectBySql(SelectAllHDCT, maHD);
    }
     
     public List<HoaDonChiTietNhap> selectBySql1(String sql, Object... args) {
        List<HoaDonChiTietNhap> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {                
                HoaDonChiTietNhap hdctn = new HoaDonChiTietNhap();
                hdctn.setMaSPnhap(rs.getString("MaSP"));
                hdctn.setMaHDNnhap(rs.getString("MaHDN"));
                hdctn.setSoLuong(rs.getInt("SoLuongNhap"));
                hdctn.setGiaNhap(rs.getDouble("GiaNhap"));
                hdctn.setTenSPnhap(rs.getString("TenSP"));
                hdctn.setTongTien(rs.getDouble("TongTien"));
                list.add(hdctn);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<HoaDonChiTietNhap> tienNhapThang(int month, int year) {
        String sql2 = "select a.MaSP,a.MaHDN,a.TenSP,a.SoLuongNhap,a.GiaNhap,SUM(SoLuongNhap*a.GiaNhap)as 'TongTien'\n"
                + "from HOADONCHITIETNHAP a inner join HOADONNHAP b on a.MaHDN=b.MaHDN where\n"
                + "Month(b.NgayNhap)=? and YEAR(b.NgayNhap)=?\n"
                + "group by a.MaSP,a.TenSP,SoLuongNhap,a.GiaNhap,a.MaHDN order by MaHDN asc";
        return this.selectBySql1(sql2, month, year);
    }

    public List<HoaDonChiTietNhap> tienNhapNam(int year) {
        String sql2 = "select a.MaSP,a.MaHDN,a.TenSP,a.SoLuongNhap,a.GiaNhap,SUM(SoLuongNhap*a.GiaNhap)as 'TongTien'\n"
                + "from HOADONCHITIETNHAP a inner join HOADONNHAP b on a.MaHDN=b.MaHDN where\n"
                + " YEAR(b.NgayNhap)=?\n"
                + "group by a.MaSP,a.TenSP,SoLuongNhap,a.GiaNhap,a.MaHDN order by MaHDN asc";
        return this.selectBySql1(sql2, year);
    }

    public List<HoaDonChiTietNhap> tienNhapNgay(Date date) {
        String sql2 = "select a.MaSP,a.MaHDN,a.TenSP,a.SoLuongNhap,a.GiaNhap,SUM(SoLuongNhap*a.GiaNhap)as 'TongTien'\n"
                + "from HOADONCHITIETNHAP a inner join HOADONNHAP b on a.MaHDN=b.MaHDN where\n"
                + " b.NgayNhap =?\n"
                + "group by a.MaSP,a.TenSP,SoLuongNhap,a.GiaNhap,a.MaHDN order by MaHDN asc";
        return this.selectBySql1(sql2, date);
    }
}
