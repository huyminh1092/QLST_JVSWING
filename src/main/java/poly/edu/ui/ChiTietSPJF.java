package poly.edu.ui;

import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import poly.edu.dao.HDCTNhapDAO;
import poly.edu.dao.HoaDonNhapDAO;
import poly.edu.dao.NhaCungUngDAO;
import poly.edu.dao.NhanVienDAO;
import poly.edu.dao.SanPhamDAO;
import poly.edu.entity.HoaDonChiTietNhap;
import poly.edu.entity.HoaDonNhap;
import poly.edu.entity.LoaiHang;
import poly.edu.entity.NhaCungUng;
import poly.edu.entity.NhanVien;
import poly.edu.entity.SanPham;
import poly.edu.helper.BoxHelper;
import poly.edu.helper.DateHelper;
import poly.edu.helper.ImageHelper;
import poly.edu.helper.JDBCHelper;
import static poly.edu.ui.GreenOrganicJFrame.jPanelDeskop;
import static poly.edu.ui.GreenOrganicJFrame.lblTieuDe;
import static poly.edu.ui.HoaDonNhapjIF.tblSanPhamNhap;
import static poly.edu.ui.HoaDonNhapjIF.txtTongTien;

public class ChiTietSPJF extends javax.swing.JInternalFrame {
    
