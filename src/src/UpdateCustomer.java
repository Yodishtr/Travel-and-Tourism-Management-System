import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * A class representing the update personal details from the dashboard and allows the user
 * to modify their personal details
 */

public class UpdateCustomer extends JFrame implements ActionListener {
    JLabel labelusername, labelname;
//    JComboBox comboID;
    JTextField tfnumber_id, tfcountry, tfaddress, tfemail, tfphone, tfid_type, tfgender;
//    JRadioButton rman, rwoman, rother;
    JButton update, back;

    private String username;
    public UpdateCustomer(String username){
        this.username = username;
        setBounds(500, 200, 850, 550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);


        JLabel heading = new JLabel("Update Personal Details");
        heading.setBounds(300, 0, 300, 25);
        heading.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(heading);

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

//        comboID = new JComboBox(new String[] {"Passport", "Driver's License", "Health Card", "PR Card"});
//        comboID.setBounds(220, 90, 150, 25);
//        comboID.setFont(new Font("Times New Roman", Font.PLAIN, 16));
//        comboID.setBackground(Color.WHITE);
//        add(comboID);

        tfid_type = new JTextField();
        tfid_type.setBounds(220, 90, 150, 25);
        add(tfid_type);

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

        tfgender = new JTextField();
        tfgender.setBounds(220, 210, 150, 25);
        add(tfgender);

//        rman = new JRadioButton("Man");
//        rman.setBounds(190, 210, 70, 25);
//        add(rman);
//
//        rwoman = new JRadioButton("Woman");
//        rwoman.setBounds(270, 210, 100, 25);
//        add(rwoman);
//
//        rother = new JRadioButton("Other");
//        rother.setBounds(370, 210, 70, 25);
//        add(rother);
//
//        ButtonGroup bg = new ButtonGroup();
//        bg.add(rman);
//        bg.add(rwoman);
//        bg.add(rother);

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

        update = new JButton("Update");
        update.setBackground(Color.GRAY);
        update.setForeground(Color.WHITE);
        update.setOpaque(true);
        update.setBounds(30, 420, 100, 25);
        update.setBorder(BorderFactory.createEmptyBorder());
        update.addActionListener(this);
        update.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                update.setBackground(Color.LIGHT_GRAY);
            }

            @Override
            public void mouseExited(MouseEvent e){
                update.setBackground(Color.GRAY);
            }

            @Override
            public void mousePressed(MouseEvent e){
                update.setBackground(Color.DARK_GRAY);
            }

            @Override
            public void mouseReleased(MouseEvent e){
                if (update.getBounds().contains(e.getPoint())){
                    update.setBackground(Color.LIGHT_GRAY);
                } else{
                    update.setBackground(Color.GRAY);
                }
            }
        });
        add(update);

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

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/update.png"));
        Image i2 = i1.getImage().getScaledInstance(370, 450, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(450, 40, 400, 450);
        add(image);

        try{
            Conn connection = new Conn();
            ResultSet rs = connection.s.executeQuery("SELECT * FROM customer WHERE username = '"+ this.username+"'");
            if (!rs.next()){
                JOptionPane.showMessageDialog(null, "Customer details not found");
            } else {
                labelusername.setText(rs.getString("username"));
                labelname.setText(rs.getString("name"));
                tfid_type.setText(rs.getString("id_type"));
                tfnumber_id.setText(rs.getString("id_number"));
                tfgender.setText(rs.getString("gender"));
                tfcountry.setText(rs.getString("country"));
                tfaddress.setText(rs.getString("address"));
                tfphone.setText(rs.getString("phone"));
                tfemail.setText(rs.getString("email"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == update){
            String user_name = labelusername.getText();
            String id = tfid_type.getText();
            String number = tfnumber_id.getText();
            String name = labelname.getText();
            String gender = tfgender.getText();
            String country = tfcountry.getText();
            String address = tfaddress.getText();
            String email = tfemail.getText();
            String phone = tfphone.getText();

            try{
                Conn conn = new Conn();
                String query = "UPDATE customer set username ='" + user_name + "', id_type ='"+ id +"', id_number ='"+ number +"', name ='"+ name +"', gender='"+
                        gender +"', country='"+ country +"', address='"+ address +"', phone='"+ phone +"', email='"+ email +"'";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Customer Details Updated Successfully");
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
        new UpdateCustomer("Sully");
    }
}
