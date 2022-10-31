package poly.edu.ui;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import poly.edu.dao.HoaDonNhapDAO;
import poly.edu.dao.LoaiHangDAO;
import poly.edu.dao.NhaCungUngDAO;
import poly.edu.dao.SanPhamDAO;
import poly.edu.dao.SanPhamNCUDAO;
import poly.edu.entity.HoaDonNhap;
import poly.edu.entity.LoaiHang;
import poly.edu.entity.NhaCungUng;
import poly.edu.entity.SanPham;
import poly.edu.entity.SanPhamNCU;
import poly.edu.helper.AuthorHelper;
import poly.edu.helper.BoxHelper;
import poly.edu.helper.DataValidateHelper;
import poly.edu.helper.DateHelper;
import poly.edu.helper.ImageHelper;
import poly.edu.helper.JDBCHelper;

public class SanPhamjIF extends javax.swing.JInternalFrame {
    SanPhamDAO spdao = new SanPhamDAO();
    LoaiHangDAO lhdao = new LoaiHangDAO();
    SanPhamNCUDAO spncuDAO = new SanPhamNCUDAO();
    NhaCungUngDAO ncuDAO = new NhaCungUngDAO();
    HoaDonNhapDAO hdnDAO = new HoaDonNhapDAO();
    int row = -1;
    List<SanPham> ls=new SanPhamDAO().selectAll();
    
