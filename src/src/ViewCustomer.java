import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;

/**
 * Class representing the frame for the view personal details button on the dashboard
 */
public class ViewCustomer extends JFrame implements ActionListener {

    private String username;
    private JButton back;

    public ViewCustomer(String username){
        this.username = username;
        setBounds(450, 180, 870, 625);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        // Username label
        JLabel user_name = new JLabel("Username: ");
        user_name.setForeground(Color.BLACK);
        user_name.setBounds(30, 50, 150, 25);
        user_name.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(user_name);

        JLabel label_username = new JLabel();
        label_username.setForeground(Color.BLACK);
        label_username.setBounds(220, 50, 150, 25);
        label_username.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(label_username);

        // ID type label
        JLabel id_type = new JLabel("ID Type: ");
        id_type.setForeground(Color.BLACK);
        id_type.setBounds(30, 110, 150, 25);
        id_type.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(id_type);

        JLabel label_IdType = new JLabel();
        label_IdType.setForeground(Color.BLACK);
        label_IdType.setBounds(220, 110, 150, 25);
        label_IdType.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(label_IdType);

        // ID number
        JLabel id_number = new JLabel("ID Number: ");
        id_number.setForeground(Color.BLACK);
        id_number.setBounds(30, 170, 150, 25);
        id_number.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(id_number);

        JLabel label_IdNumber = new JLabel();
        label_IdNumber.setForeground(Color.BLACK);
        label_IdNumber.setBounds(220, 170, 150, 25);
        label_IdNumber.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(label_IdNumber);

        // Name
        JLabel name = new JLabel("Name: ");
        name.setForeground(Color.BLACK);
        name.setBounds(30, 230, 150, 25);
        name.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(name);

        JLabel label_Name = new JLabel();
        label_Name.setForeground(Color.BLACK);
        label_Name.setBounds(220, 230, 150, 25);
        label_Name.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(label_Name);

        // Gender
        JLabel gender = new JLabel("Gender: ");
        gender.setForeground(Color.BLACK);
        gender.setBounds(30, 290, 150, 25);
        gender.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(gender);

        JLabel label_Gender = new JLabel();
        label_Gender.setForeground(Color.BLACK);
        label_Gender.setBounds(220, 290, 150, 25);
        label_Gender.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(label_Gender);

        // Country
        JLabel country = new JLabel("Country: ");
        country.setForeground(Color.BLACK);
        country.setBounds(500, 50, 150, 25);
        country.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(country);

        JLabel label_Country = new JLabel();
        label_Country.setForeground(Color.BLACK);
        label_Country.setBounds(690, 50, 150, 25);
        label_Country.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(label_Country);

        // Address
        JLabel address = new JLabel("Address: ");
        address.setForeground(Color.BLACK);
        address.setBounds(500, 110, 150, 25);
        address.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(address);

        JLabel label_Address = new JLabel();
        label_Address.setForeground(Color.BLACK);
        label_Address.setBounds(690, 110, 150, 25);
        label_Address.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(label_Address);

        // Email
        JLabel email = new JLabel("Email: ");
        email.setForeground(Color.BLACK);
        email.setBounds(500, 170, 150, 25);
        email.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(email);

        JLabel label_Email = new JLabel();
        label_Email.setForeground(Color.BLACK);
        label_Email.setBounds(690, 170, 150, 25);
        label_Email.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(label_Email);

        // Phone
        JLabel phone = new JLabel("Phone: ");
        phone.setForeground(Color.BLACK);
        phone.setBounds(500, 230, 150, 25);
        phone.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(phone);

        JLabel label_Phone = new JLabel();
        label_Phone.setForeground(Color.BLACK);
        label_Phone.setBounds(690, 230, 150, 25);
        label_Phone.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(label_Phone);

        back = new JButton("Back");
        back.setBounds(350, 350, 110, 25);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Tahoma", Font.BOLD, 15));
        back.setOpaque(true);
        back.addActionListener(this);
        back.setBorder(BorderFactory.createEmptyBorder());
        back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                back.setBackground(Color.DARK_GRAY);
            }

            @Override
            public void mouseExited(MouseEvent e){
                back.setBackground(Color.BLACK);
            }

            @Override
            public void mousePressed(MouseEvent e){
                back.setBackground(Color.GRAY);
            }

            @Override
            public void mouseReleased(MouseEvent e){
                if (back.getBounds().contains(e.getPoint())){
                    back.setBackground(Color.GRAY);
                } else {
                    back.setBackground(Color.BLACK);
                }
            }
        });
        add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 200, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(20, 400, 600, 200);
        add(image);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
        Image i5 = i4.getImage().getScaledInstance(600, 200, Image.SCALE_SMOOTH);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image_1 = new JLabel(i6);
        image_1.setBounds(600, 400, 600, 200);
        add(image_1);

        try{
            Conn conn = new Conn();
            String query = "SELECT * FROM customer WHERE username = '"+ this.username +"'";
            ResultSet rs = conn.s.executeQuery(query);
            if (!rs.next()){
                JOptionPane.showMessageDialog(null, "Customer Not Found");
            } else{
                label_username.setText(rs.getString("username"));
                label_IdType.setText(rs.getString("id_type"));
                label_IdNumber.setText(rs.getString("id_number"));
                label_Name.setText(rs.getString("name"));
                label_Gender.setText(rs.getString("gender"));
                label_Country.setText(rs.getString("country"));
                label_Address.setText(rs.getString("address"));
                label_Phone.setText(rs.getString("phone"));
                label_Email.setText(rs.getString("email"));
                
            }

        } catch (Exception e){
            e.printStackTrace();
        }

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == back){
            SwingUtilities.invokeLater(() -> {
                dispose();
            });
        }
    }


    public static void main(String[] args){
        new ViewCustomer("");
    }
}
