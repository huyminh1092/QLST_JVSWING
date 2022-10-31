
package poly.edu.helper;

import java.awt.Color;
import static java.awt.Color.white;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import org.apache.xmlbeans.impl.values.JavaBase64Holder;


public class DataValidateHelper {
    public static void validateEmpty(JTextField field, StringBuilder sb, String errorMessage){ //Text Field
        if (field.getText().equals("")) {
            sb.append(errorMessage).append("\n");
            field.setBackground(Color.yellow);
            field.requestFocus();
        }else{
            field.setBackground(Color.white);
        }
    }
    
    public static void validateEmptyAddress(JTextArea field, StringBuilder sb, String errorMessage){ //TextArea
        if (field.getText().equals("")) {
            sb.append(errorMessage).append("\n");
            field.setBackground(Color.yellow);
            field.requestFocus();
        }else{
            field.setBackground(Color.white);
        }
    }
    
    public static void validateEmptyForLabel(JLabel label, StringBuilder sb, String errorMessage){
         if (label.getToolTipText() == null) {
            sb.append(errorMessage).append("\n");
         }
    }
    
    public static boolean checkNumber(JTextField field, StringBuilder sb, String errorMessage) {
        boolean check = true;
        if (field.getText().equals("")) {
            return false;
        }
       
        try {
            float point = Float.parseFloat(field.getText());
            
            if (point < 0) {
                sb.append(errorMessage).append("\n");
                field.setBackground(Color.yellow);
                field.requestFocus();
                check = false;
            }
        } catch (Exception e) {
            sb.append(errorMessage).append("\n");
            field.setBackground(Color.yellow);
            field.requestFocus();
            check = false;
        }
        if (check) {
            field.setBackground(Color.white);
        }
        return check;
    }
    
    public static void validateEmpty(JPasswordField field, StringBuilder sb, String errorMessage){ //PasswordField
        String password = new String(field.getPassword());
        if (password.equals("")) {
            sb.append(errorMessage).append("\n");
            field.setBackground(Color.yellow);
            field.requestFocus();
        }else{
            field.setBackground(Color.white);
        }
    }
    
    public static boolean checkEmail(JTextField field, StringBuilder sb, String errorMessage) {
        boolean check = true;
        if (field.getText().equals("")) {
            return false;
        }

        Pattern pt = Pattern.compile("\\w+@\\w+\\.\\w+");//cung cap mau
        Matcher matcher = pt.matcher(field.getText());//kiem tra chuoi nhap vao có dúng vs mau khong

        if (!matcher.find()) {
            sb.append(errorMessage).append("\n");
            field.setBackground(Color.yellow);
            field.requestFocus();
            check = false;
        }
        
        if (check) {
            field.setBackground(Color.white);;
        }
        return check;
    }
    
    public static boolean checkPhone(JTextField field, StringBuilder sb, String errorMessage) {
        boolean check = true;
        if (field.getText().equals("")) {
            return false;
        }

        Pattern pt = Pattern.compile("^0\\d{9,10}$");//cung cap mau
        Matcher matcher = pt.matcher(field.getText());//kiem tra chuoi nhap vao có dúng vs mau khong

        if (!matcher.find()) {
            sb.append(errorMessage).append("\n");
            field.setBackground(Color.yellow);
            field.requestFocus();
            check = false;
        }
        
        if (check) {
            field.setBackground(Color.white);;
        }
        return check;
    }
    
    
    public static boolean isValidDate(String inDate) {

        if (inDate == null) {
            return false;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        if (inDate.trim().length() != dateFormat.toPattern().length()) {
            return false;
        }

        dateFormat.setLenient(false);

        try {
            //parse the inDate parameter
            dateFormat.parse(inDate.trim());
        } catch (ParseException pe) {
            return false;
        }
        return true;
    }

    //định dạng dd/MM/yyyy (hoặc d/M/yyyy nếu là số 0 đứng trước)
    public static boolean checkDate(JTextField txt, StringBuilder sb, String errorMessage) {
        boolean check = true;
        
        if (txt.getText().equals("")) {
            return false;
        }
            String id = txt.getText();
            if (isValidDate(id)) {
                return true;
            } else {
                sb.append(errorMessage).append("\n");
                txt.setBackground(Color.yellow);
                check = false;
            }
            if (check) {
                txt.setBackground(white);
        }
            return check;
    }
    
    public static void validateComboBox(JComboBox cboBox, StringBuilder sb, String errorMessage){ //Text Field
        if (cboBox.getSelectedIndex() == 0) {
            sb.append(errorMessage).append("\n");
            cboBox.requestFocus();
        }
    }
    public static boolean CheckNgayDKKH(JTextField field1, JTextField field2) {
        Date date1 = DateHelper.toDate(field1.getText());
        Date date2 = DateHelper.toDate(field2.getText());
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        c1.setTime(date1);
        c2.setTime(date2);
        long a = (c1.getTime().getTime() - c2.getTime().getTime()) / (24 * 3600 * 1000);
        if (a >= 1095) {
            field2.setBackground(Color.WHITE);
            return true;
        } else {
            field2.setBackground(Color.YELLOW);
            return false;
        }
    }
    
    public static boolean CheckNgayXoaHD(JTextField field1) {
        Date date2 = DateHelper.toDate(field1.getText());
        Date date1 = DateHelper.toDate(java.time.LocalDate.now().toString());
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        c1.setTime(date1);
        c2.setTime(date2);
        long a = (c1.getTime().getTime() - c2.getTime().getTime()) / (24 * 3600 * 1000);
        if (a >= 365) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean CheckNgayUpdateHD(JTextField field1) {
        Date date2 = DateHelper.toDate(field1.getText());
        Date date1 = DateHelper.toDate(java.time.LocalDate.now().toString());
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        c1.setTime(date1);
        c2.setTime(date2);
        long a = (c1.getTime().getTime() - c2.getTime().getTime()) / (24 * 3600 * 1000);
        if (a < 1) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean checkMaSoThueSTK(JTextField field, StringBuilder sb, String errorMessage) {
        boolean check = true;
        if (field.getText().equals("")) {
            return false;
        }

        Pattern pt = Pattern.compile("\\d{9,15}$");//cung cap mau
        Matcher matcher = pt.matcher(field.getText());//kiem tra chuoi nhap vao có dúng vs mau khong

        if (!matcher.find()) {
            sb.append(errorMessage).append("\n");
            field.setBackground(Color.yellow);
            field.requestFocus();
            check = false;
        }
        
        if (check) {
            field.setBackground(Color.white);;
        }
        return check;
    }
    
    public static boolean checkChenhLechGia(JTextField field1, JTextField field2) {
        double giaNhap = Double.parseDouble(field1.getText());
        double giaBan = Double.parseDouble(field2.getText());
        if (giaBan <= giaNhap) {
            field2.setBackground(Color.YELLOW);
            return false;
        }else{
            field2.setBackground(Color.WHITE);
            return true;
        }
        
    }
    
    
}