    public SanPhamjIF() {
        initComponents();
        init();
        lblRecord.setText(ls.size()+"");
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
        txtNgayNH = new app.bolivia.swing.JCTextField();
        txtGiaNhap = new app.bolivia.swing.JCTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtGiaBan = new app.bolivia.swing.JCTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtGiamGia = new app.bolivia.swing.JCTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSanPham = new rojeru_san.complementos.RSTableMetro();
        btnDELETEsp = new rojerusan.RSMaterialButtonRectangle();
        btnNEWsp = new rojerusan.RSMaterialButtonRectangle();
        btnADDsp = new rojerusan.RSMaterialButtonRectangle();
        btnUPDATEsp = new rojerusan.RSMaterialButtonRectangle();
        jLabel5 = new javax.swing.JLabel();
        txtFINDsp = new app.bolivia.swing.JCTextField();
        jSeparator5 = new javax.swing.JSeparator();
        btnFINDsp = new rojerusan.RSButtonHover();
        btnFirst = new rojerusan.RSButtonHover();
        btnBack = new rojerusan.RSButtonHover();
        btnNext = new rojerusan.RSButtonHover();
        btnLast = new rojerusan.RSButtonHover();
        lblRecord = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cboLoaiSP = new rojerusan.RSComboMetro();
        txtMaSP = new app.bolivia.swing.JCTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtViTri = new app.bolivia.swing.JCTextField();
        jLabel15 = new javax.swing.JLabel();
        txtHanSD = new app.bolivia.swing.JCTextField();
        jLabel16 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        txtSoLuong = new app.bolivia.swing.JCTextField();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtGhiChu = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnChuyenLSP = new rojerusan.RSButtonHover();
        lblHinh = new javax.swing.JLabel();
        cboTenNCU = new rojerusan.RSComboMetro();
        jLabel8 = new javax.swing.JLabel();
        cboDonVi = new rojerusan.RSComboMetro();
        cboTenSPncu = new rojerusan.RSComboMetro();
        btnChuyenChiTietSP = new rojerusan.RSButtonHover();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 51));
        jLabel1.setText("Ngày nhập hàng");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 51));
        jLabel2.setText("Giá nhập");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 51));
        jLabel3.setText("Giá bán");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 51));
        jLabel4.setText("Giảm giá");

        txtNgayNH.setBorder(null);
        txtNgayNH.setText("0000-00-00");
        txtNgayNH.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtNgayNH.setMargin(new java.awt.Insets(10, 6, -5, 10));
        txtNgayNH.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNgayNHFocusLost(evt);
            }
        });

        txtGiaNhap.setBorder(null);
        txtGiaNhap.setText("0.0");
        txtGiaNhap.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtGiaNhap.setMargin(new java.awt.Insets(10, 6, -5, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));

        txtGiaBan.setBorder(null);
        txtGiaBan.setText("0.0");
        txtGiaBan.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtGiaBan.setMargin(new java.awt.Insets(10, 6, -5, 10));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));

        txtGiamGia.setBorder(null);
        txtGiamGia.setText("0");
        txtGiamGia.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtGiamGia.setMargin(new java.awt.Insets(10, 6, -5, 10));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"NCU01", "Nước Cocacola", "Nuoc01", "Thành phát", "01/10/2021", "01/10/2024", "7000", "8500", "100", "10", null, null, null}
            },
            new String [] {
                "Mã SP", "Tên SP", "Loại SP", "Tên NCU", "Ngày Nhập", "Hạn SD", "Giá Nhập", "Giá Bán", "Số Lượng", "Đơn Vị", "Giảm Giá %", "Vị Trí", "Hình"
            }
        ));
        tblSanPham.setColorBackgoundHead(new java.awt.Color(0, 102, 51));
        tblSanPham.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblSanPham.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tblSanPham.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tblSanPham.setColorSelBackgound(new java.awt.Color(204, 204, 204));
        tblSanPham.setColorSelForeground(new java.awt.Color(0, 0, 0));
        tblSanPham.setFillsViewportHeight(true);
        tblSanPham.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        tblSanPham.setFuenteFilas(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        tblSanPham.setFuenteFilasSelect(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        tblSanPham.setFuenteHead(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        tblSanPham.setGridColor(new java.awt.Color(0, 102, 51));
        tblSanPham.setGrosorBordeFilas(0);
        tblSanPham.setGrosorBordeHead(0);
        tblSanPham.setRowHeight(25);
        tblSanPham.setShowGrid(false);
        tblSanPham.setShowHorizontalLines(true);
        tblSanPham.setShowVerticalLines(true);
        tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSanPham);

        btnDELETEsp.setBackground(new java.awt.Color(0, 102, 51));
        btnDELETEsp.setBorder(null);
        btnDELETEsp.setText("Xóa");
        btnDELETEsp.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnDELETEsp.setType(null);
        btnDELETEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDELETEspActionPerformed(evt);
            }
        });

        btnNEWsp.setBackground(new java.awt.Color(0, 102, 51));
        btnNEWsp.setBorder(null);
        btnNEWsp.setText("Mới");
        btnNEWsp.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnNEWsp.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnNEWsp.setType(null);
        btnNEWsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNEWspActionPerformed(evt);
            }
        });

        btnADDsp.setBackground(new java.awt.Color(0, 102, 51));
        btnADDsp.setBorder(null);
        btnADDsp.setText("Thêm");
        btnADDsp.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnADDsp.setType(null);
        btnADDsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADDspActionPerformed(evt);
            }
        });

        btnUPDATEsp.setBackground(new java.awt.Color(0, 102, 51));
        btnUPDATEsp.setBorder(null);
        btnUPDATEsp.setText("Cập nhật");
        btnUPDATEsp.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnUPDATEsp.setType(null);
        btnUPDATEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUPDATEspActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 51));
        jLabel5.setText("Tìm kiếm: ");

        txtFINDsp.setBorder(null);
        txtFINDsp.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        txtFINDsp.setMargin(new java.awt.Insets(10, 6, -5, 10));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        btnFINDsp.setBackground(new java.awt.Color(255, 255, 255));
        btnFINDsp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/TimKiem.png"))); // NOI18N
        btnFINDsp.setColorHover(new java.awt.Color(204, 204, 204));
        btnFINDsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFINDspActionPerformed(evt);
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
        jLabel7.setText("Loại sản phẩm");

        cboLoaiSP.setColorArrow(new java.awt.Color(0, 102, 51));
        cboLoaiSP.setColorBorde(new java.awt.Color(0, 102, 51));
        cboLoaiSP.setColorFondo(new java.awt.Color(0, 102, 51));
        cboLoaiSP.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        cboLoaiSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLoaiSPActionPerformed(evt);
            }
        });

        txtMaSP.setBorder(null);
        txtMaSP.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtMaSP.setMargin(new java.awt.Insets(10, 6, -5, 10));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 51));
        jLabel9.setText("Mã sản phẩm");

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 51));
        jLabel10.setText("Tên sản phẩm");

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 51));
        jLabel11.setText("Đơn vị tính");

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 51));
        jLabel14.setText("Số lượng");

        txtViTri.setBorder(null);
        txtViTri.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtViTri.setMargin(new java.awt.Insets(10, 6, -5, 10));

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 51));
        jLabel15.setText("Vị trí");

        txtHanSD.setBorder(null);
        txtHanSD.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtHanSD.setMargin(new java.awt.Insets(10, 6, -5, 10));

        jLabel16.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 102, 51));
        jLabel16.setText("Hạn sử dụng");

        jSeparator9.setBackground(new java.awt.Color(0, 0, 0));

        jSeparator12.setBackground(new java.awt.Color(0, 0, 0));

        jSeparator13.setBackground(new java.awt.Color(0, 0, 0));

        txtSoLuong.setBorder(null);
        txtSoLuong.setText("0");
        txtSoLuong.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtSoLuong.setMargin(new java.awt.Insets(10, 6, -5, 10));

        jLabel18.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 102, 51));
        jLabel18.setText("Mô tả");

        txtGhiChu.setColumns(20);
        txtGhiChu.setRows(3);
        jScrollPane2.setViewportView(txtGhiChu);

        jLabel17.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 102, 51));
        jLabel17.setText("VNĐ");

        jLabel19.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 102, 51));
        jLabel19.setText("VNĐ");

        jLabel20.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 102, 51));
        jLabel20.setText("%");

        btnChuyenLSP.setBackground(new java.awt.Color(0, 102, 51));
        btnChuyenLSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/ChuyenTabSPUCN.png"))); // NOI18N
        btnChuyenLSP.setText("Loại sản phẩm");
        btnChuyenLSP.setColorHover(new java.awt.Color(0, 155, 76));
        btnChuyenLSP.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnChuyenLSP.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnChuyenLSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuyenLSPActionPerformed(evt);
            }
        });

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

        cboTenNCU.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        cboTenNCU.setColorArrow(new java.awt.Color(0, 102, 51));
        cboTenNCU.setColorBorde(new java.awt.Color(0, 102, 51));
        cboTenNCU.setColorFondo(new java.awt.Color(0, 102, 51));
        cboTenNCU.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        cboTenNCU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTenNCUActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 51));
        jLabel8.setText("Tên nhà cung ứng");

        cboDonVi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Chọn đơn vị tính", "Kg", "Lon", "Thùng", "Con", "Cái", "Chai", "Hộp", "" }));
        cboDonVi.setColorArrow(new java.awt.Color(0, 102, 51));
        cboDonVi.setColorBorde(new java.awt.Color(0, 102, 51));
        cboDonVi.setColorFondo(new java.awt.Color(0, 102, 51));
        cboDonVi.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N

        cboTenSPncu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        cboTenSPncu.setColorArrow(new java.awt.Color(0, 102, 51));
        cboTenSPncu.setColorBorde(new java.awt.Color(0, 102, 51));
        cboTenSPncu.setColorFondo(new java.awt.Color(0, 102, 51));
        cboTenSPncu.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        cboTenSPncu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cboTenSPncuFocusLost(evt);
            }
        });

        btnChuyenChiTietSP.setBackground(new java.awt.Color(0, 102, 51));
        btnChuyenChiTietSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/ChuyenTabSPUCN1.png"))); // NOI18N
        btnChuyenChiTietSP.setText("Chi tiết sản phẩm");
        btnChuyenChiTietSP.setColorHover(new java.awt.Color(0, 155, 76));
        btnChuyenChiTietSP.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnChuyenChiTietSP.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnChuyenChiTietSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuyenChiTietSPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(btnADDsp, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(btnUPDATEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(btnDELETEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(btnNEWsp, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnChuyenChiTietSP, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnChuyenLSP, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cboLoaiSP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNgayNH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtMaSP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(txtGiaNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel17))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(txtGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel19))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(txtGiamGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel20)))
                                    .addComponent(jLabel7))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator13)
                                        .addComponent(txtSoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                        .addComponent(jSeparator12)
                                        .addComponent(txtViTri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jSeparator9)
                                        .addComponent(txtHanSD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cboDonVi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cboTenSPncu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cboTenNCU, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel16)
                                                .addComponent(jLabel10)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(0, 0, Short.MAX_VALUE)))
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane2)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jSeparator5)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(txtFINDsp, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(0, 0, 0)
                                                    .addComponent(btnFINDsp, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addComponent(lblHinh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNgayNH, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtGiaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17))
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19))
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20))
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtFINDsp, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnFINDsp, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, 0)
                                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblHinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboTenNCU, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(7, 7, 7)
                        .addComponent(cboTenSPncu, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHanSD, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtViTri, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addGap(9, 9, 9)
                        .addComponent(cboDonVi, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDELETEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNEWsp, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnADDsp, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUPDATEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChuyenLSP, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChuyenChiTietSP, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNext, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
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

    private void btnChuyenLSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuyenLSPActionPerformed
        GreenOrganicJFrame.jPanelDeskop.removeAll();
        LoaiSanPhamjIF loaiSP = new LoaiSanPhamjIF();
        GreenOrganicJFrame.jPanelDeskop.add(loaiSP).setVisible(true);
        GreenOrganicJFrame.lblTieuDe.setText(" PHÂN LOẠI SẢN PHẨM"); 
        GreenOrganicJFrame.lblTieuDe.setFont(new java.awt.Font("Tahoma", 1, 19));
    }//GEN-LAST:event_btnChuyenLSPActionPerformed

    private void lblHinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHinhMouseClicked
        chonAnh();
    }//GEN-LAST:event_lblHinhMouseClicked

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked
        this.row = tblSanPham.getSelectedRow();
        lblRecord.setText(getRecord());
        this.edit();
    }//GEN-LAST:event_tblSanPhamMouseClicked

    private void btnUPDATEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUPDATEspActionPerformed
        update();
    }//GEN-LAST:event_btnUPDATEspActionPerformed

    private void btnDELETEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDELETEspActionPerformed
        delete();
    }//GEN-LAST:event_btnDELETEspActionPerformed

    private void btnNEWspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNEWspActionPerformed
       clearForm();
    }//GEN-LAST:event_btnNEWspActionPerformed

    private void btnFINDspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFINDspActionPerformed
        find();
    }//GEN-LAST:event_btnFINDspActionPerformed

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

    private void btnADDspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADDspActionPerformed
        insert();
    }//GEN-LAST:event_btnADDspActionPerformed

    private void cboLoaiSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLoaiSPActionPerformed
