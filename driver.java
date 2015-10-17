import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

/**
 * Created by pikku on 10/17/2015.
 */
public class driver extends JFrame{
    private final int WIDTH = 1000, HEIGHT = 900;
    private JLabel titleLabel; //for the title of the game
    private JButton startButton;
    private eventHandler handles;

    public driver(){
        Container pane = getContentPane();
        handles = new eventHandler();
        setTitle("Lander on Pluto");
        setSize(WIDTH,HEIGHT);
        pane.setLayout(new GridLayout(2,1));
        setIconImage(Toolkit.getDefaultToolkit().getImage("./Images/lander.png")); //changing the icon for the game in the title bar and in the task bar

        titleLabel = new JLabel("Lander on Pluto!",SwingConstants.CENTER);
        startButton = new JButton("Initiate Landing");

        /*try {
            titleImage = new ImageIcon(ImageIO.read(new File("./images/lander.png")));
        }
        catch(IOException e){
            System.out.println("Error, image could not be found");
        }

        frame.setIconImage(titleImage);
*/
        pane.add(titleLabel);
        pane.add(startButton);
        startButton.addActionListener(handles);

        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public class eventHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            new startGame();
        }
    }

    public static void main(String[] args){
        driver window = new driver();
    }
}
