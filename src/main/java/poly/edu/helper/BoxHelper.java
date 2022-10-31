
package poly.edu.helper;

import java.awt.Component;
import javax.swing.JOptionPane;


public class BoxHelper {
    public static void alert(Component parent, String message) {
        JOptionPane.showMessageDialog(parent, message, "Siêu thị GreenOrganic", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static boolean confirm(Component parent, String message) {
        int result = JOptionPane.showConfirmDialog(parent, message,
                "Siêu thị GreenOrganic",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        return result == JOptionPane.YES_OPTION;
    }
    
    public static String input(Component parent, String message) {
        return JOptionPane.showInputDialog(parent, message,
                "Siêu thị GreenOrganic", JOptionPane.INFORMATION_MESSAGE);
    }
    
     public static void showError(Component parent, String message){
        JOptionPane.showMessageDialog(parent, message, "Siêu thị GreenOrganic",  JOptionPane.ERROR_MESSAGE);
    }
}
