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

    private static JButton addPersonalDetails, updatePersonalDetails;

    public Dashboard(){
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





        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae){
        //
    }


    public static void main(String[] args){
        new Dashboard();
    }
}
