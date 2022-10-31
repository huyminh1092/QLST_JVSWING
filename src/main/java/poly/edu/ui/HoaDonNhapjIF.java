package poly.edu.ui;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import poly.edu.dao.HDCTNhapDAO;
import poly.edu.dao.HoaDonNhapDAO;
import poly.edu.dao.NhaCungUngDAO;
import poly.edu.dao.SanPhamDAO;
import poly.edu.dao.SanPhamNCUDAO;
import poly.edu.entity.HoaDonChiTietNhap;
import poly.edu.entity.HoaDonNhap;
import poly.edu.entity.NhaCungUng;
import poly.edu.entity.SanPham;
import poly.edu.entity.SanPhamNCU;
import poly.edu.helper.BoxHelper;
import poly.edu.helper.DataValidateHelper;
import poly.edu.helper.DateHelper;
import poly.edu.helper.JDBCHelper;
import static poly.edu.ui.DSHoaDonNhapjIF.tblDSHDN;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import java.io.File;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.borders.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.property.VerticalAlignment;
import java.awt.Color;
import java.awt.Desktop;
import java.io.IOException;
import poly.edu.dao.NhanVienDAO;
import poly.edu.entity.NhanVien;
import poly.edu.helper.AuthorHelper;

public class HoaDonNhapjIF extends javax.swing.JInternalFrame {
    
    SanPhamNCUDAO spncuDAO = new SanPhamNCUDAO();
    NhaCungUngDAO ncuDAO = new NhaCungUngDAO();
    SanPhamDAO spDAO = new SanPhamDAO();
    HoaDonNhapDAO hdNhapDAO = new HoaDonNhapDAO();
    HDCTNhapDAO hdctnhapDAO = new HDCTNhapDAO();
    int row = -1;

