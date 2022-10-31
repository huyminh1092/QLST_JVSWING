/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.edu.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import poly.edu.helper.JDBCHelper;

/**
 *
 * @author Admin
 */
public class ThongKeDAO {
    private List<Object[]> getListOfArray(String sql, String[] cols, Object... args) {
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                Object[] vals = new Object[cols.length];
                for (int i = 0; i < cols.length; i++) {
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }

    }
    
    public List<Object[]> getKhachHang() {
        String sql = "{CALL sp_TKKhachHang}";
        String[] cols = {"MaKH", "TenKH", "SoLanMuaHang"};
        return this.getListOfArray(sql, cols);
    }
    
    public List<Object[]> getNhanVien() {
        String sql = "{CALL sp_TKNhanVien}";
        String[] cols = {"MaNV", "TenNV", "SoLuongHoaDonDaBan"};
        return this.getListOfArray(sql, cols);
    }
    
    public List<Object[]> getHangTonKho() {
        String sql = "{CALL sp_HangTonKho}";
        String[] cols = {"MaSP", "TenSP", "Soluongtonkho", "HanSuDung"};
        return this.getListOfArray(sql, cols);
    }
    
    public List<Object[]> getHangBanChay(int month, int year) {
        String sql = "{CALL sp_BanChayTheoThang(?, ?)}";
        String[] cols = {"MaSP", "TenSP", "SoLuongTieuThu", "SoHoaDon"};
        return this.getListOfArray(sql, cols, month, year);
    }
    
     public List<Object[]> getNhaCungUng() {
        String sql = "{CALL sp_TKNhaCungUng}";
        String[] cols = {"TenNCU", "SDT", "DiaChi", "SoLanNhap"};
        return this.getListOfArray(sql, cols);
    }
     
     public List<Object[]> getChiPhiNhapTheoNgay(Date date) {
        String sql = "{CALL sp_ChiPhiTheoNgay(?)}";
        String[] cols = {"ChiPhi"};
        return this.getListOfArray(sql, cols, date);
    }
     
    public List<Object[]> getChiPhiNhapTheoThang(int month, int year) {
        String sql = "{CALL sp_ChiPhiTheoThang(?, ?)}";
        String[] cols = {"ChiPhi"};
        return this.getListOfArray(sql, cols, month, year);
    }
     
      public List<Object[]> getChiPhiNhapTheoNam(int year) {
        String sql = "{CALL sp_ChiPhiTheoNam(?)}";
        String[] cols = {"ChiPhi"};
        return this.getListOfArray(sql, cols, year);
    }
      
      public List<Object[]> getDoanhThuTheoNgay(Date date) {
        String sql = "{CALL sp_DoanhThuTheoNgay(?)}";
        String[] cols = {"Tongdoanhthusanpha", "GiamGia", "TongTien", "DonGia", "SoLuongBan", "TenSP", "MaSP", "MaHDB"};
        return this.getListOfArray(sql, cols, date);
    }
     
    public List<Object[]> getDoanhThuTheoThang(int month, int year) {
        String sql = "{CALL sp_DoanhThuTheoThang(?, ?)}";
        String[] cols = {"Tongdoanhthusanpha", "GiamGia", "TongTien", "DonGia", "SoLuongBan", "TenSP", "MaSP", "MaHDB"};
        return this.getListOfArray(sql, cols, month, year);
    }
     
      public List<Object[]> getDoanhThuTheoNam(int year) {
        String sql = "{CALL sp_DoanhThuTheoNam(?)}";
        String[] cols = {"Tongdoanhthusanpha", "GiamGia", "TongTien", "DonGia", "SoLuongBan", "TenSP", "MaSP", "MaHDB"};
        return this.getListOfArray(sql, cols, year);
    }
}
