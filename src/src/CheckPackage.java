import javax.swing.*;
import java.awt.*;

/**
 * A class representing the check package button on the dashboard and allows user to
 * view the packages being offered.
 * future improvements would be to use an api to display real packages offered.
 */
public class CheckPackage extends JFrame {

    public CheckPackage(){
        setBounds(450, 200, 900, 600);

        JTabbedPane tab = new JTabbedPane();

        // Panel 1 : the Gold Package
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.LIGHT_GRAY);

        JLabel label1 = new JLabel("Gold Package");
        label1.setBounds(50, 5, 300, 30);
        label1.setFont(new Font("Serif", Font.BOLD, 25));
        label1.setForeground(Color.YELLOW);
        p1.add(label1);

        JLabel label2 = new JLabel("Duration: ");
        label2.setBounds(50, 70, 150, 30);
        label2.setFont(new Font("Serif", Font.BOLD, 20));
        label2.setForeground(Color.BLACK);
        p1.add(label2);

        JLabel label2_1 = new JLabel("6 days and 7 Nights");
        label2_1.setBounds(210, 70, 150, 30);
        label2_1.setFont(new Font("Serif", Font.PLAIN, 18));
        label2_1.setForeground(Color.WHITE);
        p1.add(label2_1);

        JLabel label3 = new JLabel("Package Features: ");
        label3.setBounds(50, 120, 300, 30);
        label3.setFont(new Font("Serif", Font.BOLD, 20));
        label3.setForeground(Color.BLACK);
        p1.add(label3);

       String[] features = {"Airport Assistance", "Continental Breakfast", "All-Inclusive", "City Tour"};
       JList<String> package_features = new JList<>(features);
       package_features.setCellRenderer(new BulletListCellRenderer());
       package_features.setVisibleRowCount(3);
       package_features.setBounds(50, 170, 300, 100);
       package_features.setBackground(Color.LIGHT_GRAY);
       p1.add(package_features);

       JLabel label4 = new JLabel("Exclusive Perk: ");
       label4.setBounds(50, 300, 150, 30);
       label4.setFont(new Font("Serif", Font.BOLD, 20));
       label4.setForeground(Color.BLACK);
       p1.add(label4);

       JLabel label4_1 = new JLabel("Personal Butler");
       label4_1.setBounds(220, 300, 150, 30);
       label4_1.setFont(new Font("Serif", Font.PLAIN, 18));
       label4_1.setForeground(Color.WHITE);
       p1.add(label4_1);

       JLabel label4_2 = new JLabel("3 Island Cruise");
       label4_2.setBounds(220, 340, 150, 30);
       label4_2.setFont(new Font("Serif", Font.PLAIN, 18));
       label4_2.setForeground(Color.WHITE);
       p1.add(label4_2);

        JLabel label4_3 = new JLabel("Polyglot Guide");
        label4_3.setBounds(220, 380, 150, 30);
        label4_3.setFont(new Font("Serif", Font.PLAIN, 18));
        label4_3.setForeground(Color.WHITE);
        p1.add(label4_3);

        JLabel label5 = new JLabel("Price: ");
        label5.setBounds(50, 430, 75, 30);
        label5.setFont(new Font("Serif", Font.BOLD, 20));
        label5.setForeground(Color.BLACK);
        p1.add(label5);

        JLabel label5_1 = new JLabel("Price Upon Request");
        label5_1.setBounds(150, 430, 200, 30);
        label5_1.setFont(new Font("Serif", Font.PLAIN, 18));
        label5_1.setForeground(Color.WHITE);
        p1.add(label5_1);



        tab.addTab("Package 1", null, p1);

        add(tab);




        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    static class BulletListCellRenderer extends DefaultListCellRenderer{
        @Override
        public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected,
                                                      boolean cellHasFocus) {
            super.getListCellRendererComponent(list, "• " + value, index, isSelected, cellHasFocus);
            setFont(new Font("Serif", Font.PLAIN, 18));
            setForeground(Color.WHITE);
            return this;
        }
    }

    public static void main(String[] args){
        new CheckPackage();
    }
}
