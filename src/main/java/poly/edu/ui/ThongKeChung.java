package poly.edu.ui;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import poly.edu.dao.HDCTBanDAO;
import poly.edu.dao.HDCTNhapDAO;
import poly.edu.dao.HoaDonBanDAO;
import poly.edu.dao.KhachHangDAO;
import poly.edu.dao.NhaCungUngDAO;
import poly.edu.dao.NhanVienDAO;
import poly.edu.dao.SanPhamDAO;
import poly.edu.dao.ThongKeDAO;
import poly.edu.entity.HoaDonBan;
import poly.edu.entity.HoaDonChiTietBan;
import poly.edu.entity.HoaDonChiTietNhap;
import poly.edu.entity.KhachHang;
import poly.edu.entity.NhaCungUng;
import poly.edu.entity.NhanVien;
import poly.edu.entity.SanPham;
import poly.edu.helper.AuthorHelper;
import poly.edu.helper.BoxHelper;
import poly.edu.helper.DateHelper;
import static poly.edu.ui.GreenOrganicJFrame.jPanelDeskop;


public class ThongKeChung extends javax.swing.JInternalFrame {
    ThongKeDAO tkdao = new ThongKeDAO();
    GreenOrganicJFrame formChung;
    
    public ThongKeChung() {
        initComponents();
        init();
        TKNhanVien();
    }

    void setForm() {
        this.lblNV1.setVisible(false);//Nền chứa NV
        this.lblNV2.setVisible(false);
        this.lblNV3.setVisible(false);
        this.lblNVTop1.setVisible(false);//Tiêu đề NV top
        this.lblNVTop2.setVisible(false);
        this.lblNVTop3.setVisible(false);
        this.lblTenNVVitriTop1.setVisible(false);
        this.lblTenNVVitriTop2.setVisible(false);
        this.lblTenNVVitriTop3.setVisible(false);        
        this.SoHoaDonBanRaNV1.setVisible(false);
        this.SoHoaDonBanRaNV2.setVisible(false);
        this.SoHoaDonBanRaNV3.setVisible(false);

        this.lblTieuDeChiPhiNhap.setVisible(false);
        this.lblTieuDeDoanhThuBan.setVisible(false);
        this.lblTieuDeLoiNhuan.setVisible(false);
        
        this.lblTienNhapSo.setVisible(false);
        this.lblTienBanRaSo.setVisible(false);
        this.lblTienLaiSo.setVisible(false);
        this.iconloinhuan.setVisible(false);
        this.iconnhaphang.setVisible(false);
        this.iconbanra.setVisible(false);
        this.lblvnd.setVisible(false);
        this.lblvnd1.setVisible(false);
        this.lblvnd2.setVisible(false);
                
        this.lblnennhap.setVisible(false);
        this.lblnenban.setVisible(false);
        this.lblnenlai.setVisible(false);
        this.lblNenManHinh.setVisible(false);
        this.lblHinhMayTinh.setVisible(false);
        this.lblHinhMayTinhKKT.setVisible(false);
        
        this.txtNgay.setVisible(false);
        this.cboThang.setVisible(false);
        this.cboNam.setVisible(false);
        this.lblThang.setVisible(false);
        this.lblNam.setVisible(false);
        this.lblNgay.setVisible(false);
        this.cboThangDT.setVisible(false);
        this.cboNamDT.setVisible(false);
        this.lblThangDT.setVisible(false);
        this.lblNamDT.setVisible(false);
        
        this.btnGuiYCGia.setVisible(false);
        this.btnGuiYCNhap.setVisible(false);
        this.btnViewChart.setVisible(false);
        this.btnExportFileSPKho.setVisible(false);
        this.btnExportFileSPBan.setVisible(false);
        this.btnExportFile.setVisible(false);

        this.tblSanPhamTonKho.setVisible(false);
        this.jScrollPane1.setVisible(false);
        this.tblSanPhamBan.setVisible(false);
        this.jScrollPane2.setVisible(false);
        this.tblNhaCungUng.setVisible(false);
        this.jScrollPane3.setVisible(false);

    }

    void TKNhanVien() {
        List<Object[]> list = tkdao.getNhanVien();
        Object nv[] = list.get(0);
        String name1 = (String) nv[1];
        int soLuong1 = (int) nv[2];
        
        Object nv2[] = list.get(1);
        String name2 = (String) nv2[1];
        int soLuong2 = (int) nv2[2];
        
        Object nv3[] = list.get(2);
        String name3 = (String) nv3[1];
        int soLuong3 = (int) nv3[2];
        
        setForm();
        
        lblHinhMayTinh.setVisible(true);


        lblNV1.setVisible(true);//Nền chứa NV
        lblNV2.setVisible(true);
        lblNV3.setVisible(true);
        lblNVTop1.setVisible(true);//Tiêu đề NV top
        lblNVTop2.setVisible(true);
        lblNVTop3.setVisible(true);
        lblTenNVVitriTop1.setVisible(true);
        lblTenNVVitriTop2.setVisible(true);
        lblTenNVVitriTop3.setVisible(true);        
        SoHoaDonBanRaNV1.setVisible(true);
        SoHoaDonBanRaNV2.setVisible(true);
        SoHoaDonBanRaNV3.setVisible(true);
        
        lblTenNVVitriTop1.setText(name1.toUpperCase());
        lblTenNVVitriTop2.setText(name2.toUpperCase());
        lblTenNVVitriTop3.setText(name3.toUpperCase()); 
        
        SoHoaDonBanRaNV1.setText("Số hóa đơn đã bán:  "+ soLuong1);
        SoHoaDonBanRaNV2.setText("Số hóa đơn đã bán:  "+ soLuong2);
        SoHoaDonBanRaNV3.setText("Số hóa đơn đã bán:  "+ soLuong3);
        
        
        
        
//        lblNVTop1.setFont(new java.awt.Font("Tahoma", 1, 16));            
//        lblNVTop2.setFont(new java.awt.Font("Tahoma", 1, 16));             
//        lblNVTop3.setFont(new java.awt.Font("Tahoma", 1, 16));

        lblNVTop1.setText("Nhân viên top 1");
        lblNVTop2.setText("Nhân viên top 2");
        lblNVTop3.setText("Nhân viên top 3");
        lblTieuDe.setText("Top nhân viên xuất sắc");
    }

    void TKKhachHang() {
        List<Object[]> list = tkdao.getKhachHang();
        Object kh[] = list.get(0);
        String name1 = (String) kh[1];
        int soLuong1 = (int) kh[2];
        
        Object kh1[] = list.get(1);
        String name2 = (String) kh1[1];
        int soLuong2 = (int) kh1[2];
        
        Object kh2[] = list.get(2);
        String name3 = (String) kh2[1];
        int soLuong3 = (int) kh2[2];
        
        setForm();
        
        lblHinhMayTinh.setVisible(true);
        
        lblNV1.setVisible(true);//Nền chứa NV
        lblNV2.setVisible(true);
        lblNV3.setVisible(true);
        lblNVTop1.setVisible(true);//Tiêu đề NV top
       
        lblNVTop2.setVisible(true);
        lblNVTop3.setVisible(true);
        lblTenNVVitriTop1.setVisible(true);
        lblTenNVVitriTop2.setVisible(true);
        lblTenNVVitriTop3.setVisible(true);        
        SoHoaDonBanRaNV1.setVisible(true);
        SoHoaDonBanRaNV2.setVisible(true);
        SoHoaDonBanRaNV3.setVisible(true);
        
        lblTenNVVitriTop1.setText(name1.toUpperCase());
        lblTenNVVitriTop2.setText(name2.toUpperCase());
        lblTenNVVitriTop3.setText(name3.toUpperCase()); 
        
        SoHoaDonBanRaNV1.setText("Số lần mua hàng:  "+ soLuong1);
        SoHoaDonBanRaNV2.setText("Số lần mua hàng:  "+ soLuong2);
        SoHoaDonBanRaNV3.setText("Số lần mua hàng:  "+ soLuong3);
        
        lblNVTop1.setText("Khách hàng top 1");
        lblNVTop2.setText("Khách hàng top 2");
        lblNVTop3.setText("Khách hàng top 3");
        lblTieuDe.setText("Top khách hàng tiềm năng");
    }

    void TKDoanhThu() {
        setForm();
        
        lblHinhMayTinhKKT.setVisible(true);

        lblTieuDeChiPhiNhap.setVisible(true);
        lblTieuDeDoanhThuBan.setVisible(true);
        lblTieuDeLoiNhuan.setVisible(true);
        
        lblTienNhapSo.setVisible(true);
        lblTienBanRaSo.setVisible(true);
        lblTienLaiSo.setVisible(true);
        lblnennhap.setVisible(true);
        lblnenban.setVisible(true);
        lblnenlai.setVisible(true);
        iconloinhuan.setVisible(true);
        iconnhaphang.setVisible(true);
        iconbanra.setVisible(true);
        lblvnd.setVisible(true);
        lblvnd1.setVisible(true);
        lblvnd2.setVisible(true);
       
        
        txtNgay.setVisible(true);
        lblNgay.setVisible(true);
        cboThangDT.setVisible(true);
        cboNamDT.setVisible(true);
        lblThangDT.setVisible(true);
        lblNamDT.setVisible(true);
        
        btnViewChart.setVisible(true);
        btnExportFile.setVisible(true); 
        lblNenManHinh.setVisible(true);

        lblTieuDe.setText("Doanh thu cửa hàng");
        
        
    }
    
    void fillTableNCU() {
        DefaultTableModel model = (DefaultTableModel) tblNhaCungUng.getModel();
        model.setRowCount(0);
        List<Object[]> list = tkdao.getNhaCungUng();
        for (Object[] ncu : list) {
            model.addRow(ncu);
        }
    }

    void TKNhaCungUng() {
        setForm();
        
        lblHinhMayTinhKKT.setVisible(true);
        
        this.tblNhaCungUng.setVisible(true);
        this.jScrollPane3.setVisible(true);

        lblTieuDe.setText("Top nhà cung ứng");
        fillTableNCU();
    }
    void fillTableSPTonKho() {
        String header[]={"Mã SP","Tên SP","Số lượng tồn","Hạn sử dụng"};
        DefaultTableModel model=new DefaultTableModel(header,0);
        model.setRowCount(0);
        List<Object[]> list = tkdao.getHangTonKho();
        for (Object[] sp : list) {
            model.addRow(sp);
            
        }
        tblSanPhamTonKho.setModel(model);
        
    }

