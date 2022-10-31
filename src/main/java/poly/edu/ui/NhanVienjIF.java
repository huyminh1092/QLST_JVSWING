package poly.edu.ui;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import poly.edu.dao.NhanVienDAO;
import poly.edu.entity.NhanVien;
import poly.edu.helper.BoxHelper;
import poly.edu.helper.DataValidateHelper;
import poly.edu.helper.DateHelper;
import poly.edu.helper.ImageHelper;

public class NhanVienjIF extends javax.swing.JInternalFrame {
    NhanVienDAO dao = new NhanVienDAO();
    int row = -1;
    List<NhanVien> lo=new NhanVienDAO().selectAll();
    public NhanVienjIF() {
        initComponents();
        init();
        lblRecord.setText(lo.size()+"");
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
        txtMaNV = new app.bolivia.swing.JCTextField();
        txtTenNV = new app.bolivia.swing.JCTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtSDT = new app.bolivia.swing.JCTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtNgaySinh = new app.bolivia.swing.JCTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhanVien = new rojeru_san.complementos.RSTableMetro();
        btnDELETEnv = new rojerusan.RSMaterialButtonRectangle();
        btnNEWnv = new rojerusan.RSMaterialButtonRectangle();
        btnADDnv = new rojerusan.RSMaterialButtonRectangle();
        btnUPDATEnv = new rojerusan.RSMaterialButtonRectangle();
        jLabel5 = new javax.swing.JLabel();
        txtFindnv = new app.bolivia.swing.JCTextField();
        jSeparator5 = new javax.swing.JSeparator();
        rSButtonHover1 = new rojerusan.RSButtonHover();
        btnFirst = new rojerusan.RSButtonHover();
        btnBack = new rojerusan.RSButtonHover();
        btnNext = new rojerusan.RSButtonHover();
        btnLast = new rojerusan.RSButtonHover();
        lblRecord = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtEmail = new app.bolivia.swing.JCTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        cboGioiTinh = new rojerusan.RSComboMetro();
        cboVaiTro = new rojerusan.RSComboMetro();
        txtMatKhau = new rojerusan.RSPasswordTextPlaceHolder();
        lblHinh = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 51));
        jLabel1.setText("Mã nhân viên");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 51));
        jLabel2.setText("Tên nhân viên");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 51));
        jLabel3.setText("Số điện thoại");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 51));
        jLabel4.setText("Ngày sinh");

        txtMaNV.setBorder(null);
        txtMaNV.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtMaNV.setMargin(new java.awt.Insets(10, 6, -5, 10));

        txtTenNV.setBorder(null);
        txtTenNV.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtTenNV.setMargin(new java.awt.Insets(10, 6, -5, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));

        txtSDT.setBorder(null);
        txtSDT.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtSDT.setMargin(new java.awt.Insets(10, 6, -5, 10));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));

        txtNgaySinh.setBorder(null);
        txtNgaySinh.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtNgaySinh.setMargin(new java.awt.Insets(10, 6, -5, 10));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));

        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"NCU01", "Thành Phát", "0919879374", "Thanhphat@gmail.com", "0987675432183", "00754", "Quận 1, TP HCM", null, null}
            },
            new String [] {
                "Mã nhân viên", "Tên nhân viên", "Ngày sinh", "Giới tính", "SĐT", "Email", "Mật khẩu", "Vai trò", "Hình"
            }
        ));
        tblNhanVien.setColorBackgoundHead(new java.awt.Color(0, 102, 51));
        tblNhanVien.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblNhanVien.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tblNhanVien.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tblNhanVien.setColorSelBackgound(new java.awt.Color(204, 204, 204));
        tblNhanVien.setColorSelForeground(new java.awt.Color(0, 0, 0));
        tblNhanVien.setFillsViewportHeight(true);
        tblNhanVien.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        tblNhanVien.setFuenteFilas(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        tblNhanVien.setFuenteFilasSelect(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        tblNhanVien.setFuenteHead(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        tblNhanVien.setGridColor(new java.awt.Color(0, 102, 51));
        tblNhanVien.setGrosorBordeFilas(0);
        tblNhanVien.setGrosorBordeHead(0);
        tblNhanVien.setRowHeight(25);
        tblNhanVien.setShowGrid(false);
        tblNhanVien.setShowHorizontalLines(true);
        tblNhanVien.setShowVerticalLines(true);
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNhanVien);

        btnDELETEnv.setBackground(new java.awt.Color(0, 102, 51));
        btnDELETEnv.setBorder(null);
        btnDELETEnv.setText("Xóa");
        btnDELETEnv.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnDELETEnv.setType(null);
        btnDELETEnv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDELETEnvActionPerformed(evt);
            }
        });

        btnNEWnv.setBackground(new java.awt.Color(0, 102, 51));
        btnNEWnv.setBorder(null);
        btnNEWnv.setText("Mới");
        btnNEWnv.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnNEWnv.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnNEWnv.setType(null);
        btnNEWnv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNEWnvActionPerformed(evt);
            }
        });

        btnADDnv.setBackground(new java.awt.Color(0, 102, 51));
        btnADDnv.setBorder(null);
        btnADDnv.setText("Thêm");
        btnADDnv.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnADDnv.setType(null);
        btnADDnv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADDnvActionPerformed(evt);
            }
        });

        btnUPDATEnv.setBackground(new java.awt.Color(0, 102, 51));
        btnUPDATEnv.setBorder(null);
        btnUPDATEnv.setText("Cập nhật");
        btnUPDATEnv.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnUPDATEnv.setType(null);
        btnUPDATEnv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUPDATEnvActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 51));
        jLabel5.setText("Tìm kiếm: ");

        txtFindnv.setBorder(null);
        txtFindnv.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        txtFindnv.setMargin(new java.awt.Insets(10, 6, -5, 10));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        rSButtonHover1.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonHover1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/TimKiem.png"))); // NOI18N
        rSButtonHover1.setColorHover(new java.awt.Color(204, 204, 204));
        rSButtonHover1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover1ActionPerformed(evt);
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

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 51));
        jLabel11.setText("Vai trò");

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 51));
        jLabel12.setText("Email");

        txtEmail.setBorder(null);
        txtEmail.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtEmail.setMargin(new java.awt.Insets(10, 6, -5, 10));

        jSeparator10.setBackground(new java.awt.Color(0, 0, 0));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 51));
        jLabel13.setText("Mật khẩu");

        jSeparator11.setBackground(new java.awt.Color(0, 0, 0));

        cboGioiTinh.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nam", "Nữ" }));
        cboGioiTinh.setColorArrow(new java.awt.Color(0, 102, 51));
        cboGioiTinh.setColorBorde(new java.awt.Color(0, 102, 51));
        cboGioiTinh.setColorFondo(new java.awt.Color(0, 102, 51));
        cboGioiTinh.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N

        cboVaiTro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Quản lý trưởng", "Quản lý kho", "Thu ngân" }));
        cboVaiTro.setColorArrow(new java.awt.Color(0, 102, 51));
        cboVaiTro.setColorBorde(new java.awt.Color(0, 102, 51));
        cboVaiTro.setColorFondo(new java.awt.Color(0, 102, 51));
        cboVaiTro.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N

        txtMatKhau.setBorder(null);
        txtMatKhau.setForeground(new java.awt.Color(0, 0, 0));
        txtMatKhau.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtMatKhau.setMargin(new java.awt.Insets(10, 6, -5, 10));

        lblHinh.setBackground(new java.awt.Color(204, 204, 204));
        lblHinh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/KichVao.png"))); // NOI18N
        lblHinh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51), 3));
        lblHinh.setOpaque(true);
        lblHinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHinhMouseClicked(evt);
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
                        .addComponent(btnADDnv, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(btnUPDATEnv, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(btnDELETEnv, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(btnNEWnv, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1034, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                                .addComponent(txtTenNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jSeparator1)
                                                .addComponent(jSeparator4)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtMaNV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel1)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtNgaySinh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGap(64, 64, 64)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jSeparator10)
                                                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                                    .addComponent(jSeparator11)
                                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel7)
                                                    .addComponent(cboGioiTinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(cboVaiTro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(txtMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(71, 71, 71)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator5)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(txtFindnv, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(rSButtonHover1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(lblHinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFindnv, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSButtonHover1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblHinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cboGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(13, 13, 13)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cboVaiTro, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(13, 13, 13)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel13)))
                                .addGap(32, 32, 32)))
                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDELETEnv, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNEWnv, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnADDnv, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUPDATEnv, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void lblHinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHinhMouseClicked
        chonAnh();
    }//GEN-LAST:event_lblHinhMouseClicked

    private void btnADDnvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADDnvActionPerformed
        insert();
    }//GEN-LAST:event_btnADDnvActionPerformed

    private void btnUPDATEnvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUPDATEnvActionPerformed
        update();
    }//GEN-LAST:event_btnUPDATEnvActionPerformed

    private void btnDELETEnvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDELETEnvActionPerformed
        delete();
    }//GEN-LAST:event_btnDELETEnvActionPerformed

    private void btnNEWnvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNEWnvActionPerformed
        clearForm();
    }//GEN-LAST:event_btnNEWnvActionPerformed

    private void rSButtonHover1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover1ActionPerformed
        find();
    }//GEN-LAST:event_rSButtonHover1ActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
       first();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        back();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        last();
    }//GEN-LAST:event_btnLastActionPerformed

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
        this.row = tblNhanVien.getSelectedRow();
        lblRecord.setText(getRecord());
        this.edit();
    }//GEN-LAST:event_tblNhanVienMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle btnADDnv;
    private rojerusan.RSButtonHover btnBack;
    private rojerusan.RSMaterialButtonRectangle btnDELETEnv;
    private rojerusan.RSButtonHover btnFirst;
    private rojerusan.RSButtonHover btnLast;
    private rojerusan.RSMaterialButtonRectangle btnNEWnv;
    private rojerusan.RSButtonHover btnNext;
    private rojerusan.RSMaterialButtonRectangle btnUPDATEnv;
    private rojerusan.RSComboMetro cboGioiTinh;
    private rojerusan.RSComboMetro cboVaiTro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblHinh;
    private javax.swing.JLabel lblRecord;
    private rojerusan.RSButtonHover rSButtonHover1;
    private rojeru_san.complementos.RSTableMetro tblNhanVien;
    private app.bolivia.swing.JCTextField txtEmail;
    private app.bolivia.swing.JCTextField txtFindnv;
    private app.bolivia.swing.JCTextField txtMaNV;
    private rojerusan.RSPasswordTextPlaceHolder txtMatKhau;
    private app.bolivia.swing.JCTextField txtNgaySinh;
    private app.bolivia.swing.JCTextField txtSDT;
    private app.bolivia.swing.JCTextField txtTenNV;
    // End of variables declaration//GEN-END:variables
     void chonAnh() {
        JFileChooser chooser = new JFileChooser();
        if (chooser.showOpenDialog(this) == JFileChooser.CANCEL_OPTION) {
            return;
        }else{
            File file = chooser.getSelectedFile();
            ImageHelper.save(file);
            ImageIcon icon = ImageHelper.read(file.getName());
            Image img = ImageHelper.resize(icon.getImage(), 193, 202);
            ImageIcon resizedIcon = new ImageIcon(img);
            lblHinh.setIcon(resizedIcon);
            lblHinh.setToolTipText(file.getName());
        }
    }
     
     void init() {
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        row = -1;
        fillTable();
        updateStatus();
     }
     
     void fillTable() {
         DefaultTableModel model = (DefaultTableModel) tblNhanVien.getModel();
         model.setRowCount(0);
         try {
             List<NhanVien> list = dao.selectAll();
             for (NhanVien nv : list) {
                 Object[] row = {
                     nv.getMaNV(),
                     nv.getHoTen(),
                     DateHelper.toString(nv.getNgaySinh(), "yyyy-MM-dd"),
                     nv.isGioiTinh() ? "Nam" : "Nữ",
                     nv.getSDT(),
                     nv.getEmail(),
                     nv.getPassWord(),
                     nv.getVaiTro(),
                     nv.getHinh()
                 };
                 model.addRow(row);
             }
         } catch (Exception e) {
             BoxHelper.alert(this, "Lỗi truy vấn dữ liệu");
         }
     }
     
     void fillTableByName() {
         DefaultTableModel model = (DefaultTableModel) tblNhanVien.getModel();
         model.setRowCount(0);
         try {
             String key = txtFindnv.getText();
             List<NhanVien> list = dao.selectByKetword(key);
             for (NhanVien nv : list) {
                 Object[] row = {
                     nv.getMaNV(),
                     nv.getHoTen(),
                     DateHelper.toString(nv.getNgaySinh(), "yyyy-MM-dd"),
                     nv.isGioiTinh() ? "Nam" : "Nữ",
                     nv.getSDT(),
                     nv.getEmail(),
                     nv.getPassWord(),
                     nv.getVaiTro(),
                     nv.getHinh()
                 };
                 model.addRow(row);
             }
         } catch (Exception e) {
             BoxHelper.alert(this, "Lỗi truy vấn dữ liệu");
         }
     }
     
     void setForm(NhanVien nv) {
         if (nv == null) {
             txtMaNV.setText("");
             txtTenNV.setText("");
             txtNgaySinh.setText("");
             txtSDT.setText("");
             txtEmail.setText("");
             txtMatKhau.setText("");
             cboGioiTinh.setSelectedIndex(0);
             cboVaiTro.setSelectedIndex(0);
             lblHinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/KichVao.png")));
             lblHinh.setToolTipText(null);
         }else {
             txtMaNV.setText(nv.getMaNV());
             txtTenNV.setText(nv.getHoTen());
             txtNgaySinh.setText(nv.getNgaySinh().toString());
             txtSDT.setText(nv.getSDT());
             txtEmail.setText(nv.getEmail());
             txtMatKhau.setText(nv.getPassWord());
             cboGioiTinh.setSelectedItem(tblNhanVien.getValueAt(row, 3));
             cboVaiTro.setSelectedItem(tblNhanVien.getValueAt(row, 7));
             lblHinh.setToolTipText(nv.getHinh());
             ImageIcon icon = ImageHelper.read(nv.getHinh());
             Image img = ImageHelper.resize(icon.getImage(), 193, 202);
             lblHinh.setIcon(new ImageIcon(img));
         }
     }
     
     NhanVien getForm() {
         NhanVien nv = new NhanVien();
         nv.setMaNV(txtMaNV.getText());
         nv.setHoTen(txtTenNV.getText());
         nv.setNgaySinh(DateHelper.toDate(txtNgaySinh.getText()));
         nv.setSDT(txtSDT.getText());
         nv.setEmail(txtEmail.getText());
         nv.setPassWord(txtMatKhau.getText());
         if (cboGioiTinh.getSelectedIndex() == 0) {
            nv.setGioiTinh(true);
        }else{
            nv.setGioiTinh(false);
        }
         if (cboVaiTro.getSelectedIndex() == 0) {
            nv.setVaiTro("Quản lý trưởng");
        }else if (cboVaiTro.getSelectedIndex() == 1) {
             nv.setVaiTro("Quản lý kho");
        }else{
            nv.setVaiTro("Thu ngân");
        }
         nv.setHinh(lblHinh.getToolTipText());
         ImageIcon icon = ImageHelper.read(nv.getHinh());
         Image img = ImageHelper.resize(icon.getImage(), 193, 202);
         lblHinh.setIcon(new ImageIcon(img));

        return nv;
     }
     
     void clearForm() {
        NhanVien kh = new NhanVien();
        kh = null;
        this.setForm(kh);
        row = -1;
        lblRecord.setText("0");
        tblNhanVien.clearSelection();
        setColorField();
        updateStatus();
     }
     
     void edit() {
        row = tblNhanVien.getSelectedRow();
        String maNV = (String) tblNhanVien.getValueAt(row, 0);
        NhanVien nv = dao.selectByID(maNV);
        this.setForm(nv);
        this.updateStatus();
     }
     
     void insert() {
         if (validDate().length() > 0) {
            BoxHelper.showError(this, validDate().toString());
            return;
         }else{
             NhanVien nv = getForm();
             try {
                dao.insert(nv);
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
                NhanVien nv = getForm();
                try {
                    dao.update(nv);
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
        String maNV = txtMaNV.getText();
//        if (!AuthorHelper.isManager()) {
//            BoxHelper.alert(this, "Bạn không có quyền xóa khách hàng");
//        }else{
            if (BoxHelper.confirm(this, "Bạn thực sự muốn xóa nhân viên này")) {
                try {
                    dao.delete(maNV);
                    this.fillTable();
                    this.clearForm();
                    BoxHelper.alert(this, "Xóa thành công");
                } catch (Exception e) {
                    BoxHelper.alert(this, "Xóa thất bại");
                }
            }       
    }
     void find() {
        this.clearForm();
        if (txtFindnv.getText().equals("")) {
            BoxHelper.alert(this, "Tên nhân viên không tồn tại");
            fillTable();
            return;
        }
        NhanVien kh = dao.selectByName(txtFindnv.getText());
        if (kh != null) {
            fillTableByName();
//            setForm(kh);
//            this.row = findCurrentByAll(lh.getMaLoai());
//            tblLoaiHang.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
            this.row = tblNhanVien.getRowCount();
            lblRecord.setText("0");
            this.updateStatus();
        } else {
            fillTable();
            BoxHelper.alert(this, "Tên nhân viên không tồn tại");
            this.clearForm();
        }
    }
     void first() {
        this.row = 0;
        tblNhanVien.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
        lblRecord.setText(this.getRecord());
        this.edit();
    }
    void last() {
        this.row = tblNhanVien.getRowCount() - 1;
        tblNhanVien.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
        lblRecord.setText(this.getRecord());
        this.edit();
    }
    void next() {
        if (this.row < tblNhanVien.getRowCount() - 1) {
            this.row++;
            tblNhanVien.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
            lblRecord.setText(this.getRecord());
            this.edit();
        }else{
            this.row = 0;
            tblNhanVien.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
            lblRecord.setText(this.getRecord());
            this.edit();
        }
    }
    void back() {
        if (this.row > 0) {
            this.row--;
            tblNhanVien.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
            lblRecord.setText(this.getRecord());
            this.edit();
        }else{
            this.row = tblNhanVien.getRowCount() - 1;
            tblNhanVien.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
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
        txtMaNV.setEditable(!edit);
        btnADDnv.setEnabled(!edit);
        btnDELETEnv.setEnabled(edit);
        btnUPDATEnv.setEnabled(edit);
    }
     
     StringBuilder validDate() {
        StringBuilder sb = new StringBuilder();
        DataValidateHelper.validateEmpty(txtMaNV, sb, "Mã nhân viên không được để trống!");
        DataValidateHelper.validateEmpty(txtTenNV, sb, "Tên nhân viên không được để trống!");
        DataValidateHelper.validateEmpty(txtNgaySinh, sb, "Ngày sinh không được để trống!");
        DataValidateHelper.checkDate(txtNgaySinh, sb, "Ngày sinh không hợp lệ (yyyy-MM-dd)");
        DataValidateHelper.validateEmpty(txtSDT, sb, "Số điện thoại không được để trống!");
        DataValidateHelper.checkPhone(txtSDT, sb, "Số điện thoại không hợp lệ!");
        DataValidateHelper.validateEmpty(txtEmail, sb, "Email không được để trống!");
        DataValidateHelper.checkEmail(txtEmail, sb, "Email không hợp lệ!");
        DataValidateHelper.validateEmpty(txtMatKhau, sb, "Mật khẩu không được để trống!");
        DataValidateHelper.validateEmptyForLabel(lblHinh, sb, "Hình không được để trống!");
       
        return sb;
    }
     void setColorField() {
         txtMaNV.setBackground(Color.WHITE);
         txtTenNV.setBackground(Color.WHITE);
         txtNgaySinh.setBackground(Color.WHITE);
         txtEmail.setBackground(Color.WHITE);
         txtSDT.setBackground(Color.WHITE);
         txtMatKhau.setBackground(Color.WHITE);
     }
}
