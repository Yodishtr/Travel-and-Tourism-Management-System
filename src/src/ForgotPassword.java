import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Class implementing the forgot password feature
 */
public class ForgotPassword extends JFrame implements ActionListener {

    private static JTextField tfusername, tfname, tfans, security_question, tfpassword;
    private static JButton search, retrieve, back;


    public ForgotPassword() {
        setBounds(350, 200, 850, 380);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/forgotpassword.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(580, 70, 200, 200);
        add(image);


        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(30, 30, 500, 280);
        add(p1);

        JLabel lblusername = new JLabel("username");
        lblusername.setBounds(40, 20, 100, 25);
        lblusername.setFont(new Font("Tahoma", Font.BOLD, 14));
        p1.add(lblusername);

        tfusername = new JTextField();
        tfusername.setBounds(220, 20, 150, 25);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);

        search = new JButton("Search");
        search.setBackground(Color.LIGHT_GRAY);
        search.setForeground(Color.WHITE);
        search.setFont(new Font("SAN_SERIF", Font.BOLD, 14));
        search.setBounds(380, 20, 100, 25);
        search.setOpaque(true);
        search.setBorderPainted(false);
        search.addActionListener(this);
        p1.add(search);

        JLabel lblname = new JLabel("Name");
        lblname.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblname.setBounds(40, 65, 100, 25);
        p1.add(lblname);

        tfname = new JTextField();
        tfname.setBounds(220, 65, 150, 25);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);

        JLabel lbl_sec_question = new JLabel("Security Question");
        lbl_sec_question.setFont(new Font("Tahoma", Font.BOLD, 14));
        lbl_sec_question.setBounds(40, 105, 100, 25);
        p1.add(lbl_sec_question);

        security_question = new JTextField();
        security_question.setBounds(220, 105, 150, 25);
        security_question.setBorder(BorderFactory.createEmptyBorder());
        p1.add(security_question);

        JLabel lbl_sec_ans = new JLabel("Security Answer");
        lbl_sec_ans.setFont(new Font("Tahoma", Font.BOLD, 14));
        lbl_sec_ans.setBounds(40, 145, 100, 25);
        p1.add(lbl_sec_ans);

        tfans = new JTextField();
        tfans.setBounds(220, 145, 150, 25);
        tfans.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfans);

        retrieve = new JButton("Retrieve");
        retrieve.setBackground(Color.DARK_GRAY);
        retrieve.setForeground(Color.WHITE);
        retrieve.setFont(new Font("SAN_SERIF", Font.BOLD, 12));
        retrieve.setBounds(380, 145, 100, 25);
        retrieve.setOpaque(true);
        retrieve.setBorderPainted(false);
        retrieve.addActionListener(this);
        p1.add(retrieve);

        JLabel lblpassword = new JLabel("Password");
        lblpassword.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblpassword.setBounds(40, 185, 100, 25);
        p1.add(lblpassword);

        tfpassword = new JTextField();
        tfpassword.setBounds(220, 185, 150, 25);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpassword);

        back = new JButton("Back");
        back.setBackground(Color.GRAY);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("SAN_SERIF", Font.BOLD, 12));
        back.setBounds(150, 230, 100, 25);
        back.setOpaque(true);
        back.setBorderPainted(false);
        back.addActionListener(this);
        p1.add(back);


        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == search){
            try {
                String query = "SELECT name, password, security_question, sec";
            } catch (Exception e){
                e.printStackTrace();
            }
        } else if (ae.getSource() == retrieve){

        } else if (ae.getSource() == back){
            SwingUtilities.invokeLater(() -> {
                dispose();
                new Login();
            });
        }

    }

    public static void main(String[] args){
        new ForgotPassword();
    }

}
