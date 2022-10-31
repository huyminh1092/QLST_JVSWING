
package poly.edu.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import poly.edu.entity.SanPhamNCU;
import poly.edu.helper.JDBCHelper;


public class SanPhamNCUDAO extends MainDAO<SanPhamNCU, String>{
    String Insert_SQL = "INSERT INTO  SPNCUNGUNG (TenSPNCU, HanSuDung, MaNCU, Gia) "
            + " Values (?, ?, ?, ?)";
    String Update_SQL =  "UPDATE SPNCUNGUNG SET TenSPNCU = ?, HanSuDung = ?, MaNCU = ?, Gia = ? "
            + " WHERE MaSPNCU = ? ";
    String Delete_Sql = "DELETE FROM SPNCUNGUNG WHERE MaSPNCU=?";
    String SelectAll_Sql = "SELECT * FROM SPNCUNGUNG";
    String SelectByID_Sql = "SELECT * FROM SPNCUNGUNG WHERE MaSPNCU=?";
    String SelectByName = "Select * from SPNCUNGUNG WHERE TenSPNCU = ?";

    @Override
    public void insert(SanPhamNCU entity) {
        try {
            JDBCHelper.update(Insert_SQL, entity.getTenSP(), entity.getHanSuDung(), entity.getMaNCU(), entity.getGia());
        } catch (SQLException ex) {
        }
    }

    @Override
    public void update(SanPhamNCU entity) {
         try {
            JDBCHelper.update(Update_SQL, entity.getTenSP(), entity.getHanSuDung(), entity.getMaNCU(), entity.getGia(),
                    entity.getMaSP());
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
    public List<SanPhamNCU> selectAll() {
        return this.selectBySql(SelectAll_Sql);
    }

    @Override
    public SanPhamNCU selectByID(String id) {
        List<SanPhamNCU> list = this.selectBySql(SelectByID_Sql, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<SanPhamNCU> selectBySql(String sql, Object... args) {
         List<SanPhamNCU> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {                
                SanPhamNCU spNCU = new SanPhamNCU();
                spNCU.setMaSP(rs.getInt("MaSPNCU"));
                spNCU.setTenSP(rs.getString("TenSPNCU"));
                spNCU.setHanSuDung(rs.getDate("HanSuDung"));
                spNCU.setMaNCU(rs.getString("MaNCU"));
                spNCU.setGia(rs.getDouble("Gia"));
                
                list.add(spNCU);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public List<SanPhamNCU> selectByNhaCungUng(String maNCU) {
        String sql = "Select * from SPNCUNGUNG where MaNCU= ?";
        return this.selectBySql(sql, maNCU);
    }
    public SanPhamNCU selectByIDInt(int id) {
        List<SanPhamNCU> list = this.selectBySql(SelectByID_Sql, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
    public void delete(int id) {
        try {
            JDBCHelper.update(Delete_Sql, id);
        } catch (SQLException ex) {
        }
    }
    public List<SanPhamNCU> selectByKeyWord(String ten) {
        String sql = "Select * from SPNCUNGUNG WHERE TenSPNCU Like ?";
        return this.selectBySql(sql, "%" + ten + "%");
    }
    public SanPhamNCU selectByName(String id) {
        String sql="SELECT * FROM SPNCUNGUNG WHERE TenSPNCU like ?";
        List<SanPhamNCU> list = this.selectBySql(sql, "%" + id + "%");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
    
    public SanPhamNCU TimSP(String id) {
        String sql="SELECT * FROM SPNCUNGUNG WHERE MaNCU=?";
        List<SanPhamNCU> list = this.selectBySql(sql, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
    public SanPhamNCU selectByIDToName(String name) {
    
    List<SanPhamNCU> list = this.selectBySql(SelectByName, name);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
    
    
}
