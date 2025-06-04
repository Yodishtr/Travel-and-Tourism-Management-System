import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * A class handling the signup of a new user to the travel management system
 */

public class Signup extends JFrame implements ActionListener {

    private static JButton create;
    private static JButton back;
    private static JTextField tfusername, tfname, tfpassword, tfsec_ans;
    private static Choice security;

    public Signup(){
        setBounds(350, 200, 900, 400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(131, 193, 233));
        p1.setBounds(0, 0, 500, 400);
        p1.setLayout(null);
        add(p1);

        JLabel lblusername = new JLabel("Username");
        lblusername.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblusername.setBounds(50, 20, 125, 25);
        p1.add(lblusername);

        tfusername = new JTextField();
        tfusername.setBounds(190, 20, 180, 25);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);

        JLabel name = new JLabel("Name");
        name.setFont(new Font("Tahoma", Font.BOLD, 18));
        name.setBounds(50, 60, 125, 25);
        p1.add(name);

        tfname = new JTextField();
        tfname.setBounds(190, 60, 180, 25);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);

        JLabel password = new JLabel("Password");
        password.setFont(new Font("Tahoma", Font.BOLD, 18));
        password.setBounds(50, 100, 125, 25);
        p1.add(password);

        tfpassword = new JTextField();
        tfpassword.setBounds(190, 100, 180, 25);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpassword);

        JLabel lblsecurity = new JLabel("Security Ques");
        lblsecurity.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblsecurity.setBounds(50, 140, 125, 25);
        p1.add(lblsecurity);

        security = new Choice();
        security.add("Fav series/movie character");
        security.add("Fav series/movies");
        security.add("Your lucky number");
        security.add("Childhood nickname");
        security.setBounds(190, 140, 190, 25);
        security.setBackground(Color.WHITE);
        p1.add(security);

        JLabel sec_ans = new JLabel("Security Answer");
        sec_ans.setFont(new Font("Tahoma", Font.BOLD, 18));
        sec_ans.setBounds(50, 180, 125, 25);
        p1.add(sec_ans);

        tfsec_ans = new JTextField();
        tfsec_ans.setBounds(190, 180, 180, 25);
        tfsec_ans.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfsec_ans);

        create = new JButton("Create User");
        create.setFont(new Font("SAN_SERIF", Font.BOLD, 14));
        create.setBackground(Color.WHITE);
        create.setForeground(new Color(131, 193, 233));
        create.setBounds(50, 250, 130, 30);
        create.setOpaque(true);
        create.setBorder(BorderFactory.createEmptyBorder());
        create.setBorderPainted(false);
        create.addActionListener(this);
        p1.add(create);

        back = new JButton("Back");
        back.setFont(new Font("SAN_SERIF", Font.BOLD, 14));
        back.setBackground(Color.WHITE);
        back.setForeground(new Color(131, 193, 233));
        back.setBounds(240, 250, 130, 30);
        back.setOpaque(true);
        back.setBorder(BorderFactory.createEmptyBorder());
        back.setBorderPainted(false);
        back.addActionListener(this);
        p1.add(back);

        JPanel p2 = new JPanel();
        p2.setBackground(Color.WHITE);
        p2.setBounds(500, 0, 400, 400);
        p2.setLayout(null);
        add(p2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel i4 = new JLabel(i3);
        i4.setBounds(0, 0, 400, 400);
        p2.add(i4);


        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == create){
            String username = tfusername.getText();
            String name = tfname.getText();
            String password = tfpassword.getText();
            String sec_ans = tfsec_ans.getText();
            String security_question = security.getSelectedItem();

            String query = "insert into account values('"+username+"', '"+name+"', " +
                    "'"+password+"', '"+security_question+"', '"+sec_ans+"')";


            try{
                Conn conn = new Conn();
                conn.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Account Created Successfully");

                dispose();
                new Login();
                Conn.conn.close();
            } catch (Exception e){
                e.printStackTrace();
            }

        } else if (ae.getSource() == back){
            SwingUtilities.invokeLater(() -> {
                dispose();
                new Login();
            });
        }
    }

    public static void main(String[] args){
        new Signup();
    }
}
