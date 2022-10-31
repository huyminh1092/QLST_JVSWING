
package poly.edu.helper;

import poly.edu.entity.NhanVien;


public class AuthorHelper {
    public static NhanVien user = null;
    
     public static void clear() {
        AuthorHelper.user = null;
    }
    
    public static boolean isLogin() {
        return AuthorHelper.user != null;
    }
    
    public static boolean isManager() {
        return AuthorHelper.isLogin() && user.getVaiTro().equals("Quản lý trưởng"); 
    }
    
    public static boolean isWarehouse() {
        return AuthorHelper.isLogin() && user.getVaiTro().equals("Quản lý kho"); 
    }
    
    public static boolean isEmployee() {
        return AuthorHelper.isLogin() && user.getVaiTro().equals("Thu ngân"); 
    }
    
}
