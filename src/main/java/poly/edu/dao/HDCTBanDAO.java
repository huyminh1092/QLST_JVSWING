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
import poly.edu.entity.HoaDonChiTietBan;
import poly.edu.helper.JDBCHelper;

/**
 *
 * @author Minh Huy
 */
public class HDCTBanDAO extends MainDAO<HoaDonChiTietBan,Integer>{
    String Insert_Sql = "INSERT INTO HOADONCHITIETBAN (MaSP,MaHDB,SoLuongBan,DonGia,DonViTinh,TenSP,GiamGia)" +
"     VALUES (?,?,?,?,?,?,?)";
    String Update_Sql = "UPDATE HOADONCHITIETBAN SET  MaSP = ?, MaHDB = ?, SoLuongBan = ?, DonGia = ?,DonViTinh=?,TenSP=?,GiamGia=?"
            + "    WHERE ID = ?";
    String Delete_Sql = "DELETE FROM HOADONCHITIETBAN WHERE ID = ?";
    String SelectAll = "Select * from HOADONCHITIETBAN";
    String SelectById = "Select * from HOADONCHITIETBAN WHERE ID = ?";
    
    @Override
    public void insert(HoaDonChiTietBan entity) {
        try {
            JDBCHelper.update(Insert_Sql,entity.getMaSPham(),entity.getMaHDNban(),entity.getSoLuong(),entity.getGiaBan(),entity.getDonViTinh(),
                    entity.getTenSPnhap(),entity.getGiamgia());
        } catch (SQLException e) {
        }
    }

    @Override
    public void update(HoaDonChiTietBan entity) {
        
        try {
            JDBCHelper.update(Update_Sql ,entity.getMaSPham(),entity.getMaHDNban(),entity.getSoLuong(),entity.getGiaBan(),entity.getDonViTinh(),
                    entity.getTenSPnhap(),entity.getGiamgia(),entity.getMaHDCTban());
        } catch (SQLException e) {
        }
    }

    @Override
    public void delete(Integer id) {
        try {
            JDBCHelper.update(Delete_Sql, id);
        } catch (SQLException e) {
        }
    }

    @Override
    public List<HoaDonChiTietBan> selectAll() {
        return this.selectBySql(SelectAll);
    }

    @Override
    public HoaDonChiTietBan selectByID(Integer id) {
         List<HoaDonChiTietBan> list = this.selectBySql(SelectById, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
    @Override
    protected List<HoaDonChiTietBan> selectBySql(String sql, Object... args) {
        List<HoaDonChiTietBan> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {                
                HoaDonChiTietBan hdn = new HoaDonChiTietBan();
                hdn.setMaHDCTban(rs.getInt("ID"));
                hdn.setMaHDNban(rs.getString("MaHDB"));
                hdn.setMaSPham(rs.getString("MaSP"));
                hdn.setSoLuong(rs.getInt("SoLuongBan"));
                hdn.setGiaBan(rs.getDouble("DonGia"));      
                hdn.setDonViTinh(rs.getString("DonViTinh"));
                hdn.setTenSPnhap(rs.getString("TenSP"));
                hdn.setGiamgia(rs.getInt("GiamGia"));
                list.add(hdn);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
   public List<HoaDonChiTietBan> selectBangHDCT(String ma) {
       String sql="SELECT * FROM HOADONCHITIETBAN WHERE MaHDB=?";
        return this.selectBySql(sql,ma);
    }
   
   public List<HoaDonChiTietBan> selectBySql1(String sql, Object... args) {
        List<HoaDonChiTietBan> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {                
                HoaDonChiTietBan hdn = new HoaDonChiTietBan();
                hdn.setSoLuong(rs.getInt("TongSoLuongBan"));
                
                list.add(hdn);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public HoaDonChiTietBan getTongSLB(){
    String sql="select Sum(SoLuongBan) as 'TongSoLuongBan' from HOADONCHITIETBAN inner join \n" +
"HOADONBAN on HOADONCHITIETBAN.MaHDB=HOADONBAN.MaHDB where NgayBan=CONVERT(date,GETDATE());";
    List<HoaDonChiTietBan> list = this.selectBySql1(sql);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
    
}
