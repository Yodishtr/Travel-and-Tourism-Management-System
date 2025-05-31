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
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(131, 193, 233));
        p1.setBounds(0, 0, 400, 400);
        p1.setLayout(null);
        add(p1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel login_image = new JLabel(i3);
        login_image.setBounds(100, 120, 200, 200);
        p1.add(login_image);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(400, 30, 450, 300);
        add(p2);

        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(60, 20, 100, 25);
        lblusername.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
        p2.add(lblusername);

        JTextField tfusername = new JTextField();
        tfusername.setBounds(60, 60, 300, 30);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfusername);

        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(60, 105, 100, 25);
        lblpassword.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
        p2.add(lblpassword);

        JTextField tfpassword = new JTextField();
        tfpassword.setBounds(60, 140, 300, 30);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfpassword);

        JButton login = new JButton("Login");
        login.setBounds(60, 200, 130, 30);
        login.setBackground(new Color(131, 193, 233));
        login.setForeground(Color.WHITE);
        login.setBorder(BorderFactory.createEmptyBorder());
        login.setOpaque(true);
        login.setBorderPainted(false);
        p2.add(login);

        JButton signup = new JButton("Sign Up");
        signup.setBounds(230, 200, 130, 30);
        signup.setBackground(new Color(131, 193, 233));
        signup.setForeground(Color.WHITE);
        signup.setBorder(BorderFactory.createEmptyBorder());
        signup.setOpaque(true);
        signup.setBorderPainted(false);
        p2.add(signup);

        JButton forgot_password = new JButton("Forgot Password");
        forgot_password.setBounds(140, 240, 130, 30);
        forgot_password.setBackground(Color.WHITE);
        forgot_password.setForeground(Color.BLACK);
        forgot_password.setBorder(BorderFactory.createEmptyBorder());
        forgot_password.setOpaque(true);
        forgot_password.setBorderPainted(false);
        p2.add(forgot_password);

        JLabel text = new JLabel("Trouble Signing in?");
        text.setBounds(280, 245, 150, 20);
        text.setForeground(Color.RED);
        p2.add(text);



        setVisible(true);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args){
        Login login = new Login();

    }
}
