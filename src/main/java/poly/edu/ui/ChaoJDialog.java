package poly.edu.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class ChaoJDialog extends javax.swing.JDialog {

    public ChaoJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        sethinh();
        intit();
    }

    
    void sethinh(){
        hinh1.setVisible(true);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
    }
    
    void intit() {
        setTitle("GreenOrganic");
        setLocationRelativeTo(null);
        
        new Timer(50, new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                int value = jProgressBar1.getValue();
                int a = 0;

                if (value < 100) {
                    jProgressBar1.setValue(value + 1);
                    a = value + 1;
                    lblPhanTram.setText(a + "%");

                    if (value < 30) {
                        lblLoading.setText("Hệ thống quản lý GreenOrganic");
                        hinh1.setVisible(false);
                        jLabel3.setVisible(true);
                    } else {
                        lblLoading.setText("Mã nhân viên là tên đăng nhập");
                        hinh1.setVisible(false);
                        jLabel4.setVisible(true);
                    }
                    if (value > 60) {
                        lblLoading.setText("Hệ thống dành cho Admin!");
                        hinh1.setVisible(false);
                        jLabel5.setVisible(true);
                    }
                    if (value > 90) {
                        lblLoading.setText("Sẵn sàng để bắt đầu! Wellcom");
                        hinh1.setVisible(false);
                        jLabel6.setVisible(true);
                    }
                } else {    
                    ChaoJDialog.this.dispose();
                }
            }
        }).start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        lblPhanTram = new javax.swing.JLabel();
        lblLoading = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        hinh1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/LogoChao.png"))); // NOI18N
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 6, 1030, 570));

        lblPhanTram.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblPhanTram.setForeground(new java.awt.Color(255, 255, 255));
        lblPhanTram.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPhanTram.setText("0%");
        getContentPane().add(lblPhanTram, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 560, 40, 20));

        lblLoading.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblLoading.setForeground(new java.awt.Color(255, 255, 255));
        lblLoading.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblLoading.setText("Loading");
        lblLoading.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblLoading, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 320, -1));

        jProgressBar1.setBackground(new java.awt.Color(0, 102, 51));
        jProgressBar1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jProgressBar1.setForeground(new java.awt.Color(0, 102, 51));
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 1040, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/c6.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 580));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/c3.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 580));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/c4.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 580));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/c2.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 580));

        hinh1.setBackground(new java.awt.Color(0, 102, 51));
        hinh1.setOpaque(true);
        getContentPane().add(hinh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 580));

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
            java.util.logging.Logger.getLogger(ChaoJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChaoJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChaoJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChaoJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                ChaoJDialog dialog = new ChaoJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel hinh1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel lblLoading;
    public static javax.swing.JLabel lblPhanTram;
    // End of variables declaration//GEN-END:variables
}
