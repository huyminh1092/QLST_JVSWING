package poly.edu.ui;

import java.util.List;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import poly.edu.dao.HDCTNhapDAO;
import poly.edu.dao.HoaDonNhapDAO;
import poly.edu.dao.NhaCungUngDAO;
import poly.edu.dao.NhanVienDAO;
import poly.edu.entity.HoaDonChiTietNhap;
import poly.edu.entity.HoaDonNhap;
import poly.edu.entity.NhaCungUng;
import poly.edu.entity.NhanVien;
import poly.edu.helper.BoxHelper;
import poly.edu.helper.DateHelper;
import static poly.edu.ui.HoaDonNhapjIF.tblSanPhamNhap;
import static poly.edu.ui.HoaDonNhapjIF.txtTongTien;

public class DSHoaDonNhapjIF extends javax.swing.JInternalFrame {
    
    public static int countFind = 0;
    HoaDonNhapDAO hdNhapDAO = new HoaDonNhapDAO();
    HDCTNhapDAO hdctndao = new HDCTNhapDAO();
    NhaCungUngDAO ncuDAO = new NhaCungUngDAO();
    int row = -1;
    public static int count = 0;
    
    public DSHoaDonNhapjIF() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ci = (BasicInternalFrameUI) this.getUI();
        ci.setNorthPane(null);
        fillTable();
        int row = -1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        cboNam = new rojerusan.RSComboMetro();
        cboThang = new rojerusan.RSComboMetro();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDSHDN = new rojeru_san.complementos.RSTableMetro();
        jLabel5 = new javax.swing.JLabel();
        txtFindTenNCU = new app.bolivia.swing.JCTextField();
        jSeparator5 = new javax.swing.JSeparator();
        btnFINDhdNhap = new rojerusan.RSButtonHover();
        btnNext = new rojerusan.RSButtonHover();
        btnBack = new rojerusan.RSButtonHover();
        lblRecord = new javax.swing.JLabel();
        btnLast = new rojerusan.RSButtonHover();
        btnFirst = new rojerusan.RSButtonHover();
        btnChuyenNhapHang = new rojerusan.RSButtonHover();
        rdoDaTK = new javax.swing.JRadioButton();
        rdoChuaTK = new javax.swing.JRadioButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        cboNam.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        cboNam.setColorArrow(new java.awt.Color(0, 102, 51));
        cboNam.setColorBorde(new java.awt.Color(0, 102, 51));
        cboNam.setColorFondo(new java.awt.Color(0, 102, 51));
        cboNam.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        cboNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNamActionPerformed(evt);
            }
        });

        cboThang.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        cboThang.setColorArrow(new java.awt.Color(0, 102, 51));
        cboThang.setColorBorde(new java.awt.Color(0, 102, 51));
        cboThang.setColorFondo(new java.awt.Color(0, 102, 51));
        cboThang.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        cboThang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboThangActionPerformed(evt);
            }
        });

        tblDSHDN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã HDN", "Ngày nhập", "Tên nhân viên", "Tên nhà cung ứng", "Tổng tiền"
            }
        ));
        tblDSHDN.setColorBackgoundHead(new java.awt.Color(0, 102, 51));
        tblDSHDN.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblDSHDN.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tblDSHDN.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tblDSHDN.setColorSelBackgound(new java.awt.Color(204, 204, 204));
        tblDSHDN.setColorSelForeground(new java.awt.Color(0, 0, 0));
        tblDSHDN.setFillsViewportHeight(true);
        tblDSHDN.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        tblDSHDN.setFuenteFilas(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        tblDSHDN.setFuenteFilasSelect(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        tblDSHDN.setFuenteHead(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        tblDSHDN.setGridColor(new java.awt.Color(0, 102, 51));
        tblDSHDN.setGrosorBordeFilas(0);
        tblDSHDN.setGrosorBordeHead(0);
        tblDSHDN.setRowHeight(25);
        tblDSHDN.setShowGrid(false);
        tblDSHDN.setShowHorizontalLines(true);
        tblDSHDN.setShowVerticalLines(true);
        tblDSHDN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDSHDNMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDSHDN);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 51));
        jLabel5.setText("Tìm kiếm: ");

        txtFindTenNCU.setBorder(null);
        txtFindTenNCU.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtFindTenNCU.setMargin(new java.awt.Insets(10, 6, -5, 10));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        btnFINDhdNhap.setBackground(new java.awt.Color(255, 255, 255));
        btnFINDhdNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/TimKiem.png"))); // NOI18N
        btnFINDhdNhap.setColorHover(new java.awt.Color(204, 204, 204));
        btnFINDhdNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFINDhdNhapActionPerformed(evt);
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

        btnChuyenNhapHang.setBackground(new java.awt.Color(0, 102, 51));
        btnChuyenNhapHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/ChuyenTabSPUCN1.png"))); // NOI18N
        btnChuyenNhapHang.setText("Nhập hàng");
        btnChuyenNhapHang.setColorHover(new java.awt.Color(0, 155, 76));
        btnChuyenNhapHang.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnChuyenNhapHang.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnChuyenNhapHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuyenNhapHangActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoDaTK);
        rdoDaTK.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rdoDaTK.setForeground(new java.awt.Color(0, 102, 51));
        rdoDaTK.setSelected(true);
        rdoDaTK.setText("Đã tổng kết");
        rdoDaTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoDaTKActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoChuaTK);
        rdoChuaTK.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rdoChuaTK.setForeground(new java.awt.Color(0, 102, 51));
        rdoChuaTK.setText("Chưa tổng kết");
        rdoChuaTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoChuaTKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
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
                        .addComponent(rdoDaTK)
                        .addGap(42, 42, 42)
                        .addComponent(rdoChuaTK)
                        .addGap(255, 255, 255)
                        .addComponent(btnChuyenNhapHang, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtFindTenNCU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFINDhdNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 539, Short.MAX_VALUE)
                                .addComponent(cboThang, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                            .addComponent(txtFindTenNCU, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btnFINDhdNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboThang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, 0)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnChuyenNhapHang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rdoDaTK)
                        .addComponent(rdoChuaTK)))
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

    private void btnChuyenNhapHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuyenNhapHangActionPerformed
        chuyenHDN();
    }//GEN-LAST:event_btnChuyenNhapHangActionPerformed

    private void tblDSHDNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDSHDNMouseClicked
