/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.edu.ui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.event.AncestorListener;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;
import poly.edu.component.PanelCover;
import poly.edu.component.PanelLoginAndRegister;
import static poly.edu.component.PanelLoginAndRegister.CancelchangePass;
import static poly.edu.component.PanelLoginAndRegister.NChangePass;
import static poly.edu.component.PanelLoginAndRegister.changePass;
import static poly.edu.component.PanelLoginAndRegister.register;
import static poly.edu.component.PanelLoginAndRegister.txtUser;
import static poly.edu.component.PanelLoginAndRegister.txtUserName;
import poly.edu.dao.NhanVienDAO;
import poly.edu.entity.NhanVien;
import poly.edu.helper.AuthorHelper;
import poly.edu.helper.BoxHelper;
import poly.edu.helper.DataValidateHelper;
import poly.edu.swing.MyPasswordField;
import poly.edu.swing.MyTextField;

/**
 *
 * @author Admin
 */
public class DangNhap extends javax.swing.JDialog {
    /**
     * Creates new form DangNhap
     */
    public DangNhap(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        init();
        Login();
        cancel();
        changePass();
        cancelChangePass();
    }

    private MigLayout layout;
    private PanelCover cover;
    private PanelLoginAndRegister loginAndRegister;
    private boolean isLogin;
    private final double addSize = 30;
    private final double coverSize = 40;
    private final double loginSize = 60;
    private final DecimalFormat df = new DecimalFormat("##0.###");

    private void init() {
        layout = new MigLayout("fill, insets 0");
        cover = new PanelCover();
        loginAndRegister = new PanelLoginAndRegister();
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                double fractionCover;
                double fractionLogin;
                double size = coverSize;
                if (fraction <= 0.5f) {
                    size += fraction * addSize;
                } else {
                    size += addSize - fraction * addSize;
                }
                if (isLogin) {
                    fractionCover = 1f - fraction;
                    fractionLogin = fraction;
                    if (fraction >= 0.5f) {
                        try {
                            cover.registerRight(fractionCover * 100);
                        } catch (ParseException ex) {
                            Logger.getLogger(DangNhap.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else {
                        try {
                            cover.loginRight(fractionLogin * 100);
                        } catch (ParseException ex) {
                            Logger.getLogger(DangNhap.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                } else {
                    fractionCover = fraction;
                    fractionLogin = 1f - fraction;
                    if (fraction <= 0.5f) {
                        try {
                            cover.registerLeft(fraction * 100);
                        } catch (ParseException ex) {
                            Logger.getLogger(DangNhap.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else {
                        try {
                            cover.loginLeft((1f - fraction) * 100);
                        } catch (ParseException ex) {
                            Logger.getLogger(DangNhap.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                if (fraction >= 0.5f) {
                    loginAndRegister.showRegister(isLogin);
                }
                NumberFormat format = NumberFormat.getInstance(new Locale("vi", "VN"));
                try {
                    Number number = format.parse(df.format(fractionCover));
                    fractionCover=number.doubleValue();
                } catch (ParseException ex) {
                    Logger.getLogger(DangNhap.class.getName()).log(Level.SEVERE, null, ex);
                }
//                float ta = number.floatValue();
//                fractionCover = Double.valueOf(df.format(fractionCover));
//                fractionLogin = Double.valueOf(df.format(fractionLogin));
                try {
                    Number number1=format.parse(df.format(fractionLogin));
                    fractionLogin=number1.doubleValue();
                } catch (ParseException ex) {
                    Logger.getLogger(DangNhap.class.getName()).log(Level.SEVERE, null, ex);
                }
                layout.setComponentConstraints(cover, "width " + size + "%, pos " + fractionCover + "al 0 n 100%");
                layout.setComponentConstraints(loginAndRegister, "width " + loginSize + "%, pos " + fractionLogin + "al 0 n 100%");
                bg.revalidate();
            }

            @Override
            public void end() {
                isLogin = !isLogin;
            }
        };
        Animator animator = new Animator(800, target);
        animator.setAcceleration(0.5f);
        animator.setDeceleration(0.5f);
        animator.setResolution(0);  //  for smooth animation
        bg.setLayout(layout);
        bg.add(cover, "width " + coverSize + "%, pos 0al 0 n 100%");
        bg.add(loginAndRegister, "width " + loginSize + "%, pos 1al 0 n 100%"); //  1al as 100%
        cover.addEvent(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (!animator.isRunning()) {
                    animator.start();
                }
            }
        });
    }

    void Login() {
        loginAndRegister.cmd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg) {
                try {                  
                    loginAndRegister.txtUserName.setPrefixIcon(new ImageIcon(getClass().getResource("/poly/edu/icon/user.png")));
                    loginAndRegister.txtPass.setPrefixIcon(new ImageIcon(getClass().getResource("/poly/edu/icon/pass.png")));
                    
                    if (loginAndRegister.txtUserName.getText().equals("") || loginAndRegister.txtPass.getText().equals("")) {
                        loginAndRegister.cmdForget.setText("Tên đăng nhập hoặc mật khẩu không được để trống..!");
                    } else {
                        String matkhau = new String(loginAndRegister.txtPass.getPassword());
                        NhanVien nv = new NhanVienDAO().selectByID(loginAndRegister.txtUserName.getText());
                        if (nv == null) {
                            loginAndRegister.txtUserName.setPrefixIcon(new ImageIcon(getClass().getResource("/poly/edu/icon/user.png")));
                            loginAndRegister.cmdForget.setText("Tên đăng nhập không tồn tại!");
                        } else if (!matkhau.equals(nv.getPassWord())) {
                            loginAndRegister.txtPass.setPrefixIcon(new ImageIcon(getClass().getResource("/poly/edu/icon/pass.png")));
                            loginAndRegister.cmdForget.setText("Sai mật khẩu!");
                        } else {
                            loginAndRegister.cmdForget.setText("Đăng nhập thành công!");
                            AuthorHelper.user = nv;
                            
                            GreenOrganicJFrame.lblTenNV.setText(AuthorHelper.user.getHoTen().toUpperCase());
                            GreenOrganicJFrame.lblVaiTro.setText(AuthorHelper.user.getVaiTro());
                            if (AuthorHelper.user.getVaiTro().equals("Quản lý trưởng")) {
                                GreenOrganicJFrame.lblavtNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/avtHuyMinh.png")));
                            } else if (AuthorHelper.user.getVaiTro().equals("Quản lý kho")) {
                                GreenOrganicJFrame.lblavtNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/avtTrungTri.png")));
                            } else {
                                GreenOrganicJFrame.lblavtNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/avtDuSu.png")));
                            }
                            
                            closeWindow();
                            loginAndRegister.txtUserName.setText("");
                            loginAndRegister.txtPass.setText("");
                            loginAndRegister.cmdForget.setText("Điền thông tin tài khoản!");
                        }
                    }

                } catch (Exception e) {
                    e.printStackTrace();

                }
            }
        });
    }
    void cancel() {
        loginAndRegister.cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg) {
                close();
            }
        });
    }
    
    void changePass() {
        loginAndRegister.changePass.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg) {
                if (loginAndRegister.txtUser.getText().equals("") || 
                        loginAndRegister.txtPassCu.getText().equals("") || 
                        loginAndRegister.txtPassMoi.getText().equals("") || 
                        loginAndRegister.txtPassXN.getText().equals("")) {
                    
                    loginAndRegister.NChangePass.setText("Bạn phải nhập đầy đủ các trường dữ liệu!");
                    return;
                }

                NhanVienDAO dao = new NhanVienDAO();
                String manv = loginAndRegister.txtUser.getText();
                String matkhau = new String(loginAndRegister.txtPassCu.getPassword());
                String matKhauMoi = new String(loginAndRegister.txtPassMoi.getPassword());
                String matKhauMoi2 = new String(loginAndRegister.txtPassXN.getPassword());
                
                NhanVien nv = dao.selectByID(manv);
                
                if (nv == null) {
                    loginAndRegister.NChangePass.setText("Tên đăng nhập không tồn tại!");
                } else if (!matkhau.equals(nv.getPassWord())) {
                    loginAndRegister.NChangePass.setText("Sai mật khẩu!");
                } else if (!matKhauMoi.equals(matKhauMoi2)) {
                    loginAndRegister.NChangePass.setText("Xác nhận mật khẩu không đúng!");
                } else {
                    loginAndRegister.NChangePass.setText("Đổi mật khẩu thành công");
                    AuthorHelper.user = nv;
                    AuthorHelper.user.setPassWord(matKhauMoi);
                    dao.update(AuthorHelper.user);
                    loginAndRegister.txtUser.setText("");
                    loginAndRegister.txtPassCu.setText("");
                    loginAndRegister.txtPassMoi.setText("");
                    loginAndRegister.txtPassXN.setText("");
                    setFormDoiMatKhau();
                }
            }
        });
    }
    
