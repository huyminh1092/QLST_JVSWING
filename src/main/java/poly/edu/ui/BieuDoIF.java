/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.edu.ui;

import poly.edu.chart.ModelChart;
import java.awt.Color;
import java.util.List;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import poly.edu.dao.HoaDonBanDAO;
import poly.edu.dao.HoaDonNhapDAO;
import poly.edu.dao.ThongKeDAO;
import poly.edu.entity.HoaDonBan;
import poly.edu.entity.HoaDonNhap;

/**
 *
 * @author Minh Huy
 */
public class BieuDoIF extends javax.swing.JInternalFrame {

    /**
     * Creates new form demonhe
     */
    double tongtiennhap = 0;
    double tongtienban = 0;
    double dt1, dt2, dt3, dt4, dt5, dt6, dt7, dt8, dt9, dt10, dt11, dt12 = 0;
    List<Object[]> listDT1 = new ThongKeDAO().getDoanhThuTheoThang(1, 2021);
    List<Object[]> listDT2 = new ThongKeDAO().getDoanhThuTheoThang(2, 2021);
    List<Object[]> listDT3 = new ThongKeDAO().getDoanhThuTheoThang(3, 2021);
    List<Object[]> listDT4 = new ThongKeDAO().getDoanhThuTheoThang(4, 2021);
    List<Object[]> listDT5 = new ThongKeDAO().getDoanhThuTheoThang(5, 2021);
    List<Object[]> listDT6 = new ThongKeDAO().getDoanhThuTheoThang(6, 2021);
    List<Object[]> listDT7 = new ThongKeDAO().getDoanhThuTheoThang(7, 2021);
    List<Object[]> listDT8 = new ThongKeDAO().getDoanhThuTheoThang(8, 2021);
    List<Object[]> listDT9 = new ThongKeDAO().getDoanhThuTheoThang(9, 2021);
    List<Object[]> listDT10 = new ThongKeDAO().getDoanhThuTheoThang(10, 2021);
    List<Object[]> listDT11 = new ThongKeDAO().getDoanhThuTheoThang(11, 2021);
    List<Object[]> listDT12 = new ThongKeDAO().getDoanhThuTheoThang(12, 2021);

