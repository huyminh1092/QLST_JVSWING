package poly.edu.ui;

import java.io.File;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JFileChooser;
import poly.edu.helper.BoxHelper;


public class SendMail extends javax.swing.JDialog {
    File sendFile = null;
    
    public SendMail(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        intit();
        txtTenFile.setEditable(false);
    }

    
    void intit() {
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        txtMatKhau = new rojerusan.RSPasswordTextPlaceHolder();
        txtGuiDen = new app.bolivia.swing.JCTextField();
        jLabel10 = new javax.swing.JLabel();
        txtGuiHangLoat = new app.bolivia.swing.JCTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTenFile = new app.bolivia.swing.JCTextField();
        jLabel12 = new javax.swing.JLabel();
        txtTieuDe = new app.bolivia.swing.JCTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTenDangNhap = new app.bolivia.swing.JCTextField();
        jLabel7 = new javax.swing.JLabel();
        btnChonFile = new rojerusan.RSMaterialButtonRectangle();
        btnCancel = new rojerusan.RSMaterialButtonRectangle();
        btnGuiYeuCau = new rojerusan.RSMaterialButtonRectangle();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaNoiDung = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 51));
        jLabel9.setText("Mật khẩu Mail");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, -1, -1));

        txtMatKhau.setBackground(new java.awt.Color(230, 245, 241));
        txtMatKhau.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(141, 156, 161)));
        txtMatKhau.setForeground(new java.awt.Color(102, 102, 102));
        txtMatKhau.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        getContentPane().add(txtMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 240, -1));

        txtGuiDen.setBackground(new java.awt.Color(230, 245, 241));
        txtGuiDen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(146, 151, 161)));
        txtGuiDen.setForeground(new java.awt.Color(102, 102, 102));
        txtGuiDen.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        txtGuiDen.setMargin(new java.awt.Insets(10, 6, -5, 10));
        getContentPane().add(txtGuiDen, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 100, 250, -1));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 51));
        jLabel10.setText("Gửi đến Mail");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 80, -1, -1));

        txtGuiHangLoat.setBackground(new java.awt.Color(230, 245, 241));
        txtGuiHangLoat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(146, 151, 161)));
        txtGuiHangLoat.setForeground(new java.awt.Color(102, 102, 102));
        txtGuiHangLoat.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        txtGuiHangLoat.setMargin(new java.awt.Insets(10, 6, -5, 10));
        getContentPane().add(txtGuiHangLoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 170, 250, -1));

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 51));
        jLabel11.setText("Gửi hàng loạt");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, -1, -1));

        txtTenFile.setBackground(new java.awt.Color(230, 245, 241));
        txtTenFile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(146, 151, 161)));
        txtTenFile.setForeground(new java.awt.Color(102, 102, 102));
        txtTenFile.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        txtTenFile.setMargin(new java.awt.Insets(10, 6, -5, 10));
        getContentPane().add(txtTenFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, 510, -1));

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 51));
        jLabel12.setText("Tiêu đề");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, -1, -1));

        txtTieuDe.setBackground(new java.awt.Color(230, 245, 241));
        txtTieuDe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(146, 151, 161)));
        txtTieuDe.setForeground(new java.awt.Color(102, 102, 102));
        txtTieuDe.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        txtTieuDe.setMargin(new java.awt.Insets(10, 6, -5, 10));
        getContentPane().add(txtTieuDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 510, -1));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 51));
        jLabel8.setText("Tên file chia sẻ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, -1, -1));

        txtTenDangNhap.setBackground(new java.awt.Color(230, 245, 241));
        txtTenDangNhap.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(146, 151, 161)));
        txtTenDangNhap.setForeground(new java.awt.Color(102, 102, 102));
        txtTenDangNhap.setText("SUTDPD05301@fpt.edu.vn");
        txtTenDangNhap.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        txtTenDangNhap.setMargin(new java.awt.Insets(20, 20, 20, 20));
        txtTenDangNhap.setName("Tên đăng nhập"); // NOI18N
        txtTenDangNhap.setNextFocusableComponent(txtTenDangNhap);
        getContentPane().add(txtTenDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 240, -1));
        txtTenDangNhap.getAccessibleContext().setAccessibleParent(txtTenDangNhap);

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 500, 690, -1));

        btnChonFile.setBackground(new java.awt.Color(7, 164, 121));
        btnChonFile.setBorder(null);
        btnChonFile.setText("CHỌN FILE");
        btnChonFile.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnChonFile.setType(null);
        btnChonFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChonFileActionPerformed(evt);
            }
        });
        getContentPane().add(btnChonFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 550, 120, 40));

        btnCancel.setBackground(new java.awt.Color(7, 164, 121));
        btnCancel.setBorder(null);
        btnCancel.setText("CANCEL");
        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnCancel.setType(null);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 550, 120, 40));

        btnGuiYeuCau.setBackground(new java.awt.Color(7, 164, 121));
        btnGuiYeuCau.setBorder(null);
        btnGuiYeuCau.setText("GỬI YÊU CẦU");
        btnGuiYeuCau.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnGuiYeuCau.setType(null);
        btnGuiYeuCau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuiYeuCauActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuiYeuCau, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 550, 120, 40));

        txaNoiDung.setBackground(new java.awt.Color(230, 245, 241));
        txaNoiDung.setColumns(20);
        txaNoiDung.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        txaNoiDung.setForeground(new java.awt.Color(102, 102, 102));
        txaNoiDung.setRows(5);
        txaNoiDung.setText("abc");
        txaNoiDung.setCaretColor(new java.awt.Color(7, 164, 121));
        txaNoiDung.setDisabledTextColor(new java.awt.Color(7, 164, 121));
        txaNoiDung.setSelectionColor(new java.awt.Color(7, 164, 121));
        jScrollPane1.setViewportView(txaNoiDung);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 510, 120));

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 51));
        jLabel14.setText("Tài khoản Mail");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, -1, -1));

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 51));
        jLabel13.setText("Nội dung");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(7, 164, 121));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("GỬI YÊU CẦU");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 690, -1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GreenOrganic");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 380, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nhập thông tin cần yêu cầu");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 300, 380, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Bắt đầu cuộc hành trình với chúng tôi!");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 330, 380, -1));

        jLabel5.setBackground(new java.awt.Color(32, 156, 91));
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 610));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuiYeuCauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuiYeuCauActionPerformed
        sendMail();
    }//GEN-LAST:event_btnGuiYeuCauActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnChonFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChonFileActionPerformed
        chooseFile();
    }//GEN-LAST:event_btnChonFileActionPerformed

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
            java.util.logging.Logger.getLogger(SendMail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SendMail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SendMail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SendMail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                SendMail dialog = new SendMail(new javax.swing.JFrame(), true);
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
    private rojerusan.RSMaterialButtonRectangle btnCancel;
    private rojerusan.RSMaterialButtonRectangle btnChonFile;
    private rojerusan.RSMaterialButtonRectangle btnGuiYeuCau;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txaNoiDung;
    private app.bolivia.swing.JCTextField txtGuiDen;
    private app.bolivia.swing.JCTextField txtGuiHangLoat;
    private rojerusan.RSPasswordTextPlaceHolder txtMatKhau;
    private app.bolivia.swing.JCTextField txtTenDangNhap;
    private app.bolivia.swing.JCTextField txtTenFile;
    private app.bolivia.swing.JCTextField txtTieuDe;
    // End of variables declaration//GEN-END:variables

    void sendMail() {
//        Properties prop = new Properties();
//        prop.put("mail.smtp.host", "smtp.gmail.com");
//        prop.put("mail.smtp.port", "587");
//        prop.put("mail.smtp.auth", "true");
//        prop.put("mail.smtp.starttls.enable", "true"); //TLS
        
        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS
        prop.put("mail.smtp.ssl.trust", "smtp.gmail.com");

        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(txtTenDangNhap.getText(), new String(txtMatKhau.getPassword()));
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(txtTenDangNhap.getText()));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(txtGuiDen.getText())
            );
            String ccEmails = txtGuiHangLoat.getText();
            message.addRecipients(Message.RecipientType.CC, InternetAddress.parse(ccEmails));
            message.setSubject(txtTieuDe.getText());
            message.setText(txaNoiDung.getText());
            
            
            MimeBodyPart filepart = new MimeBodyPart();
//            File file = new File("D:\\Java 3\\Demo\\vn.txt");
            FileDataSource fds = new FileDataSource(sendFile);
            filepart.setDataHandler(new DataHandler(fds));
            filepart.setFileName(sendFile.getName());
            
            
            MimeMultipart multipart = new MimeMultipart();
            multipart.addBodyPart(filepart);
            
            message.setContent(multipart);

            Transport.send(message);

            BoxHelper.alert(this, "Gửi thành công");
        } catch (Exception e) {
             BoxHelper.alert(this, "Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
    void chooseFile() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(this);
        if (fileChooser.getSelectedFile() != null) {
            sendFile = fileChooser.getSelectedFile();
            txtTenFile.setText(sendFile.getName());
        }else{
            sendFile = fileChooser.getSelectedFile();
            txtTenFile.setText("");
        }
    }
}
