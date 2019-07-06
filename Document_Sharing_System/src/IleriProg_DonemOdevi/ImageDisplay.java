
package IleriProg_DonemOdevi;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;



class ImageDisplay extends JPanel {

    BufferedImage image;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(image, 0, 0, null);
    }

    public void setImage(BufferedImage i) {
        this.image = i;
    }
}