
package poly.edu.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import poly.edu.entity.NhaCungUng;
import poly.edu.helper.JDBCHelper;


public class NhaCungUngDAO extends MainDAO<NhaCungUng, String>{
    String Insert_SQL = "INSERT INTO  NHACUNGUNG (MaNCU, TenNCU, SDT, Email, DiaChi, STK, MasothueNCU) "
            + " Values (?, ?, ?, ?, ?, ?, ?)";
    String Update_SQL =  "UPDATE NHACUNGUNG SET TenNCU = ?, SDT = ?, Email = ?, DiaChi = ?, STK = ?, MasothueNCU = ? "
            + " WHERE MaNCU = ? ";
    String Delete_Sql = "DELETE FROM NHACUNGUNG WHERE MaNCU=?";
    String SelectAll_Sql = "SELECT * FROM NHACUNGUNG";
    String SelectByID_Sql = "SELECT * FROM NHACUNGUNG WHERE MaNCU=?";
    String FindByName="SELECT * FROM NHACUNGUNG WHERE TenNCU LIKE ?";
    
    @Override
    public void insert(NhaCungUng entity) {
        try {
            JDBCHelper.update(Insert_SQL, entity.getMaNCU(), entity.getTenNCU(), entity.getsDT(), entity.getEmail(),
                    entity.getDiaChi(), entity.getsTK(), entity.getMaSoThue());
        } catch (SQLException ex) {
        }
    }

    @Override
    public void update(NhaCungUng entity) {
        try {
            JDBCHelper.update(Update_SQL, entity.getTenNCU(), entity.getsDT(), entity.getEmail(),
                    entity.getDiaChi(), entity.getsTK(), entity.getMaSoThue(), entity.getMaNCU());
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
    public List<NhaCungUng> selectAll() {
        return this.selectBySql(SelectAll_Sql);
    }

    @Override
    public NhaCungUng selectByID(String id) {
        List<NhaCungUng> list = this.selectBySql(SelectByID_Sql, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<NhaCungUng> selectBySql(String sql, Object... args) {
        List<NhaCungUng> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {                
                NhaCungUng ncu = new NhaCungUng();
                ncu.setMaNCU(rs.getString("MaNCU"));
                ncu.setTenNCU(rs.getString("TenNCU"));
                ncu.setsDT(rs.getString("SDT"));
                ncu.setEmail(rs.getString("Email"));
                ncu.setDiaChi(rs.getString("DiaChi"));
                ncu.setsTK(rs.getString("STK"));
                ncu.setMaSoThue(rs.getString("MasothueNCU"));
                
                list.add(ncu);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public List<NhaCungUng> findNCU(String name){
        return  this.selectBySql(FindByName,"%"+name+"%");
    }
    
    public List<NhaCungUng> selectByKeyWord(String ten) {
        String sql = "Select * from NHACUNGUNG WHERE TenNCU Like ?";
        return this.selectBySql(sql, "%" + ten + "%");
    }
    public NhaCungUng selectByName(String keyword) {
        String sql = "Select * from NHACUNGUNG where TenNCU like ?";
        List<NhaCungUng> list = this.selectBySql(sql, "%"+keyword+"%");
        if (list.isEmpty()) {
            return null;
        }
        return this.selectBySql(sql, "%"+keyword+"%").get(0);
    }
    
    
}