//        selectHoaDon();
        count = 1;
        this.row = tblDSHDN.getSelectedRow();
        lblRecord.setText(getRecord());
        chuyenHDN();
        setData();
        
    }//GEN-LAST:event_tblDSHDNMouseClicked

    private void rdoDaTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoDaTKActionPerformed
        fillTableHoaDonNhapDaTK();
        countFind = 0;
    }//GEN-LAST:event_rdoDaTKActionPerformed

    private void rdoChuaTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoChuaTKActionPerformed
        txtFindTenNCU.setText("");
        fillTableHoaDonNhapChuaTK();
        countFind = 1;
    }//GEN-LAST:event_rdoChuaTKActionPerformed

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

    private void btnFINDhdNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFINDhdNhapActionPerformed
        findHDN();
    }//GEN-LAST:event_btnFINDhdNhapActionPerformed

    private void cboNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNamActionPerformed
        findHDNByMonth();
    }//GEN-LAST:event_cboNamActionPerformed

    private void cboThangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboThangActionPerformed
        //        chonLoaiHang();
    }//GEN-LAST:event_cboThangActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonHover btnBack;
    private rojerusan.RSButtonHover btnChuyenNhapHang;
    private rojerusan.RSButtonHover btnFINDhdNhap;
    private rojerusan.RSButtonHover btnFirst;
    private rojerusan.RSButtonHover btnLast;
    private rojerusan.RSButtonHover btnNext;
    private javax.swing.ButtonGroup buttonGroup1;
    private rojerusan.RSComboMetro cboNam;
    private rojerusan.RSComboMetro cboThang;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblRecord;
    private javax.swing.JRadioButton rdoChuaTK;
    private javax.swing.JRadioButton rdoDaTK;
    public static rojeru_san.complementos.RSTableMetro tblDSHDN;
    private app.bolivia.swing.JCTextField txtFindTenNCU;
    // End of variables declaration//GEN-END:variables
    void fillTable() {
        if (rdoDaTK.isSelected() == true) {
            fillTableHoaDonNhapDaTK();
        }
        if (rdoChuaTK.isSelected() == true) {
            fillTableHoaDonNhapChuaTK();
        }
    }
    
    void fillTableHoaDonNhapDaTK() {
        DefaultTableModel model = (DefaultTableModel) tblDSHDN.getModel();
        model.setRowCount(0);
        try {
                List<HoaDonNhap> list = hdNhapDAO.selectAllHaveTotal();
            for (HoaDonNhap hdn : list) {
                NhanVien nv = new NhanVienDAO().selectByID(hdn.getMaNV());
                NhaCungUng ncu = new NhaCungUngDAO().selectByID(hdn.getMaNCU());
                Object[] row = {
                    hdn.getMaHDNhap(),
                    DateHelper.toString(hdn.getNgayNhap(), "yyyy-MM-dd"),
                    nv.getHoTen(),
                    ncu.getTenNCU(),
                    hdn.getTongTienNhap()
                    
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
            BoxHelper.showError(this, "Lỗi truy vấn dữ liệu!");
        } 
    }
    
    void fillTableHoaDonNhapChuaTK() {
        DefaultTableModel model = (DefaultTableModel) tblDSHDN.getModel();
        model.setRowCount(0);
        try {
                List<HoaDonNhap> list = hdNhapDAO.selectAll();
            for (HoaDonNhap hdn : list) {
                NhanVien nv = new NhanVienDAO().selectByID(hdn.getMaNV());
                NhaCungUng ncu = new NhaCungUngDAO().selectByID(hdn.getMaNCU());
                Object[] row = {
                    hdn.getMaHDNhap(),
                    DateHelper.toString(hdn.getNgayNhap(), "yyyy-MM-dd"),
                    nv.getHoTen(),
                    ncu.getTenNCU(),
                    hdn.getTongTienNhap()
                    
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
            BoxHelper.showError(this, "Lỗi truy vấn dữ liệu!");
        } 
    }
    
    void fillTableHoaDonNhapByNameNVHasTongTien() {
        DefaultTableModel model = (DefaultTableModel) tblDSHDN.getModel();
        model.setRowCount(0);
        try {
                List<HoaDonNhap> list = hdNhapDAO.selectByNameNCUHasTongTien(txtFindTenNCU.getText());
            for (HoaDonNhap hdn : list) {
                NhanVien nv = new NhanVienDAO().selectByID(hdn.getMaNV());
                NhaCungUng ncu = new NhaCungUngDAO().selectByID(hdn.getMaNCU());
                Object[] row = {
                    hdn.getMaHDNhap(),
                    DateHelper.toString(hdn.getNgayNhap(), "yyyy-MM-dd"),
                    nv.getHoTen(),
                    ncu.getTenNCU(),
                    hdn.getTongTienNhap()
                    
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
            BoxHelper.showError(this, "Lỗi truy vấn dữ liệu!");
        } 
    }
    
    void fillTableHoaDonNhapByNameNVNoTongTien() {
        DefaultTableModel model = (DefaultTableModel) tblDSHDN.getModel();
        model.setRowCount(0);
        try {
                List<HoaDonNhap> list = hdNhapDAO.selectByNameNCUNoTongTien(txtFindTenNCU.getText());
            for (HoaDonNhap hdn : list) {
                NhanVien nv = new NhanVienDAO().selectByID(hdn.getMaNV());
                NhaCungUng ncu = new NhaCungUngDAO().selectByID(hdn.getMaNCU());
                Object[] row = {
                    hdn.getMaHDNhap(),
                    DateHelper.toString(hdn.getNgayNhap(), "yyyy-MM-dd"),
                    nv.getHoTen(),
                    ncu.getTenNCU(),
                    hdn.getTongTienNhap()
                    
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
            BoxHelper.showError(this, "Lỗi truy vấn dữ liệu!");
        } 
    }
    
    void fillTableHoaDonNhapByMonthHasTongTien() {
        DefaultTableModel model = (DefaultTableModel) tblDSHDN.getModel();
        model.setRowCount(0);
        String thang = (String) cboThang.getSelectedItem();
        String nam = (String) cboNam.getSelectedItem();
        int month = Integer.valueOf(thang);
        int year = Integer.valueOf(nam);
        try {
                List<HoaDonNhap> list = hdNhapDAO.selectByMonthNCUHasTongTien(month, year);
            for (HoaDonNhap hdn : list) {
                NhanVien nv = new NhanVienDAO().selectByID(hdn.getMaNV());
                NhaCungUng ncu = new NhaCungUngDAO().selectByID(hdn.getMaNCU());
                Object[] row = {
                    hdn.getMaHDNhap(),
                    DateHelper.toString(hdn.getNgayNhap(), "yyyy-MM-dd"),
                    nv.getHoTen(),
                    ncu.getTenNCU(),
                    hdn.getTongTienNhap()
                    
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
            BoxHelper.showError(this, "Lỗi truy vấn dữ liệu!");
        } 
    }
    
    void fillTableHoaDonNhapByMonthNoTongTien() {
        DefaultTableModel model = (DefaultTableModel) tblDSHDN.getModel();
        model.setRowCount(0);
        String thang = (String) cboThang.getSelectedItem();
        String nam = (String) cboNam.getSelectedItem();
        int month = Integer.valueOf(thang);
        int year = Integer.valueOf(nam);
        try {
                List<HoaDonNhap> list = hdNhapDAO.selectByMonthNCUNoTongTien(month, year);
            for (HoaDonNhap hdn : list) {
                NhanVien nv = new NhanVienDAO().selectByID(hdn.getMaNV());
                NhaCungUng ncu = new NhaCungUngDAO().selectByID(hdn.getMaNCU());
                Object[] row = {
                    hdn.getMaHDNhap(),
                    DateHelper.toString(hdn.getNgayNhap(), "yyyy-MM-dd"),
                    nv.getHoTen(),
                    ncu.getTenNCU(),
                    hdn.getTongTienNhap()
                    
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
            BoxHelper.showError(this, "Lỗi truy vấn dữ liệu!");
        } 
    }
    
    void findHDN() {
        if (txtFindTenNCU.getText().equals("")) {
            BoxHelper.alert(this, "Tên nhà cung ứng không tồn tại");
            fillTable();
            return;
        }
        if (countFind == 0) {
            HoaDonNhap hdn = hdNhapDAO.selectByNameObNCUHasTongTien(txtFindTenNCU.getText());
            if (hdn != null) {
                fillTableHoaDonNhapByNameNVHasTongTien();
                this.row = tblDSHDN.getRowCount();
                lblRecord.setText("0");
            } else {
                fillTableHoaDonNhapDaTK();
                BoxHelper.alert(this, "Tên nhà cung ứng không tồn tại");
            }
        }else{
            HoaDonNhap hdn = hdNhapDAO.selectByNameObNCUNoTongTien(txtFindTenNCU.getText());
            if (hdn != null) {
                fillTableHoaDonNhapByNameNVNoTongTien();
                this.row = tblDSHDN.getRowCount();
                lblRecord.setText("0");
            } else {
                fillTableHoaDonNhapChuaTK();
                BoxHelper.alert(this, "Tên nhà cung ứng không tồn tại");
            }
        }

    }
    
    void findHDNByMonth() {
        String thang = (String) cboThang.getSelectedItem();
        String nam = (String) cboNam.getSelectedItem();
        int month = Integer.valueOf(thang);
        int year = Integer.valueOf(nam);
        if (countFind == 0) {
            HoaDonNhap hdn = hdNhapDAO.selectByMotnhObNCUHasTongTien(month, year);
            if (hdn != null) {
                fillTableHoaDonNhapByMonthHasTongTien();
                this.row = tblDSHDN.getRowCount();
                lblRecord.setText("0");
            } else {
                fillTableHoaDonNhapDaTK();
                BoxHelper.alert(this, "Không tìm thấy hóa đơn!");
            }
        }else{
            HoaDonNhap hdn = hdNhapDAO.selectByMonthObNCUNoTongTien(month, year);
            if (hdn != null) {
                fillTableHoaDonNhapByMonthNoTongTien();
                this.row = tblDSHDN.getRowCount();
                lblRecord.setText("0");
            } else {
                fillTableHoaDonNhapChuaTK();
                BoxHelper.alert(this, "Không tìm thấy hóa đơn!");
            }
        }

    }
    public void selectHoaDon() {
        row = tblDSHDN.getSelectedRow();
        String maHD = (String) tblDSHDN.getValueAt(row, 0);
        
        DefaultTableModel model = (DefaultTableModel) HoaDonNhapjIF.tblSanPhamNhap.getModel();
        model.setRowCount(0);
        try {
                List<HoaDonChiTietNhap> list = hdctndao.selectByMaHD(maHD);
            for (HoaDonChiTietNhap sp : list) {
                Object[] row = {
                    sp.getMaHDCTnhap(),
                    sp.getMaHDNnhap(),
                    sp.getMaSPnhap(),
                    sp.getTenSPnhap(),
                    sp.getSoLuong(),
                    sp.getDonViTinh(),
                    sp.getGiaNhap(),
                    sp.thanhTien()
                    
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
            BoxHelper.showError(this, "Lỗi truy vấn dữ liệu!");
        }  
    }
    
    void chuyenHDN() {
        GreenOrganicJFrame.jPanelDeskop.removeAll();
        HoaDonNhapjIF hdn = new HoaDonNhapjIF();
        GreenOrganicJFrame.jPanelDeskop.add(hdn).setVisible(true);
        GreenOrganicJFrame.lblTieuDe.setText(" HÓA ĐƠN NHẬP"); 
        GreenOrganicJFrame.lblTieuDe.setFont(new java.awt.Font("Tahoma", 1, 19));
    }
    void setData() {
        row = tblDSHDN.getSelectedRow();
        String maHD = (String) tblDSHDN.getValueAt(row, 0);
//        String maNCU = (String) tblDSHDN.getValueAt(row, 3);
//        NhaCungUng ncu = ncuDAO.selectByID(maNCU);
        HoaDonNhap hdn  = hdNhapDAO.selectAllByID(maHD);
        HoaDonNhapjIF.txtMaHDnhap.setText(hdn.getMaHDNhap());
        HoaDonNhapjIF.txtMaNV.setText(hdn.getMaNV());
        HoaDonNhapjIF.txtNgayNhap.setText(hdn.getNgayNhap().toString());
        HoaDonNhapjIF.cboTenNCU.setSelectedItem((String) tblDSHDN.getValueAt(row, 3));
        if (tblSanPhamNhap.getRowCount() < 0) {
                txtTongTien.setText("0.0");
            } else {
                double tt = 0;
                for (int i = 0; i < tblSanPhamNhap.getRowCount(); i++) {
                    double thanhtien = (Double) tblSanPhamNhap.getValueAt(i, 7);
                    tt = tt + thanhtien;
                }
                txtTongTien.setText(tt + "");
            }   
        HoaDonNhapjIF.cboTenNCU.setEnabled(false);
    }
    void first() {
        this.row = 0;
        tblDSHDN.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
        lblRecord.setText(this.getRecord());
    }
    void last() {
        this.row = tblDSHDN.getRowCount() - 1;
        tblDSHDN.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
        lblRecord.setText(this.getRecord());
    }
    void next() {
        if (this.row < tblDSHDN.getRowCount() - 1) {
            this.row++;
            tblDSHDN.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
            lblRecord.setText(this.getRecord());
        }else{
            this.row = 0;
            tblDSHDN.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
            lblRecord.setText(this.getRecord());
        }
    }
    void back() {
        if (this.row > 0) {
            this.row--;
            tblDSHDN.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
            lblRecord.setText(this.getRecord());
        }else{
            this.row = tblDSHDN.getRowCount() - 1;
            tblDSHDN.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
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
