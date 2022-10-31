package poly.edu.ui;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import poly.edu.dao.LoaiHangDAO;
import poly.edu.entity.LoaiHang;
import poly.edu.helper.AuthorHelper;
import poly.edu.helper.BoxHelper;
import poly.edu.helper.DataValidateHelper;

public class LoaiSanPhamjIF extends javax.swing.JInternalFrame {
    LoaiHangDAO dao  = new LoaiHangDAO();
    int row = -1;
    public LoaiSanPhamjIF() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLoaiHang = new rojeru_san.complementos.RSTableMetro();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMaLH = new app.bolivia.swing.JCTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtTenLH = new app.bolivia.swing.JCTextField();
        jSeparator3 = new javax.swing.JSeparator();
        btnDELETElh = new rojerusan.RSMaterialButtonRectangle();
        btnADDlh = new rojerusan.RSMaterialButtonRectangle();
        btnUPDATElh = new rojerusan.RSMaterialButtonRectangle();
        btnNEWlh = new rojerusan.RSMaterialButtonRectangle();
        jLabel5 = new javax.swing.JLabel();
        txtFINDlh = new app.bolivia.swing.JCTextField();
        jSeparator5 = new javax.swing.JSeparator();
        btnFINDlh = new rojerusan.RSButtonHover();
        btnNext = new rojerusan.RSButtonHover();
        btnBack = new rojerusan.RSButtonHover();
        lblRecord = new javax.swing.JLabel();
        btnLast = new rojerusan.RSButtonHover();
        btnFirst = new rojerusan.RSButtonHover();
        btnChuyenSP = new rojerusan.RSButtonHover();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tblLoaiHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null},
                {"", null},
                {"", null}
            },
            new String [] {
                "Mã loại hàng", "Tên loại hàng"
            }
        ));
        tblLoaiHang.setColorBackgoundHead(new java.awt.Color(0, 102, 51));
        tblLoaiHang.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblLoaiHang.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tblLoaiHang.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tblLoaiHang.setColorSelBackgound(new java.awt.Color(204, 204, 204));
        tblLoaiHang.setColorSelForeground(new java.awt.Color(0, 0, 0));
        tblLoaiHang.setFillsViewportHeight(true);
        tblLoaiHang.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        tblLoaiHang.setFuenteFilas(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        tblLoaiHang.setFuenteFilasSelect(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        tblLoaiHang.setFuenteHead(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        tblLoaiHang.setGridColor(new java.awt.Color(0, 102, 51));
        tblLoaiHang.setGrosorBordeFilas(0);
        tblLoaiHang.setGrosorBordeHead(0);
        tblLoaiHang.setRowHeight(25);
        tblLoaiHang.setShowGrid(false);
        tblLoaiHang.setShowHorizontalLines(true);
        tblLoaiHang.setShowVerticalLines(true);
        tblLoaiHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLoaiHangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLoaiHang);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin loại hàng", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13), new java.awt.Color(0, 102, 51))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 51));
        jLabel2.setText("Mã loại hàng");

        txtMaLH.setBorder(null);
        txtMaLH.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtMaLH.setMargin(new java.awt.Insets(10, 6, -5, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 51));
        jLabel3.setText("Tên loại hàng");

        txtTenLH.setBorder(null);
        txtTenLH.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtTenLH.setMargin(new java.awt.Insets(10, 6, -5, 10));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));

        btnDELETElh.setBackground(new java.awt.Color(0, 102, 51));
        btnDELETElh.setBorder(null);
        btnDELETElh.setText("Xóa");
        btnDELETElh.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnDELETElh.setType(null);
        btnDELETElh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDELETElhActionPerformed(evt);
            }
        });

        btnADDlh.setBackground(new java.awt.Color(0, 102, 51));
        btnADDlh.setBorder(null);
        btnADDlh.setText("THêm");
        btnADDlh.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnADDlh.setType(null);
        btnADDlh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADDlhActionPerformed(evt);
            }
        });

        btnUPDATElh.setBackground(new java.awt.Color(0, 102, 51));
        btnUPDATElh.setBorder(null);
        btnUPDATElh.setText("Cập nhật");
        btnUPDATElh.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnUPDATElh.setType(null);
        btnUPDATElh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUPDATElhActionPerformed(evt);
            }
        });

        btnNEWlh.setBackground(new java.awt.Color(0, 102, 51));
        btnNEWlh.setBorder(null);
        btnNEWlh.setText("Mới");
        btnNEWlh.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnNEWlh.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnNEWlh.setType(null);
        btnNEWlh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNEWlhActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaLH, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(jSeparator2))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTenLH, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnADDlh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUPDATElh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDELETElh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNEWlh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenLH, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaLH, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnADDlh, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDELETElh, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUPDATElh, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNEWlh, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 51));
        jLabel5.setText("Tìm kiếm: ");

        txtFINDlh.setBorder(null);
        txtFINDlh.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        txtFINDlh.setMargin(new java.awt.Insets(10, 6, -5, 10));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        btnFINDlh.setBackground(new java.awt.Color(255, 255, 255));
        btnFINDlh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/TimKiem.png"))); // NOI18N
        btnFINDlh.setColorHover(new java.awt.Color(204, 204, 204));
        btnFINDlh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFINDlhActionPerformed(evt);
            }
        });

        btnNext.setBackground(new java.awt.Color(255, 255, 255));
        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/next.png"))); // NOI18N
        btnNext.setColorHover(new java.awt.Color(204, 204, 204));
        btnNext.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnNext.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/back.png"))); // NOI18N
        btnBack.setColorHover(new java.awt.Color(204, 204, 204));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnBack.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblRecord.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRecord.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRecord.setText("0");

        btnLast.setBackground(new java.awt.Color(255, 255, 255));
        btnLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/last.png"))); // NOI18N
        btnLast.setColorHover(new java.awt.Color(204, 204, 204));
        btnLast.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnLast.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        btnFirst.setBackground(new java.awt.Color(255, 255, 255));
        btnFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/first.png"))); // NOI18N
        btnFirst.setColorHover(new java.awt.Color(204, 204, 204));
        btnFirst.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnFirst.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnChuyenSP.setBackground(new java.awt.Color(0, 102, 51));
        btnChuyenSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/ChuyenTabSPUCN1.png"))); // NOI18N
        btnChuyenSP.setText("QL Sản phẩm");
        btnChuyenSP.setColorHover(new java.awt.Color(0, 155, 76));
        btnChuyenSP.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnChuyenSP.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnChuyenSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuyenSPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtFINDlh, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btnFINDlh, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnChuyenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1034, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFINDlh, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFINDlh, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChuyenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChuyenSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuyenSPActionPerformed
        GreenOrganicJFrame.jPanelDeskop.removeAll();
        SanPhamjIF sp = new SanPhamjIF();
        GreenOrganicJFrame.jPanelDeskop.add(sp).setVisible(true);
        GreenOrganicJFrame.lblTieuDe.setText(" SẢN PHẨM"); 
        GreenOrganicJFrame.lblTieuDe.setFont(new java.awt.Font("Tahoma", 1, 19));
    }//GEN-LAST:event_btnChuyenSPActionPerformed

    private void tblLoaiHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLoaiHangMouseClicked
        this.row = tblLoaiHang.getSelectedRow();
        lblRecord.setText(getRecord());
        this.edit();
    }//GEN-LAST:event_tblLoaiHangMouseClicked

    private void btnADDlhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADDlhActionPerformed
        this.insert();
    }//GEN-LAST:event_btnADDlhActionPerformed

    private void btnUPDATElhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUPDATElhActionPerformed
        this.update();
    }//GEN-LAST:event_btnUPDATElhActionPerformed

    private void btnDELETElhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDELETElhActionPerformed
        this.delete();
    }//GEN-LAST:event_btnDELETElhActionPerformed

    private void btnNEWlhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNEWlhActionPerformed
       this.clearForm();
    }//GEN-LAST:event_btnNEWlhActionPerformed

    private void btnFINDlhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFINDlhActionPerformed
        this.find();
    }//GEN-LAST:event_btnFINDlhActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        this.first();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        this.last();
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.back();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        this.next();
    }//GEN-LAST:event_btnNextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle btnADDlh;
    private rojerusan.RSButtonHover btnBack;
    private rojerusan.RSButtonHover btnChuyenSP;
    private rojerusan.RSMaterialButtonRectangle btnDELETElh;
    private rojerusan.RSButtonHover btnFINDlh;
    private rojerusan.RSButtonHover btnFirst;
    private rojerusan.RSButtonHover btnLast;
    private rojerusan.RSMaterialButtonRectangle btnNEWlh;
    private rojerusan.RSButtonHover btnNext;
    private rojerusan.RSMaterialButtonRectangle btnUPDATElh;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblRecord;
    private rojeru_san.complementos.RSTableMetro tblLoaiHang;
    private app.bolivia.swing.JCTextField txtFINDlh;
    private app.bolivia.swing.JCTextField txtMaLH;
    private app.bolivia.swing.JCTextField txtTenLH;
    // End of variables declaration//GEN-END:variables
    void init() {
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ci = (BasicInternalFrameUI) this.getUI();
        ci.setNorthPane(null);
        this.row = -1;
        this.fillTable();
        this.updateStatus();
    }
    void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblLoaiHang.getModel();
        model.setRowCount(0);
        try {
            List<LoaiHang> list = dao.selectAll();
            for (LoaiHang lh : list) {
                Object[] row = {
                    lh.getMaLoai(),
                    lh.getTenLoai()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            BoxHelper.showError(this, "Lỗi truy vấn dữ liệu!");
        }
    }
    void fillTableByName() {
        DefaultTableModel model = (DefaultTableModel) tblLoaiHang.getModel();
        model.setRowCount(0);
        try {
            String key = txtFINDlh.getText();
            List<LoaiHang> list = dao.selectByKetword(key);
            for (LoaiHang lh : list) {
                Object[] row = {
                    lh.getMaLoai(),
                    lh.getTenLoai()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            BoxHelper.showError(this, "Lỗi truy vấn dữ liệu!");
        }
    }
    void setForm(LoaiHang lh) {
        if (lh == null) {
            txtMaLH.setText("");
            txtTenLH.setText("");
        }else{
        txtMaLH.setText(lh.getMaLoai());
        txtTenLH.setText(lh.getTenLoai());
        }
    }
    LoaiHang getForm() {
        LoaiHang lh = new LoaiHang();
        lh.setMaLoai(txtMaLH.getText());
        lh.setTenLoai(txtTenLH.getText());
        return lh;
    }
    void clearForm() {
        LoaiHang lh = new LoaiHang();
        lh = null;
        fillTable();
        this.setForm(lh);
        this.row = -1;
        tblLoaiHang.clearSelection();
        txtMaLH.setBackground(Color.WHITE);
        txtTenLH.setBackground(Color.WHITE);
        this.updateStatus();
    }
    void edit() {
        String maLH = (String) tblLoaiHang.getValueAt(row, 0);
        LoaiHang lh = dao.selectByID(maLH);
        this.setForm(lh);
        this.updateStatus();
    }
    void insert() {
        LoaiHang lh = getForm();
        StringBuilder sb = new StringBuilder();
        DataValidateHelper.validateEmpty(txtMaLH, sb, "Mã loại hàng không được để trống!");
        DataValidateHelper.validateEmpty(txtTenLH, sb, "Tên loại hàng không được để trống!");
        if (sb.length() > 0) {
            BoxHelper.showError(this, sb.toString());
            return;
        }
        try {
            dao.insert(lh);
            this.fillTable();
            this.clearForm();
            BoxHelper.alert(this, "Thêm mới thành công!");
        } catch (Exception e) {
            BoxHelper.alert(this, "Thêm mới thất bại!");
        }  
    }
    void update() {
        LoaiHang lh = getForm();
        StringBuilder sb = new StringBuilder();
        DataValidateHelper.validateEmpty(txtMaLH, sb, "Mã loại hàng không được để trống!");
        DataValidateHelper.validateEmpty(txtTenLH, sb, "Tên loại hàng không được để trống!");
        if (sb.length() > 0) {
            BoxHelper.showError(this, sb.toString());
            return;
        }
        if (BoxHelper.confirm(this, "Bạn có muốn cập nhật loại hàng này?")) {
            try {
                dao.update(lh);
                this.fillTable();
                this.clearForm();
                BoxHelper.alert(this, "Cập nhật thành công!");
            } catch (Exception e) {
                BoxHelper.alert(this, "Cập nhật thất bại!");
            }
        }
    }
    void delete() {
        if (!AuthorHelper.isManager()) {
           BoxHelper.alert(this, "Bạn không có quyền xóa loại hàng!");
        }else{
            String maLH = txtMaLH.getText();
            if (BoxHelper.confirm(this, "Bạn có muốn xóa loại hàng này?")) {
                try {
                    dao.delete(maLH);
                    this.fillTable();
                    this.clearForm();
                    BoxHelper.alert(this, "Xóa thành công!");
                } catch (Exception e) {
                    BoxHelper.alert(this, "Xóa thất bại!");
                }
            }
        }
    }
    void find() {
        this.clearForm();
        if (txtFINDlh.getText().equals("")) {
            BoxHelper.alert(this, "Tên loại hàng không tồn tại");
            fillTable();
            return;
        }
        LoaiHang lh = dao.selectByName(txtFINDlh.getText());
        if (lh != null) {
            fillTableByName();
            setForm(lh);
//            this.row = findCurrentByAll(lh.getMaLoai());
//            tblLoaiHang.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
            this.row = tblLoaiHang.getRowCount();
            lblRecord.setText("0");
            this.updateStatus();
        } else {
            fillTable();
            BoxHelper.alert(this, "Tên loại hàng không tồn tại");
            this.clearForm();
        }
    }
    void first() {
        this.row = 0;
        tblLoaiHang.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
        lblRecord.setText(this.getRecord());
        this.edit();
    }
    void last() {
        this.row = tblLoaiHang.getRowCount() - 1;
        tblLoaiHang.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
        lblRecord.setText(this.getRecord());
        this.edit();
    }
    void next() {
        if (this.row < tblLoaiHang.getRowCount() - 1) {
            this.row++;
            tblLoaiHang.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
            lblRecord.setText(this.getRecord());
            this.edit();
        }else{
            this.row = 0;
            tblLoaiHang.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
            lblRecord.setText(this.getRecord());
            this.edit();
        }
    }
    void back() {
        if (this.row > 0) {
            this.row--;
            tblLoaiHang.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
            lblRecord.setText(this.getRecord());
            this.edit();
        }else{
            this.row = tblLoaiHang.getRowCount() - 1;
            tblLoaiHang.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
            lblRecord.setText(this.getRecord());
            this.edit();
        }
    }
    void updateStatus() {
        boolean edit = (this.row >= 0);
        txtMaLH.setEditable(!edit);
        btnADDlh.setEnabled(!edit);
        btnDELETElh.setEnabled(edit);
        btnUPDATElh.setEnabled(edit);
    }
    public int getCurrentLoaiHangIndex() {
        return this.row;
    }
    public String getRecord() {//hàm tạo bản record
        return (row + 1) + ""; 
    }
    
}
