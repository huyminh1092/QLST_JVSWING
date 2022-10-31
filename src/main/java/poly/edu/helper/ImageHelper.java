
package poly.edu.helper;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;


public class ImageHelper {
    public static Image resize(Image originalImage, int targeWidth, int targetHeight) {
        Image resultingImage = originalImage.getScaledInstance(targeWidth, targetHeight, Image.SCALE_SMOOTH);
        return resultingImage;
    }
    
    public static Image getAppIcon(){
    URL url=ImageHelper.class.getResource("/poly/edu/icon/xanh.png");
    return  new ImageIcon(url).getImage();
    }
    
    public static void save(File src) {
        File dst = new File("logos", src.getName());
        if (!dst.getParentFile().exists()) {
            dst.getParentFile().mkdirs();
        }
        try {
            Path from = Paths.get(src.getAbsolutePath());
            Path to = Paths.get(dst.getAbsolutePath());
            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static ImageIcon read(String fileName) {
        File path = new File("logos", fileName);
        return new ImageIcon(path.getAbsolutePath()); 
    }
}
