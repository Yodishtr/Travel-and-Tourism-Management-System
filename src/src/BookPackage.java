import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;

/**
 * A class representing the book package button and allows the user to book packages for their future holidays
 */

public class BookPackage extends JFrame implements ActionListener {

    private JLabel label_totalPrice, label_username, label_id, label_idNumber;
    private JTextField tfpersonTotal;
    private JButton calculate, book, back;
    private Choice cpackage;
    private String username;



    public BookPackage(String username){
        this.username = username;
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

        label_username = new JLabel();
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

        // ID
        JLabel id = new JLabel("ID: ");
        id.setForeground(Color.BLACK);
        id.setBounds(40, 230, 150, 25);
        id.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(id);

        label_id = new JLabel();
        label_id.setForeground(Color.BLACK);
        label_id.setBounds(250, 230, 150, 25);
        label_id.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(label_id);

        // ID Number
        JLabel id_number = new JLabel("ID Number: ");
        id_number.setForeground(Color.BLACK);
        id_number.setBounds(40, 290, 150, 25);
        id_number.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(id_number);

        label_idNumber = new JLabel();
        label_idNumber.setForeground(Color.BLACK);
        label_idNumber.setBounds(250, 290, 150, 25);
        label_idNumber.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(label_idNumber);

        // total price
        JLabel total_price = new JLabel("Total Price: ");
        total_price.setForeground(Color.BLACK);
        total_price.setBounds(40, 350, 150, 25);
        total_price.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(total_price);

        label_totalPrice = new JLabel();
        label_totalPrice.setForeground(Color.BLACK);
        label_totalPrice.setBounds(250, 350, 150, 25);
        label_totalPrice.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(label_totalPrice);


        try{
            Conn conn = new Conn();
            String query = "SELECT * FROM customer WHERE username = '"+ this.username +"'";
            ResultSet rs = conn.s.executeQuery(query);
            if (!rs.next()){
                JOptionPane.showMessageDialog(null, "Customer Not Found");
            } else{
                label_username.setText(rs.getString("username"));
                label_id.setText(rs.getString("id_type"));
                label_idNumber.setText(rs.getString("id_number"));
            }

        } catch (Exception e){
            e.printStackTrace();
        }

        calculate = new JButton("Calculate");
        calculate.setBackground(Color.GRAY);
        calculate.setForeground(Color.WHITE);
        calculate.setFont(new Font("Tahoma", Font.BOLD, 15));
        calculate.setBounds(40, 390, 100, 25);
        calculate.setOpaque(true);
        calculate.setBorder(BorderFactory.createEmptyBorder());
        calculate.addActionListener(this);
        calculate.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                calculate.setBackground(Color.BLACK);
            }

            @Override
            public void mouseExited(MouseEvent e){
                calculate.setBackground(Color.GRAY);
            }

            @Override
            public void mousePressed(MouseEvent e){
                calculate.setBackground(Color.DARK_GRAY);
            }

            @Override
            public void mouseReleased(MouseEvent e){
                if (calculate.getBounds().contains(e.getPoint())){
                    calculate.setBackground(Color.BLACK);
                } else{
                    calculate.setBackground(Color.GRAY);
                }
            }
        });
        add(calculate);

        book = new JButton("Book");
        book.setBackground(Color.GRAY);
        book.setForeground(Color.WHITE);
        book.setFont(new Font("Tahoma", Font.BOLD, 15));
        book.setBounds(170, 390, 100, 25);
        book.setOpaque(true);
        book.setBorder(BorderFactory.createEmptyBorder());
        book.addActionListener(this);
        book.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                book.setBackground(Color.BLACK);
            }

            @Override
            public void mouseExited(MouseEvent e){
                book.setBackground(Color.GRAY);
            }

            @Override
            public void mousePressed(MouseEvent e){
                book.setBackground(Color.DARK_GRAY);
            }

            @Override
            public void mouseReleased(MouseEvent e){
                if (book.getBounds().contains(e.getPoint())){
                    book.setBackground(Color.BLACK);
                } else{
                    book.setBackground(Color.GRAY);
                }
            }
        });
        add(book);

        back = new JButton("Back");
        back.setBackground(Color.GRAY);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Tahoma", Font.BOLD, 15));
        back.setBounds(100, 430, 100, 25);
        back.setOpaque(true);
        back.setBorder(BorderFactory.createEmptyBorder());
        back.addActionListener(this);
        back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                back.setBackground(Color.BLACK);
            }

            @Override
            public void mouseExited(MouseEvent e){
                back.setBackground(Color.GRAY);
            }

            @Override
            public void mousePressed(MouseEvent e){
                back.setBackground(Color.DARK_GRAY);
            }

            @Override
            public void mouseReleased(MouseEvent e){
                if (back.getBounds().contains(e.getPoint())){
                    back.setBackground(Color.BLACK);
                } else{
                    back.setBackground(Color.GRAY);
                }
            }
        });
        add(back);




        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == calculate){
            String package_selected = cpackage.getSelectedItem().toString();
            Integer number_person = 1;
            try {
                number_person = Integer.valueOf(tfpersonTotal.getText().trim());
            } catch (NumberFormatException E){
                JOptionPane.showMessageDialog(null, "Please enter a valid number");
            }
            if (package_selected.equals("Gold Package")){
                Integer finalPrice = number_person * 50;
                label_totalPrice.setText('$' + String.valueOf(finalPrice) + 'k');
            } else if (package_selected.equals("Silver Package")){
                Integer finalPrice = number_person * 20;
                label_totalPrice.setText('$' + String.valueOf(finalPrice) + 'k');
            } else{
                Integer finalPrice = number_person * 10;
                label_totalPrice.setText('$' + String.valueOf(finalPrice) + 'k');
            }
        } else if (e.getSource() == back){
            SwingUtilities.invokeLater(() -> {
                dispose();
            });
        } else{
            try{
                Conn conn = new Conn();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args){
        new BookPackage("Sully");
    }
}
