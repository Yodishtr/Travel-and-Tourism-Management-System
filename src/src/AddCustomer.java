import javax.swing.*;
import java.awt.*;

/**
 * Class representing the frame for the add personal details button from the app dashboard
 */

public class AddCustomer extends JFrame {

    JLabel labelusername, labelname;
    JComboBox comboID;
    JTextField tfnumber_id, tfcountry, tfaddress, tfemail, tfphone;
    JRadioButton rman, rwoman, rother;

    public AddCustomer(){
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
        rman.setBounds(220, 210, 70, 25);
        add(rman);

        rwoman = new JRadioButton("Woman");
        rwoman.setBounds(290, 210, 100, 25);
        add(rwoman);

        rother = new JRadioButton("Other");
        rother.setBounds(390, 210, 70, 25);
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


        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public static void main(String[] args){
        new AddCustomer();
    }
}
