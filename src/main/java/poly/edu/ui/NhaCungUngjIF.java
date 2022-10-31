package poly.edu.ui;

import java.awt.Color;
import java.util.List;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import poly.edu.dao.NhaCungUngDAO;
import poly.edu.entity.NhaCungUng;
import poly.edu.helper.AuthorHelper;
import poly.edu.helper.BoxHelper;
import poly.edu.helper.DataValidateHelper;

public class NhaCungUngjIF extends javax.swing.JInternalFrame {
    int row;
    int count = 0;
    List<NhaCungUng> uio = new NhaCungUngDAO().selectAll();
    NhaCungUngDAO dao = new NhaCungUngDAO();
    
    public NhaCungUngjIF() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMaNCU = new app.bolivia.swing.JCTextField();
        txtTenNCU = new app.bolivia.swing.JCTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtSTKncu = new app.bolivia.swing.JCTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtMSTncu = new app.bolivia.swing.JCTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhaCungUng = new rojeru_san.complementos.RSTableMetro();
        btnDELETEncu = new rojerusan.RSMaterialButtonRectangle();
        btnNEWncu = new rojerusan.RSMaterialButtonRectangle();
        btnADDncu = new rojerusan.RSMaterialButtonRectangle();
        btnUPDATEncu = new rojerusan.RSMaterialButtonRectangle();
        jLabel8 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtSDTncu = new app.bolivia.swing.JCTextField();
        txtEmailncu = new app.bolivia.swing.JCTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaDiaChincu = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        txtFINDncu = new app.bolivia.swing.JCTextField();
        jSeparator5 = new javax.swing.JSeparator();
        btnFINDncu = new rojerusan.RSButtonHover();
        btnChuyenSPNCU = new rojerusan.RSButtonHover();
        btnFirst = new rojerusan.RSButtonHover();
        btnBack = new rojerusan.RSButtonHover();
        btnNext = new rojerusan.RSButtonHover();
        btnLast = new rojerusan.RSButtonHover();
        lblRecord = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 51));
        jLabel1.setText("Mã nhà cung ứng");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 51));
        jLabel2.setText("Tên nhà cung ứng");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 51));
        jLabel3.setText("Số tài khoản");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 51));
        jLabel4.setText("Mã số thuế");

        txtMaNCU.setBorder(null);
        txtMaNCU.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtMaNCU.setMargin(new java.awt.Insets(10, 6, -5, 10));

        txtTenNCU.setBorder(null);
        txtTenNCU.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtTenNCU.setMargin(new java.awt.Insets(10, 6, -5, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));

        txtSTKncu.setBorder(null);
        txtSTKncu.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtSTKncu.setMargin(new java.awt.Insets(10, 6, -5, 10));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));

        txtMSTncu.setBorder(null);
        txtMSTncu.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtMSTncu.setMargin(new java.awt.Insets(10, 6, -5, 10));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));

        tblNhaCungUng.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"NCU01", "Thành Phát", "0919879374", "Thanhphat@gmail.com", "0987675432183", "00754", "Quận 1, TP HCM"}
            },
            new String [] {
                "Mã NCU", "Tên NCU", "SĐT", "Email", "Số tài khoản", "Mã số thuế", "Địa chỉ"
            }
        ));
        tblNhaCungUng.setColorBackgoundHead(new java.awt.Color(0, 102, 51));
        tblNhaCungUng.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblNhaCungUng.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tblNhaCungUng.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tblNhaCungUng.setColorSelBackgound(new java.awt.Color(204, 204, 204));
        tblNhaCungUng.setColorSelForeground(new java.awt.Color(0, 0, 0));
        tblNhaCungUng.setFillsViewportHeight(true);
        tblNhaCungUng.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        tblNhaCungUng.setFuenteFilas(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        tblNhaCungUng.setFuenteFilasSelect(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        tblNhaCungUng.setFuenteHead(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        tblNhaCungUng.setGridColor(new java.awt.Color(0, 102, 51));
        tblNhaCungUng.setGrosorBordeFilas(0);
        tblNhaCungUng.setGrosorBordeHead(0);
        tblNhaCungUng.setRowHeight(25);
        tblNhaCungUng.setShowGrid(false);
        tblNhaCungUng.setShowHorizontalLines(true);
        tblNhaCungUng.setShowVerticalLines(true);
        tblNhaCungUng.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhaCungUngMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNhaCungUng);

        btnDELETEncu.setBackground(new java.awt.Color(0, 102, 51));
        btnDELETEncu.setBorder(null);
        btnDELETEncu.setText("Xóa");
        btnDELETEncu.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnDELETEncu.setType(null);
        btnDELETEncu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDELETEncuActionPerformed(evt);
            }
        });

        btnNEWncu.setBackground(new java.awt.Color(0, 102, 51));
        btnNEWncu.setBorder(null);
        btnNEWncu.setText("Mới");
        btnNEWncu.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnNEWncu.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnNEWncu.setType(null);
        btnNEWncu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNEWncuActionPerformed(evt);
            }
        });

        btnADDncu.setBackground(new java.awt.Color(0, 102, 51));
        btnADDncu.setBorder(null);
        btnADDncu.setText("Thêm");
        btnADDncu.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnADDncu.setType(null);
        btnADDncu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADDncuActionPerformed(evt);
            }
        });

        btnUPDATEncu.setBackground(new java.awt.Color(0, 102, 51));
        btnUPDATEncu.setBorder(null);
        btnUPDATEncu.setText("Cập nhật");
        btnUPDATEncu.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnUPDATEncu.setType(null);
        btnUPDATEncu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUPDATEncuActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 51));
        jLabel8.setText("Số điện thoại");

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 51));
        jLabel9.setText("Email");

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 51));
        jLabel10.setText("Địa chỉ");

        txtSDTncu.setBorder(null);
        txtSDTncu.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtSDTncu.setMargin(new java.awt.Insets(10, 6, -5, 10));

        txtEmailncu.setBorder(null);
        txtEmailncu.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtEmailncu.setMargin(new java.awt.Insets(10, 6, -5, 10));

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));

        txaDiaChincu.setColumns(20);
        txaDiaChincu.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txaDiaChincu.setRows(4);
        jScrollPane2.setViewportView(txaDiaChincu);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 51));
        jLabel5.setText("Tìm kiếm: ");

        txtFINDncu.setBorder(null);
        txtFINDncu.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        txtFINDncu.setMargin(new java.awt.Insets(10, 6, -5, 10));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        btnFINDncu.setBackground(new java.awt.Color(255, 255, 255));
        btnFINDncu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/TimKiem.png"))); // NOI18N
        btnFINDncu.setColorHover(new java.awt.Color(204, 204, 204));
        btnFINDncu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFINDncuActionPerformed(evt);
            }
        });

        btnChuyenSPNCU.setBackground(new java.awt.Color(0, 102, 51));
        btnChuyenSPNCU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/ChuyenTabSPUCN.png"))); // NOI18N
        btnChuyenSPNCU.setText("Sản phẩm NCU   ");
        btnChuyenSPNCU.setColorHover(new java.awt.Color(0, 155, 76));
        btnChuyenSPNCU.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnChuyenSPNCU.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnChuyenSPNCU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuyenSPNCUActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(btnADDncu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(btnUPDATEncu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(btnDELETEncu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(btnNEWncu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnChuyenSPNCU, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtMSTncu, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                                        .addComponent(jSeparator2)
                                        .addComponent(jSeparator1)
                                        .addComponent(jSeparator3)
                                        .addComponent(txtMaNCU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtTenNCU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtSTKncu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jSeparator4))
                                    .addGap(144, 144, 144)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator8)
                                        .addComponent(jSeparator7)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                                        .addComponent(txtEmailncu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtSDTncu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1034, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(txtFINDncu, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(btnFINDncu, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFINDncu, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFINDncu, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaNCU, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenNCU, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSTKncu, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMSTncu, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSDTncu, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmailncu, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDELETEncu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNEWncu, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnADDncu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUPDATEncu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChuyenSPNCU, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
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

    private void btnChuyenSPNCUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuyenSPNCUActionPerformed
        GreenOrganicJFrame.jPanelDeskop.removeAll();
        SPhamNhaCungUngjIF spNCU = new SPhamNhaCungUngjIF();
        GreenOrganicJFrame.jPanelDeskop.add(spNCU).setVisible(true);
        GreenOrganicJFrame.lblTieuDe.setText(" SẢN PHẨM NHÀ CUNG ỨNG"); 
        GreenOrganicJFrame.lblTieuDe.setFont(new java.awt.Font("Tahoma", 1, 19));
    }//GEN-LAST:event_btnChuyenSPNCUActionPerformed

    private void tblNhaCungUngMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhaCungUngMouseClicked
        this.row = tblNhaCungUng.getSelectedRow();
        lblRecord.setText(getRecord());
        this.edit();
    }//GEN-LAST:event_tblNhaCungUngMouseClicked

    private void btnADDncuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADDncuActionPerformed
        insert();
    }//GEN-LAST:event_btnADDncuActionPerformed

    private void btnUPDATEncuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUPDATEncuActionPerformed
        update();
    }//GEN-LAST:event_btnUPDATEncuActionPerformed

    private void btnDELETEncuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDELETEncuActionPerformed
        delete();
    }//GEN-LAST:event_btnDELETEncuActionPerformed

    private void btnNEWncuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNEWncuActionPerformed
        clearform();
    }//GEN-LAST:event_btnNEWncuActionPerformed

    private void btnFINDncuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFINDncuActionPerformed
        find();
    }//GEN-LAST:event_btnFINDncuActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle btnADDncu;
    private rojerusan.RSButtonHover btnBack;
    private rojerusan.RSButtonHover btnChuyenSPNCU;
    private rojerusan.RSMaterialButtonRectangle btnDELETEncu;
    private rojerusan.RSButtonHover btnFINDncu;
    private rojerusan.RSButtonHover btnFirst;
    private rojerusan.RSButtonHover btnLast;
    private rojerusan.RSMaterialButtonRectangle btnNEWncu;
    private rojerusan.RSButtonHover btnNext;
    private rojerusan.RSMaterialButtonRectangle btnUPDATEncu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lblRecord;
    private rojeru_san.complementos.RSTableMetro tblNhaCungUng;
    private javax.swing.JTextArea txaDiaChincu;
    private app.bolivia.swing.JCTextField txtEmailncu;
    private app.bolivia.swing.JCTextField txtFINDncu;
    private app.bolivia.swing.JCTextField txtMSTncu;
    private app.bolivia.swing.JCTextField txtMaNCU;
    private app.bolivia.swing.JCTextField txtSDTncu;
    private app.bolivia.swing.JCTextField txtSTKncu;
    private app.bolivia.swing.JCTextField txtTenNCU;
    // End of variables declaration//GEN-END:variables
    void init() {
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        
        lblRecord.setText(uio.size() + "");
        fillTable();
        this.row = -1;
        updateStatus();
    }
    
    void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblNhaCungUng.getModel();
        model.setRowCount(0);
        List<NhaCungUng> ls =dao.selectAll();
        for (NhaCungUng l : ls) {
            model.addRow(new Object[]{l.getMaNCU(), l.getTenNCU(), l.getsDT(), l.getEmail(), l.getsTK(), l.getMaSoThue(), l.getDiaChi()});
        }
        model.fireTableDataChanged();
    }
    
    void fillTableByName() {
        DefaultTableModel model = (DefaultTableModel) tblNhaCungUng.getModel();
        model.setRowCount(0);
        String key = txtFINDncu.getText();
        List<NhaCungUng> ls = new NhaCungUngDAO().selectByKeyWord(key);
        for (NhaCungUng l : ls) {
            model.addRow(new Object[]{l.getMaNCU(), l.getTenNCU(), l.getsDT(), l.getEmail(), l.getsTK(), l.getMaSoThue(), l.getDiaChi()});
        }
        model.fireTableDataChanged();
    }
    void setmodel(NhaCungUng nc) {
        txtEmailncu.setText(nc.getEmail());
        txtMSTncu.setText(nc.getMaSoThue());
        txtMaNCU.setText(nc.getMaNCU());
        txtSDTncu.setText(nc.getsDT());
        txtSTKncu.setText(nc.getsTK());
        txtTenNCU.setText(nc.getTenNCU());
        txaDiaChincu.setText(nc.getDiaChi());
    }
    
    NhaCungUng getmodel() {
        NhaCungUng nc = new NhaCungUng();
        nc.setDiaChi(txaDiaChincu.getText());
        nc.setEmail(txtEmailncu.getText());
        nc.setMaNCU(txtMaNCU.getText());
        nc.setMaSoThue(txtMSTncu.getText());
        nc.setTenNCU(txtTenNCU.getText());
        nc.setsDT(txtSDTncu.getText());
        nc.setsTK(txtSTKncu.getText());
        return nc;
    }
    
    
     void clearform() {
        txtEmailncu.setText("");
        txtMSTncu.setText("");
        txtMaNCU.setText("");
        txtSDTncu.setText("");
        txtSTKncu.setText("");
        txtTenNCU.setText("");
        txaDiaChincu.setText("");
//        txtFINDncu.setText("");
        lblRecord.setText("0");
        row = -1;
        txtEmailncu.setBackground(Color.white);
        txtMSTncu.setBackground(Color.white);
        txtMaNCU.setBackground(Color.white);
        txtSDTncu.setBackground(Color.white);
        txtSTKncu.setBackground(Color.white);
        txtTenNCU.setBackground(Color.white);
        txaDiaChincu.setBackground(Color.white);
        tblNhaCungUng.clearSelection();
        fillTable();
        updateStatus();
    }
    
    void edit() {
        String mancu = (String) tblNhaCungUng.getValueAt(row, 0);
        NhaCungUng nc = new NhaCungUngDAO().selectByID(mancu);
        setmodel(nc);
        updateStatus();
    }
    
    void insert() {
        if (validDate().length() > 0) {
            BoxHelper.showError(this, validDate().toString());
            return;
        }else{
             NhaCungUng ncu = getmodel();
             try {
                dao.insert(ncu);
                this.fillTable();
                this.clearform();
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
                NhaCungUng ncu = getmodel();
                try {
                    dao.update(ncu);
                    this.fillTable();
                    this.clearform();
                    BoxHelper.alert(this, "Cập nhật thành công");
                } catch (Exception e) {
                    e.printStackTrace();
                    BoxHelper.alert(this, "Cập nhật thất bại");
                }
            }
        }
    }
    
    void delete() {
        String maNCU = txtMaNCU.getText();
        if (!AuthorHelper.isManager()) {
            BoxHelper.alert(this, "Bạn không có quyền xóa nhà cung ứng");
        }else{
            if (BoxHelper.confirm(this, "Bạn thực sự muốn xóa nhà cung ứng này")) {
                try {
                    dao.delete(maNCU);
                    this.fillTable();
                    this.clearform();
                    BoxHelper.alert(this, "Xóa thành công");
                } catch (Exception e) {
                    BoxHelper.alert(this, "Xóa thất bại");
                }
            } 
        }
    }
    
    void find() {
        this.clearform();
        if (txtFINDncu.getText().equals("")) {
            BoxHelper.alert(this, "Tên nhà cung ứng không tồn tại");
            fillTable();
            return;
        }
        NhaCungUng ncu = dao.selectByName(txtFINDncu.getText());
        if (ncu != null) {
            fillTableByName();
//            setmodel(ncu);
//            this.row = findCurrentByAll(lh.getMaLoai());
//            tblLoaiHang.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
            this.row = tblNhaCungUng.getRowCount();
            lblRecord.setText("0");
            this.updateStatus();
        } else {
            fillTable();
            BoxHelper.alert(this, "Tên nhà cung ứng không tồn tại");
            this.clearform();
        }
    }
    
    void first() {
        this.row = 0;
        tblNhaCungUng.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
        lblRecord.setText(this.getRecord());
        this.edit();
    }
    void last() {
        this.row = tblNhaCungUng.getRowCount() - 1;
        tblNhaCungUng.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
        lblRecord.setText(this.getRecord());
        this.edit();
    }
    void next() {
        if (this.row < tblNhaCungUng.getRowCount() - 1) {
            this.row++;
            tblNhaCungUng.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
            lblRecord.setText(this.getRecord());
            this.edit();
        }else{
            this.row = 0;
            tblNhaCungUng.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
            lblRecord.setText(this.getRecord());
            this.edit();
        }
    }
    void back() {
        if (this.row > 0) {
            this.row--;
            tblNhaCungUng.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
            lblRecord.setText(this.getRecord());
            this.edit();
        }else{
            this.row = tblNhaCungUng.getRowCount() - 1;
            tblNhaCungUng.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
            lblRecord.setText(this.getRecord());
            this.edit();
        }
    }
    
    public int getCurrentLoaiHangIndex() {
        return this.row;
    }
    public String getRecord() {//hàm tạo bản record
        return (row + 1) + ""; 
    }
    
    void updateStatus() {
        boolean edit = (this.row >= 0);
        txtMaNCU.setEditable(!edit);
        btnADDncu.setEnabled(!edit);
        btnDELETEncu.setEnabled(edit);
        btnUPDATEncu.setEnabled(edit);
    }
    
    StringBuilder validDate() {
        StringBuilder sb = new StringBuilder();
        DataValidateHelper.validateEmpty(txtMaNCU, sb, "Mã nhà cung ứng không được để trống!");
        DataValidateHelper.validateEmpty(txtEmailncu, sb, "Emai không được để trống!");
        DataValidateHelper.checkEmail(txtEmailncu, sb, "Email không hợp lệ");
        DataValidateHelper.validateEmpty(txtSDTncu, sb, "Số điện thoại không được để trống!");
        DataValidateHelper.checkPhone(txtSDTncu, sb, "SDT không hợp lệ");
        DataValidateHelper.validateEmpty(txtMSTncu, sb, "Mã số thuế không được để trống!");
        DataValidateHelper.checkMaSoThueSTK(txtMSTncu, sb, "Mã số thuế không hợp lệ!");
        DataValidateHelper.validateEmpty(txtSTKncu, sb, "STK không được để trống!");
        DataValidateHelper.checkMaSoThueSTK(txtSTKncu, sb, "Số tài khoản không hợp lệ!");
        DataValidateHelper.validateEmpty(txtTenNCU, sb, "Tên nhà cung ứng không được để trống!");
        DataValidateHelper.validateEmptyAddress(txaDiaChincu, sb, "Địa chỉ không được để trống!");

        return sb;
    }
    

}
