import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * A class representing the frame created when the user presses the book hotel button
 * on the dashboard
 */
public class BookHotel extends JFrame implements ActionListener {

    private String username;
    private Choice c1, c2, c3;
    private JTextField t1, t2;
    private JButton checkPrice, book, back;
    private JLabel label_totalPrice;


    public BookHotel(String username){
        this.username = username;
        setBounds(420, 220, 1100, 650);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        // image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/book.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 400, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(450, 100, 600, 400);
        add(image);

        // title label
        JLabel title = new JLabel("Book Hotel");
        title.setFont(new Font("Sans Serif", Font.BOLD, 20));
        title.setBounds(118, 11, 300, 53);
        add(title);


        // username labels
        JLabel lblUsername = new JLabel("Username: ");
        lblUsername.setFont(new Font("Sans Serif", Font.BOLD, 16));
        lblUsername.setBounds(35, 70, 200, 20);
        add(lblUsername);

        JLabel labelUsername = new JLabel(this.username);
        labelUsername.setFont(new Font("Sans Serif", Font.PLAIN, 16));
        labelUsername.setBounds(271, 70, 200, 20);
        add(labelUsername);

        // hotel selection
        JLabel lblChooseHotel = new JLabel("Select Hotel");
        lblChooseHotel.setFont(new Font("Sans Serif", Font.BOLD, 16));
        lblChooseHotel.setBounds(35, 120, 200, 20);
        add(lblChooseHotel);

        c1 = new Choice();
        c1.setFont(new Font("Sans Serif", Font.PLAIN, 12));
        c1.setBounds(271, 120, 175, 20);
        add(c1);

        // party Size
        JLabel lblPersons = new JLabel("Total Person: ");
        lblPersons.setFont(new Font("Sans Serif", Font.BOLD, 16));
        lblPersons.setBounds(35, 170, 200, 20);
        add(lblPersons);

        t1 = new JTextField("0");
        t1.setFont(new Font("Sans Serif", Font.PLAIN, 16));
        t1.setBounds(271, 170, 200, 20);
        add(t1);

        // length of stay
        JLabel lblDays = new JLabel("Days: ");
        lblDays.setFont(new Font("Sans Serif", Font.BOLD, 16));
        lblDays.setBounds(35, 220, 200, 20);
        add(lblDays);

        t2 = new JTextField("0");
        t2.setFont(new Font("Sans Serif", Font.PLAIN, 16));
        t2.setBounds(271, 220, 200, 20);
        add(t2);

        // Ac
        JLabel lblAC = new JLabel("AC / Non-AC: ");
        lblAC.setFont(new Font("Sans Serif", Font.BOLD, 16));
        lblAC.setBounds(35, 270, 200, 20);
        add(lblAC);

        c2 = new Choice();
        c2.add("With AC");
        c2.add("No AC");
        c2.setFont(new Font("Sans Serif", Font.PLAIN, 12));
        c2.setBounds(271, 270, 175, 20);
        add(c2);

        // Food option
        JLabel lblFood = new JLabel("Food Included: ");
        lblFood.setFont(new Font("Sans Serif", Font.BOLD, 16));
        lblFood.setBounds(35, 320, 200, 20);
        add(lblFood);

        c3 = new Choice();
        c3.add("Yes");
        c3.add("No");
        c3.setFont(new Font("Sans Serif", Font.PLAIN, 12));
        c3.setBounds(271, 320, 175, 20);
        add(c3);

        // ID_Number label
        JLabel lblID = new JLabel("ID: ");
        lblID.setFont(new Font("Sans Serif", Font.BOLD, 16));
        lblID.setBounds(35, 370, 200, 20);
        add(lblID);

        JLabel label_IDNumber = new JLabel();
        label_IDNumber.setFont(new Font("Sans Serif", Font.PLAIN, 16));
        label_IDNumber.setBounds(271, 370, 200, 20);
        add(label_IDNumber);

        // Phone Number
        JLabel lblPhone = new JLabel("Phone: ");
        lblPhone.setFont(new Font("Sans Serif", Font.BOLD, 16));
        lblPhone.setBounds(35, 420, 200, 20);
        add(lblPhone);

        JLabel label_phone = new JLabel();
        label_phone.setFont(new Font("Sans Serif", Font.PLAIN, 16));
        label_phone.setBounds(271, 420, 200, 20);
        add(label_phone);


        // Email
        JLabel lblEmail = new JLabel("Email: ");
        lblEmail.setFont(new Font("Sans Serif", Font.BOLD, 16));
        lblEmail.setBounds(35, 470, 200, 20);
        add(lblEmail);

        JLabel label_email = new JLabel();
        label_email.setFont(new Font("Sans Serif", Font.PLAIN, 16));
        label_email.setBounds(271, 470, 200, 20);
        add(label_email);


        // Total Price
        JLabel lblTotalPrice = new JLabel("Total Price: ");
        lblTotalPrice.setFont(new Font("Sans Serif", Font.BOLD, 16));
        lblTotalPrice.setBounds(35, 520, 200, 20);
        add(lblTotalPrice);

        label_totalPrice = new JLabel();
        label_totalPrice.setFont(new Font("Sans Serif", Font.PLAIN, 16));
        label_totalPrice.setBounds(271, 520, 200, 20);
        add(label_totalPrice);


        Conn conn = new Conn();
        try{
            String query1 = "SELECT * FROM hotel";
            PreparedStatement stmt1 = conn.prepareStatement(query1);
            ResultSet rs1 = stmt1.executeQuery();
            String query2 = "SELECT id_number, phone, email FROM customer WHERE username = ?";
            PreparedStatement stmt2 = conn.prepareStatement(query2);
            stmt2.setString(1, this.username);
            ResultSet rs2 = stmt2.executeQuery();


            while (rs1.next()){
                c1.add(rs1.getString("name"));
            }

            if(!rs2.next()){
                JOptionPane.showMessageDialog(null, "User Personal Data cannot be found");
            }else {
                label_IDNumber.setText(rs2.getString("id_number"));
                label_phone.setText(rs2.getString("phone"));
                label_email.setText(rs2.getString("email"));
            }

            rs1.close();
            rs2.close();
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error Connecting to Database");
        }

        // Check Price button
        checkPrice = new JButton("Calculate");
        checkPrice.setBackground(Color.GRAY);
        checkPrice.setForeground(Color.WHITE);
        checkPrice.setFont(new Font("Tahoma", Font.BOLD, 15));
        checkPrice.setBounds(50, 550, 100, 25);
        checkPrice.setOpaque(true);
        checkPrice.setBorder(BorderFactory.createEmptyBorder());
        checkPrice.addActionListener(this);
        checkPrice.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                checkPrice.setBackground(Color.BLACK);
            }

