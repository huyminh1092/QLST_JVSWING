/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.edu.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import poly.edu.entity.HoaDonBan;
import poly.edu.helper.JDBCHelper;

/**
 *
 * @author Minh Huy
 */
public class HoaDonBanDAO extends MainDAO<HoaDonBan, String> {

    String InsertSQL = "INSERT INTO HOADONBAN(MaHDB,NgayBan,MaKH,MaNV,GiamGia,TrangThai)"
            + "     VALUES (?,?,?,?,?,?)";
    String UpdateSQL = "UPDATE [dbo].[HOADONBAN]"
            + "   SET NgayBan = ?,MaKH =?,MaNV =?,GiamGia=?,TrangThai=? WHERE MaHDB =?";
    String FindByIDSQL = "SELECT * FROM HOADONBAN WHERE MaHDB=?";
    String DeleteSQL = "DELETE FROM HOADONBAN WHERE MaHDB=?";
    String SelectAll_SQL = "SELECT * FROM HOADONBAN";
    String SELECTByMoney_SQL = "select a.MaHDB,a.MaKH,a.MaNV,a.NgayBan ,b.TenKH,c.TenNV,\n"
            + " Sum((d.SoLuongBan*d.DonGia) - ((d.SoLuongBan*d.DonGia)* (d.GiamGia / 100))) as N'TongTien',\n"
            + " a.GiamGia,\n"
            + "	Sum((d.SoLuongBan*d.DonGia) - ((d.SoLuongBan*d.DonGia)* (d.GiamGia / 100))) - \n"
            + "	(Sum((d.SoLuongBan*d.DonGia) - ((d.SoLuongBan*d.DonGia)* (d.GiamGia / 100))) * a.GiamGia / 100)\n"
            + "	as N'ThanhTienHD'\n"
            + " from HOADONBAN a inner join KHACHHANG b on a.MaKH=b.MaKH\n"
            + " inner join NHANVIEN c on a.MaNV=c.MaNV \n"
            + "	inner join HOADONCHITIETBAN d  on a.MaHDB=d.MaHDB\n"
            + "	group by a.MaHDB,a.MaKH,a.MaNV,a.NgayBan,b.TenKH,c.TenNV, a.GiamGia";
    @Override
    public void insert(HoaDonBan entity) {
        try {
            JDBCHelper.update(InsertSQL, entity.getMaHDBan(), entity.getNgayTao(), entity.getMaKH(), entity.getMaNV(), entity.getGiamgia(),
                    entity.isTrangthai());
        } catch (SQLException e) {
        }
    }

    @Override
    public void update(HoaDonBan entity) {
        try {
            JDBCHelper.update(UpdateSQL, entity.getNgayTao(), entity.getMaKH(), entity.getMaNV(), entity.getGiamgia(),
                    entity.isTrangthai(), entity.getMaHDBan()
            );
        } catch (SQLException e) {
        }
    }

