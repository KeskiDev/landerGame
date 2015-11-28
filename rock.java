import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Random;

/**
 * Created by pikku on 11/27/2015.
 */
public class rock {
    public JLabel rock;
    public ImageIcon rockImage;
    public int xCord, yCord, xSpeed, ySpeed;
    Random rand_Num = new Random();
    public int rock_xCord = 800 + 5, rock_yCord;

    public rock(){
        try{
            rockImage = new ImageIcon(ImageIO.read(new File("./Images/download.png")));
        }
        catch(IOException e){
            System.out.println("Error, images not found.");
        }

        rock = new JLabel(rockImage);
    }


   /* double x;
    double y;
    double sv;
    double sh;
    public rock(double x, double y, double angle, double speed) {
        this.x = x;
        this.y = y;
        sv = Math.sin(angle)*speed;
        sh = Math.cos(angle)*speed;
        last_updated = System.currentTimeMillis();
    }

    long last_updated;

    public void update() {
        long time_elapsed = System.currentTimeMillis() - last_updated;
        last_updated = System.currentTimeMillis();
        this.x += this.hs*(this.time_elapsed/1000);
        this.y += this.vs*(this.time_elapsed/1000);
    }*/

}