//        chonLoaiHang();
    }//GEN-LAST:event_cboLoaiSPActionPerformed

    private void cboTenNCUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTenNCUActionPerformed
        fillComboBoxSanPhamNCU();
    }//GEN-LAST:event_cboTenNCUActionPerformed

    private void cboTenSPncuFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cboTenSPncuFocusLost
        lostFucuscboTenSP();
    }//GEN-LAST:event_cboTenSPncuFocusLost

    private void txtNgayNHFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNgayNHFocusLost
        lostFucuscboTenSP();
    }//GEN-LAST:event_txtNgayNHFocusLost

    private void btnChuyenChiTietSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuyenChiTietSPActionPerformed
        GreenOrganicJFrame.jPanelDeskop.removeAll();
        ChiTietSPJF chiTietSPJF = new ChiTietSPJF();
        GreenOrganicJFrame.jPanelDeskop.add(chiTietSPJF).setVisible(true);
        GreenOrganicJFrame.lblTieuDe.setText(" CHI TIẾT SẢN PHẨM"); 
        GreenOrganicJFrame.lblTieuDe.setFont(new java.awt.Font("Tahoma", 1, 19));
    }//GEN-LAST:event_btnChuyenChiTietSPActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static rojerusan.RSMaterialButtonRectangle btnADDsp;
    private rojerusan.RSButtonHover btnBack;
    private rojerusan.RSButtonHover btnChuyenChiTietSP;
    private rojerusan.RSButtonHover btnChuyenLSP;
    public static rojerusan.RSMaterialButtonRectangle btnDELETEsp;
    private rojerusan.RSButtonHover btnFINDsp;
    private rojerusan.RSButtonHover btnFirst;
    private rojerusan.RSButtonHover btnLast;
    private rojerusan.RSMaterialButtonRectangle btnNEWsp;
    private rojerusan.RSButtonHover btnNext;
    public static rojerusan.RSMaterialButtonRectangle btnUPDATEsp;
    public static rojerusan.RSComboMetro cboDonVi;
    public static rojerusan.RSComboMetro cboLoaiSP;
    public static rojerusan.RSComboMetro cboTenNCU;
    public static rojerusan.RSComboMetro cboTenSPncu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator9;
    public static javax.swing.JLabel lblHinh;
    private javax.swing.JLabel lblRecord;
    private rojeru_san.complementos.RSTableMetro tblSanPham;
    private app.bolivia.swing.JCTextField txtFINDsp;
    public static javax.swing.JTextArea txtGhiChu;
    public static app.bolivia.swing.JCTextField txtGiaBan;
    public static app.bolivia.swing.JCTextField txtGiaNhap;
    public static app.bolivia.swing.JCTextField txtGiamGia;
    public static app.bolivia.swing.JCTextField txtHanSD;
    public static app.bolivia.swing.JCTextField txtMaSP;
    public static app.bolivia.swing.JCTextField txtNgayNH;
    public static app.bolivia.swing.JCTextField txtSoLuong;
    public static app.bolivia.swing.JCTextField txtViTri;
    // End of variables declaration//GEN-END:variables
    void chonAnh() {
        JFileChooser chooser = new JFileChooser();
        if (chooser.showOpenDialog(this) == JFileChooser.CANCEL_OPTION) {
            return;
        }else{
            File file = chooser.getSelectedFile();
            ImageHelper.save(file);
            ImageIcon icon = ImageHelper.read(file.getName());
            Image img = ImageHelper.resize(icon.getImage(), 193, 199);
            ImageIcon resizedIcon = new ImageIcon(img);
            lblHinh.setIcon(resizedIcon);
            lblHinh.setToolTipText(file.getName());
        }
    }
    
    void fillComboBoxNCU() {
        try {
            String sql = "select * from NHACUNGUNG";
            try (
                    Connection con = JDBCHelper.openConnection();
                    PreparedStatement pstmt = con.prepareStatement(sql);) {

                ResultSet rs = pstmt.executeQuery();
                cboTenNCU.removeAllItems();
                while (rs.next()) {
                    cboTenNCU.addItem(rs.getString("TenNCU"));
                }
            }
            fillComboBoxSanPhamNCU();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    void fillComboBoxSanPhamNCU() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboTenSPncu.getModel();
        model.removeAllElements();
        String choose = (String) cboTenNCU.getSelectedItem();
        NhaCungUng ncu = ncuDAO.selectByName(choose);
        if (ncu != null) {
            List<SanPhamNCU> list = spncuDAO.selectByNhaCungUng(ncu.getMaNCU());
            for (SanPhamNCU sp : list) {
                cboTenSPncu.addItem(sp.getTenSP());
            }
        }
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
    void init() {
        txtNgayNH.setEditable(false);
        txtHanSD.setEditable(false);
        txtGiaNhap.setEditable(false);
        txtSoLuong.setEditable(false);
        fillComboBoxTenLH();
        fillComboBoxNCU();
        this.row = -1;
        this.fillTable();
        this.updateStatus();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
    }
    
    void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblSanPham.getModel();
        model.setRowCount(0);
        try {
                List<SanPham> list = spdao.selectAll();
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
                    sp.getHinh(),
                    
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
            BoxHelper.showError(this, "Lỗi truy vấn dữ liệu!");
        }  
    }
    
    void fillTableByName() {
        DefaultTableModel model = (DefaultTableModel) tblSanPham.getModel();
        model.setRowCount(0);
        try {
            String key = txtFINDsp.getText();
            List<SanPham> list = spdao.selectByKetword(key);
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
                    sp.getHinh(),
                    
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            BoxHelper.showError(this, "Lỗi truy vấn dữ liệu!");
        }  
    }
    
    
    void setForm(SanPham sp) {
        if (sp == null) {
            cboLoaiSP.setSelectedIndex(0);
            txtMaSP.setText("");
            txtNgayNH.setText("0000-00-00");
            cboTenNCU.setSelectedIndex(0);
            txtGhiChu.setText("");
            txtGiaBan.setText("0.0");
            txtGiaNhap.setText("0.0");
            txtGiamGia.setText("0");
            txtHanSD.setText("");
            cboTenSPncu.setSelectedIndex(0);
            txtViTri.setText("");
            txtSoLuong.setText("0");
            cboDonVi.setSelectedIndex(0);
            lblHinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/KichVao.png")));
            lblHinh.setToolTipText(null);
        } else {
            cboLoaiSP.setSelectedItem(sp.getTenLH());
            cboDonVi.setSelectedItem(sp.getDonVi());
            txtMaSP.setText(sp.getMaSP());
            txtNgayNH.setText(sp.getNgayNhap().toString());
            cboTenNCU.setSelectedItem(sp.getTenNCU());
            txtGhiChu.setText(sp.getGhiChu());
            txtGiaBan.setText(sp.getGiaBan() + "");
            txtGiaNhap.setText(sp.getGiaNhap() + "");
            txtGiamGia.setText(sp.getGiamGia() + "");
            txtHanSD.setText(sp.gethSD().toString());
            cboTenSPncu.setSelectedItem(sp.getTenSP());
            txtViTri.setText(sp.getViTri());
            txtSoLuong.setText(sp.getSoLuong() + "");
            lblHinh.setToolTipText(sp.getHinh());
            ImageIcon icon = ImageHelper.read(sp.getHinh());
            Image img = ImageHelper.resize(icon.getImage(), 193, 199);
            lblHinh.setIcon(new ImageIcon(img));
        }
    }
    SanPham getForm() {
        SanPham sp = new SanPham();
        String loaih = (String) cboLoaiSP.getSelectedItem();
        LoaiHang lh =  lhdao.selectByIDToName(loaih);
        sp.setMaLH(lh.getMaLoai());
        sp.setDonVi((String) cboDonVi.getSelectedItem());
        sp.setMaSP(txtMaSP.getText());
        sp.setTenLH((String) cboLoaiSP.getSelectedItem());
        sp.setTenSP((String) cboTenSPncu.getSelectedItem());
        sp.setTenNCU((String) cboTenNCU.getSelectedItem());
        sp.setGiaNhap(Double.parseDouble(txtGiaNhap.getText()));
        sp.setGiaBan(Double.parseDouble(txtGiaBan.getText()));
        sp.setGiamGia(Integer.parseInt(txtGiamGia.getText()));
        sp.setSoLuong(Integer.parseInt(txtSoLuong.getText()));
        sp.setNgayNhap(DateHelper.toDate(txtNgayNH.getText()));
        sp.sethSD(DateHelper.toDate(txtHanSD.getText()));
        sp.setGhiChu(txtGhiChu.getText());
        sp.setViTri(txtViTri.getText());
        sp.setHinh(lblHinh.getToolTipText());
        ImageIcon icon = ImageHelper.read(sp.getHinh());
        Image img = ImageHelper.resize(icon.getImage(), 193, 199);
        lblHinh.setIcon(new ImageIcon(img));
        
        return sp;
    }
    
    void clearForm() {
        SanPham sp = new SanPham();
        sp = null;
        this.setForm(sp);
        row = -1;
        lblRecord.setText("0");
        tblSanPham.clearSelection();
        txtMaSP.setBackground(Color.WHITE);
        txtViTri.setBackground(Color.WHITE);
        updateStatus();
     }
    
    void edit() {
        row = tblSanPham.getSelectedRow();
        String maSP = (String) tblSanPham.getValueAt(row, 0);
        SanPham sp = spdao.selectByID(maSP);
        this.setForm(sp);
        this.updateStatus();
     }
    
    void insert() {
         if (validDate().length() > 0) {
            BoxHelper.showError(this, validDate().toString());
            return;
         }if (DataValidateHelper.checkChenhLechGia(txtGiaNhap, txtGiaBan) == false) {
            BoxHelper.showError(this, "Giá bán phải lớn hơn giá nhập!");
            return;
        }
         else{
             SanPham listsp = spdao.selectByNameSP((String) cboTenSPncu.getSelectedItem());
              if (listsp != null) {
                  BoxHelper.alert(this, "Sản phẩm đã tồn tại!");
                  return;
            }
             SanPham sp = getForm();
             try {
                spdao.insert(sp);
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
        }if (DataValidateHelper.checkChenhLechGia(txtGiaNhap, txtGiaBan) == false) {
            BoxHelper.showError(this, "Giá bán phải lớn hơn giá nhập!");
            return;
        } 
        else {
            if (BoxHelper.confirm(this, "Bạn có muốn lưu thay đổi?")) {
                SanPham sp = getForm();
                try {
                    spdao.update(sp);
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
        String maSP = txtMaSP.getText();
        if (!AuthorHelper.isManager()) {
            BoxHelper.alert(this, "Bạn không có quyền xóa sản phẩm");
        }else{
            if (BoxHelper.confirm(this, "Bạn thực sự muốn xóa sản phẩm này")) {
                try {
                    spdao.delete(maSP);
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
        if (txtFINDsp.getText().equals("")) {
            BoxHelper.alert(this, "Tên sản phẩm không tồn tại");
            fillTable();
            return;
        }
        SanPham sp = spdao.selectByName(txtFINDsp.getText());
        if (sp != null) {
            fillTableByName();
            setForm(sp);
//            this.row = findCurrentByAll(lh.getMaLoai());
//            tblLoaiHang.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
            this.row = tblSanPham.getRowCount();
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
        tblSanPham.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
        lblRecord.setText(this.getRecord());
        this.edit();
    }
    void last() {
        this.row = tblSanPham.getRowCount() - 1;
        tblSanPham.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
        lblRecord.setText(this.getRecord());
        this.edit();
    }
    void next() {
        if (this.row < tblSanPham.getRowCount() - 1) {
            this.row++;
            tblSanPham.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
            lblRecord.setText(this.getRecord());
            this.edit();
        }else{
            this.row = 0;
            tblSanPham.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
            lblRecord.setText(this.getRecord());
            this.edit();
        }
    }
    void back() {
        if (this.row > 0) {
            this.row--;
            tblSanPham.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
            lblRecord.setText(this.getRecord());
            this.edit();
        }else{
            this.row = tblSanPham.getRowCount() - 1;
            tblSanPham.setRowSelectionInterval(getCurrentLoaiHangIndex(), getCurrentLoaiHangIndex());
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
        txtMaSP.setEditable(!edit);
        btnADDsp.setEnabled(!edit);
        btnDELETEsp.setEnabled(edit);
        btnUPDATEsp.setEnabled(edit);
    }
     
     void lostFucuscboTenSP() {
        String tenSP = String.valueOf(cboTenSPncu.getSelectedItem());
        SanPhamNCU spNCU = spncuDAO.selectByName(tenSP);
        if (spNCU != null) {
            txtHanSD.setText(spNCU.getHanSuDung().toString());
            txtGiaNhap.setText(spNCU.getGia()+ "");
        } else {
            txtHanSD.setText("");
            txtGiaNhap.setText("");
        }
    }
     
     void lostFucuscboMaSP() {
        String maSP = txtMaSP.getText();
        HoaDonNhap hdn = (HoaDonNhap) hdnDAO.selectByMaSP(maSP);
        if (hdn != null) {
            txtNgayNH.setText(hdn.getNgayNhap().toString());
        } else {
            txtNgayNH.setText("");
        }
    }
     
     StringBuilder validDate() {
        StringBuilder sb = new StringBuilder();
        DataValidateHelper.validateEmpty(txtMaSP, sb, "Mã sản phẩm không được để trống!");
        DataValidateHelper.validateEmpty(txtViTri, sb, "Tên vị trí không được để trống!");
        DataValidateHelper.checkNumber(txtGiaBan, sb, "Giá bán không hợp lệ");
        DataValidateHelper.checkNumber(txtGiamGia, sb, "Giảm giá không hợp lệ");
        DataValidateHelper.validateEmptyForLabel(lblHinh, sb, "Hình không được để trống!");
       
        return sb;
    }
}
