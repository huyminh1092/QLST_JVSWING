package poly.edu.ui;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.Timer;
import poly.edu.helper.AuthorHelper;
import poly.edu.helper.BoxHelper;
import poly.edu.helper.ImageHelper;

public class GreenOrganicJFrame extends javax.swing.JFrame {

    public GreenOrganicJFrame() {
        initComponents();
        setLocationRelativeTo(null);
        setBackground(new Color(0, 0, 0, 0));
        this.setTrongSuot();
        init();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenu1 = new poly.edu.swing.PanelMenu();
        menu2 = new poly.edu.component.Menu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        menuTrangChu = new rojeru_san.complementos.RSButtonHover();
        menuKhachHang = new rojeru_san.complementos.RSButtonHover();
        menuSanPham = new rojeru_san.complementos.RSButtonHover();
        menuNhap = new rojeru_san.complementos.RSButtonHover();
        menuNCU = new rojeru_san.complementos.RSButtonHover();
        menuBanHang = new rojeru_san.complementos.RSButtonHover();
        menuThongKe = new rojeru_san.complementos.RSButtonHover();
        menuNhanVien = new rojeru_san.complementos.RSButtonHover();
        lblavtNV = new javax.swing.JLabel();
        lblTenNV = new javax.swing.JLabel();
        lblVaiTro = new javax.swing.JLabel();
        taskBarPanel1 = new poly.edu.component.TaskBarPanel();
        jLabel12 = new javax.swing.JLabel();
        lblDongHo = new javax.swing.JLabel();
        titlePanel2 = new poly.edu.component.TitlePanel();
        btnClose = new rojerusan.RSButtonHover();
        btnSmall = new rojerusan.RSButtonHover();
        lblTieuDe = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblDoiMatKhau = new javax.swing.JLabel();
        lblDangXuat = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        lblTrangWeb = new javax.swing.JLabel();
        jPanelDeskop = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelMenu1.setBackground(new java.awt.Color(255, 255, 255));
        panelMenu1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel1.setText("Green");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Organic");

        menuTrangChu.setBackground(new java.awt.Color(0, 204, 0));
        menuTrangChu.setBorder(null);
        menuTrangChu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/Home.png"))); // NOI18N
        menuTrangChu.setText("  Trang chủ");
        menuTrangChu.setToolTipText("");
        menuTrangChu.setColorHover(new java.awt.Color(0, 153, 0));
        menuTrangChu.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        menuTrangChu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuTrangChu.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        menuTrangChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTrangChuActionPerformed(evt);
            }
        });

        menuKhachHang.setBackground(new java.awt.Color(0, 204, 0));
        menuKhachHang.setBorder(null);
        menuKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/QLKhachHang.png"))); // NOI18N
        menuKhachHang.setText("  Quản lý khách hàng");
        menuKhachHang.setToolTipText("");
        menuKhachHang.setColorHover(new java.awt.Color(0, 153, 0));
        menuKhachHang.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        menuKhachHang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuKhachHang.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        menuKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuKhachHangActionPerformed(evt);
            }
        });

        menuSanPham.setBackground(new java.awt.Color(0, 204, 0));
        menuSanPham.setBorder(null);
        menuSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/BanHang.png"))); // NOI18N
        menuSanPham.setText("  Quản lý sản phẩm");
        menuSanPham.setToolTipText("");
        menuSanPham.setColorHover(new java.awt.Color(0, 153, 0));
        menuSanPham.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        menuSanPham.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuSanPham.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        menuSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSanPhamActionPerformed(evt);
            }
        });

        menuNhap.setBackground(new java.awt.Color(0, 204, 0));
        menuNhap.setBorder(null);
        menuNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/kho.png"))); // NOI18N
        menuNhap.setText("  Quản lý nhập hàng");
        menuNhap.setToolTipText("");
        menuNhap.setColorHover(new java.awt.Color(0, 153, 0));
        menuNhap.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        menuNhap.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuNhap.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        menuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNhapActionPerformed(evt);
            }
        });

        menuNCU.setBackground(new java.awt.Color(0, 204, 0));
        menuNCU.setBorder(null);
        menuNCU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/NhaCungUng.png"))); // NOI18N
        menuNCU.setText("  Quản lý nhà cung ứng");
        menuNCU.setToolTipText("");
        menuNCU.setColorHover(new java.awt.Color(0, 153, 0));
        menuNCU.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        menuNCU.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuNCU.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        menuNCU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNCUActionPerformed(evt);
            }
        });

        menuBanHang.setBackground(new java.awt.Color(0, 204, 0));
        menuBanHang.setBorder(null);
        menuBanHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/QLHoaDon.png"))); // NOI18N
        menuBanHang.setText("  Quản lý bán hàng");
        menuBanHang.setToolTipText("");
        menuBanHang.setColorHover(new java.awt.Color(0, 153, 0));
        menuBanHang.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        menuBanHang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuBanHang.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        menuBanHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBanHangActionPerformed(evt);
            }
        });

        menuThongKe.setBackground(new java.awt.Color(0, 204, 0));
        menuThongKe.setBorder(null);
        menuThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/QLThongKe.png"))); // NOI18N
        menuThongKe.setText("  Quản lý thống kê");
        menuThongKe.setToolTipText("");
        menuThongKe.setColorHover(new java.awt.Color(0, 153, 0));
        menuThongKe.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        menuThongKe.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuThongKe.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        menuThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuThongKeActionPerformed(evt);
            }
        });

        menuNhanVien.setBackground(new java.awt.Color(0, 204, 0));
        menuNhanVien.setBorder(null);
        menuNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/QLNhanVien.png"))); // NOI18N
        menuNhanVien.setText("  Quản lý nhân viên");
        menuNhanVien.setToolTipText("");
        menuNhanVien.setColorHover(new java.awt.Color(0, 153, 0));
        menuNhanVien.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        menuNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuNhanVien.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        menuNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNhanVienActionPerformed(evt);
            }
        });

        lblavtNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/avtTrungTri.png"))); // NOI18N

        lblTenNV.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTenNV.setForeground(new java.awt.Color(255, 255, 255));
        lblTenNV.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTenNV.setText("TRUNG TRI");

        lblVaiTro.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        lblVaiTro.setForeground(new java.awt.Color(255, 255, 255));
        lblVaiTro.setText("Quản lý trưởng");

        javax.swing.GroupLayout menu2Layout = new javax.swing.GroupLayout(menu2);
        menu2.setLayout(menu2Layout);
        menu2Layout.setHorizontalGroup(
            menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuTrangChu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menuSanPham, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menuNCU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menuNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menuBanHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menuKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menuThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menuNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menu2Layout.createSequentialGroup()
                .addGroup(menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menu2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel2))
                    .addGroup(menu2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblavtNV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTenNV)
                            .addComponent(lblVaiTro))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        menu2Layout.setVerticalGroup(
            menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(73, 73, 73)
                .addComponent(menuTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(menuNCU, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(menuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(menuSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(menuBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(menuKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(menuNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(menuThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(menu2Layout.createSequentialGroup()
                        .addComponent(lblTenNV)
                        .addGap(0, 0, 0)
                        .addComponent(lblVaiTro))
                    .addComponent(lblavtNV, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelMenu1.add(menu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 700));

        taskBarPanel1.setBackground(new java.awt.Color(0, 102, 51));
        taskBarPanel1.setOpaque(true);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/Time.png"))); // NOI18N

        lblDongHo.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblDongHo.setForeground(new java.awt.Color(0, 102, 51));
        lblDongHo.setText("12:00:00 PM");

        javax.swing.GroupLayout taskBarPanel1Layout = new javax.swing.GroupLayout(taskBarPanel1);
        taskBarPanel1.setLayout(taskBarPanel1Layout);
        taskBarPanel1Layout.setHorizontalGroup(
            taskBarPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, taskBarPanel1Layout.createSequentialGroup()
                .addContainerGap(1005, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDongHo)
                .addGap(7, 7, 7))
        );
        taskBarPanel1Layout.setVerticalGroup(
            taskBarPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDongHo, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelMenu1.add(taskBarPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 700, 1130, 30));

        btnClose.setBackground(new java.awt.Color(174, 178, 195));
        btnClose.setBorder(null);
        btnClose.setForeground(new java.awt.Color(0, 0, 0));
        btnClose.setText("X");
        btnClose.setColorHover(new java.awt.Color(153, 0, 0));
        btnClose.setColorText(new java.awt.Color(0, 0, 0));
        btnClose.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnSmall.setBackground(new java.awt.Color(174, 178, 195));
        btnSmall.setBorder(null);
        btnSmall.setForeground(new java.awt.Color(0, 0, 0));
        btnSmall.setText("-");
        btnSmall.setColorHover(new java.awt.Color(102, 102, 102));
        btnSmall.setColorText(new java.awt.Color(0, 0, 0));
        btnSmall.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btnSmall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSmallActionPerformed(evt);
            }
        });

        lblTieuDe.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        lblTieuDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/TieuDe.png"))); // NOI18N
        lblTieuDe.setText(" TRANG CHỦ");

        javax.swing.GroupLayout titlePanel2Layout = new javax.swing.GroupLayout(titlePanel2);
        titlePanel2.setLayout(titlePanel2Layout);
        titlePanel2Layout.setHorizontalGroup(
            titlePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlePanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblTieuDe, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 593, Short.MAX_VALUE)
                .addComponent(btnSmall, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        titlePanel2Layout.setVerticalGroup(
            titlePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(titlePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(titlePanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(titlePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSmall, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblTieuDe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelMenu1.add(titlePanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 1130, 50));

        jPanel1.setBackground(new java.awt.Color(0, 116, 0));

        lblDoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/DoiPass.png"))); // NOI18N
        lblDoiMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblDoiMatKhauMousePressed(evt);
            }
        });

        lblDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/DangXuat.png"))); // NOI18N
        lblDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDangXuatMouseClicked(evt);
            }
        });

        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/Close.png"))); // NOI18N
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });

        lblTrangWeb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/Web.png"))); // NOI18N
        lblTrangWeb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblTrangWebMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(158, Short.MAX_VALUE)
                .addComponent(lblTrangWeb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDoiMatKhau)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDangXuat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblClose)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblClose, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(lblDoiMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblTrangWeb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelMenu1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 700, 280, 30));

        jPanelDeskop.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelDeskopLayout = new javax.swing.GroupLayout(jPanelDeskop);
        jPanelDeskop.setLayout(jPanelDeskopLayout);
        jPanelDeskopLayout.setHorizontalGroup(
            jPanelDeskopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1130, Short.MAX_VALUE)
        );
        jPanelDeskopLayout.setVerticalGroup(
            jPanelDeskopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        panelMenu1.add(jPanelDeskop, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 1130, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        if (BoxHelper.confirm(this, "Bạn muốn đóng chương trình?")) {
            System.exit(0);
        }

    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnSmallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSmallActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnSmallActionPerformed

    private void menuTrangChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTrangChuActionPerformed
        TrangChuJInternalFrame trangChu = new TrangChuJInternalFrame();
        jPanelDeskop.removeAll();
        jPanelDeskop.add(trangChu).setVisible(true);
        lblTieuDe.setText(" TRANG CHỦ");
        lblTieuDe.setFont(new java.awt.Font("Tahoma", 1, 19));
        DSHoaDonNhapjIF.count = 0;
        DSHoaDonBanjIF.count = 0;
    }//GEN-LAST:event_menuTrangChuActionPerformed

    private void menuNCUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNCUActionPerformed
        if (AuthorHelper.isLogin()) {
            if (!AuthorHelper.isEmployee()) {
                 NhaCungUngjIF nhaCungUng = new NhaCungUngjIF();
                jPanelDeskop.removeAll();
                jPanelDeskop.add(nhaCungUng).setVisible(true);
                lblTieuDe.setText(" NHÀ CUNG ỨNG");
                lblTieuDe.setFont(new java.awt.Font("Tahoma", 1, 19));
                DSHoaDonNhapjIF.count = 0;
                DSHoaDonBanjIF.count = 0;
            }else{
                BoxHelper.alert(this, "Bạn không có quyền quản lý nhà cung ứng");
            }
        }else{
            BoxHelper.alert(this, "Bạn chưa đăng nhập");
        }
         
    }//GEN-LAST:event_menuNCUActionPerformed

    private void menuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNhapActionPerformed
        
        if (AuthorHelper.isLogin()) {
            if (!AuthorHelper.isEmployee()) {
                HoaDonNhapjIF nhap = new HoaDonNhapjIF();
                jPanelDeskop.removeAll();
                jPanelDeskop.add(nhap).setVisible(true);
                lblTieuDe.setText(" HÓA ĐƠN NHẬP");
                lblTieuDe.setFont(new java.awt.Font("Tahoma", 1, 19));
                DSHoaDonNhapjIF.count = 0;
                DSHoaDonBanjIF.count = 0;
            }else{
                BoxHelper.alert(this, "Bạn không có quyền truy cập nhập hàng");
            }     
        }else{
            BoxHelper.alert(this, "Bạn chưa đăng nhập");
        }
    }//GEN-LAST:event_menuNhapActionPerformed

    private void menuNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNhanVienActionPerformed
       
        if (AuthorHelper.isLogin()) {
            if (AuthorHelper.isManager()) {
                NhanVienjIF nhanvien = new NhanVienjIF();
                jPanelDeskop.removeAll();
                jPanelDeskop.add(nhanvien).setVisible(true);
                lblTieuDe.setText(" NHÂN VIÊN");
                lblTieuDe.setFont(new java.awt.Font("Tahoma", 1, 19));
                DSHoaDonNhapjIF.count = 0;
                DSHoaDonBanjIF.count = 0;
            } else {
                BoxHelper.alert(this, "Bạn không có quyền quản lý nhân viên");
            }
        } else {
            BoxHelper.alert(this, "Bạn chưa đăng nhập");
        }
    }//GEN-LAST:event_menuNhanVienActionPerformed

    private void menuSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSanPhamActionPerformed
        
        if (AuthorHelper.isLogin()) {
           SanPhamjIF sanpham = new SanPhamjIF();
            jPanelDeskop.removeAll();
            jPanelDeskop.add(sanpham).setVisible(true);
            lblTieuDe.setText(" SẢN PHẨM");
            lblTieuDe.setFont(new java.awt.Font("Tahoma", 1, 19));
            DSHoaDonNhapjIF.count = 0;
            DSHoaDonBanjIF.count = 0;
        }else{
            BoxHelper.alert(this, "Bạn chưa đăng nhập");
        }
    }//GEN-LAST:event_menuSanPhamActionPerformed

    private void menuKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuKhachHangActionPerformed
        
        if (AuthorHelper.isLogin()) {
           KhachHangjIF khachHang = new KhachHangjIF();
            jPanelDeskop.removeAll();
            jPanelDeskop.add(khachHang).setVisible(true);
            lblTieuDe.setText(" KHÁCH HÀNG");
            lblTieuDe.setFont(new java.awt.Font("Tahoma", 1, 19));
            DSHoaDonNhapjIF.count = 0;
            DSHoaDonBanjIF.count = 0;
        }else{
            BoxHelper.alert(this, "Bạn chưa đăng nhập");
        }
    }//GEN-LAST:event_menuKhachHangActionPerformed

    private void menuBanHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBanHangActionPerformed
        
        if (AuthorHelper.isLogin()) {
            if (!AuthorHelper.isWarehouse()) {
                HoaDonBanjIF ban = new HoaDonBanjIF();
                jPanelDeskop.removeAll();
                jPanelDeskop.add(ban).setVisible(true);
                lblTieuDe.setText(" HÓA ĐƠN BÁN");
                lblTieuDe.setFont(new java.awt.Font("Tahoma", 1, 19));
                DSHoaDonNhapjIF.count = 0;
                DSHoaDonBanjIF.count = 0;
            }else{
                 BoxHelper.alert(this, "Bạn không có quyền truy cập bán hàng");
            }
        }else{
            BoxHelper.alert(this, "Bạn chưa đăng nhập");
        }
    }//GEN-LAST:event_menuBanHangActionPerformed

    private void menuThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuThongKeActionPerformed
         if (AuthorHelper.isLogin()) {
            if (AuthorHelper.isManager()) {
                ThongKeChung thongke = new ThongKeChung();
                jPanelDeskop.removeAll();
                jPanelDeskop.add(thongke).setVisible(true);
                lblTieuDe.setText(" THỐNG KÊ CHUNG");
                lblTieuDe.setFont(new java.awt.Font("Tahoma", 1, 19));
                DSHoaDonNhapjIF.count = 0;
                DSHoaDonBanjIF.count = 0;
            } else {
                BoxHelper.alert(this, "Bạn không có quyền xem thống kê");
            }
        } else {
            BoxHelper.alert(this, "Bạn chưa đăng nhập");
        }
    }//GEN-LAST:event_menuThongKeActionPerformed

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        if (BoxHelper.confirm(this, "Bạn muốn đóng chương trình?")) {
            System.exit(0);
        }
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblTrangWebMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTrangWebMousePressed
        try {
            Desktop.getDesktop().browse(new URL("https://organic-special.000webhostapp.com/index.html").toURI());
        } catch (MalformedURLException ex) {
        } catch (URISyntaxException ex) {
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_lblTrangWebMousePressed

    private void lblDoiMatKhauMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDoiMatKhauMousePressed
        DoiMatKhau dmk = new DoiMatKhau(this, true);
        dmk.setVisible(true);
    }//GEN-LAST:event_lblDoiMatKhauMousePressed

    private void lblDangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangXuatMouseClicked
        if (BoxHelper.confirm(this, "Bạn muốn đăng xuất?")) {
            AuthorHelper.clear();
            TrangChuJInternalFrame trangChu = new TrangChuJInternalFrame();
            jPanelDeskop.removeAll();
            jPanelDeskop.add(trangChu).setVisible(true);
            lblTieuDe.setText(" TRANG CHỦ");
            lblTieuDe.setFont(new java.awt.Font("Tahoma", 1, 19));
            DSHoaDonNhapjIF.count = 0;
            DSHoaDonBanjIF.count = 0;
            lblTenNV.setText("NHÂN VIÊN");
            lblVaiTro.setText("Vai trò");
            lblavtNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/avtNhanVien.png")));
            new DangNhap(this, true).setVisible(true);
        }
    }//GEN-LAST:event_lblDangXuatMouseClicked

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
            java.util.logging.Logger.getLogger(GreenOrganicJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GreenOrganicJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GreenOrganicJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GreenOrganicJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GreenOrganicJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonHover btnClose;
    private rojerusan.RSButtonHover btnSmall;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPanelDeskop;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblDangXuat;
    private javax.swing.JLabel lblDoiMatKhau;
    private javax.swing.JLabel lblDongHo;
    public static javax.swing.JLabel lblTenNV;
    public static javax.swing.JLabel lblTieuDe;
    private javax.swing.JLabel lblTrangWeb;
    public static javax.swing.JLabel lblVaiTro;
    public static javax.swing.JLabel lblavtNV;
    private poly.edu.component.Menu menu2;
    private rojeru_san.complementos.RSButtonHover menuBanHang;
    private rojeru_san.complementos.RSButtonHover menuKhachHang;
    private rojeru_san.complementos.RSButtonHover menuNCU;
    private rojeru_san.complementos.RSButtonHover menuNhanVien;
    private rojeru_san.complementos.RSButtonHover menuNhap;
    private rojeru_san.complementos.RSButtonHover menuSanPham;
    private rojeru_san.complementos.RSButtonHover menuThongKe;
    private rojeru_san.complementos.RSButtonHover menuTrangChu;
    private poly.edu.swing.PanelMenu panelMenu1;
    private poly.edu.component.TaskBarPanel taskBarPanel1;
    private poly.edu.component.TitlePanel titlePanel2;
    // End of variables declaration//GEN-END:variables

    void setTrongSuot() {
        menuTrangChu.setBackground(new Color(0, 255, 0, 1));
        menuBanHang.setBackground(new Color(0, 255, 0, 1));
        menuKhachHang.setBackground(new Color(0, 255, 0, 1));
        menuNhap.setBackground(new Color(0, 255, 0, 1));
        menuNCU.setBackground(new Color(0, 255, 0, 1));
        menuNhanVien.setBackground(new Color(0, 255, 0, 1));
        menuSanPham.setBackground(new Color(0, 255, 0, 1));
        menuThongKe.setBackground(new Color(0, 255, 0, 1));
        btnClose.setBackground(new Color(192, 192, 192, 1));
        btnSmall.setBackground(new Color(192, 192, 192, 1));
        TrangChuJInternalFrame trangChu = new TrangChuJInternalFrame();
        jPanelDeskop.removeAll();
        jPanelDeskop.add(trangChu).setVisible(true);

    }

    void init() {
        this.setIconImage(ImageHelper.getAppIcon());
        ChaoJDialog chao = new ChaoJDialog(this, true);
        chao.setVisible(true);
        new DangNhap(this, true).setVisible(true);
        new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date now = new Date();
                SimpleDateFormat formater = new SimpleDateFormat("hh:mm:ss a");
                String text = formater.format(now);
                lblDongHo.setText(text);
            }
        }).start();
    }    
}
