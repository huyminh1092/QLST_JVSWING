package poly.edu.ui;

import javax.swing.plaf.basic.BasicInternalFrameUI;


public class TrangChuJInternalFrame extends javax.swing.JInternalFrame {

    public TrangChuJInternalFrame() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        
        intit();

    }

    void intit() {
        a1.setVisible(true);
        a2.setVisible(false);
        a3.setVisible(false);
        a4.setVisible(false);
        a5.setVisible(false);
        a6.setVisible(false);

        c1.setVisible(true);
        c2.setVisible(true);
        c3.setVisible(true);
        c4.setVisible(true);
        c6.setVisible(true);
        c5.setVisible(true);

        chon1.setVisible(true);
        chon2.setVisible(false);
        chon3.setVisible(false);
        chon4.setVisible(false);
        chon5.setVisible(false);
        chon6.setVisible(false);
        

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        c1 = new javax.swing.JLabel();
        c2 = new javax.swing.JLabel();
        c3 = new javax.swing.JLabel();
        c4 = new javax.swing.JLabel();
        c5 = new javax.swing.JLabel();
        c6 = new javax.swing.JLabel();
        chon1 = new javax.swing.JLabel();
        chon2 = new javax.swing.JLabel();
        chon3 = new javax.swing.JLabel();
        chon4 = new javax.swing.JLabel();
        chon5 = new javax.swing.JLabel();
        chon6 = new javax.swing.JLabel();
        a6 = new javax.swing.JLabel();
        a5 = new javax.swing.JLabel();
        a4 = new javax.swing.JLabel();
        a3 = new javax.swing.JLabel();
        a2 = new javax.swing.JLabel();
        a1 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        c1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/anh1.png"))); // NOI18N
        c1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                c1MousePressed(evt);
            }
        });
        getContentPane().add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 610, -1, -1));

        c2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/anh1.png"))); // NOI18N
        c2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                c2MousePressed(evt);
            }
        });
        getContentPane().add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 610, -1, -1));

        c3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/anh1.png"))); // NOI18N
        c3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                c3MousePressed(evt);
            }
        });
        getContentPane().add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 610, -1, -1));

        c4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/anh1.png"))); // NOI18N
        c4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                c4MousePressed(evt);
            }
        });
        getContentPane().add(c4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 610, -1, -1));

        c5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/anh1.png"))); // NOI18N
        c5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                c5MousePressed(evt);
            }
        });
        getContentPane().add(c5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 610, -1, -1));

        c6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/anh1.png"))); // NOI18N
        c6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                c6MousePressed(evt);
            }
        });
        getContentPane().add(c6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 610, -1, -1));

        chon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/anhchon.png"))); // NOI18N
        getContentPane().add(chon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 610, -1, -1));

        chon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/anhchon.png"))); // NOI18N
        getContentPane().add(chon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 610, -1, -1));

        chon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/anhchon.png"))); // NOI18N
        getContentPane().add(chon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 610, -1, -1));

        chon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/anhchon.png"))); // NOI18N
        getContentPane().add(chon4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 610, -1, -1));

        chon5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/anhchon.png"))); // NOI18N
        getContentPane().add(chon5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 610, -1, -1));

        chon6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/anhchon.png"))); // NOI18N
        getContentPane().add(chon6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 610, -1, -1));

        a6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/tc6.png"))); // NOI18N
        getContentPane().add(a6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 660));

        a5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/tc5.png"))); // NOI18N
        getContentPane().add(a5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 660));

        a4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/tc4.png"))); // NOI18N
        getContentPane().add(a4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 660));

        a3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/tc3.png"))); // NOI18N
        getContentPane().add(a3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 660));

        a2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/tc2.png"))); // NOI18N
        getContentPane().add(a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 660));

        a1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/tc1.png"))); // NOI18N
        getContentPane().add(a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, -1, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void c1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c1MousePressed
        intit();
    }//GEN-LAST:event_c1MousePressed

    private void c2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c2MousePressed
        intit();
        a1.setVisible(false);
        a2.setVisible(true);

        chon1.setVisible(false);
        chon2.setVisible(true);
    }//GEN-LAST:event_c2MousePressed

    private void c3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c3MousePressed
        intit();
        a1.setVisible(false);
        a3.setVisible(true);

        chon1.setVisible(false);
        chon3.setVisible(true);
    }//GEN-LAST:event_c3MousePressed

    private void c4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c4MousePressed
        intit();
        a1.setVisible(false);
        a4.setVisible(true);

        chon1.setVisible(false);
        chon4.setVisible(true);
    }//GEN-LAST:event_c4MousePressed

    private void c5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c5MousePressed
        intit();
        a1.setVisible(false);
        a5.setVisible(true);

        chon1.setVisible(false);
        chon5.setVisible(true);
    }//GEN-LAST:event_c5MousePressed

    private void c6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c6MousePressed
        intit();
        a1.setVisible(false);
        a6.setVisible(true);

        chon1.setVisible(false);
        chon6.setVisible(true);
    }//GEN-LAST:event_c6MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a2;
    private javax.swing.JLabel a3;
    private javax.swing.JLabel a4;
    private javax.swing.JLabel a5;
    private javax.swing.JLabel a6;
    private javax.swing.JLabel c1;
    private javax.swing.JLabel c2;
    private javax.swing.JLabel c3;
    private javax.swing.JLabel c4;
    private javax.swing.JLabel c5;
    private javax.swing.JLabel c6;
    private javax.swing.JLabel chon1;
    private javax.swing.JLabel chon2;
    private javax.swing.JLabel chon3;
    private javax.swing.JLabel chon4;
    private javax.swing.JLabel chon5;
    private javax.swing.JLabel chon6;
    // End of variables declaration//GEN-END:variables
}
