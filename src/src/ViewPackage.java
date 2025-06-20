import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;

/**
 * A class representing the frame when user wants to check what kind of package they has booked
 */
public class ViewPackage extends JFrame implements ActionListener {

    private String username;
    private JButton back;

    public ViewPackage(String username){
        this.username = username;
        setBounds(450, 200, 900, 455);
        setLayout(null);
        getContentPane().setBackground(Color.LIGHT_GRAY);

        // frame heading
        JLabel title = new JLabel("Your package");
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setForeground(Color.BLACK);
        title.setBounds(60, 0, 300, 30);
        add(title);

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

        // Package type label
        JLabel package_type = new JLabel("Package Type: ");
        package_type.setForeground(Color.BLACK);
        package_type.setBounds(30, 110, 150, 25);
        package_type.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(package_type);

        JLabel label_packageType = new JLabel();
        label_packageType.setForeground(Color.BLACK);
        label_packageType.setBounds(220, 110, 150, 25);
        label_packageType.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(label_packageType);

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

        // Number of people in package
        JLabel persons = new JLabel("Person Total: ");
        persons.setForeground(Color.BLACK);
        persons.setBounds(30, 230, 150, 25);
        persons.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(persons);

        JLabel label_persons = new JLabel();
        label_persons.setForeground(Color.BLACK);
        label_persons.setBounds(220, 230, 150, 25);
        label_persons.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(label_persons);

        // ID type
        JLabel id = new JLabel("ID type: ");
        id.setForeground(Color.BLACK);
        id.setBounds(30, 290, 150, 25);
        id.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(id);

        JLabel label_id = new JLabel();
        label_id.setForeground(Color.BLACK);
        label_id.setBounds(220, 290, 150, 25);
        label_id.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(label_id);

        // Price
        JLabel price = new JLabel("Price: ");
        price.setForeground(Color.BLACK);
        price.setBounds(500, 50, 150, 25);
        price.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(price);

        JLabel label_price = new JLabel();
        label_price.setForeground(Color.BLACK);
        label_price.setBounds(690, 50, 150, 25);
        label_price.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(label_price);

        // Image


        // Address
//        JLabel address = new JLabel("Address: ");
//        address.setForeground(Color.BLACK);
//        address.setBounds(500, 110, 150, 25);
//        address.setFont(new Font("Tahoma", Font.BOLD, 15));
//        add(address);
//
//        JLabel label_Address = new JLabel();
//        label_Address.setForeground(Color.BLACK);
//        label_Address.setBounds(690, 110, 150, 25);
//        label_Address.setFont(new Font("Tahoma", Font.BOLD, 15));
//        add(label_Address);
//
//        // Email
//        JLabel email = new JLabel("Email: ");
//        email.setForeground(Color.BLACK);
//        email.setBounds(500, 170, 150, 25);
//        email.setFont(new Font("Tahoma", Font.BOLD, 15));
//        add(email);
//
//        JLabel label_Email = new JLabel();
//        label_Email.setForeground(Color.BLACK);
//        label_Email.setBounds(690, 170, 150, 25);
//        label_Email.setFont(new Font("Tahoma", Font.BOLD, 15));
//        add(label_Email);
//
//        // Phone
//        JLabel phone = new JLabel("Phone: ");
//        phone.setForeground(Color.BLACK);
//        phone.setBounds(500, 230, 150, 25);
//        phone.setFont(new Font("Tahoma", Font.BOLD, 15));
//        add(phone);
//
//        JLabel label_Phone = new JLabel();
//        label_Phone.setForeground(Color.BLACK);
//        label_Phone.setBounds(690, 230, 150, 25);
//        label_Phone.setFont(new Font("Tahoma", Font.BOLD, 15));
//        add(label_Phone);

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


        try{
            Conn conn = new Conn();
            String query = "SELECT * FROM bookpackage WHERE username = '"+ this.username +"'";
            ResultSet rs = conn.s.executeQuery(query);
            if (!rs.next()){
                JOptionPane.showMessageDialog(null, "Customer Not Found");
            } else{
                label_username.setText(rs.getString("username"));
                label_packageType.setText(rs.getString("package"));
                label_IdNumber.setText(rs.getString("number"));
                label_persons.setText(rs.getString("persons"));
                label_id.setText(rs.getString("id"));

                int party_size = Integer.valueOf(label_persons.getText());
                String chosen_package = label_packageType.getText();
                if (chosen_package.equals("Gold Package")){
                    int cost = 50;
                    cost *= party_size;
                    label_price.setText("$" + cost + "k");
                    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/package1.jpg"));
                    Image i2 = i1.getImage().getScaledInstance(340, 195, Image.SCALE_SMOOTH);
                    ImageIcon i3 = new ImageIcon(i2);
                    JLabel goldImage = new JLabel(i3);
                    goldImage.setBounds(500, 110, 340, 195);
                    add(goldImage);

                } else if (chosen_package.equals("Silver Package")){
                    int cost = 20;
                    cost *= party_size;
                    label_price.setText("$" + cost + "k");
                    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/package2.jpg"));
                    Image i2 = i1.getImage().getScaledInstance(340, 195, Image.SCALE_SMOOTH);
                    ImageIcon i3 = new ImageIcon(i2);
                    JLabel silverImage = new JLabel(i3);
                    silverImage.setBounds(500, 110, 340, 195);
                    add(silverImage);

                } else{
                    int cost = 10;
                    cost *= party_size;
                    label_price.setText("$" + cost + "k");
                    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/package3.jpg"));
                    Image i2 = i1.getImage().getScaledInstance(340, 195, Image.SCALE_SMOOTH);
                    ImageIcon i3 = new ImageIcon(i2);
                    JLabel regularImage = new JLabel(i3);
                    regularImage.setBounds(500, 110, 340, 195);
                    add(regularImage);
                }

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
        new ViewPackage("Sully");
    }
}
