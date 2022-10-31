package poly.edu.ui;

import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.borders.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.property.VerticalAlignment;
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import poly.edu.dao.HDCTBanDAO;
import poly.edu.dao.HoaDonBanDAO;
import poly.edu.dao.KhachHangDAO;
import poly.edu.dao.NhanVienDAO;
import poly.edu.dao.SanPhamDAO;
import poly.edu.entity.HoaDonBan;
import poly.edu.entity.HoaDonChiTietBan;
import poly.edu.entity.KhachHang;
import poly.edu.entity.NhanVien;
import poly.edu.entity.SanPham;
import poly.edu.helper.AuthorHelper;
import poly.edu.helper.BoxHelper;
import poly.edu.helper.DataValidateHelper;
import poly.edu.helper.DateHelper;

public class HoaDonBanjIF extends javax.swing.JInternalFrame {
    static int x=0;
    int count = 0;

    public HoaDonBanjIF() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ci = (BasicInternalFrameUI) this.getUI();
        ci.setNorthPane(null);
        init();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMaKH = new app.bolivia.swing.JCTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtTenKH = new app.bolivia.swing.JCTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtDiemTich = new app.bolivia.swing.JCTextField();
        jSeparator4 = new javax.swing.JSeparator();
        btnDungDiem = new rojerusan.RSMaterialButtonRectangle();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMaHDB = new app.bolivia.swing.JCTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtGiamGia = new app.bolivia.swing.JCTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        txtNgayTao = new app.bolivia.swing.JCTextField();
        jLabel12 = new javax.swing.JLabel();
        txtTongTien = new app.bolivia.swing.JCTextField();
        jLabel16 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtThanhTien = new app.bolivia.swing.JCTextField();
        jLabel18 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        txtMaNV = new app.bolivia.swing.JCTextField();
        jSeparator13 = new javax.swing.JSeparator();
        btnInhoadon = new rojerusan.RSMaterialButtonRectangle();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBangSP = new rojeru_san.complementos.RSTableMetro();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBangSPB = new rojeru_san.complementos.RSTableMetro();
        btnNEWhdb = new rojerusan.RSMaterialButtonRectangle();
        btnADDhdb = new rojerusan.RSMaterialButtonRectangle();
        btnUPDATEhdb = new rojerusan.RSMaterialButtonRectangle();
        DELETEhdb = new rojerusan.RSMaterialButtonRectangle();
        btnADDhtct = new rojerusan.RSButtonHover();
        btnDELETEhdct = new rojerusan.RSButtonHover();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtTimKiem = new app.bolivia.swing.JCTextField();
        jSeparator14 = new javax.swing.JSeparator();
        btnTimKiem = new rojerusan.RSButtonHover();
        jLabel14 = new javax.swing.JLabel();
        btnChuyenDSHDB = new rojerusan.RSButtonHover();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Khách hàng", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13), new java.awt.Color(0, 102, 51))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 51));
        jLabel2.setText("Mã khách hàng");

