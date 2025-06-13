import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Class representing the frame for the add personal details button from the app dashboard
 */

public class AddCustomer extends JFrame implements ActionListener {

    JLabel labelusername, labelname;
    JComboBox comboID;
    JTextField tfnumber_id, tfcountry, tfaddress, tfemail, tfphone;
    JRadioButton rman, rwoman, rother;
    JButton add, back;

    private String username;

    public AddCustomer(String username){
        this.username = username;
        setBounds(450, 200, 850, 550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(30, 50, 150, 25);
        lblusername.setFont(new Font("Times New Roman", Font.BOLD, 16));
        add(lblusername);

        labelusername = new JLabel();
        labelusername.setBounds(220, 50, 150, 25);
        add(labelusername);

        JLabel lblid = new JLabel("Your ID");
        lblid.setBounds(30, 90, 150, 25);
        lblid.setFont(new Font("Times New Roman", Font.BOLD, 16));
        add(lblid);

        comboID = new JComboBox(new String[] {"Passport", "Driver's License", "Health Card", "PR Card"});
        comboID.setBounds(220, 90, 150, 25);
        comboID.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        comboID.setBackground(Color.WHITE);
        add(comboID);

        JLabel lblnumber_id = new JLabel("Your ID Number");
        lblnumber_id.setBounds(30, 130, 150, 25);
        lblnumber_id.setFont(new Font("Times New Roman", Font.BOLD, 16));
        add(lblnumber_id);

        tfnumber_id = new JTextField();
        tfnumber_id.setBounds(220, 130, 150, 25);
        add(tfnumber_id);

        JLabel lblname = new JLabel("Your Name");
        lblname.setBounds(30, 170, 150, 25);
        lblname.setFont(new Font("Times New Roman", Font.BOLD, 16));
        add(lblname);

        labelname = new JLabel();
        labelname.setBounds(220, 170, 150, 25);
        add(labelname);

        JLabel lblgender = new JLabel("Your Gender");
        lblgender.setBounds(30, 210, 150, 25);
        lblgender.setFont(new Font("Times New Roman", Font.BOLD, 16));
        add(lblgender);

        rman = new JRadioButton("Man");
        rman.setBounds(190, 210, 70, 25);
        add(rman);

        rwoman = new JRadioButton("Woman");
        rwoman.setBounds(270, 210, 100, 25);
        add(rwoman);

        rother = new JRadioButton("Other");
        rother.setBounds(370, 210, 70, 25);
        add(rother);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rman);
        bg.add(rwoman);
        bg.add(rother);

        JLabel lblcountry = new JLabel("Your Country");
        lblcountry.setBounds(30, 250, 150, 25);
        lblcountry.setFont(new Font("Times New Roman", Font.BOLD, 16));
        add(lblcountry);

        tfcountry = new JTextField();
        tfcountry.setBounds(220, 250, 150, 25);
        add(tfcountry);

        JLabel lbladdress = new JLabel("Your Address");
        lbladdress.setBounds(30, 290, 150, 25);
        lbladdress.setFont(new Font("Times New Roman", Font.BOLD, 16));
        add(lbladdress);

        tfaddress = new JTextField();
        tfaddress.setBounds(220, 290, 150, 25);
        add(tfaddress);

        JLabel lblemail = new JLabel("Your Email");
        lblemail.setBounds(30, 330, 150, 25);
        lblemail.setFont(new Font("Times New Roman", Font.BOLD, 16));
        add(lblemail);

        tfemail = new JTextField();
        tfemail.setBounds(220, 330, 150, 25);
        add(tfemail);

        JLabel lblphone = new JLabel("Your Phone Number");
        lblphone.setBounds(30, 370, 150, 25);
        lblphone.setFont(new Font("Times New Roman", Font.BOLD, 16));
        add(lblphone);

        tfphone = new JTextField();
        tfphone.setBounds(220, 370, 150, 25);
        add(tfphone);

        add = new JButton("Add");
        add.setBackground(Color.GRAY);
        add.setForeground(Color.WHITE);
        add.setOpaque(true);
        add.setBounds(30, 420, 100, 25);
        add.setBorder(BorderFactory.createEmptyBorder());
        add.addActionListener(this);
        add.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                add.setBackground(Color.LIGHT_GRAY);
            }

            @Override
            public void mouseExited(MouseEvent e){
                add.setBackground(Color.GRAY);
            }

            @Override
            public void mousePressed(MouseEvent e){
                add.setBackground(Color.DARK_GRAY);
            }

            @Override
            public void mouseReleased(MouseEvent e){
                if (add.getBounds().contains(e.getPoint())){
                    add.setBackground(Color.LIGHT_GRAY);
                } else{
                    add.setBackground(Color.GRAY);
                }
            }
        });
        add(add);

        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setOpaque(true);
        back.setBorder(BorderFactory.createEmptyBorder());
        back.addActionListener(this);
        back.setBounds(270, 420, 100, 25);
        back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                back.setBackground(Color.GRAY);
            }

            @Override
            public void mouseExited(MouseEvent e){
                back.setBackground(Color.BLACK);
            }

            @Override
            public void mousePressed(MouseEvent e){
                back.setBackground(Color.DARK_GRAY);
            }

            @Override
            public void mouseReleased(MouseEvent e){
                if (back.getBounds().contains(e.getPoint())){
                    back.setBackground(Color.GRAY);
                } else{
                    back.setBackground(Color.BLACK);
                }
            }
        });
        add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/newcustomer.jpg"));
        Image i2 = i1.getImage().getScaledInstance(370, 600, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(450, 40, 400, 450);
        add(image);

        try{
            Conn connection = new Conn();
            ResultSet rs = connection.s.executeQuery("SELECT * FROM account WHERE username = '"+ this.username+"'");
            rs.next();
            labelusername.setText(rs.getString("username"));
            labelname.setText(rs.getString("name"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == add){
            String user_name = labelusername.getText();
            String id = (String) comboID.getSelectedItem();
            String number = tfnumber_id.getText();
            String name = labelname.getText();
            String gender;
            if (rman.isSelected()){
                gender = "Male";
            } else if (rwoman.isSelected()){
                gender = "Female";
            } else{
                gender = "Other";
            }
            String country = tfcountry.getText();
            String address = tfaddress.getText();
            String email = tfemail.getText();
            String phone = tfphone.getText();

            try{
                Conn conn = new Conn();
                String query = "INSERT INTO customer VALUES ('" + user_name + "', '"+ id +"', '"+ number +"', '"+ name +"', '"+
                        gender +"', '"+ country +"', '"+ address +"', '"+ phone +"', '"+ email +"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Customer Details Added Successfully");
                SwingUtilities.invokeLater(() -> {
                    dispose();
                });

            } catch (SQLException ee){
                System.out.println("SQL State: " + ee.getSQLState());
                System.out.println("Message: " + ee.getMessage());
            }

        } else{
            SwingUtilities.invokeLater(() -> {
                dispose();

            });
        }
    }


    public static void main(String[] args){
        new AddCustomer("Sully");
    }
}
