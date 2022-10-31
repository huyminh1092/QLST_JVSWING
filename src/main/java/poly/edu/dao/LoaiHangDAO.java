
package poly.edu.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import poly.edu.entity.LoaiHang;
import poly.edu.helper.JDBCHelper;


public class LoaiHangDAO extends MainDAO<LoaiHang, String>{
    String Insert_SQL = "INSERT INTO  LOAIHANG (MaLoaiHang, TenLoaiHang) "
            + " Values (?, ?)";
    String Update_SQL =  "UPDATE LOAIHANG SET TenLoaiHang = ? "
            + " WHERE MaLoaiHang = ? ";
    String Delete_Sql = "DELETE FROM LOAIHANG WHERE MaLoaiHang=?";
    String SelectAll_Sql = "SELECT * FROM LOAIHANG";
    String SelectByID_Sql = "SELECT * FROM LOAIHANG WHERE MaLoaiHang=?";
    String SelectByName =  "Select * from LOAIHANG where TenLoaiHang = ?";

    @Override
    public void insert(LoaiHang entity) {
        try {
            JDBCHelper.update(Insert_SQL, entity.getMaLoai(), entity.getTenLoai());
        } catch (SQLException ex) {
        }
    }

    @Override
    public void update(LoaiHang entity) {
         try {
            JDBCHelper.update(Update_SQL, entity.getTenLoai(), entity.getMaLoai());
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
    public List<LoaiHang> selectAll() {
        return this.selectBySql(SelectAll_Sql);
    }

    @Override
    public LoaiHang selectByID(String id) {
         List<LoaiHang> list = this.selectBySql(SelectByID_Sql, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<LoaiHang> selectBySql(String sql, Object... args) {
         List<LoaiHang> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {                
                LoaiHang lh = new LoaiHang();
                lh.setMaLoai(rs.getString("MaLoaiHang"));
                lh.setTenLoai(rs.getString("TenLoaiHang"));
                list.add(lh);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<LoaiHang> selectByKetword(String keyword) {
        String sql = "Select * from LOAIHANG where TenLoaiHang like ?";
        return this.selectBySql(sql, "%"+keyword+"%");
    }
    public LoaiHang selectByName(String keyword) {
        String sql = "Select * from LOAIHANG where TenLoaiHang like ?";
        List<LoaiHang> list = this.selectBySql(sql, "%"+keyword+"%");
        if (list.isEmpty()) {
            return null;
        }
        return this.selectBySql(sql, "%"+keyword+"%").get(0);
    }
    
     public LoaiHang selectByIDToName(String name) {
    
    List<LoaiHang> list = this.selectBySql(SelectByName, name);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
}
