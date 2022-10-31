
package poly.edu.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class JDBCHelper {
    static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    static String dburl = "jdbc:sqlserver://localhost;database=QLSieuThi";
    static String user = "sa";
    static String password = "sa";
    static {
        try {
            Class.forName(driver);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static Connection openConnection() throws Exception{
        Class.forName(driver);
        String connectionUrl = dburl;
        String username = user;
        String password = JDBCHelper.password;
        Connection con = DriverManager.getConnection(connectionUrl, username, password);
        return con;
    }
    
    public static PreparedStatement getStmt(String sql, Object...args)throws SQLException{
        Connection conn = DriverManager.getConnection(dburl,user,password);
        PreparedStatement stmt;
        if (sql.trim().startsWith("{")) {
            stmt = conn.prepareCall(sql); //gọi thủ tục lưu trữ
        }else{
            stmt = conn.prepareStatement(sql);
        }
        for (int i = 0; i < args.length; i++) {
            stmt.setObject(i + 1, args[i]);
        }
        return stmt;
    }
    
    public static int update(String sql, Object...args)throws SQLException{
        try {
            PreparedStatement stmt = JDBCHelper.getStmt(sql, args);
            try {
                return stmt.executeUpdate();
            } finally {
                stmt.getConnection().close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public static ResultSet query(String sql, Object...args) throws SQLException{
        PreparedStatement stmt = JDBCHelper.getStmt(sql, args);
        return stmt.executeQuery();
    }
    
    public static Object value(String sql, Object...args){
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            if (rs.next()) {
                return rs.getObject(0);
            }
            rs.getStatement().getConnection().close();
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