    void setFormDoiMatKhau() {
        register.setLayout(new MigLayout("wrap", "push[center]push", "push[]25[]10[]10[]10[]10[]25[]10[]push"));
//        JLabel label = new JLabel("ĐỔI MẬT KHẨU");
//        label.setFont(new Font("Segoe UI", 1, 30));
//        label.setForeground(new Color(7, 164, 121));
//        register.add(label);
        
        loginAndRegister.txtUser.setPrefixIcon(new ImageIcon(getClass().getResource("/poly/edu/icon/user.png")));
        loginAndRegister.txtUser.setHint("Tên đăng nhập");
        loginAndRegister.register.add(loginAndRegister.txtUser, "w 60%");
        
        
        loginAndRegister.txtPassCu.setPrefixIcon(new ImageIcon(getClass().getResource("/poly/edu/icon/Mopass.png")));
        loginAndRegister.txtPassCu.setHint("Mật khẩu cũ");
        loginAndRegister.register.add(loginAndRegister.txtPassCu, "w 60%");
        
        
        loginAndRegister.txtPassMoi.setPrefixIcon(new ImageIcon(getClass().getResource("/poly/edu/icon/pass.png")));
        loginAndRegister.txtPassMoi.setHint("Mật khẩu mới");
        loginAndRegister.register.add(loginAndRegister.txtPassMoi, "w 60%");
        
         
        loginAndRegister.txtPassXN.setPrefixIcon(new ImageIcon(getClass().getResource("/poly/edu/icon/XNpass.png")));
        loginAndRegister.txtPassXN.setHint("Xác nhân mật khẩu");
        loginAndRegister.register.add(loginAndRegister.txtPassXN, "w 60%");
        
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
    
    void cancelChangePass() {
        loginAndRegister.CancelchangePass.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg) {
                close();
            }
        });
    }
    
    void closeWindow() {
        this.dispose();
    }

    void close() {
        System.exit(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setOpaque(true);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 933, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DangNhap dialog = new DangNhap(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane bg;
    // End of variables declaration//GEN-END:variables
}
