import javax.swing.*;
import java.awt.*;

/**
 * A login class showing the Login Frame and with the associated functionality of enabling a user to login
 * or signup/create a new account if they previously didn't have one
 */
public class Login extends JFrame {

    public Login(){
        setSize(900, 400);
        setLocation(350, 275);
        setVisible(true);
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(131, 193, 233));
        p1.setBounds(0, 0, 400, 400);
        p1.setLayout(null);
        add(p1);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        System.out.println(i1.getImageLoadStatus());
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel login_image = new JLabel(i3);
        login_image.setBounds(100, 120, 200, 200);
        p1.add(login_image);



        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args){
        Login login = new Login();

    }
}
