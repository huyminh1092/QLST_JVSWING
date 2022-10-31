package poly.edu.ui;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import poly.edu.dao.KhachHangDAO;
import poly.edu.entity.KhachHang;
import poly.edu.helper.AuthorHelper;
import poly.edu.helper.BoxHelper;
import poly.edu.helper.DataValidateHelper;
import poly.edu.helper.DateHelper;
import poly.edu.helper.ImageHelper;

public class KhachHangjIF extends javax.swing.JInternalFrame {
    KhachHangDAO dao = new KhachHangDAO();
    int row = -1;
    List<KhachHang> lskh=new KhachHangDAO().selectAll();
    public KhachHangjIF() {
        initComponents();
        init();
        lblRecord.setText(lskh.size()+"");
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
        txtMaKH = new app.bolivia.swing.JCTextField();
        txtTenKH = new app.bolivia.swing.JCTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtSDT = new app.bolivia.swing.JCTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtNgaySinh = new app.bolivia.swing.JCTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKhachHang = new rojeru_san.complementos.RSTableMetro();
        btnDELETEkh = new rojerusan.RSMaterialButtonRectangle();
        btnNEWkh = new rojerusan.RSMaterialButtonRectangle();
        btnADDkh = new rojerusan.RSMaterialButtonRectangle();
        btnUPDATEkh = new rojerusan.RSMaterialButtonRectangle();
        jLabel5 = new javax.swing.JLabel();
        txtFINDkh = new app.bolivia.swing.JCTextField();
        jSeparator5 = new javax.swing.JSeparator();
        btnFINDkh = new rojerusan.RSButtonHover();
        btnFirst = new rojerusan.RSButtonHover();
        btnBack = new rojerusan.RSButtonHover();
        btnNext = new rojerusan.RSButtonHover();
        btnLast = new rojerusan.RSButtonHover();
        lblRecord = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtMaNV = new app.bolivia.swing.JCTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        txtMaKM = new app.bolivia.swing.JCTextField();
        jSeparator11 = new javax.swing.JSeparator();
        cboGioiTinh = new rojerusan.RSComboMetro();
        jLabel8 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        txtNgayDangKi = new app.bolivia.swing.JCTextField();
        lblHinh = new javax.swing.JLabel();
        btnChonHinh = new rojerusan.RSButtonHover();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 51));
        jLabel1.setText("Mã khách hàng");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 51));
        jLabel2.setText("Tên khách hàng");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 51));
        jLabel3.setText("Số điện thoại");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 51));
        jLabel4.setText("Ngày sinh");

        txtMaKH.setBorder(null);
        txtMaKH.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtMaKH.setMargin(new java.awt.Insets(10, 6, -5, 10));

        txtTenKH.setBorder(null);
        txtTenKH.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtTenKH.setMargin(new java.awt.Insets(10, 6, -5, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));

        txtSDT.setBorder(null);
        txtSDT.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtSDT.setMargin(new java.awt.Insets(10, 6, -5, 10));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));

        txtNgaySinh.setBorder(null);
        txtNgaySinh.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtNgaySinh.setMargin(new java.awt.Insets(10, 6, -5, 10));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));

        tblKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"NCU01", "Thành Phát", "0919879374", "Thanhphat@gmail.com", "0987675432183", "00754", "Quận 1, TP HCM", null, null}
            },
            new String [] {
                "Mã KH", "Tên KH", "Ngày sinh", "Giới tính", "SĐT", "Ngày DK", "Mã NV tạo", "Mã khuyến mãi", "Hinh"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKhachHang.setColorBackgoundHead(new java.awt.Color(0, 102, 51));
        tblKhachHang.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblKhachHang.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tblKhachHang.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tblKhachHang.setColorSelBackgound(new java.awt.Color(204, 204, 204));
        tblKhachHang.setColorSelForeground(new java.awt.Color(0, 0, 0));
        tblKhachHang.setFillsViewportHeight(true);
        tblKhachHang.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        tblKhachHang.setFuenteFilas(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        tblKhachHang.setFuenteFilasSelect(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        tblKhachHang.setFuenteHead(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        tblKhachHang.setGridColor(new java.awt.Color(0, 102, 51));
        tblKhachHang.setGrosorBordeFilas(0);
        tblKhachHang.setGrosorBordeHead(0);
        tblKhachHang.setRowHeight(25);
        tblKhachHang.setShowGrid(false);
        tblKhachHang.setShowHorizontalLines(true);
        tblKhachHang.setShowVerticalLines(true);
        tblKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhachHangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKhachHang);

        btnDELETEkh.setBackground(new java.awt.Color(0, 102, 51));
        btnDELETEkh.setBorder(null);
        btnDELETEkh.setText("Xóa");
        btnDELETEkh.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnDELETEkh.setType(null);
        btnDELETEkh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDELETEkhActionPerformed(evt);
            }
        });

        btnNEWkh.setBackground(new java.awt.Color(0, 102, 51));
        btnNEWkh.setBorder(null);
        btnNEWkh.setText("Mới");
        btnNEWkh.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnNEWkh.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnNEWkh.setType(null);
        btnNEWkh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNEWkhActionPerformed(evt);
            }
        });

        btnADDkh.setBackground(new java.awt.Color(0, 102, 51));
        btnADDkh.setBorder(null);
        btnADDkh.setText("Thêm");
        btnADDkh.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnADDkh.setType(null);
        btnADDkh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADDkhActionPerformed(evt);
            }
        });

        btnUPDATEkh.setBackground(new java.awt.Color(0, 102, 51));
        btnUPDATEkh.setBorder(null);
        btnUPDATEkh.setText("Cập nhật");
        btnUPDATEkh.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnUPDATEkh.setType(null);
        btnUPDATEkh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUPDATEkhActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 51));
        jLabel5.setText("Tìm kiếm: ");

        txtFINDkh.setBorder(null);
        txtFINDkh.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        txtFINDkh.setMargin(new java.awt.Insets(10, 6, -5, 10));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        btnFINDkh.setBackground(new java.awt.Color(255, 255, 255));
        btnFINDkh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/TimKiem.png"))); // NOI18N
        btnFINDkh.setColorHover(new java.awt.Color(204, 204, 204));
        btnFINDkh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFINDkhActionPerformed(evt);
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

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 51));
        jLabel7.setText("Giới tính");

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 51));
        jLabel12.setText("Mã nhân viên tạo");

        txtMaNV.setBorder(null);
        txtMaNV.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtMaNV.setMargin(new java.awt.Insets(10, 6, -5, 10));

        jSeparator10.setBackground(new java.awt.Color(0, 0, 0));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 51));
        jLabel13.setText("Mã khuyến mãi");

        txtMaKM.setBorder(null);
        txtMaKM.setText("0");
        txtMaKM.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtMaKM.setMargin(new java.awt.Insets(10, 6, -5, 10));

        jSeparator11.setBackground(new java.awt.Color(0, 0, 0));

        cboGioiTinh.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nam", "Nữ" }));
        cboGioiTinh.setColorArrow(new java.awt.Color(0, 102, 51));
        cboGioiTinh.setColorBorde(new java.awt.Color(0, 102, 51));
        cboGioiTinh.setColorFondo(new java.awt.Color(0, 102, 51));
        cboGioiTinh.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 51));
        jLabel8.setText("Ngày đăng kí");

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));

        txtNgayDangKi.setBorder(null);
        txtNgayDangKi.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtNgayDangKi.setMargin(new java.awt.Insets(10, 6, -5, 10));

        lblHinh.setBackground(new java.awt.Color(204, 204, 204));
        lblHinh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHinh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51), 3));
        lblHinh.setOpaque(true);

        btnChonHinh.setBackground(new java.awt.Color(0, 102, 51));
        btnChonHinh.setText("Chọn hình");
        btnChonHinh.setColorHover(new java.awt.Color(0, 155, 76));
        btnChonHinh.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnChonHinh.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnChonHinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChonHinhActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(btnADDkh, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(btnUPDATEkh, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(btnDELETEkh, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(btnNEWkh, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSeparator3)
                                            .addComponent(txtSDT, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                            .addComponent(jSeparator2)
                                            .addComponent(txtTenKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jSeparator1)
                                            .addComponent(jSeparator4)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtMaKH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNgaySinh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(64, 64, 64)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jSeparator10)
                                            .addComponent(txtMaNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jSeparator11)
                                            .addComponent(jLabel7)
                                            .addComponent(txtMaKM, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                            .addComponent(cboGioiTinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNgayDangKi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jSeparator6)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel13))
                                        .addGap(71, 71, 71)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator5)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtFINDkh, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(btnFINDkh, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnChonHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42))
                                    .addComponent(lblHinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFINDkh, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFINDkh, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNgayDangKi, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13))
                            .addComponent(lblHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaKM, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnChonHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDELETEkh, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNEWkh, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnADDkh, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUPDATEkh, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btnChonHinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChonHinhActionPerformed
        chonAnh();
    }//GEN-LAST:event_btnChonHinhActionPerformed

    private void tblKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhachHangMouseClicked
        this.row = tblKhachHang.getSelectedRow();
        lblRecord.setText(getRecord());
        this.edit();
    }//GEN-LAST:event_tblKhachHangMouseClicked

    private void btnADDkhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADDkhActionPerformed
        insert();
    }//GEN-LAST:event_btnADDkhActionPerformed

    private void btnUPDATEkhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUPDATEkhActionPerformed
        update();
    }//GEN-LAST:event_btnUPDATEkhActionPerformed

    private void btnDELETEkhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDELETEkhActionPerformed
        delete();
    }//GEN-LAST:event_btnDELETEkhActionPerformed

    private void btnNEWkhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNEWkhActionPerformed
        clearForm();
    }//GEN-LAST:event_btnNEWkhActionPerformed

    private void btnFINDkhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFINDkhActionPerformed
        find();
    }//GEN-LAST:event_btnFINDkhActionPerformed

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
    private rojerusan.RSMaterialButtonRectangle btnADDkh;
    private rojerusan.RSButtonHover btnBack;
    private rojerusan.RSButtonHover btnChonHinh;
    private rojerusan.RSMaterialButtonRectangle btnDELETEkh;
    private rojerusan.RSButtonHover btnFINDkh;
    private rojerusan.RSButtonHover btnFirst;
    private rojerusan.RSButtonHover btnLast;
    private rojerusan.RSMaterialButtonRectangle btnNEWkh;
    private rojerusan.RSButtonHover btnNext;
    private rojerusan.RSMaterialButtonRectangle btnUPDATEkh;
    private rojerusan.RSComboMetro cboGioiTinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblHinh;
    private javax.swing.JLabel lblRecord;
    private rojeru_san.complementos.RSTableMetro tblKhachHang;
    private app.bolivia.swing.JCTextField txtFINDkh;
    private app.bolivia.swing.JCTextField txtMaKH;
    private app.bolivia.swing.JCTextField txtMaKM;
    private app.bolivia.swing.JCTextField txtMaNV;
    private app.bolivia.swing.JCTextField txtNgayDangKi;
    private app.bolivia.swing.JCTextField txtNgaySinh;
    private app.bolivia.swing.JCTextField txtSDT;
    private app.bolivia.swing.JCTextField txtTenKH;
    // End of variables declaration//GEN-END:variables
    void chonAnh() {
        JFileChooser chooser = new JFileChooser();
        if (chooser.showOpenDialog(this) == JFileChooser.CANCEL_OPTION) {
            return;
        }else{
            File file = chooser.getSelectedFile();
            ImageHelper.save(file);
            ImageIcon icon = ImageHelper.read(file.getName());
            Image img = ImageHelper.resize(icon.getImage(), 193, 205);
            ImageIcon resizedIcon = new ImageIcon(img);
            lblHinh.setIcon(resizedIcon);
            lblHinh.setToolTipText(file.getName());
        }
    }
    void init() {
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        txtMaNV.setText(AuthorHelper.user.getMaNV());
        txtNgayDangKi.setText(java.time.LocalDate.now().toString());
        txtMaNV.setEditable(false);
        txtNgayDangKi.setEditable(false);
        txtMaKM.setEditable(false);
        row = -1;
        fillTable();
        updateStatus();
    }
    void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblKhachHang.getModel();
        model.setRowCount(0);
        try {
            List<KhachHang> list = dao.selectAll();
            for (KhachHang kh : list) {
                Object[] row = {
                    kh.getMaKH(),
                    kh.getHoTen(),
                    DateHelper.toString(kh.getNgaySinh(), "yyyy-MM-dd"),
                    kh.getGioiTinh() ? "Nam" : "Nữ",
                    kh.getsDT(),
                    DateHelper.toString(kh.getNgayDK(), "yyyy-MM-dd"),
                    kh.getMaNV(),
                    kh.getMaGiamGia(),
                    kh.getHinh()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            BoxHelper.alert(this, "Lỗi truy vấn dữ liệu");
        }
    }
    void fillTableByName() {
        DefaultTableModel model = (DefaultTableModel) tblKhachHang.getModel();
        model.setRowCount(0);
        try {
            String key = txtFINDkh.getText();
            List<KhachHang> list = dao.selectByKetword(key);
            for (KhachHang kh : list) {
                Object[] row = {
                    kh.getMaKH(),
                    kh.getHoTen(),
                    DateHelper.toString(kh.getNgaySinh(), "yyyy-MM-dd"),
                    kh.getGioiTinh() ? "Nam" : "Nữ",
                    kh.getsDT(),
                    DateHelper.toString(kh.getNgayDK(), "yyyy-MM-dd"),
                    kh.getMaNV(),
                    kh.getMaGiamGia(),
                    kh.getHinh()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            BoxHelper.alert(this, "Lỗi truy vấn dữ liệu");
        }
    }
    void setForm(KhachHang kh) {
        if (kh == null) {
            txtMaKH.setText("");
            txtTenKH.setText("");
            txtNgaySinh.setText("");
            txtNgayDangKi.setText(java.time.LocalDate.now().toString());
            txtSDT.setText("");
            txtMaNV.setText(AuthorHelper.user.getMaNV());
            txtMaKM.setText("0");
            cboGioiTinh.setSelectedIndex(0);
            lblHinh.setIcon(null);
        } else {
            txtMaKH.setText(kh.getMaKH());
            txtTenKH.setText(kh.getHoTen());
            txtNgaySinh.setText(kh.getNgaySinh().toString());
            txtNgayDangKi.setText(kh.getNgayDK().toString());
            txtSDT.setText(kh.getsDT());
            txtMaNV.setText(kh.getMaNV());
            txtMaKM.setText(String.valueOf(kh.getMaGiamGia()));
            cboGioiTinh.setSelectedItem(tblKhachHang.getValueAt(row, 3));
            if (kh.getHinh() != null) {
                lblHinh.setToolTipText(kh.getHinh());
                ImageIcon icon = ImageHelper.read(kh.getHinh());
                Image img = ImageHelper.resize(icon.getImage(), 193, 205);
                lblHinh.setIcon(new ImageIcon(img));
            }else {
                lblHinh.setIcon(null);
            }
        }
    }
    
    KhachHang getForm() {
        KhachHang kh = new KhachHang();
        kh.setMaKH(txtMaKH.getText());
        kh.setHoTen(txtTenKH.getText());
        kh.setNgaySinh(DateHelper.toDate(txtNgaySinh.getText()));
        if (cboGioiTinh.getSelectedIndex() == 0) {
            kh.setGioiTinh(true);
        }else{
            kh.setGioiTinh(false);
        }
        kh.setsDT(txtSDT.getText());
        kh.setNgayDK(DateHelper.toDate(txtNgayDangKi.getText()));
        kh.setMaNV(txtMaNV.getText());
        kh.setMaGiamGia(Integer.parseInt(txtMaKM.getText()));
        if (lblHinh.getIcon()!= null) {
            kh.setHinh(lblHinh.getToolTipText());
            ImageIcon icon = ImageHelper.read(kh.getHinh());
            Image img = ImageHelper.resize(icon.getImage(), 193, 205);
            lblHinh.setIcon(new ImageIcon(img));
        }else{
            kh.setHinh("Chưa chọn hình");
        }
        return kh;
    }
    
    void clearForm() {
        KhachHang kh = new KhachHang();
        kh = null;
        this.setForm(kh);
        row = -1;
        lblRecord.setText("0");
        tblKhachHang.clearSelection();
        setColorField();
        updateStatus();
    }
    void edit() {
        row = tblKhachHang.getSelectedRow();
        String maKH = (String) tblKhachHang.getValueAt(row, 0);
        KhachHang kh = dao.selectByID(maKH);
        this.setForm(kh);
        this.updateStatus();
    }
    void insert() {
        if (validDate().length() > 0) {
            BoxHelper.showError(this, validDate().toString());
            return;
        }if (DataValidateHelper.CheckNgayDKKH(txtNgayDangKi, txtNgaySinh) == false) {
            BoxHelper.showError(this, "Ngày đăng ký phải cách ngày sinh ít nhất 3 năm!");
            return;
        }
        else {
            KhachHang kh = getForm();
            try {
                dao.insert(kh);
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
        }if (DataValidateHelper.CheckNgayDKKH(txtNgayDangKi, txtNgaySinh) == false) {
            BoxHelper.showError(this, "Ngày đăng ký phải cách ngày sinh ít nhất 3 năm!");
            return;
        }
        
        else {
            if (BoxHelper.confirm(this, "Bạn có muốn lưu thay đổi?")) {
                KhachHang kh = getForm();
                try {
                    dao.update(kh);
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
        String maKH = txtMaKH.getText();
        if (!AuthorHelper.isManager()) {
            BoxHelper.alert(this, "Bạn không có quyền xóa khách hàng");
        }else{
            if (BoxHelper.confirm(this, "Bạn thực sự muốn xóa khách hàng này")) {
                try {
                    dao.delete(maKH);
                    this.fillTable();
                    this.clearForm();
                    BoxHelper.alert(this, "Xóa thành công");
                } catch (Exception e) {
                    BoxHelper.alert(this, "Xóa thất bại");
                }
            }  
        }
    }
    
    void find() {
        this.clearForm();
        if (txtFINDkh.getText().equals("")) {
            BoxHelper.alert(this, "Tên khách hàng không tồn tại");
            fillTable();
            return;
        }
        KhachHang kh = dao.selectByName(txtFINDkh.getText());
        if (kh != null) {
            fillTableByName();
//            setForm(kh);
//            this.row = findCurrentByAll(lh.getMaLoai());
//            tblLoaiHang.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
            this.row = tblKhachHang.getRowCount();
            lblRecord.setText("0");
            this.updateStatus();
        } else {
            fillTable();
            BoxHelper.alert(this, "Tên khách hàng không tồn tại");
            this.clearForm();
        }
    }
    void updateStatus() {
        boolean edit = (this.row >= 0);
        txtMaKH.setEditable(!edit);
        btnADDkh.setEnabled(!edit);
        btnDELETEkh.setEnabled(edit);
        btnUPDATEkh.setEnabled(edit);
    }
    void first() {
        this.row = 0;
        tblKhachHang.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
        lblRecord.setText(this.getRecord());
        this.edit();
    }
    void last() {
        this.row = tblKhachHang.getRowCount() - 1;
        tblKhachHang.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
        lblRecord.setText(this.getRecord());
        this.edit();
    }
    void next() {
        if (this.row < tblKhachHang.getRowCount() - 1) {
            this.row++;
            tblKhachHang.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
            lblRecord.setText(this.getRecord());
            this.edit();
        }else{
            this.row = 0;
            tblKhachHang.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
            lblRecord.setText(this.getRecord());
            this.edit();
        }
    }
    void back() {
        if (this.row > 0) {
            this.row--;
            tblKhachHang.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
            lblRecord.setText(this.getRecord());
            this.edit();
        }else{
            this.row = tblKhachHang.getRowCount() - 1;
            tblKhachHang.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
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
    StringBuilder validDate() {
        StringBuilder sb = new StringBuilder();
        DataValidateHelper.validateEmpty(txtMaKH, sb, "Mã khách hàng không được để trống!");
        DataValidateHelper.validateEmpty(txtTenKH, sb, "Tên khách hàng không được để trống!");
        DataValidateHelper.validateEmpty(txtNgayDangKi, sb, "Ngày đăng ký không được để trống!");
        DataValidateHelper.checkDate(txtNgayDangKi, sb, "Ngày đăng ký không hợp lệ (yyyy-MM-dd)");
        DataValidateHelper.validateEmpty(txtNgaySinh, sb, "Ngày sinh không được để trống!");
        DataValidateHelper.checkDate(txtNgaySinh, sb, "Ngày sinh không hợp lệ (yyyy-MM-dd)");
        DataValidateHelper.validateEmpty(txtSDT, sb, "Số điện thoại không được để trống!");
        DataValidateHelper.checkPhone(txtSDT, sb, "Số điện thoại không hợp lệ");
        
        return sb;
    }
    
     void setColorField() {
         txtMaKH.setBackground(Color.WHITE);
         txtTenKH.setBackground(Color.WHITE);
         txtNgaySinh.setBackground(Color.WHITE);
         txtNgayDangKi.setBackground(Color.WHITE);
         txtSDT.setBackground(Color.WHITE);
     }
}
