import javax.swing.*;
import java.awt.*;

/**
 *
 */

public class Splash extends JFrame implements Runnable{
    Thread thread;

    public Splash(){
        // setSize(1200, 600);
        // setLocation(150, 200);
        setLocation(150, 200);

        setVisible(true);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200, 600, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);


        thread = new Thread(this);
        thread.start();


        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void run(){
        try{
            Thread.sleep(9000);

        } catch (Exception e){
            e.printStackTrace();
        }
        SwingUtilities.invokeLater(() -> {
            dispose();
            // new Login();
        });

    }

    public static void main(String[] args){
        Splash frame = new Splash();


        for(int i = 1; i <= 200; i++){

            frame.setSize(i * 6, i * 3);
            try{
                Thread.sleep(20);
            } catch(Exception e){
                e.printStackTrace();
            }
        }

    }
}