            @Override
            public void mouseExited(MouseEvent e){
                checkPrice.setBackground(Color.GRAY);
            }

            @Override
            public void mousePressed(MouseEvent e){
                checkPrice.setBackground(Color.DARK_GRAY);
            }

            @Override
            public void mouseReleased(MouseEvent e){
                if (checkPrice.getBounds().contains(e.getPoint())){
                    checkPrice.setBackground(Color.BLACK);
                } else{
                    checkPrice.setBackground(Color.GRAY);
                }
            }
        });
        add(checkPrice);

        // Book Button
        book = new JButton("Book");
        book.setBackground(Color.GRAY);
        book.setForeground(Color.WHITE);
        book.setFont(new Font("Tahoma", Font.BOLD, 15));
        book.setBounds(170, 550, 100, 25);
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
        back.setBounds(110, 580, 100, 25);
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
        if (e.getSource() == checkPrice){
            Conn conn = new Conn();
            try{
                String hotelChoice = c1.getSelectedItem().toString();
                String query = "SELECT * FROM hotel WHERE name = ?";
                PreparedStatement stmt1 = conn.prepareStatement(query);
                stmt1.setString(1, hotelChoice);
                ResultSet rs1 = stmt1.executeQuery();
                if (!rs1.next()){
                    JOptionPane.showMessageDialog(null, "No Hotel Found");
                }
                String food_option = rs1.getString("foodincluded");
                String ac_option = rs1.getString("acroom");
                String regularPrice = rs1.getString("costperperson");


                String lengthStay = t1.getText();
                String acOption = t2.getText();
                String foodOption = c3.getSelectedItem().toString();
                if ((acOption == "With AC") && (foodOption.equals("Yes"))){
                    int totalOptionCost = Integer.valueOf(food_option) + Integer.valueOf(ac_option);
                    int totalHotelCostPerPerson = Integer.valueOf(lengthStay) * totalOptionCost;
                    int finalTotal = totalHotelCostPerPerson * Integer.valueOf(t1.getText());
                    label_totalPrice.setText(String.valueOf(finalTotal));
                } else if ((acOption == "No AC") && (foodOption.equals("No"))){
                    int totalHotelCostPerPerson = Integer.valueOf(lengthStay) + Integer.valueOf(regularPrice);
                    int finalTotal = totalHotelCostPerPerson * Integer.valueOf(t1.getText());
                    label_totalPrice.setText(String.valueOf(finalTotal));
                }

            } catch(Exception eE){
                JOptionPane.showMessageDialog(null, "Error Connecting to Database");
            }
        }
    }


    public static void main(String[] args){
        new BookHotel("Sully");
    }
}