    @Override
    public void delete(String id) {
        try {
            JDBCHelper.update(DeleteSQL, id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<HoaDonBan> selectChuaTT() {
        String sql = "SELECT * FROM HOADONBAN WHERE TrangThai=0";
        return this.selectBySql(sql);

    }

    @Override
    public List<HoaDonBan> selectAll() {
        return this.selectBySql(SelectAll_SQL);
    }

    @Override
    public HoaDonBan selectByID(String id) {
        List<HoaDonBan> list = this.selectBySql(FindByIDSQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public List<HoaDonBan> selectByKeyWord(String ten) {
        String sql = "select a.MaHDB,a.MaKH,a.MaNV,a.NgayBan ,b.TenKH,c.TenNV,\n" +
"  Sum((d.SoLuongBan*d.DonGia) - ((d.SoLuongBan*d.DonGia)* (d.GiamGia / 100))) as N'TongTien',\n" +
"  a.GiamGia as N'GiamGia',\n" +
"  Sum((d.SoLuongBan*d.DonGia) - ((d.SoLuongBan*d.DonGia)* (d.GiamGia / 100))) - \n" +
" (Sum((d.SoLuongBan*d.DonGia) - ((d.SoLuongBan*d.DonGia)* (d.GiamGia / 100))) * a.GiamGia / 100)\n" +
"  as N'ThanhTienHD'\n" +
"  from HOADONBAN a inner join \n" +
"KHACHHANG b on a.MaKH=b.MaKH inner join NHANVIEN c on a.MaNV=c.MaNV \n" +
"inner join HOADONCHITIETBAN d\n" +
"on a.MaHDB=d.MaHDB where a.MaKH LIKE ? and TrangThai=1 \n" +
"		   group by a.MaHDB,a.MaKH,a.MaNV,a.NgayBan,b.TenKH,c.TenNV,a.GiamGia";
        return this.selectBySql1(sql, "%" + ten + "%");
    }
    public List<HoaDonBan> selectByKeyWord1(String ten) {
        String sql = " select a.MaHDB,a.MaKH,a.MaNV,a.NgayBan,b.TenKH,c.TenNV,0 as 'TongTien',0 as 'GiamGia',\n" +
"		   0 as 'ThanhTienHD'\n" +
"		   from HOADONBAN a\n" +
"		   inner join KHACHHANG b on a.MaKH=b.MaKH inner join NHANVIEN c \n" +
"		   on b.MaNVTao=c.MaNV\n" +
"		   where a.MaKH Like ? and a.TrangThai=0\n" +
"		   group by a.MaHDB,a.MaKH,a.MaNV,a.NgayBan,b.TenKH,c.TenNV";
        return this.selectBySql1(sql, "%" + ten + "%");
    }

    public HoaDonBan selectByName(String name) {
        String sql = "SELECT * FROM HOADONBAN WHERE MaKH Like ?";
        List<HoaDonBan> ls = this.selectBySql(sql, "%" + name + "%");
        if (ls.isEmpty()) {
            return null;
        }
        return ls.get(0);
    }

    public List<HoaDonBan> selectTheoNgay(String ngay) {
        String sql = "select a.MaHDB,a.MaKH,a.MaNV,a.NgayBan ,b.TenKH,c.TenNV,\n"
                + "Sum(d.SoLuongBan*d.DonGia) as N'TongTien',sum(d.GiamGia) as N'GiamGia'\n"
                + "from HOADONBAN a inner join \n"
                + "KHACHHANG b on a.MaKH=b.MaKH inner join NHANVIEN c on a.MaNV=c.MaNV inner join HOADONCHITIETBAN d\n"
                + "on a.MaHDB=d.MaHDB where a.NgayBan Like ? group by a.MaHDB,a.MaKH,a.MaNV,a.NgayBan,b.TenKH,c.TenNV";
        return this.selectBySql1(sql, "%" + ngay + "%");
    }
    public List<HoaDonBan> selectTheoNgayDTK(int month,int year) {
        String sql = "select a.MaHDB,a.MaKH,a.MaNV,a.NgayBan ,b.TenKH,c.TenNV,\n" +
"  Sum((d.SoLuongBan*d.DonGia) - ((d.SoLuongBan*d.DonGia)* (d.GiamGia / 100))) as N'TongTien',\n" +
"  a.GiamGia as N'GiamGia',\n" +
"  Sum((d.SoLuongBan*d.DonGia) - ((d.SoLuongBan*d.DonGia)* (d.GiamGia / 100))) - \n" +
" (Sum((d.SoLuongBan*d.DonGia) - ((d.SoLuongBan*d.DonGia)* (d.GiamGia / 100))) * a.GiamGia / 100)\n" +
"  as N'ThanhTienHD'\n" +
"  from HOADONBAN a inner join \n" +
"KHACHHANG b on a.MaKH=b.MaKH inner join NHANVIEN c on a.MaNV=c.MaNV \n" +
"inner join HOADONCHITIETBAN d\n" +
"on a.MaHDB=d.MaHDB where MONTH(a.NgayBan)=? and YEAR(a.NgayBan)=? and TrangThai=1 \n" +
"		   group by a.MaHDB,a.MaKH,a.MaNV,a.NgayBan,b.TenKH,c.TenNV,a.GiamGia";
        return this.selectBySql1(sql,month,year);
    }
     public List<HoaDonBan> selectTheoNgayCTK(int month,int year) {
        String sql = "select a.MaHDB,a.MaKH,a.MaNV,a.NgayBan,b.TenKH,c.TenNV,0 as 'TongTien',0 as 'GiamGia',\n" +
"		   0 as 'ThanhTienHD'\n" +
"		   from HOADONBAN a\n" +
"		   inner join KHACHHANG b on a.MaKH=b.MaKH inner join NHANVIEN c \n" +
"		   on b.MaNVTao=c.MaNV\n" +
"		   where MONTH(a.NgayBan)=? and YEAR(a.NgayBan)=?  and a.TrangThai=0\n" +
"		   group by a.MaHDB,a.MaKH,a.MaNV,a.NgayBan,b.TenKH,c.TenNV";
        return this.selectBySql1(sql,month,year);
    }

    public HoaDonBan selectByDate(String ngay) {
        String sql = "Select * from HOADONBAN WHERE NgayBan Like ?";
        List<HoaDonBan> ls = this.selectBySql(sql, "%" + ngay + "%");
        if (ls.isEmpty()) {
            return null;
        }
        return ls.get(0);
    }

    @Override
    protected List<HoaDonBan> selectBySql(String sql, Object... args) {
        List<HoaDonBan> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                HoaDonBan hdn = new HoaDonBan();
                hdn.setMaHDBan(rs.getString("MaHDB"));
                hdn.setNgayTao(rs.getDate("NgayBan"));
                hdn.setMaNV(rs.getString("MaNV"));
                hdn.setMaKH(rs.getString("MaKH"));
                hdn.setGiamgia(rs.getInt("GiamGia"));

                list.add(hdn);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    protected List<HoaDonBan> selectBySql1(String sql, Object... args) {
        List<HoaDonBan> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                HoaDonBan hdn = new HoaDonBan();
                hdn.setMaHDBan(rs.getString("MaHDB"));
                hdn.setNgayTao(rs.getDate("NgayBan"));
                hdn.setMaNV(rs.getString("MaNV"));
                hdn.setMaKH(rs.getString("MaKH"));
                hdn.setGiamgia(rs.getInt("GiamGia"));
                hdn.setTongTien(rs.getDouble("TongTien"));
                hdn.setThanhtienHD(rs.getDouble("ThanhTienHD"));

                list.add(hdn);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<HoaDonBan> selectList() {
        return this.selectBySql1(SELECTByMoney_SQL);
    }
    
    public List<HoaDonBan> selectBySql2(String sql, Object... args) {
        List<HoaDonBan> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {                
                HoaDonBan hdn = new HoaDonBan();
                hdn.setTongTien(rs.getDouble("Tongdoanhthusanpham"));
                
                
                list.add(hdn);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public HoaDonBan findDT(int ngay) {
        String sql = "select Sum((d.SoLuongBan*d.DonGia) - ((d.SoLuongBan*d.DonGia)* (d.GiamGia / 100)))\n"
                + " -(Sum((d.SoLuongBan*d.DonGia) - ((d.SoLuongBan*d.DonGia)* (d.GiamGia / 100))) * SUM(a.GiamGia )/ 100)\n"
                + "as N'Tongdoanhthusanpham' \n"
                + "from SANPHAM b inner join HOADONCHITIETBAN d \n"
                + "on b.MaSP=d.MaSP inner join HOADONBAN a on d.MaHDB=a.MaHDB\n"
                + "where MONTH(a.NgayBan)=?";
        List<HoaDonBan> ls = this.selectBySql2(sql, ngay);
        if (ls.isEmpty()) {
            return null;
        }
        return ls.get(0);
    }

    public List<HoaDonBan> TongDT() {
        String sql = "select 	Sum((d.SoLuongBan*d.DonGia) - ((d.SoLuongBan*d.DonGia)* (d.GiamGia / 100))) - " +
"	(Sum((d.SoLuongBan*d.DonGia) - ((d.SoLuongBan*d.DonGia) * (d.GiamGia / 100)))) * a.GiamGia/100 " +
"	as 'Tongdoanhthusanpham' " +
"	from HOADONCHITIETBAN d  " +
"	join HOADONBAN a on d.MaHDB=a.MaHDB " +
"	where a.NgayBan = CONVERT(date,GETDATE()) " +
"	group by a.GiamGia, d.DonGia, d.SoLuongBan";
        List<HoaDonBan> ls = this.selectBySql2(sql);
        return ls;
    }
}