    public BieuDoIF() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ci = (BasicInternalFrameUI) this.getUI();
        ci.setNorthPane(null);
        init();
    }

    void init() {
        HoaDonNhap hdn1 = new HoaDonNhapDAO().findTN(1);
        HoaDonNhap hdn2 = new HoaDonNhapDAO().findTN(2);
        HoaDonNhap hdn3 = new HoaDonNhapDAO().findTN(3);
        HoaDonNhap hdn4 = new HoaDonNhapDAO().findTN(4);
        HoaDonNhap hdn5 = new HoaDonNhapDAO().findTN(5);
        HoaDonNhap hdn6 = new HoaDonNhapDAO().findTN(6);
        HoaDonNhap hdn7 = new HoaDonNhapDAO().findTN(7);
        HoaDonNhap hdn8 = new HoaDonNhapDAO().findTN(8);
        HoaDonNhap hdn9 = new HoaDonNhapDAO().findTN(9);
        HoaDonNhap hdn10 = new HoaDonNhapDAO().findTN(10);
        HoaDonNhap hdn11 = new HoaDonNhapDAO().findTN(11);
        HoaDonNhap hdn12 = new HoaDonNhapDAO().findTN(12);

        tongtiennhap = hdn1.getTongTienNhap() + hdn2.getTongTienNhap() + hdn3.getTongTienNhap() + hdn4.getTongTienNhap()
                + hdn5.getTongTienNhap() + hdn6.getTongTienNhap() + hdn7.getTongTienNhap() + hdn8.getTongTienNhap() + hdn9.getTongTienNhap()
                + hdn10.getTongTienNhap() + hdn11.getTongTienNhap() + hdn12.getTongTienNhap();

        if (listDT1 != null) {
            for (int i = 0; i < listDT1.size(); i++) {
                Object dtop1[] = listDT1.get(i);
                double tiendt = (double) dtop1[2];
                dt1 = dt1 + tiendt;
                System.out.println(dt1);
            }
        }
        if (listDT2 != null) {
            for (int i = 0; i < listDT2.size(); i++) {
                Object dtop2[] = listDT2.get(i);
                double tiendt = (double) dtop2[2];
                dt2 = dt2 + tiendt;
            }
        }
        if (listDT3 != null) {
            for (int i = 0; i < listDT3.size(); i++) {
                Object dtop3[] = listDT3.get(i);
                double tiendt = (double) dtop3[2];
                dt3 = dt3 + tiendt;
            }
        }
        if (listDT4 != null) {
            for (int i = 0; i < listDT4.size(); i++) {
                Object dtop4[] = listDT4.get(i);
                double tiendt = (double) dtop4[2];
                dt4 = dt4 + tiendt;
            }
        }
        if (listDT5 != null) {
            for (int i = 0; i < listDT5.size(); i++) {
                Object dtop5[] = listDT5.get(i);
                double tiendt = (double) dtop5[2];
                dt5 = dt5 + tiendt;
            }
        }
        if (listDT6 != null) {
            for (int i = 0; i < listDT6.size(); i++) {
                Object dtop6[] = listDT6.get(i);
                double tiendt = (double) dtop6[2];
                dt6 = dt6 + tiendt;
            }
        }
        if (listDT7 != null) {
            for (int i = 0; i < listDT7.size(); i++) {
                Object dtop7[] = listDT7.get(i);
                double tiendt = (double) dtop7[2];
                dt7 = dt7 + tiendt;
            }
        }
        if (listDT8 != null) {
            for (int i = 0; i < listDT8.size(); i++) {
                Object dtop8[] = listDT8.get(i);
                double tiendt = (double) dtop8[2];
                dt8 = dt8 + tiendt;
            }
        }
        if (listDT9 != null) {
            for (int i = 0; i < listDT9.size(); i++) {
                Object dtop9[] = listDT9.get(i);
                double tiendt = (double) dtop9[2];
                dt9 = dt9 + tiendt;
            }
        }
        if (listDT10 != null) {
            for (int i = 0; i < listDT10.size(); i++) {
                Object dtop10[] = listDT10.get(i);
                double tiendt = (double) dtop10[2];
                dt10 = dt10 + tiendt;
            }
        }
        if (listDT11 != null) {
            for (int i = 0; i < listDT11.size(); i++) {
                Object dtop11[] = listDT11.get(i);
                double tiendt = (double) dtop11[2];
                dt11 = dt11 + tiendt;
            }
        }
        if (listDT12 != null) {
            for (int i = 0; i < listDT12.size(); i++) {
                Object dtop12[] = listDT12.get(i);
                double tiendt = (double) dtop12[2];
                dt12 = dt12 + tiendt;
            }
        }

        tongtienban = dt1 + dt2 + dt3 + dt4 + dt5 + dt6 + dt7 + dt8 + dt9 + dt10 + dt11 + dt12;
        chart.addLegend("DOANH THU", new Color(12, 84, 175), new Color(74, 211, 193));
        chart.addLegend("TIỀN NHẬP", new Color(186, 37, 37), new Color(241, 100, 120));
        chart.addLegend("TIỀN LÃI", new Color(5, 125, 0), new Color(255, 255, 51));
//        chart.addLegend("Cost", new Color(186, 37, 37), new Color(241, 100, 120));

        chart.addData(new ModelChart("Jan", new double[]{dt1, hdn1.getTongTienNhap(), (dt1 - hdn1.getTongTienNhap())}));
        chart.addData(new ModelChart("Feb", new double[]{dt2, hdn2.getTongTienNhap(), (dt2 - hdn2.getTongTienNhap())}));
        chart.addData(new ModelChart("Mar", new double[]{dt3, hdn3.getTongTienNhap(), (dt3 - hdn3.getTongTienNhap())}));
        chart.addData(new ModelChart("Apr", new double[]{dt4, hdn4.getTongTienNhap(), (dt4 - hdn4.getTongTienNhap())}));
        chart.addData(new ModelChart("May", new double[]{dt5, hdn5.getTongTienNhap(), (dt5 - hdn5.getTongTienNhap())}));
        chart.addData(new ModelChart("June", new double[]{dt6, hdn6.getTongTienNhap(), (dt6 - hdn6.getTongTienNhap())}));
        chart.addData(new ModelChart("July", new double[]{dt7, hdn7.getTongTienNhap(), (dt7 - hdn7.getTongTienNhap())}));
        chart.addData(new ModelChart("Aug", new double[]{dt8, hdn8.getTongTienNhap(), (dt8 - hdn8.getTongTienNhap())}));
        chart.addData(new ModelChart("Sep", new double[]{dt9, hdn9.getTongTienNhap(), (dt9 - hdn9.getTongTienNhap())}));
        chart.addData(new ModelChart("Oct", new double[]{dt10, hdn10.getTongTienNhap(), (dt10 - hdn10.getTongTienNhap())}));
        chart.addData(new ModelChart("Nov", new double[]{dt11, hdn11.getTongTienNhap(), (dt11 - hdn11.getTongTienNhap())}));
        chart.addData(new ModelChart("Dec", new double[]{dt12, hdn12.getTongTienNhap(), (dt12 - hdn12.getTongTienNhap())}));
        chart.start();

        lineChart.addLegend("DOANH THU", new Color(12, 84, 175), new Color(74, 211, 193));
        lineChart.addLegend("TIỀN NHẬP", new Color(186, 37, 37), new Color(241, 100, 120));
        lineChart.addLegend("TIỀN LÃI", new Color(5, 125, 0), new Color(255, 255, 51));

        lineChart.addData(new ModelChart("Jan", new double[]{dt1, hdn1.getTongTienNhap(), dt1 - hdn1.getTongTienNhap()}));
        lineChart.addData(new ModelChart("Feb", new double[]{dt2, hdn2.getTongTienNhap(), dt2 - hdn2.getTongTienNhap()}));
        lineChart.addData(new ModelChart("Mar", new double[]{dt3, hdn3.getTongTienNhap(), dt3 - hdn3.getTongTienNhap()}));

        lineChart.addData(new ModelChart("Apr", new double[]{dt4, hdn4.getTongTienNhap(), dt4 - hdn4.getTongTienNhap()}));
        lineChart.addData(new ModelChart("May", new double[]{dt5, hdn5.getTongTienNhap(), dt5 - hdn5.getTongTienNhap()}));
        lineChart.addData(new ModelChart("June", new double[]{dt6, hdn6.getTongTienNhap(), dt6 - hdn6.getTongTienNhap()}));
        lineChart.addData(new ModelChart("July", new double[]{dt7, hdn7.getTongTienNhap(), dt7 - hdn7.getTongTienNhap()}));
        lineChart.addData(new ModelChart("Aug", new double[]{dt8, hdn8.getTongTienNhap(), dt8 - hdn8.getTongTienNhap()}));
        lineChart.addData(new ModelChart("Sep", new double[]{dt9, hdn9.getTongTienNhap(), dt9 - hdn9.getTongTienNhap()}));
        lineChart.addData(new ModelChart("Oct", new double[]{dt10, hdn10.getTongTienNhap(), dt10 - hdn10.getTongTienNhap()}));
        lineChart.addData(new ModelChart("Nov", new double[]{dt11, hdn11.getTongTienNhap(), dt11 - hdn11.getTongTienNhap()}));
        lineChart.addData(new ModelChart("Dec", new double[]{dt12, hdn12.getTongTienNhap(), dt12 - hdn12.getTongTienNhap()}));
        lineChart.start();;
//    progress2.setValuSe();
        int dt = (int) Math.round((tongtienban / (tongtienban + tongtiennhap)) * 100);

        int tn = (int) Math.round(((tongtiennhap) / (tongtienban + tongtiennhap)) * 100);

        int tl = (int) Math.round(((tongtienban - tongtiennhap) / (tongtienban + tongtiennhap)) * 100);

        progress1.setValue(dt);
        progress1.start();
        progress2.setValue(tn);
        progress2.start();
        progress3.setValue(tl);
        progress3.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new poly.edu.swings.RoundPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        progress1 = new poly.edu.swing.progress.Progress();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        progress2 = new poly.edu.swing.progress.Progress();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        progress3 = new poly.edu.swing.progress.Progress();
        roundPanel2 = new poly.edu.swings.RoundPanel();
        chart = new poly.edu.chart.Chart();
        roundPanel3 = new poly.edu.swings.RoundPanel();
        lineChart = new poly.edu.chart.LineChart();

        roundPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TIỀN DOANH THU");

        progress1.setForeground(new java.awt.Color(0, 0, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(progress1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(progress1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 0));
        jLabel2.setText("BÁO CÁO DOANH THU NĂM 2021");

        jPanel2.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TIỀN NHẬP HÀNG");

        progress2.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(progress2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(progress2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TIỀN LÃI NĂM");

        progress3.setForeground(new java.awt.Color(0, 102, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(progress3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(progress3, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(119, 119, 119))
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        roundPanel2.setBackground(new java.awt.Color(51, 51, 51));

        chart.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        javax.swing.GroupLayout roundPanel2Layout = new javax.swing.GroupLayout(roundPanel2);
        roundPanel2.setLayout(roundPanel2Layout);
        roundPanel2Layout.setHorizontalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, 1094, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundPanel2Layout.setVerticalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                .addContainerGap())
        );

        roundPanel3.setBackground(new java.awt.Color(51, 51, 51));

        lineChart.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        javax.swing.GroupLayout roundPanel3Layout = new javax.swing.GroupLayout(roundPanel3);
        roundPanel3.setLayout(roundPanel3Layout);
        roundPanel3Layout.setHorizontalGroup(
            roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lineChart, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundPanel3Layout.setVerticalGroup(
            roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lineChart, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(roundPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private poly.edu.chart.Chart chart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private poly.edu.chart.LineChart lineChart;
    private poly.edu.swing.progress.Progress progress1;
    private poly.edu.swing.progress.Progress progress2;
    private poly.edu.swing.progress.Progress progress3;
    private poly.edu.swings.RoundPanel roundPanel1;
    private poly.edu.swings.RoundPanel roundPanel2;
    private poly.edu.swings.RoundPanel roundPanel3;
    // End of variables declaration//GEN-END:variables
}
