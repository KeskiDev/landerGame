import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.File;
import java.io.IOException;

/**
 * Created by pikku on 11/27/2015.
 */
public class rock {
    public JLabel rock;
    public ImageIcon rockImage;
    public int xCord, yCord, xSpeed, ySpeed;

    public rock(){
        try{
            rockImage = new ImageIcon(ImageIO.read(new File("./Images/download.png")));
        }
        catch(IOException e){
            System.out.println("Error, images not found.");
        }

        rock = new JLabel(rockImage);
    }

    /*
        public int getyCord() {
            return yCord;
        }

        public void setyCord(int yCord) {
            this.yCord = yCord;
        }

    public int getxCord() {
        return xCord;
    }

    public void setxCord(int xCord) {
        this.xCord = xCord;
    }
    */
}