    public static int countFind = 0;
    HoaDonNhapDAO hdNhapDAO = new HoaDonNhapDAO();
    HDCTNhapDAO hdctndao = new HDCTNhapDAO();
    NhaCungUngDAO ncuDAO = new NhaCungUngDAO();
    int row = -1;
    public static int countSP = 0;
    List<SanPham> lio=new SanPhamDAO().selectAll();
    public ChiTietSPJF() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ci = (BasicInternalFrameUI) this.getUI();
        ci.setNorthPane(null);
        inii();
        lblRecord.setText(lio.size()+"");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblChiTietSP = new rojeru_san.complementos.RSTableMetro();
        jLabel5 = new javax.swing.JLabel();
        txtFindTenSP = new app.bolivia.swing.JCTextField();
        jSeparator5 = new javax.swing.JSeparator();
        btnFINDSP = new rojerusan.RSButtonHover();
        btnNext = new rojerusan.RSButtonHover();
        btnBack = new rojerusan.RSButtonHover();
        lblRecord = new javax.swing.JLabel();
        btnLast = new rojerusan.RSButtonHover();
        btnFirst = new rojerusan.RSButtonHover();
        btnChuyenSP = new rojerusan.RSButtonHover();
        cboLoaiSP = new rojerusan.RSComboMetro();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tblChiTietSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SP", "Tên SP", "Loại SP", "Tên NCU", "Ngày nhập", "Hạn SD", "Giá nhập", "Giá bán", "Số lượng", "Đơn vị", "Giảm giá", "Vị trí"
            }
        ));
        tblChiTietSP.setColorBackgoundHead(new java.awt.Color(0, 102, 51));
        tblChiTietSP.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblChiTietSP.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tblChiTietSP.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tblChiTietSP.setColorSelBackgound(new java.awt.Color(204, 204, 204));
        tblChiTietSP.setColorSelForeground(new java.awt.Color(0, 0, 0));
        tblChiTietSP.setFillsViewportHeight(true);
        tblChiTietSP.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        tblChiTietSP.setFuenteFilas(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        tblChiTietSP.setFuenteFilasSelect(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        tblChiTietSP.setFuenteHead(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        tblChiTietSP.setGridColor(new java.awt.Color(0, 102, 51));
        tblChiTietSP.setGrosorBordeFilas(0);
        tblChiTietSP.setGrosorBordeHead(0);
        tblChiTietSP.setRowHeight(25);
        tblChiTietSP.setShowGrid(false);
        tblChiTietSP.setShowHorizontalLines(true);
        tblChiTietSP.setShowVerticalLines(true);
        tblChiTietSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblChiTietSPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblChiTietSP);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 51));
        jLabel5.setText("Tìm kiếm: ");

        txtFindTenSP.setBorder(null);
        txtFindTenSP.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtFindTenSP.setMargin(new java.awt.Insets(10, 6, -5, 10));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        btnFINDSP.setBackground(new java.awt.Color(255, 255, 255));
        btnFINDSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/TimKiem.png"))); // NOI18N
        btnFINDSP.setColorHover(new java.awt.Color(204, 204, 204));
        btnFINDSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFINDSPActionPerformed(evt);
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
        btnChuyenSP.setText("Cập nhật sản phẩm");
        btnChuyenSP.setColorHover(new java.awt.Color(0, 155, 76));
        btnChuyenSP.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnChuyenSP.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnChuyenSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuyenSPActionPerformed(evt);
            }
        });

        cboLoaiSP.setColorArrow(new java.awt.Color(0, 102, 51));
        cboLoaiSP.setColorBorde(new java.awt.Color(0, 102, 51));
        cboLoaiSP.setColorFondo(new java.awt.Color(0, 102, 51));
        cboLoaiSP.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        cboLoaiSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLoaiSPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
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
                        .addComponent(btnChuyenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cboLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 329, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtFindTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFINDSP, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cboLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFindTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btnFINDSP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChuyenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
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

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        first();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        last();
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        back();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnFINDSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFINDSPActionPerformed
        find();
    }//GEN-LAST:event_btnFINDSPActionPerformed

    private void cboLoaiSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLoaiSPActionPerformed
        fillTableChiTietSPTheoCBO();
    }//GEN-LAST:event_cboLoaiSPActionPerformed

    private void tblChiTietSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChiTietSPMouseClicked
        chuyenSP();
        this.edit();
        lblRecord.setText(getRecord());
        
        
    }//GEN-LAST:event_tblChiTietSPMouseClicked

    private void btnChuyenSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuyenSPActionPerformed
        chuyenSP();
    }//GEN-LAST:event_btnChuyenSPActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonHover btnBack;
    private rojerusan.RSButtonHover btnChuyenSP;
    private rojerusan.RSButtonHover btnFINDSP;
    private rojerusan.RSButtonHover btnFirst;
    private rojerusan.RSButtonHover btnLast;
    private rojerusan.RSButtonHover btnNext;
    private javax.swing.ButtonGroup buttonGroup1;
    private rojerusan.RSComboMetro cboLoaiSP;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblRecord;
    public static rojeru_san.complementos.RSTableMetro tblChiTietSP;
    private app.bolivia.swing.JCTextField txtFindTenSP;
    // End of variables declaration//GEN-END:variables
    void inii() {
        fillComboBoxTenLH();
        fillTableChiTietSP();
    }
    
    void fillComboBoxTenLH() {
           try {
            String sql = "select * from LoaiHang";
            try (
                    Connection con = JDBCHelper.openConnection();
                    PreparedStatement pstmt = con.prepareStatement(sql);) {

                ResultSet rs = pstmt.executeQuery();
                cboLoaiSP.removeAllItems();
                while (rs.next()) {
                    cboLoaiSP.addItem(rs.getString("TenLoaiHang"));
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
        }
    }
    
    void fillTableChiTietSP() {
        DefaultTableModel model = (DefaultTableModel) tblChiTietSP.getModel();
        model.setRowCount(0);
        try {
                List<SanPham> list = new SanPhamDAO().selectAll();
            for (SanPham sp : list) {
                Object[] row = {
                    sp.getMaSP(),
                    sp.getTenSP(),
                    sp.getTenLH(),
                    sp.getTenNCU(),
                    DateHelper.toString(sp.getNgayNhap(), "yyyy-MM-dd"),
                    DateHelper.toString(sp.gethSD(), "yyyy-MM-dd"),
                    sp.getGiaNhap(),
                    sp.getGiaBan(),
                    sp.getSoLuong(),
                    sp.getDonVi(),
                    sp.getGiamGia(),
                    sp.getViTri(),
                    
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
            BoxHelper.showError(this, "Lỗi truy vấn dữ liệu!");
        }  
    }
    
    void fillTableChiTietSPTheoCBO() {
        DefaultTableModel model = (DefaultTableModel) tblChiTietSP.getModel();
        model.setRowCount(0);
        try {
                String tenLH = String.valueOf(cboLoaiSP.getSelectedItem());
                List<SanPham> list = new SanPhamDAO().selectByLoaiHangTheoTen(tenLH);
            for (SanPham sp : list) {
                Object[] row = {
                    sp.getMaSP(),
                    sp.getTenSP(),
                    sp.getTenLH(),
                    sp.getTenNCU(),
                    DateHelper.toString(sp.getNgayNhap(), "yyyy-MM-dd"),
                    DateHelper.toString(sp.gethSD(), "yyyy-MM-dd"),
                    sp.getGiaNhap(),
                    sp.getGiaBan(),
                    sp.getSoLuong(),
                    sp.getDonVi(),
                    sp.getGiamGia(),
                    sp.getViTri(),
                    
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
            BoxHelper.showError(this, "Lỗi truy vấn dữ liệu!");
        }  
    }
    
    
    void fillTableByName() {
        DefaultTableModel model = (DefaultTableModel) tblChiTietSP.getModel();
        model.setRowCount(0);
        try {
            String key = txtFindTenSP.getText();
            List<SanPham> list = new SanPhamDAO().selectByKetword(key);
            for (SanPham sp : list) {
                Object[] row = {
                    sp.getMaSP(),
                    sp.getTenSP(),
                    sp.getTenLH(),
                    sp.getTenNCU(),
                    DateHelper.toString(sp.getNgayNhap(), "yyyy-MM-dd"),
                    DateHelper.toString(sp.gethSD(), "yyyy-MM-dd"),
                    sp.getGiaNhap(),
                    sp.getGiaBan(),
                    sp.getSoLuong(),
                    sp.getDonVi(),
                    sp.getGiamGia(),
                    sp.getViTri(),
                    
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            BoxHelper.showError(this, "Lỗi truy vấn dữ liệu!");
        }  
    }
    
    void edit() {
        row = tblChiTietSP.getSelectedRow();
        String maSP = (String) tblChiTietSP.getValueAt(row, 0);
        SanPham sp = new SanPhamDAO().selectByID(maSP);
        
            SanPhamjIF.cboLoaiSP.setSelectedItem(sp.getTenLH());
            SanPhamjIF.cboDonVi.setSelectedItem(sp.getDonVi());
            SanPhamjIF.txtMaSP.setText(sp.getMaSP());
            SanPhamjIF.txtNgayNH.setText(sp.getNgayNhap().toString());
            SanPhamjIF.cboTenNCU.setSelectedItem(sp.getTenNCU());
            SanPhamjIF.txtGhiChu.setText(sp.getGhiChu());
            SanPhamjIF.txtGiaBan.setText(sp.getGiaBan() + "");
            SanPhamjIF.txtGiaNhap.setText(sp.getGiaNhap() + "");
            SanPhamjIF.txtGiamGia.setText(sp.getGiamGia() + "");
            SanPhamjIF.txtHanSD.setText(sp.gethSD().toString());
            SanPhamjIF.cboTenSPncu.setSelectedItem(sp.getTenSP());
            SanPhamjIF.txtViTri.setText(sp.getViTri());
            SanPhamjIF.txtSoLuong.setText(sp.getSoLuong() + "");
            SanPhamjIF.txtGhiChu.setText(sp.getGhiChu());
            SanPhamjIF.lblHinh.setToolTipText(sp.getHinh());
            ImageIcon icon = ImageHelper.read(sp.getHinh());
            Image img = ImageHelper.resize(icon.getImage(), 193, 199);
            SanPhamjIF.lblHinh.setIcon(new ImageIcon(img));
            SanPhamjIF.btnADDsp.setEnabled(false);
            SanPhamjIF.btnUPDATEsp.setEnabled(true);
            SanPhamjIF.btnDELETEsp.setEnabled(true);
        
     }
    
    void find() {
        if (txtFindTenSP.getText().equals("")) {
            BoxHelper.alert(this, "Tên sản phẩm không tồn tại");
            fillTableChiTietSP();
            return;
        }
        SanPham sp = new SanPhamDAO().selectByName(txtFindTenSP.getText());
        if (sp != null) {
            fillTableByName();
//            this.row = findCurrentByAll(lh.getMaLoai());
//            tblLoaiHang.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
            this.row = tblChiTietSP.getRowCount();
            lblRecord.setText("0");
        } else {
            fillTableChiTietSP();
            BoxHelper.alert(this, "Tên sản phẩm không tồn tại");
        }
    }
    
    void chuyenSP() {
        SanPhamjIF sanpham = new SanPhamjIF();
        jPanelDeskop.removeAll();
        jPanelDeskop.add(sanpham).setVisible(true);
        lblTieuDe.setText(" SẢN PHẨM");
        lblTieuDe.setFont(new java.awt.Font("Tahoma", 1, 19));
    }
    
    
    void first() {
        this.row = 0;
        tblChiTietSP.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
        lblRecord.setText(this.getRecord());
    }
    void last() {
        this.row = tblChiTietSP.getRowCount() - 1;
        tblChiTietSP.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
        lblRecord.setText(this.getRecord());
    }
    void next() {
        if (this.row < tblChiTietSP.getRowCount() - 1) {
            this.row++;
            tblChiTietSP.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
            lblRecord.setText(this.getRecord());
        }else{
            this.row = 0;
            tblChiTietSP.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
            lblRecord.setText(this.getRecord());
        }
    }
    void back() {
        if (this.row > 0) {
            this.row--;
            tblChiTietSP.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
            lblRecord.setText(this.getRecord());
        }else{
            this.row = tblChiTietSP.getRowCount() - 1;
            tblChiTietSP.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
            lblRecord.setText(this.getRecord());
        }
    }
    
    public int getCurrentLoaiHangIndex() {
        return this.row;
    }
    public String getRecord() {//hàm tạo bản record
        return (row + 1) + ""; 
    }
}