    public HoaDonNhapjIF() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSanPhamNhap = new rojeru_san.complementos.RSTableMetro();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMaHDnhap = new app.bolivia.swing.JCTextField();
        jSeparator2 = new javax.swing.JSeparator();
        cboTenNCU = new rojerusan.RSComboMetro();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMaNV = new app.bolivia.swing.JCTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtNgayNhap = new app.bolivia.swing.JCTextField();
        jSeparator4 = new javax.swing.JSeparator();
        btnDELETEhdn = new rojerusan.RSMaterialButtonRectangle();
        btnADDhdn = new rojerusan.RSMaterialButtonRectangle();
        btnUPDATEhdn = new rojerusan.RSMaterialButtonRectangle();
        btnNEWhdn = new rojerusan.RSMaterialButtonRectangle();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMaSPnhap = new app.bolivia.swing.JCTextField();
        cboTenSPnhap = new rojerusan.RSComboMetro();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        txtGiaNhap = new app.bolivia.swing.JCTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtSoLuongNhap = new app.bolivia.swing.JCTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        txtThanhTien = new app.bolivia.swing.JCTextField();
        jLabel15 = new javax.swing.JLabel();
        btnADDspNhap = new rojerusan.RSMaterialButtonRectangle();
        btnUPDATEspNhap = new rojerusan.RSMaterialButtonRectangle();
        btnDELETEspNhap = new rojerusan.RSMaterialButtonRectangle();
        btnNEWspNhap = new rojerusan.RSMaterialButtonRectangle();
        btnChuyenDSHDNhap = new rojerusan.RSButtonHover();
        jLabel17 = new javax.swing.JLabel();
        cboDonVi = new rojerusan.RSComboMetro();
        jLabel13 = new javax.swing.JLabel();
        btnInHDnhap = new rojerusan.RSMaterialButtonRectangle();
        jSeparator10 = new javax.swing.JSeparator();
        txtTongTien = new app.bolivia.swing.JCTextField();
        jLabel16 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tblSanPhamNhap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã HDCT", "Mã HĐN", "Mã SPN", "Tên sản phẩm", "Số lượng", "Giá nhập", "Đơn vị tính", "Thành tiền"
            }
        ));
        tblSanPhamNhap.setColorBackgoundHead(new java.awt.Color(0, 102, 51));
        tblSanPhamNhap.setColorBordeFilas(new java.awt.Color(0, 102, 51));
        tblSanPhamNhap.setColorBordeHead(new java.awt.Color(0, 102, 51));
        tblSanPhamNhap.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblSanPhamNhap.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tblSanPhamNhap.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tblSanPhamNhap.setColorSelBackgound(new java.awt.Color(204, 204, 204));
        tblSanPhamNhap.setColorSelForeground(new java.awt.Color(0, 0, 0));
        tblSanPhamNhap.setFillsViewportHeight(true);
        tblSanPhamNhap.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        tblSanPhamNhap.setFuenteFilas(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        tblSanPhamNhap.setFuenteFilasSelect(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        tblSanPhamNhap.setFuenteHead(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        tblSanPhamNhap.setGridColor(new java.awt.Color(0, 102, 51));
        tblSanPhamNhap.setGrosorBordeFilas(0);
        tblSanPhamNhap.setGrosorBordeHead(0);
        tblSanPhamNhap.setRowHeight(25);
        tblSanPhamNhap.setShowGrid(false);
        tblSanPhamNhap.setShowHorizontalLines(true);
        tblSanPhamNhap.setShowVerticalLines(true);
        tblSanPhamNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamNhapMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSanPhamNhap);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hóa đơn", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13), new java.awt.Color(0, 102, 51))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 51));
        jLabel2.setText("Mã hóa đơn");

        txtMaHDnhap.setBorder(null);
        txtMaHDnhap.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtMaHDnhap.setMargin(new java.awt.Insets(10, 6, -5, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));

        cboTenNCU.setColorArrow(new java.awt.Color(0, 102, 51));
        cboTenNCU.setColorBorde(new java.awt.Color(0, 102, 51));
        cboTenNCU.setColorFondo(new java.awt.Color(0, 102, 51));
        cboTenNCU.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        cboTenNCU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTenNCUActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 51));
        jLabel1.setText("Tên nhà cung ứng");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 51));
        jLabel3.setText("Mã nhân viên");

        txtMaNV.setBorder(null);
        txtMaNV.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtMaNV.setMargin(new java.awt.Insets(10, 6, -5, 10));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 51));
        jLabel4.setText("Ngày nhập hàng");

        txtNgayNhap.setBorder(null);
        txtNgayNhap.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtNgayNhap.setMargin(new java.awt.Insets(10, 6, -5, 10));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));

        btnDELETEhdn.setBackground(new java.awt.Color(0, 102, 51));
        btnDELETEhdn.setBorder(null);
        btnDELETEhdn.setText("Xóa");
        btnDELETEhdn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnDELETEhdn.setType(null);
        btnDELETEhdn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDELETEhdnActionPerformed(evt);
            }
        });

        btnADDhdn.setBackground(new java.awt.Color(0, 102, 51));
        btnADDhdn.setBorder(null);
        btnADDhdn.setText("Lưu HĐ");
        btnADDhdn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnADDhdn.setType(null);
        btnADDhdn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADDhdnActionPerformed(evt);
            }
        });

        btnUPDATEhdn.setBackground(new java.awt.Color(0, 102, 51));
        btnUPDATEhdn.setBorder(null);
        btnUPDATEhdn.setText("Cập nhật");
        btnUPDATEhdn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnUPDATEhdn.setType(null);
        btnUPDATEhdn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUPDATEhdnActionPerformed(evt);
            }
        });

        btnNEWhdn.setBackground(new java.awt.Color(0, 102, 51));
        btnNEWhdn.setBorder(null);
        btnNEWhdn.setText("Mới");
        btnNEWhdn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnNEWhdn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnNEWhdn.setType(null);
        btnNEWhdn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNEWhdnActionPerformed(evt);
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
                    .addComponent(jLabel1)
                    .addComponent(txtMaHDnhap, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(cboTenNCU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtNgayNhap, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnADDhdn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(btnDELETEhdn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnUPDATEhdn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(btnNEWhdn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNgayNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnADDhdn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDELETEhdn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnUPDATEhdn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnNEWhdn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaHDnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addGap(8, 8, 8)
                        .addComponent(cboTenNCU, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 18, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin sản phẩm", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13), new java.awt.Color(0, 102, 51))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 51));
        jLabel7.setText("Tên sản phẩm");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 51));
        jLabel5.setText("Mã sản phẩm ");

        txtMaSPnhap.setBorder(null);
        txtMaSPnhap.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtMaSPnhap.setMargin(new java.awt.Insets(10, 6, -5, 10));

        cboTenSPnhap.setColorArrow(new java.awt.Color(0, 102, 51));
        cboTenSPnhap.setColorBorde(new java.awt.Color(0, 102, 51));
        cboTenSPnhap.setColorFondo(new java.awt.Color(0, 102, 51));
        cboTenSPnhap.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        cboTenSPnhap.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cboTenSPnhapFocusLost(evt);
            }
        });

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 51));
        jLabel8.setText("Giá nhập hàng");

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));

        txtGiaNhap.setBorder(null);
        txtGiaNhap.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtGiaNhap.setMargin(new java.awt.Insets(10, 6, -5, 10));

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 51));
        jLabel11.setText("VNĐ");

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 51));
        jLabel10.setText("Số lượng");

        txtSoLuongNhap.setBorder(null);
        txtSoLuongNhap.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtSoLuongNhap.setMargin(new java.awt.Insets(10, 6, -5, 10));
        txtSoLuongNhap.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSoLuongNhapFocusLost(evt);
            }
        });

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 51));
        jLabel14.setText("Thành tiền");

        jSeparator9.setBackground(new java.awt.Color(0, 0, 0));

        txtThanhTien.setBorder(null);
        txtThanhTien.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtThanhTien.setMargin(new java.awt.Insets(10, 6, -5, 10));

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 51));
        jLabel15.setText("VNĐ");

        btnADDspNhap.setBackground(new java.awt.Color(0, 102, 51));
        btnADDspNhap.setBorder(null);
        btnADDspNhap.setText("Thêm");
        btnADDspNhap.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnADDspNhap.setType(null);
        btnADDspNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADDspNhapActionPerformed(evt);
            }
        });

        btnUPDATEspNhap.setBackground(new java.awt.Color(0, 102, 51));
        btnUPDATEspNhap.setBorder(null);
        btnUPDATEspNhap.setText("Cập nhật");
        btnUPDATEspNhap.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnUPDATEspNhap.setType(null);
        btnUPDATEspNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUPDATEspNhapActionPerformed(evt);
            }
        });

        btnDELETEspNhap.setBackground(new java.awt.Color(0, 102, 51));
        btnDELETEspNhap.setBorder(null);
        btnDELETEspNhap.setText("Xóa");
        btnDELETEspNhap.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnDELETEspNhap.setType(null);
        btnDELETEspNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDELETEspNhapActionPerformed(evt);
            }
        });

        btnNEWspNhap.setBackground(new java.awt.Color(0, 102, 51));
        btnNEWspNhap.setBorder(null);
        btnNEWspNhap.setText("Mới");
        btnNEWspNhap.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnNEWspNhap.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnNEWspNhap.setType(null);
        btnNEWspNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNEWspNhapActionPerformed(evt);
            }
        });

        btnChuyenDSHDNhap.setBackground(new java.awt.Color(0, 102, 51));
        btnChuyenDSHDNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/ChuyenTabSPUCN.png"))); // NOI18N
        btnChuyenDSHDNhap.setText("DS hóa đơn nhập");
        btnChuyenDSHDNhap.setColorHover(new java.awt.Color(0, 155, 76));
        btnChuyenDSHDNhap.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnChuyenDSHDNhap.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnChuyenDSHDNhap.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnChuyenDSHDNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuyenDSHDNhapActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 102, 51));
        jLabel17.setText("Đơn vị tính");

        cboDonVi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Chọn đơn vị", "Kg", "Lon", "Thùng", "Con", "Cái", "Chai", "Hộp" }));
        cboDonVi.setColorArrow(new java.awt.Color(0, 102, 51));
        cboDonVi.setColorBorde(new java.awt.Color(0, 102, 51));
        cboDonVi.setColorFondo(new java.awt.Color(0, 102, 51));
        cboDonVi.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnADDspNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(btnUPDATEspNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(btnDELETEspNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(btnNEWspNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(btnChuyenDSHDNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtMaSPnhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboTenSPnhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtGiaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cboDonVi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator9)
                            .addComponent(jLabel14)
                            .addComponent(jSeparator8)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15))
                            .addComponent(txtSoLuongNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSoLuongNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGiaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel17)
                        .addGap(8, 8, 8)
                        .addComponent(cboDonVi, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaSPnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addGap(8, 8, 8)
                        .addComponent(cboTenSPnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDELETEspNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNEWspNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnADDspNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUPDATEspNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChuyenDSHDNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 51));
        jLabel13.setText("Tổng tiền:");

        btnInHDnhap.setBackground(new java.awt.Color(0, 102, 51));
        btnInHDnhap.setBorder(null);
        btnInHDnhap.setText("In hóa đơn");
        btnInHDnhap.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnInHDnhap.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnInHDnhap.setType(null);
        btnInHDnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInHDnhapActionPerformed(evt);
            }
        });

        jSeparator10.setBackground(new java.awt.Color(0, 0, 0));

        txtTongTien.setBorder(null);
        txtTongTien.setForeground(new java.awt.Color(51, 51, 255));
        txtTongTien.setText("0.0");
        txtTongTien.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtTongTien.setMargin(new java.awt.Insets(10, 6, -5, 10));

        jLabel16.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 255));
        jLabel16.setText("VNĐ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInHDnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1034, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel16))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnInHDnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
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

    private void btnChuyenDSHDNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuyenDSHDNhapActionPerformed
        DSHoaDonNhapjIF.countFind = 0;
        GreenOrganicJFrame.jPanelDeskop.removeAll();
        DSHoaDonNhapjIF dsHDN = new DSHoaDonNhapjIF();
        GreenOrganicJFrame.jPanelDeskop.add(dsHDN).setVisible(true);
        GreenOrganicJFrame.lblTieuDe.setText(" DANH SÁCH HÓA ĐƠN NHẬP");
        GreenOrganicJFrame.lblTieuDe.setFont(new java.awt.Font("Tahoma", 1, 19));
        
    }//GEN-LAST:event_btnChuyenDSHDNhapActionPerformed

    private void cboTenNCUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTenNCUActionPerformed
        fillComboBoxSanPhamNCU();
    }//GEN-LAST:event_cboTenNCUActionPerformed

    private void btnADDhdnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADDhdnActionPerformed
        insertHD();
    }//GEN-LAST:event_btnADDhdnActionPerformed

    private void btnADDspNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADDspNhapActionPerformed
        insertHDCT();
    }//GEN-LAST:event_btnADDspNhapActionPerformed

    private void tblSanPhamNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamNhapMouseClicked
        this.row = tblSanPhamNhap.getSelectedRow();
        this.edit();
    }//GEN-LAST:event_tblSanPhamNhapMouseClicked

    private void cboTenSPnhapFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cboTenSPnhapFocusLost
        lostFucuscboTenSP();
    }//GEN-LAST:event_cboTenSPnhapFocusLost

    private void txtSoLuongNhapFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSoLuongNhapFocusLost
        lostFocusSoLuong();
    }//GEN-LAST:event_txtSoLuongNhapFocusLost

    private void btnUPDATEspNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUPDATEspNhapActionPerformed
        updateHDCT();
    }//GEN-LAST:event_btnUPDATEspNhapActionPerformed

    private void btnDELETEspNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDELETEspNhapActionPerformed
        deleteHDCT();
    }//GEN-LAST:event_btnDELETEspNhapActionPerformed

    private void btnUPDATEhdnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUPDATEhdnActionPerformed
        updateHD();
    }//GEN-LAST:event_btnUPDATEhdnActionPerformed

    private void btnDELETEhdnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDELETEhdnActionPerformed
        deleteHD();
    }//GEN-LAST:event_btnDELETEhdnActionPerformed

    private void btnNEWhdnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNEWhdnActionPerformed
        clearFormHDN();
    }//GEN-LAST:event_btnNEWhdnActionPerformed

    private void btnNEWspNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNEWspNhapActionPerformed
        clearFormHDCTN();
    }//GEN-LAST:event_btnNEWspNhapActionPerformed

    private void btnInHDnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInHDnhapActionPerformed
        try {

//            PressPrintandSave();
            printHD();
        } catch (IOException ex) {

        }
    }//GEN-LAST:event_btnInHDnhapActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle btnADDhdn;
    private rojerusan.RSMaterialButtonRectangle btnADDspNhap;
    private rojerusan.RSButtonHover btnChuyenDSHDNhap;
    private rojerusan.RSMaterialButtonRectangle btnDELETEhdn;
    private rojerusan.RSMaterialButtonRectangle btnDELETEspNhap;
    private rojerusan.RSMaterialButtonRectangle btnInHDnhap;
    private rojerusan.RSMaterialButtonRectangle btnNEWhdn;
    private rojerusan.RSMaterialButtonRectangle btnNEWspNhap;
    private rojerusan.RSMaterialButtonRectangle btnUPDATEhdn;
    private rojerusan.RSMaterialButtonRectangle btnUPDATEspNhap;
    private rojerusan.RSComboMetro cboDonVi;
    public static rojerusan.RSComboMetro cboTenNCU;
    private rojerusan.RSComboMetro cboTenSPnhap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    public static rojeru_san.complementos.RSTableMetro tblSanPhamNhap;
    private app.bolivia.swing.JCTextField txtGiaNhap;
    public static app.bolivia.swing.JCTextField txtMaHDnhap;
    public static app.bolivia.swing.JCTextField txtMaNV;
    private app.bolivia.swing.JCTextField txtMaSPnhap;
    public static app.bolivia.swing.JCTextField txtNgayNhap;
    private app.bolivia.swing.JCTextField txtSoLuongNhap;
    private app.bolivia.swing.JCTextField txtThanhTien;
    public static app.bolivia.swing.JCTextField txtTongTien;
    // End of variables declaration//GEN-END:variables
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
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboTenSPnhap.getModel();
        model.removeAllElements();
        String choose = (String) cboTenNCU.getSelectedItem();
        NhaCungUng ncu = ncuDAO.selectByName(choose);
        if (ncu != null) {
            List<SanPhamNCU> list = spncuDAO.selectByNhaCungUng(ncu.getMaNCU());
            for (SanPhamNCU sp : list) {
                cboTenSPnhap.addItem(sp.getTenSP());
            }
        }
    }

    void init() {
        txtMaSPnhap.setEditable(false);
        txtThanhTien.setEditable(false);
        txtTongTien.setEditable(false);
        txtMaNV.setEditable(false);
        txtNgayNhap.setEditable(false);
        txtMaNV.setText(AuthorHelper.user.getMaNV());
        txtNgayNhap.setText(java.time.LocalDate.now().toString());
        fillComboBoxNCU();
        this.row = -1;
        if (DSHoaDonNhapjIF.count == 1) {
            selectHoaDon();
        } else {
            DefaultTableModel model = (DefaultTableModel) tblSanPhamNhap.getModel();
            model.setRowCount(0);
        }

        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ci = (BasicInternalFrameUI) this.getUI();
        ci.setNorthPane(null);
    }

    public void selectHoaDon() {
        row = tblDSHDN.getSelectedRow();
        String maHD = (String) tblDSHDN.getValueAt(row, 0);

        DefaultTableModel model = (DefaultTableModel) tblSanPhamNhap.getModel();
        model.setRowCount(0);
        try {
            List<HoaDonChiTietNhap> list = hdctnhapDAO.selectByMaHD(maHD);
            for (HoaDonChiTietNhap sp : list) {
                Object[] row = {
                    sp.getMaHDCTnhap(),
                    sp.getMaHDNnhap(),
                    sp.getMaSPnhap(),
                    sp.getTenSPnhap(),
                    sp.getSoLuong(),
                    sp.getGiaNhap(),
                    sp.getDonViTinh(),
                    sp.thanhTien()

                };
                model.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
            BoxHelper.showError(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    void fillTableSanPhamNhap() {
        DefaultTableModel model = (DefaultTableModel) tblSanPhamNhap.getModel();
        model.setRowCount(0);
        try {
            String maHD = txtMaHDnhap.getText();
            List<HoaDonChiTietNhap> list = hdctnhapDAO.selectByMaHD(maHD);
            for (HoaDonChiTietNhap sp : list) {
                Object[] row = {
                    sp.getMaHDCTnhap(),
                    sp.getMaHDNnhap(),
                    sp.getMaSPnhap(),
                    sp.getTenSPnhap(),
                    sp.getSoLuong(),
                    sp.getGiaNhap(),
                    sp.getDonViTinh(),
                    sp.thanhTien()

                };
                model.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
            BoxHelper.showError(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    void fillTableHoaDonNhap() {
        DefaultTableModel model = (DefaultTableModel) tblDSHDN.getModel();
        model.setRowCount(0);
        try {
            List<HoaDonNhap> list = hdNhapDAO.selectAllHaveTotal();
            for (int i = 0; i < list.size(); i++) {
                HoaDonNhap hdn = list.get(i);
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

    void setFormHDN(HoaDonNhap hdn) {
        if (hdn == null) {
            txtMaHDnhap.setText("");
            txtMaNV.setText(AuthorHelper.user.getMaNV());
            txtNgayNhap.setText(java.time.LocalDate.now().toString());
            cboTenNCU.setSelectedIndex(0);
            txtTongTien.setText("0.0");
        } else {
            String tenNCU = hdn.getMaNCU();
            NhaCungUng ncu = ncuDAO.selectByID(tenNCU);
            cboTenNCU.setSelectedItem(ncu.getTenNCU());
            txtMaNV.setText(hdn.getMaNV());
            txtNgayNhap.setText(hdn.getNgayNhap().toString());
            txtMaHDnhap.setText(hdn.getMaHDNhap());
        }
    }

    void setFormHDCTnhap(HoaDonChiTietNhap hdctn) {
        if (hdctn == null) {
            txtMaSPnhap.setText("");
            txtGiaNhap.setText("");
            txtSoLuongNhap.setText("");
            txtThanhTien.setText("");
            cboTenSPnhap.setSelectedIndex(0);
            cboDonVi.setSelectedIndex(0);
        } else {
            txtMaSPnhap.setText(hdctn.getMaSPnhap());
            txtGiaNhap.setText(hdctn.getGiaNhap() + "");
            txtSoLuongNhap.setText(hdctn.getSoLuong() + "");
            txtThanhTien.setText(hdctn.thanhTien() + "");
            cboTenSPnhap.setSelectedItem(hdctn.getTenSPnhap());
            cboDonVi.setSelectedItem(hdctn.getDonViTinh());
        }
    }

    HoaDonNhap getFormHDN() {
        HoaDonNhap hdn = new HoaDonNhap();
        String tenNCU = (String) cboTenNCU.getSelectedItem();
        NhaCungUng ncu = ncuDAO.selectByName(tenNCU);
        hdn.setMaHDNhap(txtMaHDnhap.getText());
        hdn.setMaNCU(ncu.getMaNCU());
        hdn.setMaNV(txtMaNV.getText());
        hdn.setNgayNhap(DateHelper.toDate(txtNgayNhap.getText()));
        hdn.setTongTienNhap(Double.parseDouble(txtTongTien.getText()));
        hdn.setTrangThai(false);

        return hdn;
    }

    HoaDonNhap getFormUpdateHDN() {
        HoaDonNhap hdn = new HoaDonNhap();
        String tenNCU = (String) cboTenNCU.getSelectedItem();
        NhaCungUng ncu = ncuDAO.selectByName(tenNCU);
        hdn.setMaHDNhap(txtMaHDnhap.getText());
        hdn.setMaNCU(ncu.getMaNCU());
        hdn.setMaNV(txtMaNV.getText());
        hdn.setNgayNhap(DateHelper.toDate(txtNgayNhap.getText()));
        hdn.setTongTienNhap(Double.parseDouble(txtTongTien.getText()));
        hdn.setTrangThai(true);

        return hdn;
    }

    HoaDonChiTietNhap getFormHDCTN() {
        HoaDonChiTietNhap hdnctn = new HoaDonChiTietNhap();
        hdnctn.setMaHDNnhap(txtMaHDnhap.getText());
        hdnctn.setMaSPnhap(txtMaSPnhap.getText());
        hdnctn.setGiaNhap(Double.parseDouble(txtGiaNhap.getText()));
        hdnctn.setSoLuong(Integer.parseInt(txtSoLuongNhap.getText()));
        String e = String.valueOf(cboTenSPnhap.getSelectedItem());
        hdnctn.setDonViTinh((String) cboDonVi.getSelectedItem());
        hdnctn.setTenSPnhap(e);

        return hdnctn;
    }

    HoaDonChiTietNhap getFormUpdateHDCTN() {
        HoaDonChiTietNhap hdnctn = new HoaDonChiTietNhap();
        row = tblSanPhamNhap.getSelectedRow();
        int maHDCT = (int) tblSanPhamNhap.getValueAt(row, 0);
        hdnctn.setMaHDCTnhap(maHDCT);
        hdnctn.setMaHDNnhap(txtMaHDnhap.getText());
        hdnctn.setMaSPnhap(txtMaSPnhap.getText());
        hdnctn.setGiaNhap(Double.parseDouble(txtGiaNhap.getText()));
        hdnctn.setSoLuong(Integer.parseInt(txtSoLuongNhap.getText()));
        String e = String.valueOf(cboTenSPnhap.getSelectedItem());
        hdnctn.setDonViTinh((String) cboDonVi.getSelectedItem());
        hdnctn.setTenSPnhap(e);

        return hdnctn;
    }

    void clearFormHDN() {
        HoaDonNhap hdn = new HoaDonNhap();
        HoaDonChiTietNhap hdctn = new HoaDonChiTietNhap();
        hdn = null;
        hdctn = null;
        this.setFormHDN(hdn);
        this.setFormHDCTnhap(hdctn);
        row = -1;
        tblSanPhamNhap.clearSelection();
        DSHoaDonNhapjIF.count = 0;
        DefaultTableModel model = (DefaultTableModel) tblSanPhamNhap.getModel();
        model.setRowCount(0);
        cboTenNCU.setEnabled(true);
        txtMaHDnhap.setBackground(Color.WHITE);
        txtMaSPnhap.setBackground(Color.WHITE);
        txtSoLuongNhap.setBackground(Color.WHITE);
//        updateStatus();
    }

    void clearFormHDCTN() {
        HoaDonChiTietNhap hdctn = new HoaDonChiTietNhap();
        hdctn = null;
        this.setFormHDCTnhap(hdctn);
        row = -1;
        tblSanPhamNhap.clearSelection();
        txtMaSPnhap.setBackground(Color.WHITE);
        txtSoLuongNhap.setBackground(Color.WHITE);
        DSHoaDonNhapjIF.count = 0;
//        updateStatus();
    }

    void edit() {
        row = tblSanPhamNhap.getSelectedRow();
        int maHDCT = (int) tblSanPhamNhap.getValueAt(row, 0);
        HoaDonChiTietNhap hdctn = hdctnhapDAO.selectByID(maHDCT);
        this.setFormHDCTnhap(hdctn);
//        this.updateStatus();
    }

    void insertHD() {
        if (validDateHDN().length() > 0) {
            BoxHelper.showError(this, validDateHDN().toString());
            return;
        } else {
            HoaDonNhap hdn = getFormHDN();
            try {
                hdNhapDAO.insert(hdn);
                fillTableHoaDonNhapChuaTK();
//                this.clearFormHDN();
                BoxHelper.alert(this, "Thêm mới thành công");
            } catch (Exception e) {
                e.printStackTrace();
                BoxHelper.alert(this, "Thêm mới thất bại");
            }
        }
    }

    void updateHD() {
        if (validDateHDN().length() > 0) {
            BoxHelper.showError(this, validDateHDCT().toString());
            return;
        } else {
            if (DataValidateHelper.CheckNgayUpdateHD(txtNgayNhap) == false) {
                BoxHelper.alert(this, "Bạn chỉ có thể cập nhật hóa đơn trong ngày");
            } else if (BoxHelper.confirm(this, "Bạn có muốn lưu thay đổi")) {
                HoaDonNhap hdn = getFormUpdateHDN();
                try {
                    hdNhapDAO.update(hdn);
                    fillTableHoaDonNhap();
                    this.clearFormHDN();
                    BoxHelper.alert(this, "Cập nhật thành công");
                } catch (Exception e) {
                    e.printStackTrace();
                    BoxHelper.alert(this, "Cập nhật thất bại");
                }
            }
        }
    }
    
    void deleteHD() {
        String maHD = txtMaHDnhap.getText();
        if (!AuthorHelper.isManager()) {
            BoxHelper.alert(this, "Bạn không có quyền xóa hóa đơn!");
        } else {
            if (maHD.equals("")) {
                BoxHelper.alert(this, "Mã hóa đơn không được để trống!");
            } else if (DataValidateHelper.CheckNgayXoaHD(txtNgayNhap) == false) {
                BoxHelper.alert(this, "Bạn không thể xóa hóa đơn có ngày nhập dưới một năm!");
            } else {
                if (BoxHelper.confirm(this, "Bạn thực sự muốn xóa hóa đơn này?")) {
                    try {
                        hdNhapDAO.delete(maHD);
                        this.clearFormHDN();
                        BoxHelper.alert(this, "Xóa thành công");
                    } catch (Exception e) {
                        BoxHelper.alert(this, "Xóa thất bại");
                    }
                }
            }
        }
    }

    void insertHDCT() {
        if (DataValidateHelper.CheckNgayUpdateHD(txtNgayNhap) == false) {
            BoxHelper.alert(this, "Bạn chỉ có thể chỉnh sửa hóa đơn trong ngày");
            return;
        } 
        else if (validDateHDCT().length() > 0) {
            BoxHelper.showError(this, validDateHDCT().toString());
            return;
        }
        else {
            HoaDonChiTietNhap listhdctn = hdctnhapDAO.selectByMaSpAndMaHD(txtMaSPnhap.getText(), txtMaHDnhap.getText());
            if (listhdctn != null) {
                BoxHelper.alert(this, "Sản phẩm đã tồn tại");
                return;
            }
            HoaDonChiTietNhap hdctn = getFormHDCTN();
            try {
                hdctnhapDAO.insert(hdctn);
                fillTableSanPhamNhap();
                tinhTongTien();
                this.clearFormHDCTN();
                BoxHelper.alert(this, "Thêm mới thành công");
            } catch (Exception e) {
                e.printStackTrace();
                BoxHelper.alert(this, "Thêm mới thất bại");
            }
        }
    }

    void updateHDCT() {
        if (DataValidateHelper.CheckNgayUpdateHD(txtNgayNhap) == false) {
            BoxHelper.alert(this, "Bạn chỉ có thể chỉnh sửa hóa đơn trong ngày");
            return;
        } 
        else if (validDateHDCT().length() > 0) {
            BoxHelper.showError(this, validDateHDCT().toString());
            return;
        } 
        else {
            HoaDonChiTietNhap hdctn = getFormUpdateHDCTN();
            try {
                hdctnhapDAO.update(hdctn);
                fillTableSanPhamNhap();
                tinhTongTien();
                this.clearFormHDCTN();
                BoxHelper.alert(this, "Cập nhật thành công");
            } catch (Exception e) {
                e.printStackTrace();
                BoxHelper.alert(this, "Cập nhật thất bại");
            }
        }
    }

    void deleteHDCT() {
        if (DataValidateHelper.CheckNgayUpdateHD(txtNgayNhap) == false) {
            BoxHelper.alert(this, "Bạn chỉ có thể chỉnh sửa hóa đơn trong ngày");
            return;
        }
        row = tblSanPhamNhap.getSelectedRow();
        int maHDCT = (int) tblSanPhamNhap.getValueAt(row, 0);
        
        if (BoxHelper.confirm(this, "Bạn thực sự muốn xóa sản phẩm này")) {
            try {
                hdctnhapDAO.delete(maHDCT);
                fillTableSanPhamNhap();
                tinhTongTien();
                this.clearFormHDCTN();
                BoxHelper.alert(this, "Xóa thành công");
            } catch (Exception e) {
                e.printStackTrace();
                BoxHelper.alert(this, "Xóa thất bại");
            }
        }
    }

    void tinhTongTien() {
        double tt = 0;
        for (int i = 0; i < tblSanPhamNhap.getRowCount(); i++) {
            double thanhtien = (Double) tblSanPhamNhap.getValueAt(i, 7);
            tt = tt + thanhtien;
        }
        txtTongTien.setText(String.format("%.0f", tt));
    }

    void lostFucuscboTenSP() {
        String tenSP = String.valueOf(cboTenSPnhap.getSelectedItem());
        SanPham sp = new SanPhamDAO().selectByName(tenSP);
        if (sp != null) {
            txtMaSPnhap.setText(sp.getMaSP());
            txtGiaNhap.setText(sp.getGiaNhap() + "");
        } else {
            txtMaSPnhap.setText("");
            txtGiaNhap.setText("");
        }
    }

    void lostFocusSoLuong() {
        try {
            if (txtGiaNhap.getText().equals("") || txtSoLuongNhap.getText().equals("")) {
                txtThanhTien.setText(0 + "");
            } else {
                double x = Double.parseDouble(txtGiaNhap.getText());
                int y = Integer.parseInt(txtSoLuongNhap.getText());
                double thanhTien = x * y;
                txtThanhTien.setText(thanhTien + "");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    StringBuilder validDateHDCT() {
        StringBuilder sb = new StringBuilder();
        DataValidateHelper.validateEmpty(txtMaHDnhap, sb, "Mã hóa đơn không được để trống!");
        DataValidateHelper.validateEmpty(txtMaSPnhap, sb, "Mã sản phẩm không được để trống!");
        DataValidateHelper.validateEmpty(txtSoLuongNhap, sb, "Số lượng không được để trống!");
        DataValidateHelper.checkNumber(txtSoLuongNhap, sb, "Số lượng không hợp lệ!");
        DataValidateHelper.validateComboBox(cboDonVi, sb, "Bạn chưa chọn đơn vị!");

        return sb;
    }

    StringBuilder validDateHDN() {
        StringBuilder sb = new StringBuilder();
        DataValidateHelper.validateEmpty(txtMaHDnhap, sb, "Mã hóa đơn không được để trống!");
        return sb;
    }

    void printHD() throws IOException {
        if (!(txtMaHDnhap.getText().equals("")) && !(txtMaNV.getText().equals(""))
                && !(txtNgayNhap.getText().equals("")) && tblSanPhamNhap.getRowCount() > 0) {

            String path = "Bill/" + txtMaHDnhap.getText().trim() + ".pdf";
            PdfWriter pdfWriter = new PdfWriter(path);
            PdfDocument pdfDocument = new PdfDocument(pdfWriter);
            Document document = new Document(pdfDocument);
            pdfDocument.setDefaultPageSize(PageSize.A4);

            float col = 280f;
            float columnWidth[] = {col, col};
            Table table = new Table(columnWidth);

            table.setBackgroundColor(new DeviceRgb(Color.GRAY));
            table.setFontColor(new DeviceRgb(Color.WHITE));
            table.addCell(new Cell().add(new Paragraph("Import Invoice"))
                    .setTextAlignment(TextAlignment.CENTER)
                    .setVerticalAlignment(VerticalAlignment.MIDDLE)
                    .setFontSize(30f)
                    .setHeight(90f)
                    .setBorder(Border.NO_BORDER)
            );
            table.addCell(new Cell().add(new Paragraph("GreenOrganic\n012365489"))
                    .setTextAlignment(TextAlignment.CENTER)
                    .setVerticalAlignment(VerticalAlignment.MIDDLE)
                    .setFontSize(15f)
                    .setHeight(90f)
                    .setBorder(Border.NO_BORDER)
            ); // Tiêu đề hóa đơn
            float colWith[] = {100, 300, 100, 100};
            Table customerInfor = new Table(colWith);
            customerInfor.addCell(new Cell(0, 4)
                    .add(new Paragraph("Supplier Information"))
                    .setBold()
                    .setBorder(Border.NO_BORDER)
            );

            customerInfor.addCell(new Cell().add(new Paragraph("Supplier Name: ")).setBorder(Border.NO_BORDER));
            customerInfor.addCell(new Cell().add(new Paragraph((String) cboTenNCU.getSelectedItem())).setBorder(Border.NO_BORDER));
            customerInfor.addCell(new Cell().add(new Paragraph("ID Invoice: ")).setBorder(Border.NO_BORDER));
            customerInfor.addCell(new Cell().add(new Paragraph(txtMaHDnhap.getText().trim())).setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.RIGHT));

            customerInfor.addCell(new Cell().add(new Paragraph("Import Date: ")).setBorder(Border.NO_BORDER));
            customerInfor.addCell(new Cell().add(new Paragraph(txtNgayNhap.getText())).setBorder(Border.NO_BORDER));
            customerInfor.addCell(new Cell().add(new Paragraph("ID Employee: ")).setBorder(Border.NO_BORDER));
            NhanVien nv = new NhanVienDAO().selectByID(txtMaNV.getText());
            customerInfor.addCell(new Cell().add(new Paragraph(nv.getHoTen())).setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.RIGHT));

            float itemInforWidth[] = {150, 70, 130, 70, 100, 130};
            Table itemInfor = new Table(itemInforWidth);

            itemInfor.addCell(new Cell().add(new Paragraph("Item"))
                    .setBackgroundColor(new DeviceRgb(Color.GRAY))
                    .setBorder(Border.NO_BORDER)
                    .setFontColor(new DeviceRgb(Color.WHITE))
                    .setBold()
            );
            itemInfor.addCell(new Cell().add(new Paragraph("Quantity"))
                    .setBackgroundColor(new DeviceRgb(Color.GRAY))
                    .setBorder(Border.NO_BORDER)
                    .setFontColor(new DeviceRgb(Color.WHITE))
                    .setBold()
            );
            itemInfor.addCell(new Cell().add(new Paragraph("Price"))
                    .setBackgroundColor(new DeviceRgb(Color.GRAY))
                    .setBorder(Border.NO_BORDER)
                    .setFontColor(new DeviceRgb(Color.WHITE))
                    .setBold()
            );
            itemInfor.addCell(new Cell().add(new Paragraph("Unit"))
                    .setBackgroundColor(new DeviceRgb(Color.GRAY))
                    .setBorder(Border.NO_BORDER)
                    .setFontColor(new DeviceRgb(Color.WHITE))
                    .setBold()
            );
            itemInfor.addCell(new Cell().add(new Paragraph("Discount"))
                    .setBackgroundColor(new DeviceRgb(Color.GRAY))
                    .setBorder(Border.NO_BORDER)
                    .setFontColor(new DeviceRgb(Color.WHITE))
                    .setBold()
            );
            itemInfor.addCell(new Cell().add(new Paragraph("Amount"))
                    .setBackgroundColor(new DeviceRgb(Color.GRAY))
                    .setBorder(Border.NO_BORDER)
                    .setFontColor(new DeviceRgb(Color.WHITE))
                    .setBold()
            );

            for (int i = 0; i < tblSanPhamNhap.getRowCount(); i++) {
                int soLuong = (int) tblSanPhamNhap.getValueAt(i, 4);
                double giaNHap = (double) tblSanPhamNhap.getValueAt(i, 5);
                double thanhTien = (double) tblSanPhamNhap.getValueAt(i, 7);
                itemInfor.addCell(new Cell().add(new Paragraph((String) tblSanPhamNhap.getValueAt(i, 3))));
                itemInfor.addCell(new Cell().add(new Paragraph(String.valueOf(soLuong))));
                itemInfor.addCell(new Cell().add(new Paragraph(String.valueOf(giaNHap))));
                itemInfor.addCell(new Cell().add(new Paragraph((String) tblSanPhamNhap.getValueAt(i, 6))));
                itemInfor.addCell(new Cell().add(new Paragraph("0")));
                itemInfor.addCell(new Cell().add(new Paragraph(String.valueOf(thanhTien))));
            }

            itemInfor.addCell(new Cell().add(new Paragraph(""))
                    .setBackgroundColor(new DeviceRgb(Color.GRAY))
                    .setBorder(Border.NO_BORDER)
                    .setHeight(30f)
            );
            itemInfor.addCell(new Cell().add(new Paragraph(""))
                    .setBackgroundColor(new DeviceRgb(Color.GRAY))
                    .setBorder(Border.NO_BORDER)
                    .setHeight(30f)
            );
            itemInfor.addCell(new Cell().add(new Paragraph(""))
                    .setBackgroundColor(new DeviceRgb(Color.GRAY))
                    .setBorder(Border.NO_BORDER)
                    .setHeight(30f)
            );
            itemInfor.addCell(new Cell().add(new Paragraph(""))
                    .setBackgroundColor(new DeviceRgb(Color.GRAY))
                    .setBorder(Border.NO_BORDER)
                    .setHeight(30f)
            );
            itemInfor.addCell(new Cell().add(new Paragraph("Total Amount:"))
                    .setBackgroundColor(new DeviceRgb(Color.GRAY))
                    .setBorder(Border.NO_BORDER)
                    .setFontColor(new DeviceRgb(Color.WHITE))
                    .setTextAlignment(TextAlignment.CENTER)
                    .setVerticalAlignment(VerticalAlignment.MIDDLE)
                    .setHeight(30f)
                    .setBold()
            );
            itemInfor.addCell(new Cell().add(new Paragraph(txtTongTien.getText() + "  VND"))
                    .setBackgroundColor(new DeviceRgb(Color.GRAY))
                    .setBorder(Border.NO_BORDER)
                    .setTextAlignment(TextAlignment.CENTER)
                    .setVerticalAlignment(VerticalAlignment.MIDDLE)
                    .setFontColor(new DeviceRgb(Color.WHITE))
                    .setHeight(20f)
                    .setBold()
            );
            
            float colEnd = 600f;
            float columnEndWidth[] = {colEnd};
            Table tableEnd = new Table(columnEndWidth);

//            table.setBackgroundColor(new DeviceRgb(Color.BLUE));
            tableEnd.setFontColor(new DeviceRgb(Color.BLACK));
            tableEnd.addCell(new Cell().add(new Paragraph("----------GreenOrganic----------"))
                    .setTextAlignment(TextAlignment.CENTER)
                    .setVerticalAlignment(VerticalAlignment.MIDDLE)
                    .setFontSize(20f)
                    .setBorder(Border.NO_BORDER)
            );// footer T

            document.add(table);
            document.add(new Paragraph("\n"));
            document.add(customerInfor);
            document.add(new Paragraph("\n"));
            document.add(itemInfor);
            document.add(new Paragraph("\n"));
            document.add(new Paragraph("\n"));
            document.add(tableEnd);
            document.flush();
            document.close();
            File file = new File(path);
            if (file.exists()) {
                Desktop.getDesktop().open(file);
            }
        }else{
            BoxHelper.alert(this, "Hóa đơn không hợp lệ");
        }

    }

}
