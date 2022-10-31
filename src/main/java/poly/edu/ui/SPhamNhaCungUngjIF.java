package poly.edu.ui;

import java.awt.Color;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import poly.edu.dao.NhaCungUngDAO;
import poly.edu.dao.SanPhamNCUDAO;
import poly.edu.entity.NhaCungUng;
import poly.edu.entity.SanPhamNCU;
import poly.edu.helper.AuthorHelper;
import poly.edu.helper.BoxHelper;
import poly.edu.helper.DataValidateHelper;
import poly.edu.helper.DateHelper;

public class SPhamNhaCungUngjIF extends javax.swing.JInternalFrame {   
    int row;
    NhaCungUngDAO ncuDAO = new NhaCungUngDAO();
    SanPhamNCUDAO spncuDAO = new SanPhamNCUDAO();
    
    public SPhamNhaCungUngjIF() {
        initComponents();
        init();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTenSPNCU = new app.bolivia.swing.JCTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtGiaNhap = new app.bolivia.swing.JCTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtHanSuDung = new app.bolivia.swing.JCTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSPNhaCungUng = new rojeru_san.complementos.RSTableMetro();
        btnDELETEspncu = new rojerusan.RSMaterialButtonRectangle();
        btnNEWspncu = new rojerusan.RSMaterialButtonRectangle();
        btnADDspncu = new rojerusan.RSMaterialButtonRectangle();
        btnUPDATEspncu = new rojerusan.RSMaterialButtonRectangle();
        jLabel5 = new javax.swing.JLabel();
        txtFindSPncu = new app.bolivia.swing.JCTextField();
        jSeparator5 = new javax.swing.JSeparator();
        btnFINDspncu = new rojerusan.RSButtonHover();
        btnChuyenNCU = new rojerusan.RSButtonHover();
        btnFirst = new rojerusan.RSButtonHover();
        btnBack = new rojerusan.RSButtonHover();
        btnNext = new rojerusan.RSButtonHover();
        btnLast = new rojerusan.RSButtonHover();
        lblRecord = new javax.swing.JLabel();
        cboTenNCU = new rojerusan.RSComboMetro();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 51));
        jLabel1.setText("Tên nhà cung ứng");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 51));
        jLabel2.setText("Tên sản phẩm cung ứng");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 51));
        jLabel3.setText("Giá nhập");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 51));
        jLabel4.setText("Hạn sử dụng");

        txtTenSPNCU.setBorder(null);
        txtTenSPNCU.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtTenSPNCU.setMargin(new java.awt.Insets(10, 6, -5, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));

        txtGiaNhap.setBorder(null);
        txtGiaNhap.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtGiaNhap.setMargin(new java.awt.Insets(10, 6, -5, 10));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));

        txtHanSuDung.setBorder(null);
        txtHanSuDung.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtHanSuDung.setMargin(new java.awt.Insets(10, 6, -5, 10));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));

        tblSPNhaCungUng.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SPNCU", "Tên NCU", "Tên sản phẩm NCU", "Giá nhập", "Hạn sử dụng"
            }
        ));
        tblSPNhaCungUng.setColorBackgoundHead(new java.awt.Color(0, 102, 51));
        tblSPNhaCungUng.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblSPNhaCungUng.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tblSPNhaCungUng.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tblSPNhaCungUng.setColorSelBackgound(new java.awt.Color(204, 204, 204));
        tblSPNhaCungUng.setColorSelForeground(new java.awt.Color(0, 0, 0));
        tblSPNhaCungUng.setFillsViewportHeight(true);
        tblSPNhaCungUng.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        tblSPNhaCungUng.setFuenteFilas(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        tblSPNhaCungUng.setFuenteFilasSelect(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        tblSPNhaCungUng.setFuenteHead(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        tblSPNhaCungUng.setGridColor(new java.awt.Color(0, 102, 51));
        tblSPNhaCungUng.setGrosorBordeFilas(0);
        tblSPNhaCungUng.setGrosorBordeHead(0);
        tblSPNhaCungUng.setRowHeight(25);
        tblSPNhaCungUng.setShowGrid(false);
        tblSPNhaCungUng.setShowHorizontalLines(true);
        tblSPNhaCungUng.setShowVerticalLines(true);
        tblSPNhaCungUng.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSPNhaCungUngMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSPNhaCungUng);

        btnDELETEspncu.setBackground(new java.awt.Color(0, 102, 51));
        btnDELETEspncu.setBorder(null);
        btnDELETEspncu.setText("Xóa");
        btnDELETEspncu.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnDELETEspncu.setType(null);
        btnDELETEspncu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDELETEspncuActionPerformed(evt);
            }
        });

        btnNEWspncu.setBackground(new java.awt.Color(0, 102, 51));
        btnNEWspncu.setBorder(null);
        btnNEWspncu.setText("Mới");
        btnNEWspncu.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnNEWspncu.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnNEWspncu.setType(null);
        btnNEWspncu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNEWspncuActionPerformed(evt);
            }
        });

        btnADDspncu.setBackground(new java.awt.Color(0, 102, 51));
        btnADDspncu.setBorder(null);
        btnADDspncu.setText("Thêm");
        btnADDspncu.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnADDspncu.setType(null);
        btnADDspncu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADDspncuActionPerformed(evt);
            }
        });

        btnUPDATEspncu.setBackground(new java.awt.Color(0, 102, 51));
        btnUPDATEspncu.setBorder(null);
        btnUPDATEspncu.setText("Cập nhật");
        btnUPDATEspncu.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnUPDATEspncu.setType(null);
        btnUPDATEspncu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUPDATEspncuActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 51));
        jLabel5.setText("Tìm kiếm: ");

        txtFindSPncu.setBorder(null);
        txtFindSPncu.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        txtFindSPncu.setMargin(new java.awt.Insets(10, 6, -5, 10));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        btnFINDspncu.setBackground(new java.awt.Color(255, 255, 255));
        btnFINDspncu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/TimKiem.png"))); // NOI18N
        btnFINDspncu.setColorHover(new java.awt.Color(204, 204, 204));
        btnFINDspncu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFINDspncuActionPerformed(evt);
            }
        });

        btnChuyenNCU.setBackground(new java.awt.Color(0, 102, 51));
        btnChuyenNCU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/ChuyenTabSPUCN1.png"))); // NOI18N
        btnChuyenNCU.setText("Nhà cung ứng  ");
        btnChuyenNCU.setColorHover(new java.awt.Color(0, 155, 76));
        btnChuyenNCU.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnChuyenNCU.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnChuyenNCU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuyenNCUActionPerformed(evt);
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

        lblRecord.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRecord.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRecord.setText("0");

        cboTenNCU.setColorArrow(new java.awt.Color(0, 102, 51));
        cboTenNCU.setColorBorde(new java.awt.Color(0, 102, 51));
        cboTenNCU.setColorFondo(new java.awt.Color(0, 102, 51));
        cboTenNCU.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        cboTenNCU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTenNCUActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/ThucPham1.jpg"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51), 2));

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 51));
        jLabel11.setText("VNĐ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(btnADDspncu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(btnUPDATEspncu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(btnDELETEspncu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(btnNEWspncu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnChuyenNCU, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtHanSuDung, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                                        .addComponent(jSeparator2)
                                        .addComponent(jSeparator3)
                                        .addComponent(txtTenSPNCU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jSeparator4)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cboTenNCU, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(txtGiaNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel11)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1034, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(txtFindSPncu, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(btnFINDspncu, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFindSPncu, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFINDspncu, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cboTenNCU, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenSPNCU, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGiaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHanSuDung, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDELETEspncu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNEWspncu, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnADDspncu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUPDATEspncu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChuyenNCU, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
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

    private void btnChuyenNCUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuyenNCUActionPerformed
        GreenOrganicJFrame.jPanelDeskop.removeAll();
        NhaCungUngjIF ncu = new NhaCungUngjIF();
        GreenOrganicJFrame.jPanelDeskop.add(ncu).setVisible(true);   
        GreenOrganicJFrame.lblTieuDe.setText(" NHÀ CUNG ỨNG"); 
        GreenOrganicJFrame.lblTieuDe.setFont(new java.awt.Font("Tahoma", 1, 19));
    }//GEN-LAST:event_btnChuyenNCUActionPerformed

    private void cboTenNCUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTenNCUActionPerformed
        chonCombo();
    }//GEN-LAST:event_cboTenNCUActionPerformed

    private void btnADDspncuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADDspncuActionPerformed
        insert();
    }//GEN-LAST:event_btnADDspncuActionPerformed

    private void btnUPDATEspncuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUPDATEspncuActionPerformed
        update();
    }//GEN-LAST:event_btnUPDATEspncuActionPerformed

    private void btnDELETEspncuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDELETEspncuActionPerformed
        delete();
    }//GEN-LAST:event_btnDELETEspncuActionPerformed

    private void btnNEWspncuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNEWspncuActionPerformed
        clearForm();
    }//GEN-LAST:event_btnNEWspncuActionPerformed

    private void btnFINDspncuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFINDspncuActionPerformed
        find();
    }//GEN-LAST:event_btnFINDspncuActionPerformed

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

    private void tblSPNhaCungUngMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSPNhaCungUngMouseClicked
        this.row = tblSPNhaCungUng.getSelectedRow();
        lblRecord.setText(getRecord());
        this.edit();
    }//GEN-LAST:event_tblSPNhaCungUngMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle btnADDspncu;
    private rojerusan.RSButtonHover btnBack;
    private rojerusan.RSButtonHover btnChuyenNCU;
    private rojerusan.RSMaterialButtonRectangle btnDELETEspncu;
    private rojerusan.RSButtonHover btnFINDspncu;
    private rojerusan.RSButtonHover btnFirst;
    private rojerusan.RSButtonHover btnLast;
    private rojerusan.RSMaterialButtonRectangle btnNEWspncu;
    private rojerusan.RSButtonHover btnNext;
    private rojerusan.RSMaterialButtonRectangle btnUPDATEspncu;
    private rojerusan.RSComboMetro cboTenNCU;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblRecord;
    private rojeru_san.complementos.RSTableMetro tblSPNhaCungUng;
    private app.bolivia.swing.JCTextField txtFindSPncu;
    private app.bolivia.swing.JCTextField txtGiaNhap;
    private app.bolivia.swing.JCTextField txtHanSuDung;
    private app.bolivia.swing.JCTextField txtTenSPNCU;
    // End of variables declaration//GEN-END:variables
    void fillComboBox(){
        try {
            DefaultComboBoxModel model=(DefaultComboBoxModel)cboTenNCU.getModel();
            model.removeAllElements();
            List<NhaCungUng> ls=new NhaCungUngDAO().selectAll();
            for (NhaCungUng l : ls) {
                model.addElement(l);
            }
        } catch (Exception e) {
        }
    }
    
    void setmauField() {
        txtGiaNhap.setBackground(Color.white);
        txtHanSuDung.setBackground(Color.white);
        txtTenSPNCU.setBackground(Color.white);
    }
    
    void init() {
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ci = (BasicInternalFrameUI) this.getUI();
        ci.setNorthPane(null);
        
        fillComboBox();
        this.row=-1;
        fillTable();
        updateStatus();
    }
    
    void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblSPNhaCungUng.getModel();
        model.setRowCount(0);
        try {
            NhaCungUng ncu = (NhaCungUng) cboTenNCU.getSelectedItem();
            List<SanPhamNCU> ls = new SanPhamNCUDAO().selectByNhaCungUng(ncu.getMaNCU());
            for (int i = 0; i < ls.size(); i++) {
                SanPhamNCU sp = ls.get(i);
                String mancu = sp.getMaNCU();
                NhaCungUng nc = new NhaCungUngDAO().selectByID(mancu);
                String tenncu = nc.getTenNCU();
                model.addRow(new Object[]{sp.getMaSP(), tenncu, sp.getTenSP(), sp.getGia(), sp.getHanSuDung()});
            }
            model.fireTableDataChanged();
            lblRecord.setText(ls.size() + "");
        } catch (Exception e) {
            e.printStackTrace();
            BoxHelper.showError(this, "Lỗi truy vấn dữ liệu!");
        }
    }
    
    void fillTableByName() {
        DefaultTableModel model = (DefaultTableModel) tblSPNhaCungUng.getModel();
        model.setRowCount(0);
        try {
            String key = txtFindSPncu.getText();
            List<SanPhamNCU> ls = new SanPhamNCUDAO().selectByKeyWord(key);
            for (int i = 0; i < ls.size(); i++) {
                SanPhamNCU sp = ls.get(i);
                String mancu = sp.getMaNCU();
                NhaCungUng nc = new NhaCungUngDAO().selectByID(mancu);
                String tenncu = nc.getTenNCU();
                model.addRow(new Object[]{sp.getMaSP(), tenncu, sp.getTenSP(), sp.getGia(), sp.getHanSuDung()});
            }
            model.fireTableDataChanged();
            lblRecord.setText(ls.size() + "");
        } catch (Exception e) {
            e.printStackTrace();
            BoxHelper.showError(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    void chonCombo() {
//        NhaCungUng nc = (NhaCungUng) cboTenNCU.getSelectedItem();
//        String mancu = nc.getMaNCU();
//        SanPhamNCU sp = new SanPhamNCUDAO().TimSP(mancu);
//
//        if (sp != null) {
//            txtTenSPNCU.setText(sp.getTenSP());
//            txtGiaNhap.setText(sp.getGia() + "");
//            txtHanSuDung.setText(sp.getHanSuDung() + "");
//        } else if (sp == null) {
//            txtTenSPNCU.setText("");
//            txtGiaNhap.setText("");
//            txtHanSuDung.setText("");
//        }
        this.row = -1;
        this.updateStatus();
        fillTable();
        setmauField();
    }

    void setmodel(SanPhamNCU sp) {
        txtGiaNhap.setText(sp.getGia() + "");
        txtHanSuDung.setText(sp.getHanSuDung() + "");
        txtTenSPNCU.setText(sp.getTenSP());
    }
    
    SanPhamNCU getmodelInsert() {
        SanPhamNCU spncu = new SanPhamNCU();
        NhaCungUng nc = (NhaCungUng) cboTenNCU.getSelectedItem();
        SanPhamNCU sp = new SanPhamNCUDAO().TimSP(nc.getMaNCU());        
        spncu.setGia(Double.parseDouble(txtGiaNhap.getText()));
        spncu.setHanSuDung(DateHelper.toDate(txtHanSuDung.getText()));
        spncu.setTenSP(txtTenSPNCU.getText());
        spncu.setMaNCU(nc.getMaNCU());

        return spncu;
    }
    
    SanPhamNCU getmodelUpdate() {
        SanPhamNCU spncu = new SanPhamNCU();
        row = tblSPNhaCungUng.getSelectedRow();
        NhaCungUng nc = (NhaCungUng) cboTenNCU.getSelectedItem();     
        spncu.setMaSP((int) tblSPNhaCungUng.getValueAt(row, 0));
        spncu.setGia(Double.parseDouble(txtGiaNhap.getText()));
        spncu.setHanSuDung(DateHelper.toDate(txtHanSuDung.getText()));
        spncu.setTenSP(txtTenSPNCU.getText());
        spncu.setMaNCU(nc.getMaNCU());

        return spncu;
    }
    
    void clearForm() {
        txtGiaNhap.setText("");
        txtHanSuDung.setText("");
        txtTenSPNCU.setText("");
        fillTable();
        row = -1;
        updateStatus();
        setmauField();
        lblRecord.setText("0");
    }
    
    void edit() {
        String tensp = (String) tblSPNhaCungUng.getValueAt(row, 2);
        SanPhamNCU spn = new SanPhamNCUDAO().selectByName(tensp);
        setmodel(spn);
        updateStatus();
    }
    void insert() {
         if (validDate().length() > 0) {
            BoxHelper.showError(this, validDate().toString());
            return;
         }
         else{
             SanPhamNCU spncu = getmodelInsert();
             try {
                spncuDAO.insert(spncu);
                this.fillTable();
                this.clearForm();
                BoxHelper.alert(this, "Thêm mới thành công");
            } catch (Exception e) {
                BoxHelper.alert(this, "Thêm mới thất bại");
            }
         }
     }
    
    void update() {
        if (validDate().length() > 0) {
            BoxHelper.showError(this, validDate().toString());
            return;
        } else {
            if (BoxHelper.confirm(this, "Bạn có muốn lưu thay đổi?")) {
                SanPhamNCU spncu = getmodelUpdate();
                try {
                    spncuDAO.update(spncu);
                    this.fillTable();
                    this.clearForm();
                    BoxHelper.alert(this, "Cập nhật thành công");
                } catch (Exception e) {
                    BoxHelper.alert(this, "Cập nhật thất bại");
                }
            }
        }
    }
    
    void delete() {
        if (!AuthorHelper.isManager()) {
            BoxHelper.alert(this, "Bạn không có quyền xóa sản phẩm nhà cung ứng");
        } else {
            try {
                if (BoxHelper.confirm(this, "Bạn có muốn xóa sản phẩm này?")) {
                }
                row = tblSPNhaCungUng.getSelectedRow();
                String tensp = (String) tblSPNhaCungUng.getValueAt(row, 2);
                SanPhamNCU spn = new SanPhamNCUDAO().selectByName(tensp);
                new SanPhamNCUDAO().delete(spn.getMaSP());
                fillTable();
                BoxHelper.alert(this, "Xóa thành công");
                clearForm();
            } catch (Exception e) {
                e.printStackTrace();
                BoxHelper.alert(this, "Xóa thất bại");

            }
        }
    }
    
    void find() {
        this.clearForm();
        if (txtFindSPncu.getText().equals("")) {
            BoxHelper.alert(this, "Tên sản phẩm không tồn tại");
            fillTable();
            return;
        }
        SanPhamNCU sp = spncuDAO.selectByName(txtFindSPncu.getText());
        if (sp != null) {
            fillTableByName();
//            setmodel(sp);
//            this.row = findCurrentByAll(lh.getMaLoai());
//            tblLoaiHang.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
            this.row = tblSPNhaCungUng.getRowCount();
            lblRecord.setText("0");
            this.updateStatus();
        } else {
            fillTable();
            BoxHelper.alert(this, "Tên sản phẩm không tồn tại");
            this.clearForm();
        }
    }
    
    void first() {
        this.row = 0;
        tblSPNhaCungUng.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
        lblRecord.setText(this.getRecord());
        this.edit();
    }
    void last() {
        this.row = tblSPNhaCungUng.getRowCount() - 1;
        tblSPNhaCungUng.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
        lblRecord.setText(this.getRecord());
        this.edit();
    }
    void next() {
        if (this.row < tblSPNhaCungUng.getRowCount() - 1) {
            this.row++;
            tblSPNhaCungUng.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
            lblRecord.setText(this.getRecord());
            this.edit();
        }else{
            this.row = 0;
            tblSPNhaCungUng.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
            lblRecord.setText(this.getRecord());
            this.edit();
        }
    }
    void back() {
        if (this.row > 0) {
            this.row--;
            tblSPNhaCungUng.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
            lblRecord.setText(this.getRecord());
            this.edit();
        }else{
            this.row = tblSPNhaCungUng.getRowCount() - 1;
            tblSPNhaCungUng.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
            lblRecord.setText(this.getRecord());
            this.edit();
        }
    }
    
    void updateStatus() {
        boolean edit = (this.row >= 0);
        btnADDspncu.setEnabled(!edit);
        btnDELETEspncu.setEnabled(edit);
        btnUPDATEspncu.setEnabled(edit);
    }
    
    public int getCurrentLoaiHangIndex() {
        return this.row;
    }
    public String getRecord() {//hàm tạo bản record
        return (row + 1) + ""; 
    }
    
    StringBuilder validDate() {

        StringBuilder sb = new StringBuilder();
        DataValidateHelper.validateEmpty(txtTenSPNCU, sb, "Tên sản phẩm không để trống");
        DataValidateHelper.validateEmpty(txtGiaNhap, sb, "Giá nhập không để trống");
        DataValidateHelper.validateEmpty(txtHanSuDung, sb, "Hạn sử dụng không để trống");
        DataValidateHelper.checkNumber(txtGiaNhap, sb, "Giá không hợp lệ");
        DataValidateHelper.checkDate(txtHanSuDung, sb, "Hạn sử dụng không hợp lệ");
        
        return  sb;
    }

}
