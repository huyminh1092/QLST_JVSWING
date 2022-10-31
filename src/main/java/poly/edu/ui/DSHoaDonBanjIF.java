package poly.edu.ui;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import poly.edu.dao.HoaDonBanDAO;
import poly.edu.dao.KhachHangDAO;
import poly.edu.dao.NhanVienDAO;
import poly.edu.entity.HoaDonBan;
import poly.edu.entity.KhachHang;
import poly.edu.entity.NhanVien;
import poly.edu.helper.BoxHelper;

public class DSHoaDonBanjIF extends javax.swing.JInternalFrame {

    static int count = 0;
    int index = 0;
    double tt = 0;
    int gg = 0;
    int row = -1;
    int xu = 0;

    public DSHoaDonBanjIF() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ci = (BasicInternalFrameUI) this.getUI();
        ci.setNorthPane(null);

        init();
    }

    void init() {
//    fillTable();

        if (cboChuaTK.isSelected()) {
            fillTable();
        } else if (cboDaTK.isSelected()) {
            fillTableMoney();
        }
    }

    double tinhthanhtien(double x, int y) {
        return x - (x * y / 100);
    }

//   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        cboNam = new rojerusan.RSComboMetro();
        cboThang = new rojerusan.RSComboMetro();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDSHDB = new rojeru_san.complementos.RSTableMetro();
        jLabel5 = new javax.swing.JLabel();
        txtTimKiemTen = new app.bolivia.swing.JCTextField();
        jSeparator5 = new javax.swing.JSeparator();
        btnTimKiemTen = new rojerusan.RSButtonHover();
        btnNext = new rojerusan.RSButtonHover();
        btnBack = new rojerusan.RSButtonHover();
        lblRecord = new javax.swing.JLabel();
        btnLast = new rojerusan.RSButtonHover();
        btnFirst = new rojerusan.RSButtonHover();
        btnChuyenBanHang = new rojerusan.RSButtonHover();
        cboDaTK = new javax.swing.JRadioButton();
        cboChuaTK = new javax.swing.JRadioButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        cboNam.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
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

        tblDSHDB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã HDB", "Tên KH", "Ngày Bán", "Nhân Viên Bán", "Tổng Tiền", "Giảm Giá", "Thành Tiền"
            }
        ));
        tblDSHDB.setColorBackgoundHead(new java.awt.Color(0, 102, 51));
        tblDSHDB.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblDSHDB.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tblDSHDB.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tblDSHDB.setColorSelBackgound(new java.awt.Color(204, 204, 204));
        tblDSHDB.setColorSelForeground(new java.awt.Color(0, 0, 0));
        tblDSHDB.setFillsViewportHeight(true);
        tblDSHDB.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        tblDSHDB.setFuenteFilas(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        tblDSHDB.setFuenteFilasSelect(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        tblDSHDB.setFuenteHead(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        tblDSHDB.setGridColor(new java.awt.Color(0, 102, 51));
        tblDSHDB.setGrosorBordeFilas(0);
        tblDSHDB.setGrosorBordeHead(0);
        tblDSHDB.setRowHeight(25);
        tblDSHDB.setShowGrid(false);
        tblDSHDB.setShowHorizontalLines(true);
        tblDSHDB.setShowVerticalLines(true);
        tblDSHDB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDSHDBMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDSHDB);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 51));
        jLabel5.setText("Tìm kiếm: ");

        txtTimKiemTen.setBorder(null);
        txtTimKiemTen.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtTimKiemTen.setMargin(new java.awt.Insets(10, 6, -5, 10));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        btnTimKiemTen.setBackground(new java.awt.Color(255, 255, 255));
        btnTimKiemTen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/TimKiem.png"))); // NOI18N
        btnTimKiemTen.setColorHover(new java.awt.Color(204, 204, 204));
        btnTimKiemTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemTenActionPerformed(evt);
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

        btnChuyenBanHang.setBackground(new java.awt.Color(0, 102, 51));
        btnChuyenBanHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/ChuyenTabSPUCN1.png"))); // NOI18N
        btnChuyenBanHang.setText("Bán hàng");
        btnChuyenBanHang.setColorHover(new java.awt.Color(0, 155, 76));
        btnChuyenBanHang.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnChuyenBanHang.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnChuyenBanHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuyenBanHangActionPerformed(evt);
            }
        });

        buttonGroup1.add(cboDaTK);
        cboDaTK.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cboDaTK.setForeground(new java.awt.Color(0, 102, 51));
        cboDaTK.setSelected(true);
        cboDaTK.setText("Đã tổng kết");
        cboDaTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDaTKActionPerformed(evt);
            }
        });

        buttonGroup1.add(cboChuaTK);
        cboChuaTK.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cboChuaTK.setForeground(new java.awt.Color(0, 102, 51));
        cboChuaTK.setText("Chưa tổng kết");
        cboChuaTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboChuaTKActionPerformed(evt);
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
                        .addComponent(lblRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(259, 259, 259)
                        .addComponent(cboDaTK)
                        .addGap(42, 42, 42)
                        .addComponent(cboChuaTK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 266, Short.MAX_VALUE)
                        .addComponent(btnChuyenBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtTimKiemTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTimKiemTen, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboThang, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                            .addComponent(txtTimKiemTen, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btnTimKiemTen, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cboThang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNext, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblRecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnChuyenBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboDaTK)
                        .addComponent(cboChuaTK)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnChuyenBanHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuyenBanHangActionPerformed
        count = 0;
        ChuyenBH();
    }//GEN-LAST:event_btnChuyenBanHangActionPerformed

    private void tblDSHDBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDSHDBMouseClicked
        // TODO add your handling code here:
        count = 1;
        ChuyenBH();
        setData();

    }//GEN-LAST:event_tblDSHDBMouseClicked

    private void btnTimKiemTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemTenActionPerformed
        // TODO add your handling code here:
        findHDBName();

    }//GEN-LAST:event_btnTimKiemTenActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:
        First();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here:
        Last();
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        Back();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        Next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void cboDaTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDaTKActionPerformed
        fillTableMoney();
        xu=0;
    }//GEN-LAST:event_cboDaTKActionPerformed

    private void cboChuaTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboChuaTKActionPerformed
        fillTable();
        xu=1;
    }//GEN-LAST:event_cboChuaTKActionPerformed
