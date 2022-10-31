package poly.edu.component;

import poly.edu.swing.Button;
import poly.edu.swing.MyPasswordField;
import poly.edu.swing.MyTextField;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;

public class PanelLoginAndRegister extends javax.swing.JLayeredPane {
    //Login
    public static Button cmd = new Button();
    public static Button cancel = new Button();
    public static JButton cmdForget = new JButton("Điền thông tin tài khoản!");
    public static MyPasswordField txtPass = new MyPasswordField();
    public static MyTextField txtUserName = new MyTextField();
    //Doi Mat Khau
    public static MyTextField txtUser = new MyTextField();
    public static MyPasswordField txtPassCu = new MyPasswordField();
    public static MyPasswordField txtPassMoi = new MyPasswordField();
    public static MyPasswordField txtPassXN = new MyPasswordField();
    public static Button changePass = new Button();
    public static Button CancelchangePass = new Button();
    public static JButton NChangePass = new JButton("Điền thông tin cần thay đổi!");
    
            
    public PanelLoginAndRegister() {
        initComponents();
        initLogin();        
        initRegister();
        login.setVisible(true);
        register.setVisible(false);
    }

    public void initRegister() {
        register.setLayout(new MigLayout("wrap", "push[center]push", "push[]25[]10[]10[]10[]10[]25[]10[]push"));
        JLabel label = new JLabel("ĐỔI MẬT KHẨU");
        label.setFont(new Font("Segoe UI", 1, 30));
        label.setForeground(new Color(7, 164, 121));
        register.add(label);
        
        
        txtUser.setPrefixIcon(new ImageIcon(getClass().getResource("/poly/edu/icon/user.png")));
        txtUser.setHint("Tên đăng nhập");
        register.add(txtUser, "w 60%");
        
        
        txtPassCu.setPrefixIcon(new ImageIcon(getClass().getResource("/poly/edu/icon/Mopass.png")));
        txtPassCu.setHint("Mật khẩu cũ");
        register.add(txtPassCu, "w 60%");
        
        
        txtPassMoi.setPrefixIcon(new ImageIcon(getClass().getResource("/poly/edu/icon/pass.png")));
        txtPassMoi.setHint("Mật khẩu mới");
        register.add(txtPassMoi, "w 60%");
        
         
        txtPassXN.setPrefixIcon(new ImageIcon(getClass().getResource("/poly/edu/icon/XNpass.png")));
        txtPassXN.setHint("Xác nhân mật khẩu");
        register.add(txtPassXN, "w 60%");
        
        //Button
        
        NChangePass.setForeground(new Color(100, 100, 100));
        NChangePass.setFont(new Font("sansserif", 1, 12));
        NChangePass.setContentAreaFilled(false);
        NChangePass.setCursor(new Cursor(Cursor.HAND_CURSOR));
        register.add(NChangePass);
        
        changePass.setBackground(new Color(7, 164, 121));
        changePass.setForeground(new Color(250, 250, 250));
        changePass.setText("ĐỔI MẬT KHẨU");
        register.add(changePass, "w 40%, h 40");
        
        
        CancelchangePass.setBackground(new Color(7, 164, 121));
        CancelchangePass.setForeground(new Color(250, 250, 250));
        CancelchangePass.setText("CANCEL");
        register.add(CancelchangePass, "w 40%, h 40");
    }

    private void initLogin() {
        login.setLayout(new MigLayout("wrap", "push[center]push", "push[]25[]10[]10[]25[]10[]push"));
        
        JLabel label = new JLabel("ĐĂNG NHẬP");
        label.setFont(new Font("Segoe UI", 1, 30));
        label.setForeground(new Color(7, 164, 121));
        login.add(label);
        
        
        txtUserName.setPrefixIcon(new ImageIcon(getClass().getResource("/poly/edu/icon/user.png")));
        txtUserName.setHint("Tên đăng nhập");
        login.add(txtUserName, "w 60%");
        
        
        txtPass.setPrefixIcon(new ImageIcon(getClass().getResource("/poly/edu/icon/pass.png")));
        txtPass.setHint("Mật khẩu");
        login.add(txtPass, "w 60%");
        
        
        cmdForget.setForeground(new Color(100, 100, 100));
        cmdForget.setFont(new Font("sansserif", 1, 12));
        cmdForget.setContentAreaFilled(false);
        cmdForget.setCursor(new Cursor(Cursor.HAND_CURSOR));
        login.add(cmdForget);
        
        //Button
        cmd.setBackground(new Color(7, 164, 121));
        cmd.setForeground(new Color(250, 250, 250));
        cmd.setText("ĐĂNG NHẬP");
        login.add(cmd, "w 40%, h 40");
        
        cancel.setBackground(new Color(7, 164, 121));
        cancel.setForeground(new Color(250, 250, 250));
        cancel.setText("CANCEL");
        login.add(cancel, "w 40%, h 40");
        
    }

    public void showRegister(boolean show) {
        if (show) {
            register.setVisible(false);
            login.setVisible(true);
        } else {
            register.setVisible(true);
            login.setVisible(false);
        }
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new javax.swing.JPanel();
        register = new javax.swing.JPanel();

        setLayout(new java.awt.CardLayout());

        login.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        add(login, "card3");

        register.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout registerLayout = new javax.swing.GroupLayout(register);
        register.setLayout(registerLayout);
        registerLayout.setHorizontalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );
        registerLayout.setVerticalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        add(register, "card2");
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel login;
    public static javax.swing.JPanel register;
    // End of variables declaration//GEN-END:variables
}