    void TKSanPhamKho() {
        
        setForm();
        
        lblHinhMayTinhKKT.setVisible(true);
       
        this.btnGuiYCGia.setVisible(true);
        this.btnExportFileSPKho.setVisible(true);
   
        this.tblSanPhamTonKho.setVisible(true);
        this.jScrollPane1.setVisible(true);

        lblTieuDe.setText("Sản phẩm tồn kho");
        
        fillTableSPTonKho();
    }
    
    void fillTableSPBanChay() {
        DefaultTableModel model = (DefaultTableModel) tblSanPhamBan.getModel();
        model.setRowCount(0);
        String thang = (String) cboThang.getSelectedItem();
        String nam = (String) cboNam.getSelectedItem();
        int month = Integer.valueOf(thang);
        int year = Integer.valueOf(nam);
        List<Object[]> list = tkdao.getHangBanChay(month, year);
            for (Object[] sp : list) {
                model.addRow(sp);
            }
    }

    void TKSanPhamBan() {
        
        setForm();
        
        lblHinhMayTinhKKT.setVisible(true);

        cboThang.setVisible(true);
        cboNam.setVisible(true);
        lblThang.setVisible(true);
        lblNam.setVisible(true);

        this.btnGuiYCNhap.setVisible(true);
        this.btnExportFileSPBan.setVisible(true);

        this.tblSanPhamBan.setVisible(true);
        this.jScrollPane2.setVisible(true);

        lblTieuDe.setText("Sản phẩm bán chạy");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SoHoaDonBanRaNV1 = new javax.swing.JLabel();
        SoHoaDonBanRaNV2 = new javax.swing.JLabel();
        SoHoaDonBanRaNV3 = new javax.swing.JLabel();
        lblTenNVVitriTop1 = new javax.swing.JLabel();
        lblTenNVVitriTop2 = new javax.swing.JLabel();
        lblTenNVVitriTop3 = new javax.swing.JLabel();
        lblNVTop3 = new javax.swing.JLabel();
        lblNVTop2 = new javax.swing.JLabel();
        lblNVTop1 = new javax.swing.JLabel();
        lblNV1 = new javax.swing.JLabel();
        lblNV2 = new javax.swing.JLabel();
        lblNV3 = new javax.swing.JLabel();
        iconbanra = new javax.swing.JLabel();
        iconloinhuan = new javax.swing.JLabel();
        iconnhaphang = new javax.swing.JLabel();
        lblvnd = new javax.swing.JLabel();
        lblvnd1 = new javax.swing.JLabel();
        lblvnd2 = new javax.swing.JLabel();
        lblTienLaiSo = new javax.swing.JLabel();
        lblTienBanRaSo = new javax.swing.JLabel();
        lblTienNhapSo = new javax.swing.JLabel();
        lblTieuDeLoiNhuan = new javax.swing.JLabel();
        lblTieuDeDoanhThuBan = new javax.swing.JLabel();
        lblTieuDeChiPhiNhap = new javax.swing.JLabel();
        lblnenban = new javax.swing.JLabel();
        lblnenlai = new javax.swing.JLabel();
        lblnennhap = new javax.swing.JLabel();
        txtNgay = new app.bolivia.swing.JCTextField();
        lblNgay = new javax.swing.JLabel();
        lblNam = new javax.swing.JLabel();
        cboNam = new rojerusan.RSComboMetro();
        cboThang = new rojerusan.RSComboMetro();
        lblThang = new javax.swing.JLabel();
        lblSoluongKH = new javax.swing.JLabel();
        lblSoluongSPKho = new javax.swing.JLabel();
        lblSoluongSPBan = new javax.swing.JLabel();
        lblSoluongNCU = new javax.swing.JLabel();
        lblSoluongNV = new javax.swing.JLabel();
        lblSPKho = new javax.swing.JLabel();
        lblSPBan = new javax.swing.JLabel();
        lblNCU = new javax.swing.JLabel();
        lblKhachHang = new javax.swing.JLabel();
        lblNhanVien = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSanPhamTonKho = new rojeru_san.complementos.RSTableMetro();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSanPhamBan = new rojeru_san.complementos.RSTableMetro();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblNhaCungUng = new rojeru_san.complementos.RSTableMetro();
        btnGuiYCGia = new rojerusan.RSMaterialButtonRectangle();
        btnExportFileSPKho = new rojerusan.RSMaterialButtonRectangle();
        btnGuiYCNhap = new rojerusan.RSMaterialButtonRectangle();
        btnExportFileSPBan = new rojerusan.RSMaterialButtonRectangle();
        lblTKSPBan = new javax.swing.JLabel();
        lblTKKH = new javax.swing.JLabel();
        lblTKSPKho = new javax.swing.JLabel();
        lblTKNV = new javax.swing.JLabel();
        lblTieuDe = new javax.swing.JLabel();
        lblNenTieuDe = new javax.swing.JLabel();
        lblDoanhThu = new javax.swing.JLabel();
        lblLoiNhuan = new javax.swing.JLabel();
        lblTKDThu = new javax.swing.JLabel();
        lblNenManHinh = new javax.swing.JLabel();
        btnViewChart = new rojerusan.RSMaterialButtonRectangle();
        btnExportFile = new rojerusan.RSMaterialButtonRectangle();
        lblTKNCU = new javax.swing.JLabel();
        lblHinhMayTinhKKT = new javax.swing.JLabel();
        lblHinhMayTinh = new javax.swing.JLabel();
        cboThangDT = new rojerusan.RSComboMetro();
        lblThangDT = new javax.swing.JLabel();
        lblNamDT = new javax.swing.JLabel();
        cboNamDT = new rojerusan.RSComboMetro();
        lblNenChung = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SoHoaDonBanRaNV1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        SoHoaDonBanRaNV1.setForeground(new java.awt.Color(255, 255, 255));
        SoHoaDonBanRaNV1.setText("Số hóa đơn bán ra: ");
        getContentPane().add(SoHoaDonBanRaNV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, -1, -1));