void fillTableTheoNgayDTK() {
        try{
            DefaultTableModel model = (DefaultTableModel) tblDSHDB.getModel();
        model.setRowCount(0);
        String thang = String.valueOf(cboThang.getSelectedItem());
        String nam = String.valueOf(cboNam.getSelectedItem());
        int month = Integer.parseInt(thang);
        int year = Integer.parseInt(nam);
        List<HoaDonBan> ls = new HoaDonBanDAO().selectTheoNgayDTK(month, year);
                for (int i = 0; i < ls.size(); i++) {
                    HoaDonBan hd = ls.get(i);
                    KhachHang kh = new KhachHangDAO().selectByID(hd.getMaKH());
                    String tenkh = kh.getHoTen();
                    NhanVien nv = new NhanVienDAO().selectByID(hd.getMaNV());
                    String tennv = nv.getHoTen();
                    model.addRow(new Object[]{hd.getMaHDBan(), tenkh, hd.getNgayTao(), tennv, hd.getTongTien(), hd.getGiamgia(),
                        hd.getThanhtienHD()});
                
                model.fireTableDataChanged();}
        }catch(Exception e){
        e.printStackTrace();
        }
    }
    void fillTableTheoNgayCTK() {
        try{
            DefaultTableModel model = (DefaultTableModel) tblDSHDB.getModel();
        model.setRowCount(0);
        String thang = String.valueOf(cboThang.getSelectedItem());
        String nam = String.valueOf(cboNam.getSelectedItem());
        int month = Integer.parseInt(thang);
        int year = Integer.parseInt(nam);
        List<HoaDonBan> ls = new HoaDonBanDAO().selectTheoNgayCTK(month, year);
                for (int i = 0; i < ls.size(); i++) {
                    HoaDonBan hd = ls.get(i);
                    KhachHang kh = new KhachHangDAO().selectByID(hd.getMaKH());
                    String tenkh = kh.getHoTen();
                    NhanVien nv = new NhanVienDAO().selectByID(hd.getMaNV());
                    String tennv = nv.getHoTen();
                    model.addRow(new Object[]{hd.getMaHDBan(), tenkh, hd.getNgayTao(), tennv, hd.getTongTien(), hd.getGiamgia(),
                        hd.getThanhtienHD()});
                
                model.fireTableDataChanged();}
        }catch(Exception e){
        e.printStackTrace();
        }
    }
    private void cboNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNamActionPerformed
        try{
        if(xu==0){// Đã tổng kết
        fillTableTheoNgayDTK();
            
        }else if(xu==1){ // Chưa tổng kết
        fillTableTheoNgayCTK();
        }
        }catch(Exception e){
        e.printStackTrace();
        }
    }//GEN-LAST:event_cboNamActionPerformed

    private void cboThangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboThangActionPerformed
        //        chonLoaiHang();
    }//GEN-LAST:event_cboThangActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonHover btnBack;
    private rojerusan.RSButtonHover btnChuyenBanHang;
    private rojerusan.RSButtonHover btnFirst;
    private rojerusan.RSButtonHover btnLast;
    private rojerusan.RSButtonHover btnNext;
    private rojerusan.RSButtonHover btnTimKiemTen;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton cboChuaTK;
    private javax.swing.JRadioButton cboDaTK;
    private rojerusan.RSComboMetro cboNam;
    private rojerusan.RSComboMetro cboThang;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblRecord;
    public static rojeru_san.complementos.RSTableMetro tblDSHDB;
    private app.bolivia.swing.JCTextField txtTimKiemTen;
    // End of variables declaration//GEN-END:variables
    int traso() {
        return index + 1;
    }

    void fillTable() {
        try {
            DefaultTableModel model = (DefaultTableModel) tblDSHDB.getModel();
            model.setRowCount(0);
            List<HoaDonBan> ls = new HoaDonBanDAO().selectChuaTT();
            for (int i = 0; i < ls.size(); i++) {
                HoaDonBan hd = ls.get(i);
                KhachHang kh = new KhachHangDAO().selectByID(hd.getMaKH());
                String tenkh = kh.getHoTen();
                NhanVien nv = new NhanVienDAO().selectByID(hd.getMaNV());
                String tennv = nv.getHoTen();
                model.addRow(new Object[]{hd.getMaHDBan(), tenkh, hd.getNgayTao(), tennv, tt, gg, hd.getThanhtienHD()});
            }
            model.fireTableDataChanged();
            lblRecord.setText(ls.size() + "");
            index = 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void fillTableMoney() {
        DefaultTableModel model = (DefaultTableModel) tblDSHDB.getModel();
        model.setRowCount(0);
        List<HoaDonBan> ls = new HoaDonBanDAO().selectList();
        for (int i = 0; i < ls.size(); i++) {
            HoaDonBan hd = ls.get(i);
            KhachHang kh = new KhachHangDAO().selectByID(hd.getMaKH());
            String tenkh = kh.getHoTen();
            NhanVien nv = new NhanVienDAO().selectByID(hd.getMaNV());
            String tennv = nv.getHoTen();
            model.addRow(new Object[]{hd.getMaHDBan(), tenkh, hd.getNgayTao(), tennv, hd.getTongTien(), hd.getGiamgia(),
                hd.getThanhtienHD()});
        }
        model.fireTableDataChanged();

    }

    void setData() {
        row = tblDSHDB.getSelectedRow();
        String maHD = (String) tblDSHDB.getValueAt(row, 0);
        String tenKH = (String) tblDSHDB.getValueAt(row, 1);
        double thanhtien =(Double) tblDSHDB.getValueAt(row,6 );
        double tongTien =(Double) tblDSHDB.getValueAt(row,4);
        HoaDonBan hd = new HoaDonBanDAO().selectByID(maHD);
        KhachHang kh = new KhachHangDAO().selectByNameAndMaHD(tenKH, maHD);
        HoaDonBanjIF.txtMaKH.setText(kh.getMaKH());
        HoaDonBanjIF.txtTenKH.setText(tenKH);
        HoaDonBanjIF.txtDiemTich.setText(kh.getMaGiamGia() + "");
        HoaDonBanjIF.txtMaHDB.setText(maHD);
        HoaDonBanjIF.txtMaNV.setText(hd.getMaNV());
        HoaDonBanjIF.txtNgayTao.setText(hd.getNgayTao().toString());
        HoaDonBanjIF.txtTongTien.setText(tongTien + "");
        HoaDonBanjIF.txtGiamGia.setText(hd.getGiamgia() + "");
        HoaDonBanjIF.txtThanhTien.setText(thanhtien + "");
//        
    }

    void ChuyenBH() {
        GreenOrganicJFrame.jPanelDeskop.removeAll();
        HoaDonBanjIF hdb = new HoaDonBanjIF();
        GreenOrganicJFrame.jPanelDeskop.add(hdb).setVisible(true);
        GreenOrganicJFrame.lblTieuDe.setText(" HÓA ĐƠN BÁN");
        GreenOrganicJFrame.lblTieuDe.setFont(new java.awt.Font("Tahoma", 1, 19));
    }

    void fillTableHDBName() {
        DefaultTableModel model = (DefaultTableModel) tblDSHDB.getModel();
        model.setRowCount(0);
        String tk = txtTimKiemTen.getText();
        KhachHang kh = new KhachHangDAO().selectByName(tk);
        List<HoaDonBan> ls = new HoaDonBanDAO().selectByKeyWord(kh.getMaKH());
        for (int i = 0; i < ls.size(); i++) {
            HoaDonBan hd = ls.get(i);
            KhachHang kho = new KhachHangDAO().selectByID(hd.getMaKH());
            String tenkh = kho.getHoTen();
            NhanVien nv = new NhanVienDAO().selectByID(hd.getMaNV());
            String tennv = nv.getHoTen();
            model.addRow(new Object[]{hd.getMaHDBan(), tenkh, hd.getNgayTao(), tennv, hd.getTongTien(),
                hd.getGiamgia(), hd.getThanhtienHD()});
        }
        model.fireTableDataChanged();
        lblRecord.setText(ls.size() + "");
        index = 1;
    }
    void fillTableHDBName1() {
        DefaultTableModel model = (DefaultTableModel) tblDSHDB.getModel();
        model.setRowCount(0);
        String tk = txtTimKiemTen.getText();
        KhachHang kh = new KhachHangDAO().selectByName(tk);
        List<HoaDonBan> ls = new HoaDonBanDAO().selectByKeyWord1(kh.getMaKH());
        for (int i = 0; i < ls.size(); i++) {
            HoaDonBan hd = ls.get(i);
            KhachHang kho = new KhachHangDAO().selectByID(hd.getMaKH());
            String tenkh = kho.getHoTen();
            NhanVien nv = new NhanVienDAO().selectByID(hd.getMaNV());
            String tennv = nv.getHoTen();
            model.addRow(new Object[]{hd.getMaHDBan(), tenkh, hd.getNgayTao(), tennv, hd.getTongTien(), hd.getGiamgia(), hd.getThanhtienHD()});
        }
        model.fireTableDataChanged();
        lblRecord.setText(ls.size() + "");
        index = 1;
    }


    void findHDBName() {
        try {
            if (txtTimKiemTen.getText().equals("")) {
                if (xu == 1) {
                    fillTable();
                } else if (xu == 0) {
                    fillTableMoney();
                }
            } else {

                if (xu == 0) {
                    KhachHang kh = new KhachHangDAO().selectByName(txtTimKiemTen.getText());
                    if (kh != null) {
                        HoaDonBan hdb = new HoaDonBanDAO().selectByName(kh.getMaKH());
                        if (hdb != null) {
                            fillTableHDBName();
                        } else {
                            BoxHelper.alert(this, "Hóa đơn bán không tồn tại");
                        }
                    }else{
                        BoxHelper.alert(this, "Khách hàng không tồn tại");
                    }
                    
                } else if (xu == 1) {
                    KhachHang kh = new KhachHangDAO().selectByName(txtTimKiemTen.getText());
                    if (kh != null) {
                        HoaDonBan hdb1 = new HoaDonBanDAO().selectByName(kh.getMaKH());
                        if (hdb1 != null) {
                            fillTableHDBName1();
                        } else {
                            BoxHelper.alert(this, "Hóa đơn bán không tồn tại");
                        }
                    }else{
                        BoxHelper.alert(this, "Khách hàng không tồn tại");
                    }
                    
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    void Next() {
        try {
            if (index == tblDSHDB.getRowCount() - 1) {
                index = 0;
            } else {
                index++;
            }
            tblDSHDB.setRowSelectionInterval(index, index);
            lblRecord.setText(traso() + "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void Back() {
        try {
            if (index == 0) {
                index = tblDSHDB.getRowCount() - 1;
            } else {
                index--;
            }
            tblDSHDB.setRowSelectionInterval(index, index);
            lblRecord.setText(traso() + "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void Last() {
        try {
            index = tblDSHDB.getRowCount() - 1;
            tblDSHDB.setRowSelectionInterval(index, index);
            lblRecord.setText(traso() + "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void First() {
        try {
            index = 0;
            tblDSHDB.setRowSelectionInterval(index, index);
            lblRecord.setText(traso() + "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
