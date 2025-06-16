import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Main Screen for the travel App
 */
public class Dashboard extends JFrame implements ActionListener {

    private static JButton addPersonalDetails, updatePersonalDetails, viewPersonalDetails, deletePersonalDetails,
    checkPackages, bookPackages, viewPackage, viewHotels, bookHotel, viewBookedHotel, destination, payment, calculator,
            notepad, aboutButton;

    private String username;

    public Dashboard(String username){
        this.username = username;
        setBounds(0, 0, 1400, 1000);
        // setExtendedState(JFrame.MAXIMIZED_BOTH); to be used if you dont know your screen size and make the frame take up the full screen
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0, 0, 102));
        p1.setBounds(0, 0, 1400, 65);
        add(p1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(5, 15, 70, 40);
        p1.add(img);

        JLabel title = new JLabel("Dashboard");
        title.setFont(new Font("Tahoma", Font.BOLD, 30));
        title.setBackground(new Color(0, 0, 102));
        title.setForeground(Color.WHITE);
        title.setBounds(85, 15, 300, 40);
        p1.add(title);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0, 0, 102));
        p2.setBounds(0, 65, 300, 900);
        add(p2);

        addPersonalDetails = new JButton("Add Personal Details");
        addPersonalDetails.setBounds(0, 0, 300, 50);
        addPersonalDetails.setBackground(new Color(0, 0, 102));
        addPersonalDetails.setForeground(Color.WHITE);
        addPersonalDetails.addActionListener(this);
        addPersonalDetails.setFont(new Font("Tahoma", Font.BOLD, 20));
        addPersonalDetails.setBorder(BorderFactory.createEmptyBorder());
        addPersonalDetails.setOpaque(true);
        // addPersonalDetails.setBorderPainted(false);
        addPersonalDetails.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                addPersonalDetails.setBackground(new Color(0, 0, 150));
            }

            @Override
            public void mouseExited(MouseEvent e){
                addPersonalDetails.setBackground(new Color(0, 0, 102));
            }

            @Override
            public void mousePressed(MouseEvent e){
                addPersonalDetails.setBackground(new Color(0, 0, 80));
            }

            @Override
            public void mouseReleased(MouseEvent e){
                if (addPersonalDetails.getBounds().contains(e.getPoint())){
                    addPersonalDetails.setBackground(new Color(0, 0, 150));
                } else {
                    addPersonalDetails.setBackground(new Color(0, 0, 102));
                }
            }
        });
        p2.add(addPersonalDetails);


        updatePersonalDetails = new JButton("Update Personal Details");
        updatePersonalDetails.setBounds(0, 50, 300, 50);
        updatePersonalDetails.setBackground(new Color(0, 0, 102));
        updatePersonalDetails.setForeground(Color.WHITE);
        updatePersonalDetails.addActionListener(this);
        updatePersonalDetails.setFont(new Font("Tahoma", Font.BOLD, 20));
        updatePersonalDetails.setBorder(BorderFactory.createEmptyBorder());
        updatePersonalDetails.setOpaque(true);
        // updatePersonalDetails.setBorderPainted(false);
        updatePersonalDetails.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                updatePersonalDetails.setBackground(new Color(0, 0, 150));
            }

            @Override
            public void mouseExited(MouseEvent e){
                updatePersonalDetails.setBackground(new Color(0, 0, 102));
            }

            @Override
            public void mousePressed(MouseEvent e){
                updatePersonalDetails.setBackground(new Color(0, 0, 80));
            }

            @Override
            public void mouseReleased(MouseEvent e){
                if (updatePersonalDetails.getBounds().contains(e.getPoint())){
                    updatePersonalDetails.setBackground(new Color(0, 0, 150));
                } else {
                    updatePersonalDetails.setBackground(new Color(0, 0, 102));
                }
            }
        });
        p2.add(updatePersonalDetails);

        viewPersonalDetails = new JButton("View Personal Details");
        viewPersonalDetails.setBounds(0, 100, 300, 50);
        viewPersonalDetails.setBackground(new Color(0, 0, 102));
        viewPersonalDetails.setForeground(Color.WHITE);
        viewPersonalDetails.addActionListener(this);
        viewPersonalDetails.setFont(new Font("Tahoma", Font.BOLD, 20));
        viewPersonalDetails.setBorder(BorderFactory.createEmptyBorder());
        viewPersonalDetails.setOpaque(true);
        viewPersonalDetails.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                viewPersonalDetails.setBackground(new Color(0, 0, 150));
            }

            @Override
            public void mouseExited(MouseEvent e){
                viewPersonalDetails.setBackground(new Color(0, 0, 102));
            }

            @Override
            public void mousePressed(MouseEvent e){
                viewPersonalDetails.setBackground(new Color(0, 0, 80));
            }

            @Override
            public void mouseReleased(MouseEvent e){
                if (viewPersonalDetails.getBounds().contains(e.getPoint())){
                    viewPersonalDetails.setBackground(new Color(0, 0, 150));
                } else {
                    viewPersonalDetails.setBackground(new Color(0, 0, 102));
                }
            }
        });
        p2.add(viewPersonalDetails);


        deletePersonalDetails = new JButton("Delete Personal Details");
        deletePersonalDetails.setBounds(0, 150, 300, 50);
        deletePersonalDetails.setBackground(new Color(0, 0, 102));
        deletePersonalDetails.setForeground(Color.WHITE);
        deletePersonalDetails.addActionListener(this);
        deletePersonalDetails.setFont(new Font("Tahoma", Font.BOLD, 20));
        deletePersonalDetails.setBorder(BorderFactory.createEmptyBorder());
        deletePersonalDetails.setOpaque(true);
        deletePersonalDetails.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                deletePersonalDetails.setBackground(new Color(0, 0, 150));
            }

            @Override
            public void mouseExited(MouseEvent e){
                deletePersonalDetails.setBackground(new Color(0, 0, 102));
            }

            @Override
            public void mousePressed(MouseEvent e){
                deletePersonalDetails.setBackground(new Color(0, 0, 80));
            }

            @Override
            public void mouseReleased(MouseEvent e){
                if (deletePersonalDetails.getBounds().contains(e.getPoint())){
                    deletePersonalDetails.setBackground(new Color(0, 0, 150));
                } else {
                    deletePersonalDetails.setBackground(new Color(0, 0, 102));
                }
            }
        });
        p2.add(deletePersonalDetails);


        checkPackages = new JButton("Check Packages");
        checkPackages.setBounds(0, 200, 300, 50);
        checkPackages.setBackground(new Color(0, 0, 102));
        checkPackages.setForeground(Color.WHITE);
        checkPackages.addActionListener(this);
        checkPackages.setFont(new Font("Tahoma", Font.BOLD, 20));
        checkPackages.setBorder(BorderFactory.createEmptyBorder());
        checkPackages.setOpaque(true);
        checkPackages.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                checkPackages.setBackground(new Color(0, 0, 150));
            }

            @Override
            public void mouseExited(MouseEvent e){
                checkPackages.setBackground(new Color(0, 0, 102));
            }

            @Override
            public void mousePressed(MouseEvent e){
                checkPackages.setBackground(new Color(0, 0, 80));
            }

            @Override
            public void mouseReleased(MouseEvent e){
                if (checkPackages.getBounds().contains(e.getPoint())){
                    checkPackages.setBackground(new Color(0, 0, 150));
                } else {
                    checkPackages.setBackground(new Color(0, 0, 102));
                }
            }
        });
        p2.add(checkPackages);


        bookPackages = new JButton("Book Packages");
        bookPackages.setBounds(0, 250, 300, 50);
        bookPackages.setBackground(new Color(0, 0, 102));
        bookPackages.setForeground(Color.WHITE);
        bookPackages.addActionListener(this);
        bookPackages.setFont(new Font("Tahoma", Font.BOLD, 20));
        bookPackages.setBorder(BorderFactory.createEmptyBorder());
        bookPackages.setOpaque(true);
        bookPackages.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                bookPackages.setBackground(new Color(0, 0, 150));
            }

            @Override
            public void mouseExited(MouseEvent e){
                bookPackages.setBackground(new Color(0, 0, 102));
            }

            @Override
            public void mousePressed(MouseEvent e){
                bookPackages.setBackground(new Color(0, 0, 80));
            }

            @Override
            public void mouseReleased(MouseEvent e){
                if (bookPackages.getBounds().contains(e.getPoint())){
                    bookPackages.setBackground(new Color(0, 0, 150));
                } else {
                    bookPackages.setBackground(new Color(0, 0, 102));
                }
            }
        });
        p2.add(bookPackages);


        viewPackage = new JButton("View Packages");
        viewPackage.setBounds(0, 300, 300, 50);
        viewPackage.setBackground(new Color(0, 0, 102));
        viewPackage.setForeground(Color.WHITE);
        viewPackage.addActionListener(this);
        viewPackage.setFont(new Font("Tahoma", Font.BOLD, 20));
        viewPackage.setBorder(BorderFactory.createEmptyBorder());
        viewPackage.setOpaque(true);
        viewPackage.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                viewPackage.setBackground(new Color(0, 0, 150));
            }

            @Override
            public void mouseExited(MouseEvent e){
                viewPackage.setBackground(new Color(0, 0, 102));
            }

            @Override
            public void mousePressed(MouseEvent e){
                viewPackage.setBackground(new Color(0, 0, 80));
            }

            @Override
            public void mouseReleased(MouseEvent e){
                if (viewPackage.getBounds().contains(e.getPoint())){
                    viewPackage.setBackground(new Color(0, 0, 150));
                } else {
                    viewPackage.setBackground(new Color(0, 0, 102));
                }
            }
        });
        p2.add(viewPackage);


        viewHotels = new JButton("View Hotels");
        viewHotels.setBounds(0, 350, 300, 50);
        viewHotels.setBackground(new Color(0, 0, 102));
        viewHotels.setForeground(Color.WHITE);
        viewHotels.addActionListener(this);
        viewHotels.setFont(new Font("Tahoma", Font.BOLD, 20));
        viewHotels.setBorder(BorderFactory.createEmptyBorder());
        viewHotels.setOpaque(true);
        viewHotels.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                viewHotels.setBackground(new Color(0, 0, 150));
            }

            @Override
            public void mouseExited(MouseEvent e){
                viewHotels.setBackground(new Color(0, 0, 102));
            }

            @Override
            public void mousePressed(MouseEvent e){
                viewHotels.setBackground(new Color(0, 0, 80));
            }

            @Override
            public void mouseReleased(MouseEvent e){
                if (viewHotels.getBounds().contains(e.getPoint())){
                    viewHotels.setBackground(new Color(0, 0, 150));
                } else {
                    viewHotels.setBackground(new Color(0, 0, 102));
                }
            }
        });
        p2.add(viewHotels);


        bookHotel = new JButton("Book Hotels");
        bookHotel.setBounds(0, 400, 300, 50);
        bookHotel.setBackground(new Color(0, 0, 102));
        bookHotel.setForeground(Color.WHITE);
        bookHotel.addActionListener(this);
        bookHotel.setFont(new Font("Tahoma", Font.BOLD, 20));
        bookHotel.setBorder(BorderFactory.createEmptyBorder());
        bookHotel.setOpaque(true);
        bookHotel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                bookHotel.setBackground(new Color(0, 0, 150));
            }

            @Override
            public void mouseExited(MouseEvent e){
                bookHotel.setBackground(new Color(0, 0, 102));
            }

            @Override
            public void mousePressed(MouseEvent e){
                bookHotel.setBackground(new Color(0, 0, 80));
            }

            @Override
            public void mouseReleased(MouseEvent e){
                if (bookHotel.getBounds().contains(e.getPoint())){
                    bookHotel.setBackground(new Color(0, 0, 150));
                } else {
                    bookHotel.setBackground(new Color(0, 0, 102));
                }
            }
        });
        p2.add(bookHotel);


        viewBookedHotel = new JButton("View Booked Hotels");
        viewBookedHotel.setBounds(0, 450, 300, 50);
        viewBookedHotel.setBackground(new Color(0, 0, 102));
        viewBookedHotel.setForeground(Color.WHITE);
        viewBookedHotel.addActionListener(this);
        viewBookedHotel.setFont(new Font("Tahoma", Font.BOLD, 20));
        viewBookedHotel.setBorder(BorderFactory.createEmptyBorder());
        viewBookedHotel.setOpaque(true);
        viewBookedHotel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                viewBookedHotel.setBackground(new Color(0, 0, 150));
            }

            @Override
            public void mouseExited(MouseEvent e){
                viewBookedHotel.setBackground(new Color(0, 0, 102));
            }

            @Override
            public void mousePressed(MouseEvent e){
                viewBookedHotel.setBackground(new Color(0, 0, 80));
            }

            @Override
            public void mouseReleased(MouseEvent e){
                if (viewBookedHotel.getBounds().contains(e.getPoint())){
                    viewBookedHotel.setBackground(new Color(0, 0, 150));
                } else {
                    viewBookedHotel.setBackground(new Color(0, 0, 102));
                }
            }
        });
        p2.add(viewBookedHotel);

        destination = new JButton("Destination");
        destination.setBounds(0, 500, 300, 50);
        destination.setBackground(new Color(0, 0, 102));
        destination.setForeground(Color.WHITE);
        destination.addActionListener(this);
        destination.setFont(new Font("Tahoma", Font.BOLD, 20));
        destination.setBorder(BorderFactory.createEmptyBorder());
        destination.setOpaque(true);
        destination.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                destination.setBackground(new Color(0, 0, 150));
            }

            @Override
            public void mouseExited(MouseEvent e){
                destination.setBackground(new Color(0, 0, 102));
            }

            @Override
            public void mousePressed(MouseEvent e){
                destination.setBackground(new Color(0, 0, 80));
            }

            @Override
            public void mouseReleased(MouseEvent e){
                if (destination.getBounds().contains(e.getPoint())){
                    destination.setBackground(new Color(0, 0, 150));
                } else {
                    destination.setBackground(new Color(0, 0, 102));
                }
            }
        });
        p2.add(destination);


        payment = new JButton("Payment");
        payment.setBounds(0, 550, 300, 50);
        payment.setBackground(new Color(0, 0, 102));
        payment.setForeground(Color.WHITE);
        payment.addActionListener(this);
        payment.setFont(new Font("Tahoma", Font.BOLD, 20));
        payment.setBorder(BorderFactory.createEmptyBorder());
        payment.setOpaque(true);
        payment.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                payment.setBackground(new Color(0, 0, 150));
            }

            @Override
            public void mouseExited(MouseEvent e){
                payment.setBackground(new Color(0, 0, 102));
            }

            @Override
            public void mousePressed(MouseEvent e){
                payment.setBackground(new Color(0, 0, 80));
            }

            @Override
            public void mouseReleased(MouseEvent e){
                if (payment.getBounds().contains(e.getPoint())){
                    payment.setBackground(new Color(0, 0, 150));
                } else {
                    payment.setBackground(new Color(0, 0, 102));
                }
            }
        });
        p2.add(payment);

        calculator = new JButton("Calculator");
        calculator.setBounds(0, 600, 300, 50);
        calculator.setBackground(new Color(0, 0, 102));
        calculator.setForeground(Color.WHITE);
        calculator.addActionListener(this);
        calculator.setFont(new Font("Tahoma", Font.BOLD, 20));
        calculator.setBorder(BorderFactory.createEmptyBorder());
        calculator.setOpaque(true);
        calculator.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                calculator.setBackground(new Color(0, 0, 150));
            }

            @Override
            public void mouseExited(MouseEvent e){
                calculator.setBackground(new Color(0, 0, 102));
            }

            @Override
            public void mousePressed(MouseEvent e){
                calculator.setBackground(new Color(0, 0, 80));
            }

            @Override
            public void mouseReleased(MouseEvent e){
                if (calculator.getBounds().contains(e.getPoint())){
                    calculator.setBackground(new Color(0, 0, 150));
                } else {
                    calculator.setBackground(new Color(0, 0, 102));
                }
            }
        });
        p2.add(calculator);


        notepad = new JButton("Notepad");
        notepad.setBounds(0, 650, 300, 50);
        notepad.setBackground(new Color(0, 0, 102));
        notepad.setForeground(Color.WHITE);
        notepad.addActionListener(this);
        notepad.setFont(new Font("Tahoma", Font.BOLD, 20));
        notepad.setBorder(BorderFactory.createEmptyBorder());
        notepad.setOpaque(true);
        notepad.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                notepad.setBackground(new Color(0, 0, 150));
            }

            @Override
            public void mouseExited(MouseEvent e){
                notepad.setBackground(new Color(0, 0, 102));
            }

            @Override
            public void mousePressed(MouseEvent e){
                notepad.setBackground(new Color(0, 0, 80));
            }

            @Override
            public void mouseReleased(MouseEvent e){
                if (notepad.getBounds().contains(e.getPoint())){
                    notepad.setBackground(new Color(0, 0, 150));
                } else {
                    notepad.setBackground(new Color(0, 0, 102));
                }
            }
        });
        p2.add(notepad);


        aboutButton = new JButton("About The App");
        aboutButton.setBounds(0, 700, 300, 50);
        aboutButton.setBackground(new Color(0, 0, 102));
        aboutButton.setForeground(Color.WHITE);
        aboutButton.addActionListener(this);
        aboutButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        aboutButton.setBorder(BorderFactory.createEmptyBorder());
        aboutButton.setOpaque(true);
        aboutButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                aboutButton.setBackground(new Color(0, 0, 150));
            }

            @Override
            public void mouseExited(MouseEvent e){
                aboutButton.setBackground(new Color(0, 0, 102));
            }

            @Override
            public void mousePressed(MouseEvent e){
                aboutButton.setBackground(new Color(0, 0, 80));
            }

            @Override
            public void mouseReleased(MouseEvent e){
                if (aboutButton.getBounds().contains(e.getPoint())){
                    aboutButton.setBackground(new Color(0, 0, 150));
                } else {
                    aboutButton.setBackground(new Color(0, 0, 102));
                }
            }
        });
        p2.add(aboutButton);

        JPanel p3 = new JPanel();
        p3.setLayout(null);
        p3.setBounds(300, 65, 1100, 900);
        add(p3);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1100, 900, Image.SCALE_SMOOTH);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel mainImage = new JLabel(i6);
        mainImage.setBounds(0, 0, 1100, 800);
        p3.add(mainImage);

        JLabel image_text = new JLabel("Travel Management System");
        image_text.setBounds(50, 30, 1000, 70);
        image_text.setForeground(Color.WHITE);
        image_text.setFont(new Font("Raleway", Font.BOLD, 40));
        mainImage.add(image_text);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae){
        // will be used to implement the buttons. make this frame invisble and dont dispose it when clicking on buttons
        if (ae.getSource() == addPersonalDetails){
            new AddCustomer(username);
        } else if (ae.getSource() == viewPersonalDetails){
            new ViewCustomer(username);
        } else if (ae.getSource() == updatePersonalDetails){
            new UpdateCustomer(username);
        }
    }


    public static void main(String[] args){
        new Dashboard("Sully");
    }
}
