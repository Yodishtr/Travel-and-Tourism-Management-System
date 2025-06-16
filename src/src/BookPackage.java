import javax.swing.*;
import java.awt.*;

/**
 * A class representing the book package button and allows the user to book packages for their future holidays
 */

public class BookPackage extends JFrame {

    JTextField tfpersonTotal;
    Choice cpackage;

    public BookPackage(){
        setBounds(350, 200, 1100, 500);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JLabel text = new JLabel("Book Package");
        text.setBounds(100, 10, 200, 30);
        text.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(text);

        // Username label
        JLabel user_name = new JLabel("Username: ");
        user_name.setForeground(Color.BLACK);
        user_name.setBounds(40, 70, 100, 25);
        user_name.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(user_name);

        JLabel label_username = new JLabel();
        label_username.setForeground(Color.BLACK);
        label_username.setBounds(250, 70, 150, 25);
        label_username.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(label_username);

        // Select package
        JLabel select_package = new JLabel("Select Package");
        select_package.setForeground(Color.BLACK);
        select_package.setBounds(40, 110, 150, 25);
        select_package.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(select_package);

        cpackage = new Choice();
        cpackage.add("Gold Package");
        cpackage.add("Silver Package");
        cpackage.add("Regular Package");
        cpackage.setBounds(250, 110, 150, 25);
        add(cpackage);


        // Person total
        JLabel person_total = new JLabel("Total Persons: ");
        person_total.setForeground(Color.BLACK);
        person_total.setBounds(40, 170, 150, 25);
        person_total.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(person_total);

        tfpersonTotal = new JTextField("1");
        tfpersonTotal.setBounds(250, 170, 150, 25);
        tfpersonTotal.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(tfpersonTotal);

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


        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public static void main(String[] args){
        new BookPackage();
    }
}