        SoHoaDonBanRaNV2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        SoHoaDonBanRaNV2.setForeground(new java.awt.Color(255, 255, 255));
        SoHoaDonBanRaNV2.setText("Số hóa đơn bán ra: ");
        getContentPane().add(SoHoaDonBanRaNV2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, -1, -1));

        SoHoaDonBanRaNV3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        SoHoaDonBanRaNV3.setForeground(new java.awt.Color(255, 255, 255));
        SoHoaDonBanRaNV3.setText("Số hóa đơn bán ra: ");
        getContentPane().add(SoHoaDonBanRaNV3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, -1, -1));

        lblTenNVVitriTop1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTenNVVitriTop1.setForeground(new java.awt.Color(255, 255, 255));
        lblTenNVVitriTop1.setText("MINH HUY");
        getContentPane().add(lblTenNVVitriTop1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, -1, -1));

        lblTenNVVitriTop2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTenNVVitriTop2.setForeground(new java.awt.Color(255, 255, 255));
        lblTenNVVitriTop2.setText("THANH MINH");
        getContentPane().add(lblTenNVVitriTop2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, -1));

        lblTenNVVitriTop3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTenNVVitriTop3.setForeground(new java.awt.Color(255, 255, 255));
        lblTenNVVitriTop3.setText("TRUNG TRI");
        getContentPane().add(lblTenNVVitriTop3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, -1, -1));

        lblNVTop3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblNVTop3.setForeground(new java.awt.Color(255, 255, 255));
        lblNVTop3.setText("Nhân viên Top 3");
        getContentPane().add(lblNVTop3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, -1, -1));

        lblNVTop2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblNVTop2.setForeground(new java.awt.Color(255, 255, 255));
        lblNVTop2.setText("Nhân viên Top 2");
        getContentPane().add(lblNVTop2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        lblNVTop1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblNVTop1.setForeground(new java.awt.Color(255, 255, 255));
        lblNVTop1.setText("Nhân viên Top 1");
        getContentPane().add(lblNVTop1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        lblNV1.setBackground(new java.awt.Color(0, 102, 51));
        lblNV1.setOpaque(true);
        getContentPane().add(lblNV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 660, 100));

        lblNV2.setBackground(new java.awt.Color(0, 102, 51));
        lblNV2.setOpaque(true);
        getContentPane().add(lblNV2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 660, 170));

        lblNV3.setBackground(new java.awt.Color(0, 102, 51));
        lblNV3.setOpaque(true);
        getContentPane().add(lblNV3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 660, 100));

        iconbanra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconbanra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/banra.png"))); // NOI18N
        getContentPane().add(iconbanra, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 420, 210, -1));

        iconloinhuan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconloinhuan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/loinhuan.png"))); // NOI18N
        getContentPane().add(iconloinhuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 420, 210, -1));

        iconnhaphang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconnhaphang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/nhaphang.png"))); // NOI18N
        getContentPane().add(iconnhaphang, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 420, 190, -1));

        lblvnd.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblvnd.setForeground(new java.awt.Color(255, 255, 255));
        lblvnd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblvnd.setText("VNĐ");
        getContentPane().add(lblvnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 220, -1));

        lblvnd1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblvnd1.setForeground(new java.awt.Color(255, 255, 255));
        lblvnd1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblvnd1.setText("VNĐ");
        getContentPane().add(lblvnd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 220, -1));

        lblvnd2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblvnd2.setForeground(new java.awt.Color(255, 255, 255));
        lblvnd2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblvnd2.setText("VNĐ");
        getContentPane().add(lblvnd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 200, -1));

        lblTienLaiSo.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        lblTienLaiSo.setForeground(new java.awt.Color(255, 255, 255));
        lblTienLaiSo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTienLaiSo.setText("000.000.000");
        getContentPane().add(lblTienLaiSo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 220, -1));

        lblTienBanRaSo.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        lblTienBanRaSo.setForeground(new java.awt.Color(255, 255, 255));
        lblTienBanRaSo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTienBanRaSo.setText("000.000.000");
        getContentPane().add(lblTienBanRaSo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 220, -1));

        lblTienNhapSo.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        lblTienNhapSo.setForeground(new java.awt.Color(255, 255, 255));
        lblTienNhapSo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTienNhapSo.setText("000.000.000");
        getContentPane().add(lblTienNhapSo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 200, -1));

        lblTieuDeLoiNhuan.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblTieuDeLoiNhuan.setForeground(new java.awt.Color(255, 255, 255));
        lblTieuDeLoiNhuan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTieuDeLoiNhuan.setText("Tổng lợi nhuận");
        getContentPane().add(lblTieuDeLoiNhuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(501, 150, 220, -1));

        lblTieuDeDoanhThuBan.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblTieuDeDoanhThuBan.setForeground(new java.awt.Color(255, 255, 255));
        lblTieuDeDoanhThuBan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTieuDeDoanhThuBan.setText("Doanh thu bán ra");
        getContentPane().add(lblTieuDeDoanhThuBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 150, 220, -1));

        lblTieuDeChiPhiNhap.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblTieuDeChiPhiNhap.setForeground(new java.awt.Color(255, 255, 255));
        lblTieuDeChiPhiNhap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTieuDeChiPhiNhap.setText("Chi phí nhập hàng");
        getContentPane().add(lblTieuDeChiPhiNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 200, -1));

        lblnenban.setBackground(new java.awt.Color(0, 102, 51));
        lblnenban.setForeground(new java.awt.Color(0, 102, 51));
        lblnenban.setOpaque(true);
        getContentPane().add(lblnenban, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 220, 410));

        lblnenlai.setBackground(new java.awt.Color(0, 102, 51));
        lblnenlai.setForeground(new java.awt.Color(0, 102, 51));
        lblnenlai.setOpaque(true);
        getContentPane().add(lblnenlai, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 220, 410));

        lblnennhap.setBackground(new java.awt.Color(0, 102, 51));
        lblnennhap.setForeground(new java.awt.Color(0, 102, 51));
        lblnennhap.setOpaque(true);
        getContentPane().add(lblnennhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 200, 410));

        txtNgay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51), 2));
        txtNgay.setToolTipText("");
        txtNgay.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        txtNgay.setMargin(new java.awt.Insets(10, 6, -5, 10));
        txtNgay.setName(""); // NOI18N
        getContentPane().add(txtNgay, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 80, 30));

        lblNgay.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        lblNgay.setForeground(new java.awt.Color(0, 102, 51));
        lblNgay.setText("Ngày");
        getContentPane().add(lblNgay, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, -1, -1));

        lblNam.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        lblNam.setForeground(new java.awt.Color(0, 102, 51));
        lblNam.setText("Năm");
        getContentPane().add(lblNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, -1, -1));

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
        getContentPane().add(cboNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, 90, 30));

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
        getContentPane().add(cboThang, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 90, 30));

        lblThang.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        lblThang.setForeground(new java.awt.Color(0, 102, 51));
        lblThang.setText("Tháng");
        getContentPane().add(lblThang, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, -1, -1));

        lblSoluongKH.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblSoluongKH.setForeground(new java.awt.Color(255, 255, 255));
        lblSoluongKH.setText("5");
        getContentPane().add(lblSoluongKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 170, -1, -1));

        lblSoluongSPKho.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblSoluongSPKho.setForeground(new java.awt.Color(255, 255, 255));
        lblSoluongSPKho.setText("5");
        getContentPane().add(lblSoluongSPKho, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 270, -1, -1));

        lblSoluongSPBan.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblSoluongSPBan.setForeground(new java.awt.Color(255, 255, 255));
        lblSoluongSPBan.setText("5");
        getContentPane().add(lblSoluongSPBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 370, -1, -1));

        lblSoluongNCU.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblSoluongNCU.setForeground(new java.awt.Color(255, 255, 255));
        lblSoluongNCU.setText("5");
        getContentPane().add(lblSoluongNCU, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 470, -1, -1));

        lblSoluongNV.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblSoluongNV.setForeground(new java.awt.Color(255, 255, 255));
        lblSoluongNV.setText("5");
        getContentPane().add(lblSoluongNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 70, -1, -1));

        lblSPKho.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        lblSPKho.setForeground(new java.awt.Color(255, 255, 255));
        lblSPKho.setText("Sản phẩm kho");
        getContentPane().add(lblSPKho, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 240, -1, -1));

        lblSPBan.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        lblSPBan.setForeground(new java.awt.Color(255, 255, 255));
        lblSPBan.setText("Sản phẩm bán");
        getContentPane().add(lblSPBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 340, -1, -1));

        lblNCU.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        lblNCU.setForeground(new java.awt.Color(255, 255, 255));
        lblNCU.setText("Nhà cung ứng");
        getContentPane().add(lblNCU, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 440, -1, -1));

        lblKhachHang.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        lblKhachHang.setForeground(new java.awt.Color(255, 255, 255));
        lblKhachHang.setText("Khách hàng");
        getContentPane().add(lblKhachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 140, -1, -1));

        lblNhanVien.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        lblNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        lblNhanVien.setText("Nhân viên");
        getContentPane().add(lblNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 40, -1, -1));

        tblSanPhamTonKho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"NCU01", "Nước Cocacola", "Nuoc01", "Thành phát"}
            },
            new String [] {
                "Mã SP", "Tên SP", "Số lượng", "Tên NCU"
            }
        ));
        tblSanPhamTonKho.setColorBackgoundHead(new java.awt.Color(0, 102, 51));
        tblSanPhamTonKho.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblSanPhamTonKho.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tblSanPhamTonKho.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tblSanPhamTonKho.setColorSelBackgound(new java.awt.Color(204, 204, 204));
        tblSanPhamTonKho.setColorSelForeground(new java.awt.Color(0, 0, 0));
        tblSanPhamTonKho.setFillsViewportHeight(true);
        tblSanPhamTonKho.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        tblSanPhamTonKho.setFuenteFilas(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        tblSanPhamTonKho.setFuenteFilasSelect(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        tblSanPhamTonKho.setFuenteHead(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        tblSanPhamTonKho.setGridColor(new java.awt.Color(0, 102, 51));
        tblSanPhamTonKho.setGrosorBordeFilas(0);
        tblSanPhamTonKho.setGrosorBordeHead(0);
        tblSanPhamTonKho.setRowHeight(25);
        tblSanPhamTonKho.setShowGrid(false);
        tblSanPhamTonKho.setShowHorizontalLines(true);
        tblSanPhamTonKho.setShowVerticalLines(true);
        jScrollPane1.setViewportView(tblSanPhamTonKho);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 700, 450));

        tblSanPhamBan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SP", "Tên SP", "Số lượng bán", "Số hóa đơn"
            }
        ));
        tblSanPhamBan.setColorBackgoundHead(new java.awt.Color(0, 102, 51));
        tblSanPhamBan.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblSanPhamBan.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tblSanPhamBan.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tblSanPhamBan.setColorSelBackgound(new java.awt.Color(204, 204, 204));
        tblSanPhamBan.setColorSelForeground(new java.awt.Color(0, 0, 0));
        tblSanPhamBan.setFillsViewportHeight(true);
        tblSanPhamBan.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        tblSanPhamBan.setFuenteFilas(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        tblSanPhamBan.setFuenteFilasSelect(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        tblSanPhamBan.setFuenteHead(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        tblSanPhamBan.setGridColor(new java.awt.Color(0, 102, 51));
        tblSanPhamBan.setGrosorBordeFilas(0);
        tblSanPhamBan.setGrosorBordeHead(0);
        tblSanPhamBan.setRowHeight(25);
        tblSanPhamBan.setShowGrid(false);
        tblSanPhamBan.setShowHorizontalLines(true);
        tblSanPhamBan.setShowVerticalLines(true);
        jScrollPane2.setViewportView(tblSanPhamBan);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 700, 450));

        tblNhaCungUng.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"NCU01", "Nước Cocacola", "Nuoc01", "Thành phát"}
            },
            new String [] {
                "Tên NCU", "SĐT", "Địa chỉ", "Số lần nhập"
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
        tblNhaCungUng.setFuenteHead(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        tblNhaCungUng.setGridColor(new java.awt.Color(0, 102, 51));
        tblNhaCungUng.setGrosorBordeFilas(0);
        tblNhaCungUng.setGrosorBordeHead(0);
        tblNhaCungUng.setRowHeight(25);
        tblNhaCungUng.setShowGrid(false);
        tblNhaCungUng.setShowHorizontalLines(true);
        tblNhaCungUng.setShowVerticalLines(true);
        jScrollPane3.setViewportView(tblNhaCungUng);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 700, 450));

        btnGuiYCGia.setBackground(new java.awt.Color(0, 102, 51));
        btnGuiYCGia.setBorder(null);
        btnGuiYCGia.setText("YC Giảm Giá");
        btnGuiYCGia.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnGuiYCGia.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnGuiYCGia.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnGuiYCGia.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnGuiYCGia.setType(null);
        btnGuiYCGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuiYCGiaActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuiYCGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 470, 140, 40));

        btnExportFileSPKho.setBackground(new java.awt.Color(0, 102, 51));
        btnExportFileSPKho.setBorder(null);
        btnExportFileSPKho.setText("Xuất File");
        btnExportFileSPKho.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnExportFileSPKho.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnExportFileSPKho.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnExportFileSPKho.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnExportFileSPKho.setType(null);
        btnExportFileSPKho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportFileSPKhoActionPerformed(evt);
            }
        });
        getContentPane().add(btnExportFileSPKho, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 510, 140, 40));

        btnGuiYCNhap.setBackground(new java.awt.Color(0, 102, 51));
        btnGuiYCNhap.setBorder(null);
        btnGuiYCNhap.setText("YC Nhập Hàng");
        btnGuiYCNhap.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnGuiYCNhap.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnGuiYCNhap.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnGuiYCNhap.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnGuiYCNhap.setType(null);
        btnGuiYCNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuiYCNhapActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuiYCNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 470, 140, 40));

        btnExportFileSPBan.setBackground(new java.awt.Color(0, 102, 51));
        btnExportFileSPBan.setBorder(null);
        btnExportFileSPBan.setText("Xuấ File");
        btnExportFileSPBan.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnExportFileSPBan.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnExportFileSPBan.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnExportFileSPBan.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnExportFileSPBan.setType(null);
        btnExportFileSPBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportFileSPBanActionPerformed(evt);
            }
        });
        getContentPane().add(btnExportFileSPBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 510, 140, 40));

        lblTKSPBan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/3.png"))); // NOI18N
        lblTKSPBan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblTKSPBanMousePressed(evt);
            }
        });
        getContentPane().add(lblTKSPBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 330, 280, -1));

        lblTKKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/4.png"))); // NOI18N
        lblTKKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblTKKHMousePressed(evt);
            }
        });
        getContentPane().add(lblTKKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 130, 280, -1));

        lblTKSPKho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/2.png"))); // NOI18N
        lblTKSPKho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblTKSPKhoMousePressed(evt);
            }
        });
        getContentPane().add(lblTKSPKho, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 230, 280, -1));

        lblTKNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/5.png"))); // NOI18N
        lblTKNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblTKNVMousePressed(evt);
            }
        });
        getContentPane().add(lblTKNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 30, 280, -1));

        lblTieuDe.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTieuDe.setForeground(new java.awt.Color(255, 255, 255));
        lblTieuDe.setText("Top khách hàng tiềm năng");
        getContentPane().add(lblTieuDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 250, 30));

        lblNenTieuDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/7.png"))); // NOI18N
        getContentPane().add(lblNenTieuDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 290, 50));

        lblDoanhThu.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        lblDoanhThu.setForeground(new java.awt.Color(255, 255, 255));
        lblDoanhThu.setText("Doanh thu");
        getContentPane().add(lblDoanhThu, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 540, -1, -1));

        lblLoiNhuan.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblLoiNhuan.setForeground(new java.awt.Color(255, 255, 255));
        lblLoiNhuan.setText("5");
        getContentPane().add(lblLoiNhuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 570, -1, -1));

        lblTKDThu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/6.png"))); // NOI18N
        lblTKDThu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblTKDThuMousePressed(evt);
            }
        });
        getContentPane().add(lblTKDThu, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 530, 280, -1));

        lblNenManHinh.setBackground(new java.awt.Color(255, 255, 255));
        lblNenManHinh.setOpaque(true);
        getContentPane().add(lblNenManHinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 700, 450));

        btnViewChart.setBackground(new java.awt.Color(0, 102, 51));
        btnViewChart.setBorder(null);
        btnViewChart.setText("View Chart");
        btnViewChart.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnViewChart.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnViewChart.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnViewChart.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnViewChart.setType(null);
        btnViewChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewChartActionPerformed(evt);
            }
        });
        getContentPane().add(btnViewChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 470, 140, 40));

        btnExportFile.setBackground(new java.awt.Color(0, 102, 51));
        btnExportFile.setBorder(null);
        btnExportFile.setText("Xuất File");
        btnExportFile.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnExportFile.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnExportFile.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnExportFile.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnExportFile.setType(null);
        btnExportFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportFileActionPerformed(evt);
            }
        });
        getContentPane().add(btnExportFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 510, 140, 40));

        lblTKNCU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/1.png"))); // NOI18N
        lblTKNCU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblTKNCUMousePressed(evt);
            }
        });
        getContentPane().add(lblTKNCU, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 430, 280, -1));

        lblHinhMayTinhKKT.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblHinhMayTinhKKT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/maytinhKKT.png"))); // NOI18N
        getContentPane().add(lblHinhMayTinhKKT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 840, -1));

        lblHinhMayTinh.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblHinhMayTinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/edu/icon/maytinh.png"))); // NOI18N
        getContentPane().add(lblHinhMayTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 840, -1));

        cboThangDT.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        cboThangDT.setColorArrow(new java.awt.Color(0, 102, 51));
        cboThangDT.setColorBorde(new java.awt.Color(0, 102, 51));
        cboThangDT.setColorFondo(new java.awt.Color(0, 102, 51));
        cboThangDT.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        cboThangDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboThangDTActionPerformed(evt);
            }
        });
        getContentPane().add(cboThangDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 90, 30));

        lblThangDT.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        lblThangDT.setForeground(new java.awt.Color(0, 102, 51));
        lblThangDT.setText("Tháng");
        getContentPane().add(lblThangDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, -1, -1));

        lblNamDT.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        lblNamDT.setForeground(new java.awt.Color(0, 102, 51));
        lblNamDT.setText("Năm");
        getContentPane().add(lblNamDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, -1, -1));

        cboNamDT.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        cboNamDT.setColorArrow(new java.awt.Color(0, 102, 51));
        cboNamDT.setColorBorde(new java.awt.Color(0, 102, 51));
        cboNamDT.setColorFondo(new java.awt.Color(0, 102, 51));
        cboNamDT.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        cboNamDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNamDTActionPerformed(evt);
            }
        });
        getContentPane().add(cboNamDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, 90, 30));

        lblNenChung.setBackground(new java.awt.Color(255, 255, 255));
        lblNenChung.setOpaque(true);
        getContentPane().add(lblNenChung, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblTKNVMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTKNVMousePressed
        TKNhanVien();
    }//GEN-LAST:event_lblTKNVMousePressed

    private void lblTKKHMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTKKHMousePressed
        TKKhachHang();
    }//GEN-LAST:event_lblTKKHMousePressed

    private void lblTKDThuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTKDThuMousePressed
        TKDoanhThu();
    }//GEN-LAST:event_lblTKDThuMousePressed

    private void lblTKNCUMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTKNCUMousePressed
        TKNhaCungUng();
    }//GEN-LAST:event_lblTKNCUMousePressed

    private void lblTKSPKhoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTKSPKhoMousePressed
        TKSanPhamKho();
    }//GEN-LAST:event_lblTKSPKhoMousePressed

    private void lblTKSPBanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTKSPBanMousePressed
        TKSanPhamBan();
    }//GEN-LAST:event_lblTKSPBanMousePressed

    private void cboThangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboThangActionPerformed
        //        chonLoaiHang();
    }//GEN-LAST:event_cboThangActionPerformed

    private void cboNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNamActionPerformed
        fillTableSPBanChay();
    }//GEN-LAST:event_cboNamActionPerformed

    private void btnExportFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportFileActionPerformed
        try {
            XuatFileDoanhThu();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnExportFileActionPerformed

    private void btnViewChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewChartActionPerformed
        BieuDoIF db = new BieuDoIF();
        jPanelDeskop.removeAll();
        jPanelDeskop.add(db).setVisible(true);
        GreenOrganicJFrame.lblTieuDe.setText(" BIỂU ĐỒ DOANH THU"); 
        GreenOrganicJFrame.lblTieuDe.setFont(new java.awt.Font("Tahoma", 1, 19));
        DSHoaDonNhapjIF.count = 0;     
    }//GEN-LAST:event_btnViewChartActionPerformed

    private void btnGuiYCGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuiYCGiaActionPerformed
            SendMail sm = new SendMail(formChung, true);
            sm.setVisible(true);
    }//GEN-LAST:event_btnGuiYCGiaActionPerformed

    private void btnExportFileSPKhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportFileSPKhoActionPerformed
        XuatFileSPKho();
    }//GEN-LAST:event_btnExportFileSPKhoActionPerformed

    private void btnGuiYCNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuiYCNhapActionPerformed
        SendMail sm = new SendMail(formChung, true);
        sm.setVisible(true);
    }//GEN-LAST:event_btnGuiYCNhapActionPerformed

    private void btnExportFileSPBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportFileSPBanActionPerformed
        XuatSPBan();
    }//GEN-LAST:event_btnExportFileSPBanActionPerformed

    private void cboThangDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboThangDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboThangDTActionPerformed

    private void cboNamDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNamDTActionPerformed

        String day = txtNgay.getText();
        String month = (String) cboThangDT.getSelectedItem();
        int thang = Integer.parseInt(month);
        String year = (String) cboNamDT.getSelectedItem();
        int nam = Integer.parseInt(year);
        String date = year + "-" + month + "-" + day;

        if (txtNgay.getText().equals("") && !(cboThangDT.getSelectedIndex() == 0)) {
            List<Object[]> listThang = tkdao.getChiPhiNhapTheoThang(thang, nam);
            List<Object[]> listDTThang = new ThongKeDAO().getDoanhThuTheoThang(thang, nam);

            double tienNhapThang;
            double tienDoanhThu;
            if (listThang != null) {
                Object cpThang[] = listThang.get(0);

                if (cpThang[0] == null) {
                    tienNhapThang = 0;
                    String tien = String.valueOf(tienNhapThang);
                    lblTienNhapSo.setText(tien);
                } else {
                    tienNhapThang = (double) cpThang[0];
                    String tien = String.valueOf(String.format("%.0f", tienNhapThang));
                    lblTienNhapSo.setText(tien);
                }
            } else {
                lblTienNhapSo.setText("0");
            }

            if (listDTThang != null) {
                double tt = 0;
                for (int i = 0; i < listDTThang.size(); i++) {
                    Object dtThang[] = listDTThang.get(i);
                    tienDoanhThu = (double) dtThang[2];
                    tt = tienDoanhThu + tt;
                }
                String tien1 = String.valueOf(String.format("%.0f", tt));
                lblTienBanRaSo.setText(tien1);
            } else {
                lblTienBanRaSo.setText("0");
            }
            double tiennhap = Double.parseDouble(lblTienNhapSo.getText());
            double tienban = Double.parseDouble(lblTienBanRaSo.getText());
            lblTienLaiSo.setText(String.format("%.0f", (tienban - tiennhap)) + "");
        } else if (txtNgay.getText().equals("") && cboThangDT.getSelectedIndex() == 0) {
            double tienNhapNam;
            double tienDoanhThuNam;
            List<Object[]> listNam = tkdao.getChiPhiNhapTheoNam(nam);
            List<Object[]> listDTNam = tkdao.getDoanhThuTheoNam(nam);
            if (listNam != null) {
                Object cpNam[] = listNam.get(0);
                if (cpNam[0] == null) {
                    tienNhapNam = 0;
                    String tien = String.valueOf(tienNhapNam);
                    lblTienNhapSo.setText(tien);

                } else {
                    tienNhapNam = (double) cpNam[0];
                    String tien = String.valueOf(String.format("%.0f", tienNhapNam));
                    lblTienNhapSo.setText(tien);

                }
            } else {
                lblTienNhapSo.setText("0");
            }
            if (listDTNam != null) {
                double tt = 0;
                for (int i = 0; i < listDTNam.size(); i++) {
                    Object dtThang[] = listDTNam.get(i);
                    tienDoanhThuNam = (double) dtThang[2];
                    tt = tienDoanhThuNam + tt;
                }
                String tien1 = String.valueOf(String.format("%.0f", tt));
                lblTienBanRaSo.setText(tien1);
            } else {
                lblTienBanRaSo.setText("0");
            }
            double tiennhap = Double.parseDouble(lblTienNhapSo.getText());
            double tienban = Double.parseDouble(lblTienBanRaSo.getText());
            lblTienLaiSo.setText((tienban - tiennhap) + "");
        } else if (!(txtNgay.getText().equals("")) && !(cboThangDT.getSelectedIndex() == 0)) {
            double tienNhapNgay;
            double tienDoanhThuNgay;
            Date datex = DateHelper.toDate(date);
            List<Object[]> list = tkdao.getChiPhiNhapTheoNgay(datex);
            List<Object[]> list1 = tkdao.getDoanhThuTheoNgay(datex);
            if (list != null) {
                Object cp[] = list.get(0);
                if (cp[0] == null) {
                    tienNhapNgay = 0;
                    String tien = String.valueOf(tienNhapNgay);
                    lblTienNhapSo.setText(tien);
                } else {
                    tienNhapNgay = (double) cp[0];
                    String tien = String.valueOf(String.format("%.0f", tienNhapNgay));
                    lblTienNhapSo.setText(tien);
                }
            } else {
                lblTienNhapSo.setText("0");
            }
            if (list1 != null) {
                double tt = 0;
                for (int i = 0; i < list1.size(); i++) {
                    Object dtThang[] = list1.get(i);
                    tienDoanhThuNgay = (double) dtThang[2];
                    tt = tienDoanhThuNgay + tt;
                }
                String tien1 = String.valueOf(String.format("%.0f", tt));
                lblTienBanRaSo.setText(tien1 + "");
            } else {
                lblTienBanRaSo.setText("0");
            }
            double tiennhap = Double.parseDouble(lblTienNhapSo.getText());
            double tienban = Double.parseDouble(lblTienBanRaSo.getText());
            lblTienLaiSo.setText((tienban - tiennhap) + "");
        }
            

    }//GEN-LAST:event_cboNamDTActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SoHoaDonBanRaNV1;
    private javax.swing.JLabel SoHoaDonBanRaNV2;
    private javax.swing.JLabel SoHoaDonBanRaNV3;
    private rojerusan.RSMaterialButtonRectangle btnExportFile;
    private rojerusan.RSMaterialButtonRectangle btnExportFileSPBan;
    private rojerusan.RSMaterialButtonRectangle btnExportFileSPKho;
    private rojerusan.RSMaterialButtonRectangle btnGuiYCGia;
    private rojerusan.RSMaterialButtonRectangle btnGuiYCNhap;
    private rojerusan.RSMaterialButtonRectangle btnViewChart;
    private rojerusan.RSComboMetro cboNam;
    private rojerusan.RSComboMetro cboNamDT;
    private rojerusan.RSComboMetro cboThang;
    private rojerusan.RSComboMetro cboThangDT;
    private javax.swing.JLabel iconbanra;
    private javax.swing.JLabel iconloinhuan;
    private javax.swing.JLabel iconnhaphang;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblDoanhThu;
    private javax.swing.JLabel lblHinhMayTinh;
    private javax.swing.JLabel lblHinhMayTinhKKT;
    private javax.swing.JLabel lblKhachHang;
    private javax.swing.JLabel lblLoiNhuan;
    private javax.swing.JLabel lblNCU;
    private javax.swing.JLabel lblNV1;
    private javax.swing.JLabel lblNV2;
    private javax.swing.JLabel lblNV3;
    private javax.swing.JLabel lblNVTop1;
    private javax.swing.JLabel lblNVTop2;
    private javax.swing.JLabel lblNVTop3;
    private javax.swing.JLabel lblNam;
    private javax.swing.JLabel lblNamDT;
    private javax.swing.JLabel lblNenChung;
    private javax.swing.JLabel lblNenManHinh;
    private javax.swing.JLabel lblNenTieuDe;
    private javax.swing.JLabel lblNgay;
    private javax.swing.JLabel lblNhanVien;
    private javax.swing.JLabel lblSPBan;
    private javax.swing.JLabel lblSPKho;
    private javax.swing.JLabel lblSoluongKH;
    private javax.swing.JLabel lblSoluongNCU;
    private javax.swing.JLabel lblSoluongNV;
    private javax.swing.JLabel lblSoluongSPBan;
    private javax.swing.JLabel lblSoluongSPKho;
    private javax.swing.JLabel lblTKDThu;
    private javax.swing.JLabel lblTKKH;
    private javax.swing.JLabel lblTKNCU;
    private javax.swing.JLabel lblTKNV;
    private javax.swing.JLabel lblTKSPBan;
    private javax.swing.JLabel lblTKSPKho;
    private javax.swing.JLabel lblTenNVVitriTop1;
    private javax.swing.JLabel lblTenNVVitriTop2;
    private javax.swing.JLabel lblTenNVVitriTop3;
    private javax.swing.JLabel lblThang;
    private javax.swing.JLabel lblThangDT;
    private javax.swing.JLabel lblTienBanRaSo;
    private javax.swing.JLabel lblTienLaiSo;
    private javax.swing.JLabel lblTienNhapSo;
    private javax.swing.JLabel lblTieuDe;
    private javax.swing.JLabel lblTieuDeChiPhiNhap;
    private javax.swing.JLabel lblTieuDeDoanhThuBan;
    private javax.swing.JLabel lblTieuDeLoiNhuan;
    private javax.swing.JLabel lblnenban;
    private javax.swing.JLabel lblnenlai;
    private javax.swing.JLabel lblnennhap;
    private javax.swing.JLabel lblvnd;
    private javax.swing.JLabel lblvnd1;
    private javax.swing.JLabel lblvnd2;
    private rojeru_san.complementos.RSTableMetro tblNhaCungUng;
    private rojeru_san.complementos.RSTableMetro tblSanPhamBan;
    private rojeru_san.complementos.RSTableMetro tblSanPhamTonKho;
    private app.bolivia.swing.JCTextField txtNgay;
    // End of variables declaration//GEN-END:variables
    void init() {
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        
        List<NhanVien> nv  = new NhanVienDAO().selectAll();
        int slNV = nv.size();
        lblSoluongNV.setText(slNV + "");
        
        List<KhachHang> kh  = new KhachHangDAO().selectAll();
        int slKH = kh.size();
        lblSoluongKH.setText(slKH + "");
        
        SanPham sp =new SanPhamDAO().getTongSL();
        lblSoluongSPKho.setText(sp.getSoLuong()+"");
        
        HoaDonChiTietBan hdctb=new HDCTBanDAO().getTongSLB();
        lblSoluongSPBan.setText(hdctb.getSoLuong()+"");
        
        List<NhaCungUng> ncu=new NhaCungUngDAO().selectAll();
        lblSoluongNCU.setText(ncu.size()+"");
        
        List<HoaDonBan> hdb=new HoaDonBanDAO().TongDT();
        double tien = 0;
        for (int i = 0; i < hdb.size(); i++) {
            HoaDonBan hd = hdb.get(i);
            tien = tien + hd.getTongTien();
        }
        lblLoiNhuan.setText(tien+"");
    }
    
    void XuatFileDoanhThu() throws FileNotFoundException, IOException {
        String day = txtNgay.getText();
        String month = (String) cboThangDT.getSelectedItem();
        int thang = Integer.parseInt(month);
        String year = (String) cboNamDT.getSelectedItem();
        int nam = Integer.parseInt(year);
        String date = year + "-" + month + "-" + day;

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("DS_CHIPHINHAP_GO");
        XSSFSheet sheet1 = workbook.createSheet("DS_DOANHTHU_GO");
        XSSFSheet sheet2 = workbook.createSheet("TIENLAI_GO");
        XSSFRow row1, row2, row3, row4, row5, row6, row7, row8,row9,row10,row11,row12 = null;
        Cell cell, cell1, cell3, cell4, cell5, cell6, cell7, cell8, cell9, cell10= null;

        row1 = sheet.createRow(5);
        row2 = sheet.createRow(0);

        row3 = sheet1.createRow(5);
        row4 = sheet1.createRow(0);

        XSSFFont font = sheet.getWorkbook().createFont();
        font.setFontName("Calibri");
        font.setBold(true);
        font.setFontHeightInPoints((short) 15); // font size 
        font.setColor(IndexedColors.DARK_TEAL.getIndex());

        XSSFFont font1 = sheet.getWorkbook().createFont();
        font1.setColor(IndexedColors.DARK_TEAL.getIndex());
        font1.setFontHeightInPoints((short) 13);
        font1.setBold(true);

        XSSFFont font2 = sheet.getWorkbook().createFont();
        font2.setColor(IndexedColors.DARK_TEAL.getIndex());
        font2.setBold(true);
        
        CellStyle cellStyle3 = sheet.getWorkbook().createCellStyle();
        cellStyle3.setFont(font2);

        XSSFFont font3 = sheet1.getWorkbook().createFont();
        font3.setColor(IndexedColors.DARK_TEAL.getIndex());
        font3.setBold(true);
               

        CellStyle cellStyle = sheet.getWorkbook().createCellStyle();
        cellStyle.setFont(font);
        cellStyle.setBorderBottom(BorderStyle.DOTTED);
        cellStyle.setAlignment(HorizontalAlignment.CENTER);

        CellStyle cellStyle1 = sheet.getWorkbook().createCellStyle();
        cellStyle1.setFont(font1);
        cellStyle1.setBorderTop(BorderStyle.THIN);
        cellStyle1.setBorderLeft(BorderStyle.THIN);
        cellStyle1.setBorderRight(BorderStyle.THIN);
        cellStyle1.setBorderBottom(BorderStyle.THIN);
        cellStyle1.setAlignment(HorizontalAlignment.CENTER);

        CellStyle cellStyle2 = sheet.getWorkbook().createCellStyle();
        cellStyle2.setBorderTop(BorderStyle.THIN);
        cellStyle2.setBorderLeft(BorderStyle.THIN);
        cellStyle2.setBorderRight(BorderStyle.THIN);
        cellStyle2.setBorderBottom(BorderStyle.THIN);

        CellStyle cellStyle4 = sheet.getWorkbook().createCellStyle();
        cellStyle4.setFont(font3);
        
        CellStyle cellStyle5 = sheet.getWorkbook().createCellStyle();
        cellStyle5.setFont(font1);
        cellStyle5.setAlignment(HorizontalAlignment.RIGHT);
        
        CellStyle cellStyle6 = sheet.getWorkbook().createCellStyle();
        cellStyle6.setFont(font3);
        cellStyle6.setAlignment(HorizontalAlignment.CENTER);

//-----------------------------------HDN--------//
        cell = row1.createCell(3, CellType.STRING);
        cell.setCellValue("STT");
        cell.setCellStyle(cellStyle1);

        cell = row1.createCell(4, CellType.STRING);
        cell.setCellValue("Mã SP ");
        cell.setCellStyle(cellStyle1);

        cell = row1.createCell(5, CellType.STRING);
        cell.setCellValue("Mã HDN ");
        cell.setCellStyle(cellStyle1);

        cell = row1.createCell(6, CellType.STRING);
        cell.setCellValue("Tên Sản Phẩm  ");
        cell.setCellStyle(cellStyle1);

        cell = row1.createCell(7, CellType.STRING);
        cell.setCellValue("Số Lượng ");
        cell.setCellStyle(cellStyle1);

        cell = row1.createCell(8, CellType.STRING);
        cell.setCellValue("Đơn Giá ");
        cell.setCellStyle(cellStyle1);

        cell = row1.createCell(9, CellType.STRING);
        cell.setCellValue("Thành Tiền ");
        cell.setCellStyle(cellStyle1);
//-----------------------------------HDN--------//
//-----------------------------------DT--------//

        cell3 = row3.createCell(3, CellType.STRING);
        cell3.setCellValue("STT");
        cell3.setCellStyle(cellStyle1);

        cell3 = row3.createCell(4, CellType.STRING);
        cell3.setCellValue("Mã SP ");
        cell3.setCellStyle(cellStyle1);

        cell3 = row3.createCell(5, CellType.STRING);
        cell3.setCellValue("Mã HDB ");
        cell3.setCellStyle(cellStyle1);

        cell3 = row3.createCell(6, CellType.STRING);
        cell3.setCellValue("Tên Sản Phẩm  ");
        cell3.setCellStyle(cellStyle1);

        cell3 = row3.createCell(7, CellType.STRING);
        cell3.setCellValue("Đơn Giá ");
        cell3.setCellStyle(cellStyle1);

        cell3 = row3.createCell(8, CellType.STRING);
        cell3.setCellValue("Số Lượng ");
        cell3.setCellStyle(cellStyle1);

        cell3 = row3.createCell(9, CellType.STRING);
        cell3.setCellValue("Tổng Tiền ");
        cell3.setCellStyle(cellStyle1);

        cell3 = row3.createCell(10, CellType.STRING);
        cell3.setCellValue("Giảm Giá ");
        cell3.setCellStyle(cellStyle1);

        cell3 = row3.createCell(11, CellType.STRING);
        cell3.setCellValue("Thành Tiền ");
        cell3.setCellStyle(cellStyle1);
//-----------------------------------DT-------//
        double tnhap=0;
        double tban=0;

        if (txtNgay.getText().equals("") && !(cboThangDT.getSelectedIndex() == 0)) {// in báo cáo tháng
            List<HoaDonChiTietNhap> ls = new HDCTNhapDAO().tienNhapThang(thang, nam);
            List<Object[]> ls1 = new ThongKeDAO().getDoanhThuTheoThang(thang, nam);
            for (int i = 0; i < ls.size(); i++) {
                HoaDonChiTietNhap hdctn = ls.get(i);
                row1 = sheet.createRow(6 + i);

                cell = row1.createCell(3, CellType.NUMERIC);
                cell.setCellValue(i + 1);
                cell.setCellStyle(cellStyle2);

                cell = row1.createCell(4, CellType.STRING);
                cell.setCellValue(hdctn.getMaSPnhap());
                cell.setCellStyle(cellStyle2);

                cell = row1.createCell(5, CellType.STRING);
                cell.setCellValue(hdctn.getMaHDNnhap());
                cell.setCellStyle(cellStyle2);

                cell = row1.createCell(6, CellType.STRING);
                cell.setCellValue(hdctn.getTenSPnhap());
                cell.setCellStyle(cellStyle2);

                cell = row1.createCell(7, CellType.NUMERIC);
                cell.setCellValue(hdctn.getSoLuong());
                cell.setCellStyle(cellStyle2);

                cell = row1.createCell(8, CellType.NUMERIC);
                cell.setCellValue(hdctn.getGiaNhap());
                cell.setCellStyle(cellStyle2);

                cell = row1.createCell(9, CellType.NUMERIC);
                cell.setCellValue(hdctn.getTongTien());
                cell.setCellStyle(cellStyle2);
         
                tnhap=tnhap+hdctn.getTongTien();

                cell1 = row2.createCell(6, CellType.STRING);
                cell1.setCellValue("BÁO CÁO CHI PHÍ NHẬP THÁNG " + thang + " NĂM " + nam);
                cell1.setCellStyle(cellStyle);
            }
            row5 = sheet.createRow(1);
            cell5 = row5.createCell(8, CellType.STRING);
            cell5.setCellValue("NGÀY TẠO ");
            cell5.setCellStyle(cellStyle3);
            cell7 = row5.createCell(9, CellType.STRING);
            cell7.setCellValue(java.time.LocalDate.now().toString());

            row6 = sheet.createRow(2);
            cell6 = row6.createCell(8, CellType.STRING);
            cell6.setCellValue("NHÂN VIÊN TẠO ");
            cell6.setCellStyle(cellStyle3);
            cell8 = row6.createCell(9, CellType.STRING);
            cell8.setCellValue(AuthorHelper.user.getHoTen());
            
            row9=sheet.createRow(ls.size()+7);
            System.out.println(ls.size());
            cell7=row9.createCell(9, CellType.NUMERIC);
            cell7.setCellValue(tnhap+" VND");
            cell7.setCellStyle(cellStyle5);

            for (int j = 0; j < ls1.size(); j++) {
                Object sp[] = ls1.get(j);
                row3 = sheet1.createRow(6 + j);

                cell3 = row3.createCell(3, CellType.NUMERIC);
                cell3.setCellValue(j + 1);
                cell3.setCellStyle(cellStyle2);

                cell3 = row3.createCell(4, CellType.STRING);
                cell3.setCellValue((String) sp[6]);
                cell3.setCellStyle(cellStyle2);

                cell3 = row3.createCell(5, CellType.STRING);
                cell3.setCellValue((String) sp[7]);
                cell3.setCellStyle(cellStyle2);

                cell3 = row3.createCell(6, CellType.STRING);
                cell3.setCellValue((String) sp[5]);
                cell3.setCellStyle(cellStyle2);

                cell3 = row3.createCell(7, CellType.NUMERIC);
                cell3.setCellValue((double) sp[3]);
                cell3.setCellStyle(cellStyle2);

                cell3 = row3.createCell(8, CellType.NUMERIC);
                cell3.setCellValue((int) sp[4]);
                cell3.setCellStyle(cellStyle2);

                cell3 = row3.createCell(9, CellType.NUMERIC);
                cell3.setCellValue((double) sp[0]);
                cell3.setCellStyle(cellStyle2);

                cell3 = row3.createCell(10, CellType.NUMERIC);
                cell3.setCellValue((int) sp[1]);
                cell3.setCellStyle(cellStyle2);

                cell3 = row3.createCell(11, CellType.NUMERIC);
                cell3.setCellValue((double) sp[2]);
                cell3.setCellStyle(cellStyle2);
                
                tban=tban+(double)sp[2];

                cell4 = row4.createCell(6, CellType.STRING);
                cell4.setCellValue("BÁO CÁO DOANH THU THÁNG " + thang + " NĂM " + nam);
                cell4.setCellStyle(cellStyle);

            }
            row7 = sheet1.createRow(1);
            cell7 = row7.createCell(8, CellType.STRING);
            cell7.setCellValue("NGÀY TẠO ");
            cell7.setCellStyle(cellStyle4);
            cell9 = row7.createCell(9, CellType.STRING);
            cell9.setCellValue(java.time.LocalDate.now().toString());
            row8 = sheet1.createRow(2);
            cell8 = row8.createCell(8, CellType.STRING);
            cell8.setCellValue("NHÂN VIÊN TẠO ");
            cell8.setCellStyle(cellStyle4);
            cell10 = row8.createCell(9, CellType.STRING);
            cell10.setCellValue(AuthorHelper.user.getHoTen());
            
            row10=sheet1.createRow(ls1.size()+7);
            cell7=row10.createCell(11, CellType.NUMERIC);
            cell7.setCellValue(tban+" VND");
            cell7.setCellStyle(cellStyle5);
            
            row11=sheet2.createRow(1);
            cell8=row11.createCell(6, CellType.STRING);
            cell8.setCellValue("TIỀN LÃI THÁNG "+thang+" NĂM "+nam);
            cell8.setCellStyle(cellStyle);
           
            row12=sheet2.createRow(3);
            cell4=row12.createCell(6, CellType.STRING);
            cell4.setCellValue(tban+" - "+tnhap+" = "+(tban-tnhap)+" VND");
            cell4.setCellStyle(cellStyle6);
            

        } else if (txtNgay.getText().equals("") && cboThangDT.getSelectedIndex() == 0) {// in báo cáo năm
            List<HoaDonChiTietNhap> ls = new HDCTNhapDAO().tienNhapNam(nam);
            List<Object[]> ls1 = new ThongKeDAO().getDoanhThuTheoNam(nam);
            for (int i = 0; i < ls.size(); i++) {
                HoaDonChiTietNhap hdctn = ls.get(i);
                row1 = sheet.createRow(6 + i);

                cell = row1.createCell(3, CellType.NUMERIC);
                cell.setCellValue(i + 1);
                cell.setCellStyle(cellStyle2);

                cell = row1.createCell(4, CellType.STRING);
                cell.setCellValue(hdctn.getMaSPnhap());
                cell.setCellStyle(cellStyle2);

                cell = row1.createCell(5, CellType.STRING);
                cell.setCellValue(hdctn.getMaHDNnhap());
                cell.setCellStyle(cellStyle2);

                cell = row1.createCell(6, CellType.STRING);
                cell.setCellValue(hdctn.getTenSPnhap());
                cell.setCellStyle(cellStyle2);

                cell = row1.createCell(7, CellType.NUMERIC);
                cell.setCellValue(hdctn.getSoLuong());
                cell.setCellStyle(cellStyle2);

                cell = row1.createCell(8, CellType.NUMERIC);
                cell.setCellValue(hdctn.getGiaNhap());
                cell.setCellStyle(cellStyle2);

                cell = row1.createCell(9, CellType.NUMERIC);
                cell.setCellValue(hdctn.getTongTien());
                cell.setCellStyle(cellStyle2);
                
                tnhap=tnhap+hdctn.getTongTien();

                cell1 = row2.createCell(6, CellType.STRING);
                cell1.setCellValue("BÁO CÁO CHI PHÍ NHẬP NĂM " + nam);
                cell1.setCellStyle(cellStyle);

            }
            row5 = sheet.createRow(1);
            cell5 = row5.createCell(8, CellType.STRING);
            cell5.setCellValue("NGÀY TẠO ");
            cell5.setCellStyle(cellStyle3);
            cell7 = row5.createCell(9, CellType.STRING);
            cell7.setCellValue(java.time.LocalDate.now().toString());

            row6 = sheet.createRow(2);
            cell6 = row6.createCell(8, CellType.STRING);
            cell6.setCellValue("NHÂN VIÊN TẠO ");
            cell6.setCellStyle(cellStyle3);
            cell8 = row6.createCell(9, CellType.STRING);
            cell8.setCellValue(AuthorHelper.user.getHoTen());
            
            row9=sheet.createRow(ls.size()+7);
            System.out.println(ls.size());
            cell7=row9.createCell(9, CellType.NUMERIC);
            cell7.setCellValue(tnhap+" VND");
            cell7.setCellStyle(cellStyle5); 

            for (int j = 0; j < ls1.size(); j++) {
                Object sp[] = ls1.get(j);
                row3 = sheet1.createRow(6 + j);

                cell3 = row3.createCell(3, CellType.NUMERIC);
                cell3.setCellValue(j + 1);
                cell3.setCellStyle(cellStyle2);

                cell3 = row3.createCell(4, CellType.STRING);
                cell3.setCellValue((String) sp[6]);
                cell3.setCellStyle(cellStyle2);

                cell3 = row3.createCell(5, CellType.STRING);
                cell3.setCellValue((String) sp[7]);
                cell3.setCellStyle(cellStyle2);

                cell3 = row3.createCell(6, CellType.STRING);
                cell3.setCellValue((String) sp[5]);
                cell3.setCellStyle(cellStyle2);

                cell3 = row3.createCell(7, CellType.NUMERIC);
                cell3.setCellValue((double) sp[3]);
                cell3.setCellStyle(cellStyle2);

                cell3 = row3.createCell(8, CellType.NUMERIC);
                cell3.setCellValue((int) sp[4]);
                cell3.setCellStyle(cellStyle2);

                cell3 = row3.createCell(9, CellType.NUMERIC);
                cell3.setCellValue((double) sp[0]);
                cell3.setCellStyle(cellStyle2);

                cell3 = row3.createCell(10, CellType.NUMERIC);
                cell3.setCellValue((int) sp[1]);
                cell3.setCellStyle(cellStyle2);

                cell3 = row3.createCell(11, CellType.NUMERIC);
                cell3.setCellValue((double) sp[2]);
                cell3.setCellStyle(cellStyle2);
                
                tban=tban+(double)sp[2];

                cell4 = row4.createCell(6, CellType.STRING);
                cell4.setCellValue("BÁO CÁO DOANH THU NĂM " + nam);
                cell4.setCellStyle(cellStyle);
            }

            row7 = sheet1.createRow(1);
            cell7 = row7.createCell(8, CellType.STRING);
            cell7.setCellValue("NGÀY TẠO ");
            cell7.setCellStyle(cellStyle4);
            cell9 = row7.createCell(9, CellType.STRING);
            cell9.setCellValue(java.time.LocalDate.now().toString());
            
            row8 = sheet1.createRow(2);
            cell8 = row8.createCell(8, CellType.STRING);
            cell8.setCellValue("NHÂN VIÊN TẠO ");
            cell8.setCellStyle(cellStyle4);
            cell10 = row8.createCell(9, CellType.STRING);
            cell10.setCellValue(AuthorHelper.user.getHoTen());
            
            row10=sheet1.createRow(ls1.size()+7);
            cell7=row10.createCell(11, CellType.NUMERIC);
            cell7.setCellValue(tban+" VND");
            cell7.setCellStyle(cellStyle5);
            
            row11=sheet2.createRow(1);
            cell8=row11.createCell(6, CellType.STRING);
            cell8.setCellValue("TIỀN LÃI NĂM "+nam);
            cell8.setCellStyle(cellStyle);
           
            row12=sheet2.createRow(3);
            cell4=row12.createCell(6, CellType.STRING);
            cell4.setCellValue(tban+" - "+tnhap+" = "+(tban-tnhap)+" VND");
            cell4.setCellStyle(cellStyle6);

        } else if (!(txtNgay.getText().equals("")) && !(cboThangDT.getSelectedIndex() == 0)) {// in báo cáo ngày
            List<HoaDonChiTietNhap> ls = new HDCTNhapDAO().tienNhapNgay(DateHelper.toDate(date));
            List<Object[]> ls1 = new ThongKeDAO().getDoanhThuTheoNgay(DateHelper.toDate(date));
            for (int i = 0; i < ls.size(); i++) {
                HoaDonChiTietNhap hdctn = ls.get(i);
                row1 = sheet.createRow(6 + i);

                cell = row1.createCell(3, CellType.NUMERIC);
                cell.setCellValue(i + 1);
                cell.setCellStyle(cellStyle2);

                cell = row1.createCell(4, CellType.STRING);
                cell.setCellValue(hdctn.getMaSPnhap());
                cell.setCellStyle(cellStyle2);

                cell = row1.createCell(5, CellType.STRING);
                cell.setCellValue(hdctn.getMaHDNnhap());
                cell.setCellStyle(cellStyle2);

                cell = row1.createCell(6, CellType.STRING);
                cell.setCellValue(hdctn.getTenSPnhap());
                cell.setCellStyle(cellStyle2);

                cell = row1.createCell(7, CellType.NUMERIC);
                cell.setCellValue(hdctn.getSoLuong());
                cell.setCellStyle(cellStyle2);

                cell = row1.createCell(8, CellType.NUMERIC);
                cell.setCellValue(hdctn.getGiaNhap());
                cell.setCellStyle(cellStyle2);

                cell = row1.createCell(9, CellType.NUMERIC);
                cell.setCellValue(hdctn.getTongTien());
                cell.setCellStyle(cellStyle2);
                
                tnhap=tnhap+hdctn.getTongTien();

                cell1 = row2.createCell(6, CellType.STRING);
                cell1.setCellValue("BÁO CÁO CHI PHÍ NHẬP NGÀY " + date);
                cell1.setCellStyle(cellStyle);
            }

            row5 = sheet.createRow(1);
            cell5 = row5.createCell(8, CellType.STRING);
            cell5.setCellValue("NGÀY TẠO ");
            cell5.setCellStyle(cellStyle3);
            cell7 = row5.createCell(9, CellType.STRING);
            cell7.setCellValue(java.time.LocalDate.now().toString());

            row6 = sheet.createRow(2);
            cell6 = row6.createCell(8, CellType.STRING);
            cell6.setCellValue("NHÂN VIÊN TẠO ");
            cell6.setCellStyle(cellStyle3);
            cell8 = row6.createCell(9, CellType.STRING);
            cell8.setCellValue(AuthorHelper.user.getHoTen());
            
            row9=sheet.createRow(ls.size()+7);
            System.out.println(ls.size());
            cell7=row9.createCell(9, CellType.NUMERIC);
            cell7.setCellValue(tnhap+" VND");
            cell7.setCellStyle(cellStyle5); 

            for (int j = 0; j < ls1.size(); j++) {
                Object sp[] = ls1.get(j);
                row3 = sheet1.createRow(6 + j);

                cell3 = row3.createCell(3, CellType.NUMERIC);
                cell3.setCellValue(j + 1);
                cell3.setCellStyle(cellStyle2);

                cell3 = row3.createCell(4, CellType.STRING);
                cell3.setCellValue((String) sp[6]);
                cell3.setCellStyle(cellStyle2);

                cell3 = row3.createCell(5, CellType.STRING);
                cell3.setCellValue((String) sp[7]);
                cell3.setCellStyle(cellStyle2);

                cell3 = row3.createCell(6, CellType.STRING);
                cell3.setCellValue((String) sp[5]);
                cell3.setCellStyle(cellStyle2);

                cell3 = row3.createCell(7, CellType.NUMERIC);
                cell3.setCellValue((double) sp[3]);
                cell3.setCellStyle(cellStyle2);

                cell3 = row3.createCell(8, CellType.NUMERIC);
                cell3.setCellValue((int) sp[4]);
                cell3.setCellStyle(cellStyle2);

                cell3 = row3.createCell(9, CellType.NUMERIC);
                cell3.setCellValue((double) sp[0]);
                cell3.setCellStyle(cellStyle2);

                cell3 = row3.createCell(10, CellType.NUMERIC);
                cell3.setCellValue((int) sp[1]);
                cell3.setCellStyle(cellStyle2);

                cell3 = row3.createCell(11, CellType.NUMERIC);
                cell3.setCellValue((double) sp[2]);
                cell3.setCellStyle(cellStyle2);
                
                tban=tban+(double)sp[2];

                cell4 = row4.createCell(6, CellType.STRING);
                cell4.setCellValue("BÁO CÁO DOANH THU NGÀY " + date);
                cell4.setCellStyle(cellStyle);

            }
            row7 = sheet1.createRow(1);
            cell7 = row7.createCell(8, CellType.STRING);
            cell7.setCellValue("NGÀY TẠO ");
            cell7.setCellStyle(cellStyle4);
            cell9 = row7.createCell(9, CellType.STRING);
            cell9.setCellValue(java.time.LocalDate.now().toString());
            
            row8 = sheet1.createRow(2);
            cell8 = row8.createCell(8, CellType.STRING);
            cell8.setCellValue("NHÂN VIÊN TẠO ");
            cell8.setCellStyle(cellStyle4);
            cell10 = row8.createCell(9, CellType.STRING);
            cell10.setCellValue(AuthorHelper.user.getHoTen());
            
            row10=sheet1.createRow(ls1.size()+7);
            cell7=row10.createCell(11, CellType.NUMERIC);
            cell7.setCellValue(tban+" VND");
            cell7.setCellStyle(cellStyle5);
            
            row11=sheet2.createRow(1);
            cell8=row11.createCell(6, CellType.STRING);
            cell8.setCellValue("TIỀN LÃI NGÀY "+date);
            cell8.setCellStyle(cellStyle);
           
            row12=sheet2.createRow(3);
            cell4=row12.createCell(6, CellType.STRING);
            cell4.setCellValue(tban+" - "+tnhap+" = "+(tban-tnhap)+" VND");
            cell4.setCellStyle(cellStyle6);
        }
        for (int columnIndex = 0; columnIndex < 200; columnIndex++) {
            sheet.autoSizeColumn(columnIndex);
            sheet1.autoSizeColumn(columnIndex);
            sheet2.autoSizeColumn(columnIndex);
        }
        JFileChooser save = new JFileChooser();
        save.showSaveDialog(save);

        FileOutputStream fis = new FileOutputStream(save.getSelectedFile());
        workbook.write(fis);
        fis.close();
        BoxHelper.alert(this, "Lưu file thành công");
    
    }
    
    
    void XuatSPBan() {
        try {
            String thang = (String) cboThang.getSelectedItem();
            String nam = (String) cboNam.getSelectedItem();
            int month = Integer.valueOf(thang);
            int year = Integer.valueOf(nam);

            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("DS_SANPHAMBANCHAY_GO");

            XSSFFont font = sheet.getWorkbook().createFont();
            font.setFontName("Calibri");
            font.setBold(true);
            font.setFontHeightInPoints((short) 15); // font size
            font.setColor(IndexedColors.DARK_TEAL.getIndex());

            XSSFFont font2 = sheet.getWorkbook().createFont();
            font2.setColor(IndexedColors.DARK_TEAL.getIndex());
            font2.setBold(true);
            CellStyle cellStyle3 = sheet.getWorkbook().createCellStyle();
            cellStyle3.setFont(font2);

            CellStyle cellStyle = sheet.getWorkbook().createCellStyle();
            cellStyle.setFont(font);
            cellStyle.setBorderBottom(BorderStyle.DOTTED);

            XSSFFont font1 = sheet.getWorkbook().createFont();
            font1.setColor(IndexedColors.DARK_TEAL.getIndex());
            font1.setFontHeightInPoints((short) 13);
            font1.setBold(true);

            CellStyle cellStyle1 = sheet.getWorkbook().createCellStyle();
            cellStyle1.setFont(font1);
            cellStyle1.setBorderTop(BorderStyle.THIN);
            cellStyle1.setBorderLeft(BorderStyle.THIN);
            cellStyle1.setBorderRight(BorderStyle.THIN);
            cellStyle1.setBorderBottom(BorderStyle.THIN);

            CellStyle cellStyle2 = sheet.getWorkbook().createCellStyle();
            cellStyle2.setBorderLeft(BorderStyle.THIN);
            cellStyle2.setBorderRight(BorderStyle.THIN);
            cellStyle2.setBorderBottom(BorderStyle.THIN);
            XSSFRow row1, row2, row5, row6 = null;
            Cell cell, cell1, cell5, cell6, cell7, cell8 = null;

            row1 = sheet.createRow(5);
            row2 = sheet.createRow(0);

            cell = row1.createCell(3, CellType.STRING);
            cell.setCellValue("STT");
            cell.setCellStyle(cellStyle1);

            cell = row1.createCell(4, CellType.STRING);
            cell.setCellValue("Mã Sản Phẩm");
            cell.setCellStyle(cellStyle1);

            cell = row1.createCell(5, CellType.STRING);
            cell.setCellValue("Tên Sản Phẩm");
            cell.setCellStyle(cellStyle1);

            cell = row1.createCell(6, CellType.STRING);
            cell.setCellValue("Số Lượng Bán");
            cell.setCellStyle(cellStyle1);

            cell = row1.createCell(7, CellType.STRING);
            cell.setCellValue("Số Hóa Đơn");
            cell.setCellStyle(cellStyle1);

            List<Object[]> ls = new ThongKeDAO().getHangBanChay(month, year);
            for (int i = 0; i < ls.size(); i++) {
                Object spbc[] = ls.get(i);
                row1 = sheet.createRow(6 + i);

                cell = row1.createCell(3, CellType.NUMERIC);
                cell.setCellValue(i + 1);
                cell.setCellStyle(cellStyle2);

                cell = row1.createCell(4, CellType.STRING);
                cell.setCellValue((String) spbc[0]);
                cell.setCellStyle(cellStyle2);

                cell = row1.createCell(5, CellType.STRING);
                cell.setCellValue((String) spbc[1]);
                cell.setCellStyle(cellStyle2);

                cell = row1.createCell(6, CellType.NUMERIC);
                cell.setCellValue((int) spbc[2]);
                cell.setCellStyle(cellStyle2);

                cell = row1.createCell(7, CellType.NUMERIC);
                cell.setCellValue((int) spbc[3]);
                cell.setCellStyle(cellStyle2);
            }

            cell1 = row2.createCell(5, CellType.STRING);
            cell1.setCellValue("BÁO CÁO SẢN PHẨM BÁN CHAỴ THÁNG " + thang + " NĂM " + nam);
            cell1.setCellStyle(cellStyle);

            row5 = sheet.createRow(1);
            cell5 = row5.createCell(6, CellType.STRING);
            cell5.setCellValue("NGÀY TẠO ");
            cell5.setCellStyle(cellStyle3);
            cell7 = row5.createCell(7, CellType.STRING);
            cell7.setCellValue(java.time.LocalDate.now().toString());

            row6 = sheet.createRow(2);
            cell6 = row6.createCell(6, CellType.STRING);
            cell6.setCellValue("NHÂN VIÊN TẠO ");
            cell6.setCellStyle(cellStyle3);
            cell8 = row6.createCell(7, CellType.STRING);
            cell8.setCellValue(AuthorHelper.user.getHoTen());

            for (int columnIndex = 0; columnIndex < 100; columnIndex++) {
                sheet.autoSizeColumn(columnIndex);
            }

            JFileChooser save = new JFileChooser();
            save.showSaveDialog(save);

            FileOutputStream fis = new FileOutputStream(save.getSelectedFile());
            workbook.write(fis);
            fis.close();
            BoxHelper.alert(this, "Lưu file thành công");
        } catch (Exception e) {
        }
    }
        
     void XuatFileSPKho() {
        try {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("DS_SANPHAMKHO_GO");

            XSSFRow row1, row2,row5,row6 = null;
            Cell cell, cell1,cell5,cell6,cell7,cell8 = null;

            XSSFFont font = sheet.getWorkbook().createFont();
            font.setFontName("Calibri");
            font.setBold(true);
            font.setFontHeightInPoints((short) 15); // font size
            font.setColor(IndexedColors.DARK_TEAL.getIndex());
            
            XSSFFont font2 = sheet.getWorkbook().createFont();
            font2.setColor(IndexedColors.DARK_TEAL.getIndex());
            font2.setBold(true);
            CellStyle cellStyle3 = sheet.getWorkbook().createCellStyle();
            cellStyle3.setFont(font2);

            CellStyle cellStyle = sheet.getWorkbook().createCellStyle();
            cellStyle.setFont(font);
            cellStyle.setBorderBottom(BorderStyle.DOTTED);

            XSSFFont font1 = sheet.getWorkbook().createFont();
            font1.setColor(IndexedColors.DARK_TEAL.getIndex());
            font1.setFontHeightInPoints((short) 13);
            font1.setBold(true);

            CellStyle cellStyle1 = sheet.getWorkbook().createCellStyle();
            cellStyle1.setFont(font1);
            cellStyle1.setBorderTop(BorderStyle.THIN);
            cellStyle1.setBorderLeft(BorderStyle.THIN);
            cellStyle1.setBorderRight(BorderStyle.THIN);
            cellStyle1.setBorderBottom(BorderStyle.THIN);

            CellStyle cellStyle2 = sheet.getWorkbook().createCellStyle();
            cellStyle2.setBorderLeft(BorderStyle.THIN);
            cellStyle2.setBorderRight(BorderStyle.THIN);
            cellStyle2.setBorderBottom(BorderStyle.THIN);

            row1 = sheet.createRow(5);
            row2 = sheet.createRow(0);

            cell = row1.createCell(3, CellType.STRING);
            cell.setCellValue("STT");
            cell.setCellStyle(cellStyle1);

            cell = row1.createCell(4, CellType.STRING);
            cell.setCellValue("Mã Sản Phẩm");
            cell.setCellStyle(cellStyle1);

            cell = row1.createCell(5, CellType.STRING);
            cell.setCellValue("Tên Sản Phẩm");
            cell.setCellStyle(cellStyle1);

            cell = row1.createCell(6, CellType.STRING);
            cell.setCellValue("Số Lượng Tồn");
            cell.setCellStyle(cellStyle1);

            cell = row1.createCell(7, CellType.STRING);
            cell.setCellValue("Hạn Sử Dụng");
            cell.setCellStyle(cellStyle1);

            List<Object[]> ls = new ThongKeDAO().getHangTonKho();
            for (int i = 0; i < ls.size(); i++) {
                Object sp[] = ls.get(i);
                row1 = sheet.createRow(6 + i);

                cell = row1.createCell(3, CellType.NUMERIC);
                cell.setCellValue(i + 1);
                cell.setCellStyle(cellStyle2);

                cell = row1.createCell(4, CellType.STRING);
                cell.setCellValue((String) sp[0]);
                cell.setCellStyle(cellStyle2);

                cell = row1.createCell(5, CellType.STRING);
                cell.setCellValue((String) sp[1]);
                cell.setCellStyle(cellStyle2);

                cell = row1.createCell(6, CellType.NUMERIC);
                cell.setCellValue((int) sp[2]);
                cell.setCellStyle(cellStyle2);

                cell = row1.createCell(7, CellType.STRING);
                cell.setCellValue(DateHelper.toString((Date) sp[3], "yyyy-MM-dd"));
                cell.setCellStyle(cellStyle2);

            }

            cell1 = row2.createCell(5, CellType.STRING);
            cell1.setCellValue("BÁO CÁO SẢN PHẨM TỒN KHO GREENORGANIC ");
            cell1.setCellStyle(cellStyle);
            
            row5 = sheet.createRow(1);
            cell5 = row5.createCell(6, CellType.STRING);
            cell5.setCellValue("NGÀY TẠO ");
            cell5.setCellStyle(cellStyle3);
            cell7 = row5.createCell(7, CellType.STRING);
            cell7.setCellValue(java.time.LocalDate.now().toString());

            row6 = sheet.createRow(2);
            cell6 = row6.createCell(6, CellType.STRING);
            cell6.setCellValue("NHÂN VIÊN TẠO ");
            cell6.setCellStyle(cellStyle3);
            cell8 = row6.createCell(7, CellType.STRING);
            cell8.setCellValue(AuthorHelper.user.getHoTen());

            for (int columnIndex = 0; columnIndex < 100; columnIndex++) {
                sheet.autoSizeColumn(columnIndex);
            }

            JFileChooser save = new JFileChooser();
            save.showSaveDialog(save);

            FileOutputStream fis = new FileOutputStream(save.getSelectedFile());
            workbook.write(fis);
            fis.close();
            BoxHelper.alert(this, "Lưu file thành công");

        } catch (Exception e) {
            e.printStackTrace();
        }
            
    }
    
}
