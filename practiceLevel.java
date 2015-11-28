import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.geom.Area;
import java.util.Random;

/**
 * Created by pikku on 10/23/2015.
 */
public class practiceLevel extends JFrame implements ActionListener {
    private final int WIDTH = 700, HEIGHT = 800;
    public int xCord = WIDTH/2 - 75, yCord = 200;
    public JLabel landerLabel, rockLabel;


    public lander ship;
    public rock asteroid;

    //add random starting position for lander

    //make new window
    Container pane = getContentPane();



    public practiceLevel() throws InterruptedException {
        setTitle("We talkin bout practice!");
        setLayout(null);
        setSize(WIDTH,HEIGHT);
        setIconImage(Toolkit.getDefaultToolkit().getImage("./Images/lander.png")); //changing the icon for the game in the title bar and in the task bar


        ship = new lander();
        ship.lander.setLocation(xCord,yCord);
        ship.lander.setSize(150,88);
        pane.add(ship.lander);
        pane.setBackground(Color.BLACK);

        asteroid = new rock();
        asteroid.rock.setLocation(75,600);
        asteroid.rock.setSize(80,80);
        pane.add(asteroid.rock);








        // add the controls
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                super.keyPressed(e);
                //System.out.println(e.getKeyCode());
                if(e.getKeyCode() == KeyEvent.VK_RIGHT){

                    //System.out.println(ship.lander.getX());
                    if(ship.lander.getX()+150 >=  WIDTH){
                        ship.lander.setLocation(700-150,yCord);
                    }
                    else
                        ship.lander.setLocation(ship.lander.getX() + 15, yCord);

                }

                if(e.getKeyCode() == KeyEvent.VK_LEFT){
                    //System.out.println(15 + e.getKeyCode());
                    //ship.lander.setLocation(ship.lander.getX() - 10, ship.lander.getY());

                    if(ship.lander.getX() <= 0){
                        ship.lander.setLocation(0,yCord);
                    }
                    else
                        ship.lander.setLocation(ship.lander.getX() - 15, yCord);
                }
            }
        });



        setFocusable(true);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //for the actionlistener in constructor
    }

/*
    public boolean collisionKo(){
        Area ship = new Area(ship.lander.getBounds());
        Area rocks = new Area(pane.getBounds());
    }
*/

}
