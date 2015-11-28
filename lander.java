import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.File;
import java.io.IOException;

/**
 * Created by pikku on 10/23/2015.
    to control everything about the lander
 */

public class lander extends JFrame{
    public JLabel lander;
    public ImageIcon landerImage;
    public int xCord, yCord, xSpeed, ySpeed;

    public lander(){
        try{
            landerImage = new ImageIcon(ImageIO.read(new File("./Images/landerGame.png")));
        }
        catch(IOException e){
            System.out.println("Error, images not found.");
        }

        lander = new JLabel(landerImage);
    }

/*
    public int getyCord() {
        return yCord;
    }

    public void setyCord(int yCord) {
        this.yCord = yCord;
    }
*/
    public int getxCord() {
        return xCord;
    }

    public void setxCord(int xCord) {
        this.xCord = xCord;
    }


}