        txtMaKH.setBorder(null);
        txtMaKH.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtMaKH.setMargin(new java.awt.Insets(10, 6, -5, 10));
        txtMaKH.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMaKHFocusLost(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 51));
        jLabel3.setText("Tên khách hàng");

        txtTenKH.setBorder(null);
        txtTenKH.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtTenKH.setMargin(new java.awt.Insets(10, 6, -5, 10));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 51));
        jLabel4.setText("Điểm đã tích");

        txtDiemTich.setBorder(null);
        txtDiemTich.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtDiemTich.setMargin(new java.awt.Insets(10, 6, -5, 10));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));

        btnDungDiem.setBackground(new java.awt.Color(0, 102, 51));
        btnDungDiem.setBorder(null);
        btnDungDiem.setText("Dùng điểm");
        btnDungDiem.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnDungDiem.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnDungDiem.setType(null);
        btnDungDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDungDiemActionPerformed(evt);
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
                    .addComponent(txtMaKH, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(jSeparator2))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(306, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtDiemTich, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDungDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDiemTich, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnDungDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hóa đơn", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13), new java.awt.Color(0, 102, 51))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 51));
        jLabel7.setText("Tổng cộng tiền");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 51));
        jLabel5.setText("Mã hóa đơn");

        txtMaHDB.setBorder(null);
        txtMaHDB.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtMaHDB.setMargin(new java.awt.Insets(10, 6, -5, 10));
        txtMaHDB.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMaHDBFocusLost(evt);
            }
        });

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 51));
        jLabel8.setText("Ngày tạo");

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 51));
        jLabel9.setText("Giảm giá ");

        txtGiamGia.setBorder(null);
        txtGiamGia.setText("0");
        txtGiamGia.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtGiamGia.setMargin(new java.awt.Insets(10, 6, -5, 10));
        txtGiamGia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtGiamGiaFocusLost(evt);
            }
        });

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));

        txtNgayTao.setBorder(null);
        txtNgayTao.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtNgayTao.setMargin(new java.awt.Insets(10, 6, -5, 10));

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 51));
        jLabel12.setText("%");

        txtTongTien.setBorder(null);
        txtTongTien.setText("0");
        txtTongTien.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtTongTien.setMargin(new java.awt.Insets(10, 6, -5, 10));

        jLabel16.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 102, 51));
        jLabel16.setText("VNĐ");

        jSeparator12.setBackground(new java.awt.Color(0, 0, 0));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 51));
        jLabel13.setText("Mã nhân viên tạo");

        jLabel17.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 102, 51));
        jLabel17.setText("Thành tiền hóa đơn");

        txtThanhTien.setBorder(null);
        txtThanhTien.setForeground(new java.awt.Color(0, 51, 204));
        txtThanhTien.setText("0");
        txtThanhTien.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtThanhTien.setMargin(new java.awt.Insets(10, 6, -5, 10));

        jLabel18.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 51, 204));
        jLabel18.setText("VNĐ");

        jSeparator10.setBackground(new java.awt.Color(0, 0, 0));

        txtMaNV.setBorder(null);
        txtMaNV.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtMaNV.setMargin(new java.awt.Insets(10, 6, -5, 10));

        jSeparator13.setBackground(new java.awt.Color(0, 0, 0));

        btnInhoadon.setBackground(new java.awt.Color(0, 102, 51));
        btnInhoadon.setBorder(null);
        btnInhoadon.setText("In hóa đơn");
        btnInhoadon.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnInhoadon.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnInhoadon.setType(null);
        btnInhoadon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInhoadonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtMaHDB, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgayTao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator7)
                    .addComponent(jSeparator6))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18))
                    .addComponent(txtMaNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator13)
                    .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(btnInhoadon, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(btnInhoadon, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator10))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMaHDB, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator6)
                            .addComponent(jSeparator12))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        tblBangSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SP", "Tên SP", "Loại SP", "HSD", "ĐVT", "Giá bán", "Số lượng", "Giảm giá"
            }
        ));
        tblBangSP.setColorBackgoundHead(new java.awt.Color(0, 102, 51));
        tblBangSP.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblBangSP.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tblBangSP.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tblBangSP.setColorSelBackgound(new java.awt.Color(204, 204, 204));
        tblBangSP.setColorSelForeground(new java.awt.Color(0, 0, 0));
        tblBangSP.setFillsViewportHeight(true);
        tblBangSP.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        tblBangSP.setFuenteFilas(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        tblBangSP.setFuenteFilasSelect(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        tblBangSP.setFuenteHead(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        tblBangSP.setGridColor(new java.awt.Color(0, 102, 51));
        tblBangSP.setGrosorBordeFilas(0);
        tblBangSP.setGrosorBordeHead(0);
        tblBangSP.setRowHeight(20);
        tblBangSP.setShowGrid(false);
        tblBangSP.setShowHorizontalLines(true);
        tblBangSP.setShowVerticalLines(true);
        tblBangSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBangSPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBangSP);

        tblBangSPB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "HDCT", "HDB", "Mã SP", "Tên SP", "ĐVT", "SLượng", "Giá", "Sale", "Total"
            }
        ));
        tblBangSPB.setColorBackgoundHead(new java.awt.Color(0, 102, 51));
        tblBangSPB.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblBangSPB.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tblBangSPB.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tblBangSPB.setColorSelBackgound(new java.awt.Color(204, 204, 204));
        tblBangSPB.setColorSelForeground(new java.awt.Color(0, 0, 0));
        tblBangSPB.setFillsViewportHeight(true);
        tblBangSPB.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        tblBangSPB.setFuenteFilas(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        tblBangSPB.setFuenteFilasSelect(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        tblBangSPB.setFuenteHead(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        tblBangSPB.setGridColor(new java.awt.Color(0, 102, 51));
        tblBangSPB.setGrosorBordeFilas(0);
        tblBangSPB.setGrosorBordeHead(0);
        tblBangSPB.setRowHeight(20);
        tblBangSPB.setShowGrid(false);
        tblBangSPB.setShowHorizontalLines(true);
        tblBangSPB.setShowVerticalLines(true);
        tblBangSPB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBangSPBMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblBangSPB);

        btnNEWhdb.setBackground(new java.awt.Color(0, 102, 51));
        btnNEWhdb.setBorder(null);
        btnNEWhdb.setText("Mới");
        btnNEWhdb.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnNEWhdb.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnNEWhdb.setType(null);
        btnNEWhdb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNEWhdbActionPerformed(evt);
            }
        });

        btnADDhdb.setBackground(new java.awt.Color(0, 102, 51));
        btnADDhdb.setBorder(null);
        btnADDhdb.setText("Lưu");
        btnADDhdb.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnADDhdb.setType(null);
        btnADDhdb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADDhdbActionPerformed(evt);
            }
        });

        btnUPDATEhdb.setBackground(new java.awt.Color(0, 102, 51));
        btnUPDATEhdb.setBorder(null);
        btnUPDATEhdb.setText("Cập nhật");
        btnUPDATEhdb.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnUPDATEhdb.setType(null);
        btnUPDATEhdb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUPDATEhdbActionPerformed(evt);
            }
        });

        DELETEhdb.setBackground(new java.awt.Color(0, 102, 51));
        DELETEhdb.setBorder(null);
        DELETEhdb.setText("Xóa");
        DELETEhdb.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        DELETEhdb.setType(null);
        DELETEhdb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEhdbActionPerformed(evt);
            }
        });

        btnADDhtct.setBackground(new java.awt.Color(0, 102, 51));
        btnADDhtct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/ChuyenTabSPUCN.png"))); // NOI18N
        btnADDhtct.setText("Thêm ");
        btnADDhtct.setColorHover(new java.awt.Color(0, 155, 76));
        btnADDhtct.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnADDhtct.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnADDhtct.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnADDhtct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADDhtctActionPerformed(evt);
            }
        });

        btnDELETEhdct.setBackground(new java.awt.Color(0, 102, 51));
        btnDELETEhdct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/ChuyenTabSPUCN1.png"))); // NOI18N
        btnDELETEhdct.setText("  Xóa ");
        btnDELETEhdct.setColorHover(new java.awt.Color(0, 155, 76));
        btnDELETEhdct.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnDELETEhdct.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnDELETEhdct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDELETEhdctActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 51));
        jLabel10.setText("Bảng sản phẩm");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 51));
        jLabel11.setText("Chi tiết hóa đơn");

        txtTimKiem.setBorder(null);
        txtTimKiem.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        txtTimKiem.setMargin(new java.awt.Insets(10, 6, -5, 10));

        jSeparator14.setForeground(new java.awt.Color(0, 0, 0));

        btnTimKiem.setBackground(new java.awt.Color(255, 255, 255));
        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/TimKiem.png"))); // NOI18N
        btnTimKiem.setColorHover(new java.awt.Color(204, 204, 204));
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 51));
        jLabel14.setText("Tìm kiếm: ");

        btnChuyenDSHDB.setBackground(new java.awt.Color(0, 102, 51));
        btnChuyenDSHDB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/ChuyenTabSPUCN.png"))); // NOI18N
        btnChuyenDSHDB.setText("DS hóa đơn bán");
        btnChuyenDSHDB.setColorHover(new java.awt.Color(0, 155, 76));
        btnChuyenDSHDB.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnChuyenDSHDB.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnChuyenDSHDB.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnChuyenDSHDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuyenDSHDBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnADDhdb, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(btnUPDATEhdb, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(DELETEhdb, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(btnNEWhdb, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145)
                        .addComponent(btnChuyenDSHDB, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnADDhtct, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(btnDELETEhdct, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(btnADDhtct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDELETEhdct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, 0)
                                    .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DELETEhdb, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNEWhdb, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnADDhdb, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUPDATEhdb, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChuyenDSHDB, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
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

    private void btnChuyenDSHDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuyenDSHDBActionPerformed
        GreenOrganicJFrame.jPanelDeskop.removeAll();
        DSHoaDonBanjIF dsHDB = new DSHoaDonBanjIF();
        GreenOrganicJFrame.jPanelDeskop.add(dsHDB).setVisible(true);
        GreenOrganicJFrame.lblTieuDe.setText(" DANH SÁCH HÓA ĐƠN BÁN");
        GreenOrganicJFrame.lblTieuDe.setFont(new java.awt.Font("Tahoma", 1, 19));
    }//GEN-LAST:event_btnChuyenDSHDBActionPerformed

    
    private void txtMaKHFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMaKHFocusLost
       focusMaKH();
    }//GEN-LAST:event_txtMaKHFocusLost

    private void btnADDhdbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADDhdbActionPerformed
        // TODO add your handling code here:
        addHDB();
    }//GEN-LAST:event_btnADDhdbActionPerformed

    private void btnUPDATEhdbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUPDATEhdbActionPerformed
        // TODO add your handling code here:
        updateHDB();
    }//GEN-LAST:event_btnUPDATEhdbActionPerformed

    private void btnADDhtctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADDhtctActionPerformed

        BanHang();
        tinhTongTienGG();
    }//GEN-LAST:event_btnADDhtctActionPerformed

    private void btnDELETEhdctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDELETEhdctActionPerformed
        // TODO add your handling code here:
        XoaHang();
        tinhTongTienGG();
    }//GEN-LAST:event_btnDELETEhdctActionPerformed

    private void tblBangSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBangSPMouseClicked
        // TODO add your handling code here:
        count = 1;
        btnADDhtct.setEnabled(true);
    }//GEN-LAST:event_tblBangSPMouseClicked

    private void tblBangSPBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBangSPBMouseClicked
        // TODO add your handling code here:
        mouseClickSPB();

    }//GEN-LAST:event_tblBangSPBMouseClicked

    private void txtMaHDBFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMaHDBFocusLost
        focusMaHDB();
    }//GEN-LAST:event_txtMaHDBFocusLost

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        TimKiem();
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnDungDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDungDiemActionPerformed
        // TODO add your handling code here:
        DungDiem();
    }//GEN-LAST:event_btnDungDiemActionPerformed

    private void txtGiamGiaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGiamGiaFocusLost

    }//GEN-LAST:event_txtGiamGiaFocusLost

    private void btnNEWhdbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNEWhdbActionPerformed
        // TODO add your handling code here:
        clearForm();
    }//GEN-LAST:event_btnNEWhdbActionPerformed

    private void btnInhoadonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInhoadonActionPerformed
        // TODO add your handling code here:
        try {
            printHD();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnInhoadonActionPerformed

    private void DELETEhdbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEhdbActionPerformed
        deleteHDB();
    }//GEN-LAST:event_DELETEhdbActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle DELETEhdb;
    private rojerusan.RSMaterialButtonRectangle btnADDhdb;
    private rojerusan.RSButtonHover btnADDhtct;
    private rojerusan.RSButtonHover btnChuyenDSHDB;
    private rojerusan.RSButtonHover btnDELETEhdct;
    private rojerusan.RSMaterialButtonRectangle btnDungDiem;
    private rojerusan.RSMaterialButtonRectangle btnInhoadon;
    private rojerusan.RSMaterialButtonRectangle btnNEWhdb;
    private rojerusan.RSButtonHover btnTimKiem;
    private rojerusan.RSMaterialButtonRectangle btnUPDATEhdb;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private rojeru_san.complementos.RSTableMetro tblBangSP;
    public static rojeru_san.complementos.RSTableMetro tblBangSPB;
    public static app.bolivia.swing.JCTextField txtDiemTich;
    public static app.bolivia.swing.JCTextField txtGiamGia;
    public static app.bolivia.swing.JCTextField txtMaHDB;
    public static app.bolivia.swing.JCTextField txtMaKH;
    public static app.bolivia.swing.JCTextField txtMaNV;
    public static app.bolivia.swing.JCTextField txtNgayTao;
    public static app.bolivia.swing.JCTextField txtTenKH;
    public static app.bolivia.swing.JCTextField txtThanhTien;
    private app.bolivia.swing.JCTextField txtTimKiem;
    public static app.bolivia.swing.JCTextField txtTongTien;
    // End of variables declaration//GEN-END:variables

    void init() {
        fillTableSP();
        if (DSHoaDonBanjIF.count == 1) {
            fillTableTheoHDB();
        }
       
        if(txtDiemTich.getText().equals("0")){
        btnDungDiem.setEnabled(false);
        }
        btnADDhtct.setEnabled(false);
        txtTenKH.setEditable(false);
        txtDiemTich.setEditable(false);
        txtMaNV.setEditable(false);
        txtNgayTao.setEditable(false);
        txtTongTien.setEditable(false);
        txtGiamGia.setEditable(false);
        txtThanhTien.setEditable(false);
        txtMaNV.setText(AuthorHelper.user.getMaNV());
        txtNgayTao.setText(java.time.LocalDate.now().toString());

    }

    void fillTableTheoHDB1() {// dùng để khi thêm hoặc xóa sản phẩm thì về đúng ds của nó 
        try {
            String cuy = txtMaHDB.getText();
            DefaultTableModel model = (DefaultTableModel) tblBangSPB.getModel();
            model.setRowCount(0);
            List<HoaDonChiTietBan> ls = new HDCTBanDAO().selectBangHDCT(cuy);
            for (HoaDonChiTietBan l : ls) {
                model.addRow(new Object[]{l.getMaHDCTban(), l.getMaHDNban(), l.getMaSPham(), l.getTenSPnhap(), l.getDonViTinh(), l.getSoLuong(),
                    l.getGiaBan(), l.getGiamgia(),l.TotalMoney()});
            }
            model.fireTableDataChanged();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    void fillTableTheoHDB() {// khi mi kích vào  hàng bên ds hdb thì nó sẽ về ds hdct bên này 
        try {
            int row = DSHoaDonBanjIF.tblDSHDB.getSelectedRow();
            String cuy = (String) DSHoaDonBanjIF.tblDSHDB.getValueAt(row, 0);
            if(cuy.equals("")){
            }else{
            DefaultTableModel model = (DefaultTableModel) tblBangSPB.getModel();
            model.setRowCount(0);
            List<HoaDonChiTietBan> ls = new HDCTBanDAO().selectBangHDCT(cuy);
            for (HoaDonChiTietBan l : ls) {
                model.addRow(new Object[]{l.getMaHDCTban(), l.getMaHDNban(), l.getMaSPham(), l.getTenSPnhap(), l.getDonViTinh(), l.getSoLuong(),
                    l.getGiaBan(), l.getGiamgia(),l.TotalMoney()});
            }
            model.fireTableDataChanged();
        }} catch (Exception e) {
            e.printStackTrace();
        }
    }

    void fillTableSP() {// fill sản phẩm
        DefaultTableModel model = (DefaultTableModel) tblBangSP.getModel();
        model.setRowCount(0);
        List<SanPham> ls = new SanPhamDAO().selectAll();
        for (SanPham l : ls) {
            model.addRow(new Object[]{l.getMaSP(), l.getTenSP(), l.getTenLH(), l.gethSD(), l.getDonVi(), l.getGiaBan(),
                 l.getSoLuong(), l.getGiamGia()});
        }
        model.fireTableDataChanged();
    }

    void fillTableByName() {// tìm theo tên 
        DefaultTableModel model = (DefaultTableModel) tblBangSP.getModel();
        model.setRowCount(0);
        String tk = txtTimKiem.getText();
        List<SanPham> ls = new SanPhamDAO().selectByKetword(tk);
        for (SanPham l : ls) {
            model.addRow(new Object[]{l.getMaSP(), l.getTenSP(), l.getTenLH(), l.gethSD(), l.getDonVi(), l.getGiaBan(),
                l.getSoLuong(), l.getGiamGia()});
        }
        model.fireTableDataChanged();
    }

    void focusMaHDB() {
        try {
            String mahdb = txtMaHDB.getText();
            HoaDonBan hdb = new HoaDonBanDAO().selectByID(mahdb);
            if (hdb != null) {
                txtMaKH.setText(hdb.getMaKH());
                String makh = txtMaKH.getText();
                if (!(makh.equals(""))) {
                    KhachHang kh = new KhachHangDAO().selectByID(makh);
                    if (kh != null) {
                        txtTenKH.setText(kh.getHoTen());
                        txtDiemTich.setText(kh.getMaGiamGia() + "");
                    } else {
                        txtTenKH.setText("");
                        txtDiemTich.setText("");
                    }
                }
                txtMaNV.setText(hdb.getMaNV());
                txtNgayTao.setText(hdb.getNgayTao().toString());
            }
            fillTableTheoHDB1();
//            tinhTongTienGG();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    void focusMaKH(){
    try {
            String makh = txtMaKH.getText();
            if (!(makh.equals(""))) {
                KhachHang kh = new KhachHangDAO().selectByID(makh);
                if (kh != null) {
                    txtTenKH.setText(kh.getHoTen());
                    txtDiemTich.setText(kh.getMaGiamGia() + "");
                } else {
                    txtTenKH.setText("");
                    txtDiemTich.setText("");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    void mouseClickSPB() {
        try {
            count = 2;
            btnADDhtct.setEnabled(true);
            int row = tblBangSPB.getSelectedRow();
            String mahdb = (String) tblBangSPB.getValueAt(row, 1);
            txtMaHDB.setText(mahdb);
        } catch (Exception e) {

            e.printStackTrace();
        }
    }
  
    int chuyendoi() {
        int cd = 0;
        if (txtDiemTich.getText().equals("")) {
            cd = 0;
        } else {
            int diemkh = Integer.parseInt(txtDiemTich.getText());
            cd = diemkh;

            BoxHelper.alert(this, "Bạn được giảm " + cd + "% tổng hóa đơn");
        }
        return cd;
    }

    void DungDiem() {
        try {
            if (JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn dùng điểm ?", "Green Organic", JOptionPane.YES_NO_OPTION)
                    == JOptionPane.NO_OPTION) {
                return;
            }
            int giam = Integer.parseInt(txtGiamGia.getText());
            if (txtGiamGia.getText().equals("")) {
                giam = 0;
            }
            int cuoicung = 0;
            cuoicung = giam + chuyendoi();
            txtDiemTich.setText("" + 0);
            txtGiamGia.setText(cuoicung + "");
            double po = Double.parseDouble(txtTongTien.getText());
            int yo = cuoicung;
            System.out.println(yo);
            txtThanhTien.setText(po - (po * yo / 100) + "");
            KhachHang kh = new KhachHangDAO().selectByID(txtMaKH.getText());
            kh.setMaGiamGia(0);
            new KhachHangDAO().update(kh);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void addHDB() {
        try {
            if (validateHDB().length() > 0) {
                BoxHelper.alert(this, validateHDB().toString());

            } else {
                HoaDonBan hdn = getModel();
                new HoaDonBanDAO().insert(hdn);
                BoxHelper.alert(this, "Thêm mới thành công");
            }
        } catch (Exception e) {
            BoxHelper.alert(this, "Thất bại");
            e.printStackTrace();
        }
    }

    void updateHDB() {
            if (validateHDB().length() > 0) {
                BoxHelper.alert(this, validateHDB().toString());

            } else {
            if (DataValidateHelper.CheckNgayUpdateHD(txtNgayTao) == false) {
                BoxHelper.alert(this, "Bạn chỉ có thể cập nhật hóa đơn trong ngày");
            } else if (BoxHelper.confirm(this, "Bạn có muốn lưu thay đổi")) {
                HoaDonBan hdb = getModelUpdate();
                try {
                    new HoaDonBanDAO().update(hdb);
                    this.clearForm();
                    BoxHelper.alert(this, "Cập nhật thành công");
                } catch (Exception e) {
                    e.printStackTrace();
                    BoxHelper.alert(this, "Cập nhật thất bại");
                }
            }
        }
                   
    }
    
    void deleteHDB() {
        String maHDB = txtMaHDB.getText();
        if (!AuthorHelper.isManager()) {
            BoxHelper.alert(this, "Bạn không có quyền xóa hóa đơn!");
        } else {
            if (maHDB.equals("")) {
                BoxHelper.alert(this, "Mã hóa đơn không được để trống!");
            } else if (DataValidateHelper.CheckNgayXoaHD(txtNgayTao) == false) {
                BoxHelper.alert(this, "Bạn không thể xóa hóa đơn có ngày tạo dưới một năm!");
            } else {
                if (BoxHelper.confirm(this, "Bạn thực sự muốn xóa hóa đơn này?")) {
                    try {
                        new HoaDonBanDAO().delete(maHDB);
                        this.clearForm();
                        BoxHelper.alert(this, "Xóa thành công");
                    } catch (Exception e) {
                        BoxHelper.alert(this, "Xóa thất bại");
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    void TimKiem() {
        try {
            if (txtTimKiem.getText().equals("")) {
                fillTableSP();
            } else {
                SanPham sp = new SanPhamDAO().selectByName(txtTimKiem.getText());
                if (sp != null) {
                    fillTableByName();
                } else {
                    JOptionPane.showMessageDialog(this, "Tên sản phẩm không tồn tại", "ERROR", JOptionPane.ERROR_MESSAGE);
                    fillTableSP();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    StringBuilder validateHDB() {
        StringBuilder sb = new StringBuilder();
        DataValidateHelper.validateEmpty(txtMaHDB, sb, "Mã hóa đơn không hợp lệ");
        DataValidateHelper.checkDate(txtNgayTao, sb, "Ngày tạo không hợp lệ");
        DataValidateHelper.validateEmpty(txtMaNV, sb, "Mã nhân viên không hợp lệ");
        return sb;
    }

    HoaDonBan getModel() {
        HoaDonBan hdb = new HoaDonBan();
        hdb.setMaKH(txtMaKH.getText());
        hdb.setMaNV(txtMaNV.getText());
        hdb.setNgayTao(DateHelper.toDate(txtNgayTao.getText()));
        hdb.setMaHDBan(txtMaHDB.getText());
        hdb.setGiamgia(Integer.parseInt(txtGiamGia.getText()));
        hdb.setTrangthai(false);
        return hdb;
    }
    HoaDonBan getModelUpdate() {
        HoaDonBan hdb = new HoaDonBan();
        hdb.setMaKH(txtMaKH.getText());
        hdb.setMaNV(txtMaNV.getText());
        hdb.setNgayTao(DateHelper.toDate(txtNgayTao.getText()));
        hdb.setMaHDBan(txtMaHDB.getText());
        hdb.setGiamgia(Integer.parseInt(txtGiamGia.getText()));
        System.out.println(Integer.parseInt(txtGiamGia.getText()));
        hdb.setTrangthai(true);
        return hdb;
    }

    StringBuilder checkTaoHDBCT() {
        StringBuilder sb = new StringBuilder();
        DataValidateHelper.validateEmpty(txtMaHDB, sb, "Mã hóa đơn không được để trống");
        return sb;
    }

    void fillHDCT() {
        DefaultTableModel model = (DefaultTableModel) tblBangSPB.getModel();
        model.setRowCount(0);
        List<HoaDonChiTietBan> ls = new HDCTBanDAO().selectAll();
        for (HoaDonChiTietBan l : ls) {
            model.addRow(new Object[]{l.getMaHDCTban(), l.getMaHDNban(), l.getMaSPham(), l.getTenSPnhap(), l.getDonViTinh(), l.getSoLuong(),
                l.getGiaBan(), l.getGiamgia(),l.TotalMoney()});
        }
        model.fireTableDataChanged();
    }

    void deleteHang() {
        int row = tblBangSPB.getSelectedRow();
        int mahdct = (Integer) tblBangSPB.getValueAt(row, 0);
        String maHDB = (String) tblBangSPB.getValueAt(row, 1);
        new HDCTBanDAO().delete(mahdct);
        BoxHelper.alert(this, "Xóa thành công");
        fillTableTheoHDB1();
        fillTableSP();
        HoaDonBan hdb = new HoaDonBanDAO().selectByID(maHDB);
        hdb.setTrangthai(false);
        new HoaDonBanDAO().update(hdb);
    }
    double Thanhtien(double x, int y) {
        double tt = 0;
        if (txtTongTien.getText().equals("") || txtGiamGia.getText().equals("")) {
            tt = 0;
        } else {
            x = Double.parseDouble(txtTongTien.getText());
            y = Integer.parseInt(txtGiamGia.getText());
            tt = x - (x * (y / 100));
        }
        return tt;
    }
    void tinhTongTienGG() {
        double tt = 0;
        if (tblBangSPB.getRowCount() < 0) {
            txtTongTien.setText(0 + "");
            txtGiamGia.setText(0 + "");
//            txtMaHDB.setText("");
        } else {
            for (int i = 0; i < tblBangSPB.getRowCount(); i++) {
                double tongtien = (Double) tblBangSPB.getValueAt(i, 8);
                tt = tt + tongtien;
            }
            int a = Integer.parseInt(txtGiamGia.getText());
            txtTongTien.setText(tt + "");        
            txtThanhTien.setText(Thanhtien(tt,a) + "");
        }
    }

    void XoaHang() {
        try {
            if (DataValidateHelper.CheckNgayUpdateHD(txtNgayTao) == false) {
            BoxHelper.alert(this, "Bạn chỉ có thể chỉnh sửa hóa đơn trong ngày");
            return;
            }
            int row = tblBangSPB.getSelectedRow();
            if (row < 0) {
                JOptionPane.showMessageDialog(this, "Bạn chưa chọn sản phẩm ");
            } else {

                String input = JOptionPane.showInputDialog("Nhập số lượng ");
                int soluongxoa = Integer.parseInt(input);
                int soluongbh = (Integer) tblBangSPB.getValueAt(row, 5);
                if (soluongxoa == soluongbh) {
                    deleteHang();
                } else if (soluongxoa < soluongbh) {

                    HoaDonChiTietBan hdbct = new HoaDonChiTietBan();
                    int mahd = (Integer) tblBangSPB.getValueAt(row, 0);
                    String hdb = (String) tblBangSPB.getValueAt(row, 1);
                    String masph = (String) tblBangSPB.getValueAt(row, 2);
                    String tensph = (String) tblBangSPB.getValueAt(row, 3);
                    String dvti = (String) tblBangSPB.getValueAt(row, 4);
                    double gban = (Double) tblBangSPB.getValueAt(row, 6);
                    int ggiam = (Integer) tblBangSPB.getValueAt(row, 7);

                    hdbct.setDonViTinh(dvti);
                    hdbct.setGiaBan(gban);
                    hdbct.setGiamgia(ggiam);
                    hdbct.setMaHDCTban(mahd);
                    hdbct.setMaHDNban(hdb);
                    hdbct.setMaSPham(masph);
                    hdbct.setTenSPnhap(tensph);
                    hdbct.setSoLuong(soluongxoa);

                    new HDCTBanDAO().update(hdbct);
//                    BoxHelper.alert(this, "Cập nhập thành công");
                    fillTableTheoHDB1();
                    fillTableSP();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Thất bại", "ERROR", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    void BanHang() {
        try {
            if (DataValidateHelper.CheckNgayUpdateHD(txtNgayTao) == false) {
            BoxHelper.alert(this, "Bạn chỉ có thể chỉnh sửa hóa đơn trong ngày");
            return;
        }
            if (checkTaoHDBCT().length() > 0) {
                JOptionPane.showMessageDialog(this, checkTaoHDBCT().toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                int row = tblBangSP.getSelectedRow();
                int index = tblBangSPB.getSelectedRow();
                if (count == 1) {

                    String slb = JOptionPane.showInputDialog("Nhập số lượng bán");
                    int soluong = Integer.parseInt(slb);
                    int soluongtonkho = (Integer) tblBangSP.getValueAt(row, 6);
                    if (soluong > soluongtonkho) {
                        JOptionPane.showMessageDialog(this, "Sản phẩm vượt quá số lương", "ERROR", JOptionPane.ERROR_MESSAGE);
                    } else {
                        String dvt = (String) tblBangSP.getValueAt(row, 4);
                        String masp = (String) tblBangSP.getValueAt(row, 0);
                        String tensp = (String) tblBangSP.getValueAt(row, 1);
//           String gia=(String)tblBangSP.getValueAt(row, 5);
                        double giaban = (Double) tblBangSP.getValueAt(row, 5);
//           String gg=(String)tblBangSP.getValueAt(row,7);
                        int giamgia = (Integer) tblBangSP.getValueAt(row, 7);
                        HoaDonChiTietBan hdct = new HoaDonChiTietBan();
                        hdct.setMaHDNban(txtMaHDB.getText());
                        hdct.setMaSPham(masp);
                        hdct.setTenSPnhap(tensp);
                        hdct.setSoLuong(soluong);
                        hdct.setGiaBan(giaban);
                        hdct.setGiamgia(giamgia);
                        hdct.setDonViTinh(dvt);
                        new HDCTBanDAO().insert(hdct);
//                        BoxHelper.alert(this, "Thành công");
                        fillTableTheoHDB1();
                        fillTableSP();
                    }

                } else if (count == 2) {
                    try {
                        String input = JOptionPane.showInputDialog("Nhập số lượng sản phẩm cần lấy");

                        int slthem = Integer.parseInt(input);
                        HoaDonChiTietBan hdbct = new HoaDonChiTietBan();
                        int mahd = (Integer) tblBangSPB.getValueAt(index, 0);
                        String hdb = (String) tblBangSPB.getValueAt(index, 1);
                        String masph = (String) tblBangSPB.getValueAt(index, 2);
                        String tensph = (String) tblBangSPB.getValueAt(index, 3);
                        String dvti = (String) tblBangSPB.getValueAt(index, 4);
                        double gban = (Double) tblBangSPB.getValueAt(index, 6);
                        int ggiam = (Integer) tblBangSPB.getValueAt(index, 7);

                        hdbct.setDonViTinh(dvti);
                        hdbct.setGiaBan(gban);
                        hdbct.setGiamgia(ggiam);
                        hdbct.setMaHDCTban(mahd);
                        hdbct.setMaHDNban(hdb);
                        hdbct.setMaSPham(masph);
                        hdbct.setTenSPnhap(tensph);
                        hdbct.setSoLuong(slthem);

                        new HDCTBanDAO().update(hdbct);
                        BoxHelper.alert(this, "Cập nhập thành công");
                        fillTableTheoHDB1();
                        fillTableSP();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            }
        } catch (Exception e) {
            BoxHelper.alert(this, "Thất bại");
            e.printStackTrace();
        }
    }

    private void clearForm() {
        try {
            DefaultTableModel model = (DefaultTableModel) tblBangSPB.getModel();
            model.setRowCount(0);
            txtDiemTich.setText("");
            txtGiamGia.setText("0");
            txtMaHDB.setText("");
            txtMaKH.setText("");
            txtMaNV.setText(AuthorHelper.user.getMaNV());
            txtNgayTao.setText(java.time.LocalDate.now().toString());
            txtTenKH.setText("");
            txtThanhTien.setText("0.0");
            txtTimKiem.setText("");
            txtTongTien.setText("0.0");
            txtMaHDB.setBackground(Color.WHITE);
            txtMaKH.setBackground(Color.WHITE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    void printHD() throws IOException {
        if (!(txtMaHDB.getText().equals("")) && !(txtMaNV.getText().equals(""))
                && !(txtTenKH.getText().equals("")) && tblBangSPB.getRowCount() > 0) {

            String path = "BillSale/" + txtMaHDB.getText().trim() + ".pdf";
            PdfWriter pdfWriter = new PdfWriter(path);
            PdfDocument pdfDocument = new PdfDocument(pdfWriter);
            Document document = new Document(pdfDocument);
            pdfDocument.setDefaultPageSize(PageSize.A4);

            float col = 280f;
            float columnWidth[] = {col, col};
            Table table = new Table(columnWidth);

            table.setBackgroundColor(new DeviceRgb(Color.GRAY));
            table.setFontColor(new DeviceRgb(Color.WHITE));
            table.addCell(new Cell().add(new Paragraph("Invoice"))
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
                    .add(new Paragraph("Invoice Information"))
                    .setBold()
                    .setBorder(Border.NO_BORDER)
            );

            customerInfor.addCell(new Cell().add(new Paragraph("Custumer: ")).setBorder(Border.NO_BORDER));
            customerInfor.addCell(new Cell().add(new Paragraph(txtTenKH.getText())).setBorder(Border.NO_BORDER));
            customerInfor.addCell(new Cell().add(new Paragraph("ID Invoice: ")).setBorder(Border.NO_BORDER));
            customerInfor.addCell(new Cell().add(new Paragraph(txtMaHDB.getText().trim())).setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.RIGHT));

            customerInfor.addCell(new Cell().add(new Paragraph("Date: ")).setBorder(Border.NO_BORDER));
            customerInfor.addCell(new Cell().add(new Paragraph(txtNgayTao.getText())).setBorder(Border.NO_BORDER));
            customerInfor.addCell(new Cell().add(new Paragraph("Employee: ")).setBorder(Border.NO_BORDER));
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

            for (int i = 0; i < tblBangSPB.getRowCount(); i++) {
                int soLuong = (int) tblBangSPB.getValueAt(i, 5);
                double giaBan = (double) tblBangSPB.getValueAt(i, 6);
                int giamGiaSP = (int) tblBangSPB.getValueAt(i, 7);
                double thanhTien = (double) tblBangSPB.getValueAt(i, 8);
                itemInfor.addCell(new Cell().add(new Paragraph((String) tblBangSPB.getValueAt(i, 3))));
                itemInfor.addCell(new Cell().add(new Paragraph(String.valueOf(soLuong))));
                itemInfor.addCell(new Cell().add(new Paragraph(String.valueOf(giaBan))));
                itemInfor.addCell(new Cell().add(new Paragraph((String) tblBangSPB.getValueAt(i, 4))));
                itemInfor.addCell(new Cell().add(new Paragraph(String.valueOf(giamGiaSP) + "%").setBorder(Border.NO_BORDER)));
                itemInfor.addCell(new Cell().add(new Paragraph(String.valueOf(thanhTien))));
            }

            itemInfor.addCell(new Cell().add(new Paragraph(""))
                    .setBorder(Border.NO_BORDER)
                    .setHeight(30f)
            );
            itemInfor.addCell(new Cell().add(new Paragraph(""))
                    .setBorder(Border.NO_BORDER)
                    .setHeight(30f)
            );
            itemInfor.addCell(new Cell().add(new Paragraph(""))
                    .setBorder(Border.NO_BORDER)
                    .setHeight(30f)
            );
            itemInfor.addCell(new Cell().add(new Paragraph(""))
                    .setBorder(Border.NO_BORDER)
                    .setHeight(30f)
            );
            itemInfor.addCell(new Cell().add(new Paragraph("Total Amount:"))
                    .setBorder(Border.NO_BORDER)
                    .setFontColor(new DeviceRgb(Color.BLACK))
                    .setTextAlignment(TextAlignment.CENTER)
                    .setVerticalAlignment(VerticalAlignment.MIDDLE)
                    .setHeight(30f)
                    .setBold()
            );
            itemInfor.addCell(new Cell().add(new Paragraph(txtTongTien.getText() + "  VND"))
                    .setBorder(Border.NO_BORDER)
                    .setTextAlignment(TextAlignment.CENTER)
                    .setVerticalAlignment(VerticalAlignment.MIDDLE)
                    .setFontColor(new DeviceRgb(Color.BLACK))
                    .setHeight(20f)
                    .setBold()
            );
            
            itemInfor.addCell(new Cell().add(new Paragraph(""))
                    .setBorder(Border.NO_BORDER)
                    .setHeight(30f)
            );
            itemInfor.addCell(new Cell().add(new Paragraph(""))
                    .setBorder(Border.NO_BORDER)
                    .setHeight(30f)
            );
            itemInfor.addCell(new Cell().add(new Paragraph(""))
                    .setBorder(Border.NO_BORDER)
                    .setHeight(30f)
            );
            itemInfor.addCell(new Cell().add(new Paragraph(""))
                    .setBorder(Border.NO_BORDER)
                    .setHeight(30f)
            );
            itemInfor.addCell(new Cell().add(new Paragraph("Point Discount:"))
                    .setBorder(Border.NO_BORDER)
                    .setFontColor(new DeviceRgb(Color.BLACK))
                    .setTextAlignment(TextAlignment.CENTER)
                    .setVerticalAlignment(VerticalAlignment.MIDDLE)
                    .setHeight(30f)
                    .setBold()
            );
            itemInfor.addCell(new Cell().add(new Paragraph(txtGiamGia.getText() + "%"))
                    .setBorder(Border.NO_BORDER)
                    .setTextAlignment(TextAlignment.CENTER)
                    .setVerticalAlignment(VerticalAlignment.MIDDLE)
                    .setFontColor(new DeviceRgb(Color.BLACK))
                    .setHeight(20f)
                    .setBold()
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
            itemInfor.addCell(new Cell().add(new Paragraph(txtThanhTien.getText() + "  VND"))
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
            tableEnd.addCell(new Cell().add(new Paragraph("----------THANK YOU----------"))
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
    
