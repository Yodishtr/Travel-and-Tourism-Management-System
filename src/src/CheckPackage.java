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
        label2.setBounds(50, 70, 120, 30);
        label2.setFont(new Font("Serif", Font.BOLD, 20));
        label2.setForeground(Color.BLACK);
        p1.add(label2);

        JLabel label2_1 = new JLabel("6 days and 7 Nights");
        label2_1.setBounds(190, 70, 150, 30);
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

        JLabel label5_1 = new JLabel("$50K");
        label5_1.setBounds(150, 430, 200, 30);
        label5_1.setFont(new Font("Serif", Font.PLAIN, 18));
        label5_1.setForeground(Color.WHITE);
        p1.add(label5_1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/package1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel gold_image = new JLabel(i3);
        gold_image.setBounds(350, 20, 500, 300);
        p1.add(gold_image);


        // Panel 2: Silver Package
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(Color.LIGHT_GRAY);

        JLabel label1_p2 = new JLabel("Silver Package");
        label1_p2.setBounds(50, 5, 300, 30);
        label1_p2.setFont(new Font("Serif", Font.BOLD, 25));
        label1_p2.setForeground(Color.GRAY);
        p2.add(label1_p2);

        JLabel label2_p2 = new JLabel("Duration: ");
        label2_p2.setBounds(50, 70, 120, 30);
        label2_p2.setFont(new Font("Serif", Font.BOLD, 20));
        label2_p2.setForeground(Color.BLACK);
        p2.add(label2_p2);

        JLabel label2_1_p2 = new JLabel("5 days and 6 Nights");
        label2_1_p2.setBounds(190, 70, 150, 30);
        label2_1_p2.setFont(new Font("Serif", Font.PLAIN, 18));
        label2_1_p2.setForeground(Color.WHITE);
        p2.add(label2_1_p2);

        JLabel label3_p2 = new JLabel("Package Features: ");
        label3_p2.setBounds(50, 120, 300, 30);
        label3_p2.setFont(new Font("Serif", Font.BOLD, 20));
        label3_p2.setForeground(Color.BLACK);
        p2.add(label3_p2);

        String[] features_p2 = {"Airport Assistance", "Continental Breakfast", "All-Inclusive"};
        JList<String> package_features_p2 = new JList<>(features_p2);
        package_features_p2.setCellRenderer(new BulletListCellRenderer());
        package_features_p2.setVisibleRowCount(3);
        package_features_p2.setBounds(50, 170, 300, 100);
        package_features_p2.setBackground(Color.LIGHT_GRAY);
        p2.add(package_features_p2);

        JLabel label4_p2 = new JLabel("Exclusive Perk: ");
        label4_p2.setBounds(50, 300, 150, 30);
        label4_p2.setFont(new Font("Serif", Font.BOLD, 20));
        label4_p2.setForeground(Color.BLACK);
        p2.add(label4_p2);

        JLabel label4_1_p2 = new JLabel("Taxi Help");
        label4_1_p2.setBounds(220, 300, 150, 30);
        label4_1_p2.setFont(new Font("Serif", Font.PLAIN, 18));
        label4_1_p2.setForeground(Color.WHITE);
        p2.add(label4_1_p2);

        JLabel label4_2_p2 = new JLabel("City Tour");
        label4_2_p2.setBounds(220, 340, 150, 30);
        label4_2_p2.setFont(new Font("Serif", Font.PLAIN, 18));
        label4_2_p2.setForeground(Color.WHITE);
        p2.add(label4_2_p2);

        JLabel label4_3_p2 = new JLabel("Food guide");
        label4_3_p2.setBounds(220, 380, 150, 30);
        label4_3_p2.setFont(new Font("Serif", Font.PLAIN, 18));
        label4_3_p2.setForeground(Color.WHITE);
        p2.add(label4_3_p2);

        JLabel label5_p2 = new JLabel("Price: ");
        label5_p2.setBounds(50, 430, 75, 30);
        label5_p2.setFont(new Font("Serif", Font.BOLD, 20));
        label5_p2.setForeground(Color.BLACK);
        p2.add(label5_p2);

        JLabel label5_1_p2 = new JLabel("$20k");
        label5_1_p2.setBounds(150, 430, 200, 30);
        label5_1_p2.setFont(new Font("Serif", Font.PLAIN, 18));
        label5_1_p2.setForeground(Color.WHITE);
        p2.add(label5_1_p2);

        ImageIcon i1_p2 = new ImageIcon(ClassLoader.getSystemResource("icons/package2.jpg"));
        Image i2_p2 = i1_p2.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i3_p2 = new ImageIcon(i2_p2);
        JLabel silver_image = new JLabel(i3_p2);
        silver_image.setBounds(350, 20, 500, 300);
        p2.add(silver_image);




        // Panel 3: Regular Package
        JPanel p3 = new JPanel();
        p3.setLayout(null);
        p3.setBackground(Color.LIGHT_GRAY);

        JLabel label1_p3 = new JLabel("Regular Package");
        label1_p3.setBounds(50, 5, 300, 30);
        label1_p3.setFont(new Font("Serif", Font.BOLD, 25));
        label1_p3.setForeground(Color.ORANGE);
        p3.add(label1_p3);

        JLabel label2_p3 = new JLabel("Duration: ");
        label2_p3.setBounds(50, 70, 120, 30);
        label2_p3.setFont(new Font("Serif", Font.BOLD, 20));
        label2_p3.setForeground(Color.BLACK);
        p3.add(label2_p3);

        JLabel label2_1_p3 = new JLabel("4 days and 5 Nights");
        label2_1_p3.setBounds(190, 70, 150, 30);
        label2_1_p3.setFont(new Font("Serif", Font.PLAIN, 18));
        label2_1_p3.setForeground(Color.WHITE);
        p3.add(label2_1_p3);

        JLabel label3_p3 = new JLabel("Package Features: ");
        label3_p3.setBounds(50, 120, 300, 30);
        label3_p3.setFont(new Font("Serif", Font.BOLD, 20));
        label3_p3.setForeground(Color.BLACK);
        p3.add(label3_p3);

        String[] features_p3 = {"Drinks Included", "Continental Breakfast", "Pool access"};
        JList<String> package_features_p3 = new JList<>(features_p3);
        package_features_p3.setCellRenderer(new BulletListCellRenderer());
        package_features_p3.setVisibleRowCount(3);
        package_features_p3.setBounds(50, 170, 300, 100);
        package_features_p3.setBackground(Color.LIGHT_GRAY);
        p3.add(package_features_p3);

        JLabel label4_p3 = new JLabel("Exclusive Perk: ");
        label4_p3.setBounds(50, 300, 150, 30);
        label4_p3.setFont(new Font("Serif", Font.BOLD, 20));
        label4_p3.setForeground(Color.BLACK);
        p3.add(label4_p3);

        JLabel label4_1_p3 = new JLabel("Taxi Help");
        label4_1_p3.setBounds(220, 300, 150, 30);
        label4_1_p3.setFont(new Font("Serif", Font.PLAIN, 18));
        label4_1_p3.setForeground(Color.WHITE);
        p3.add(label4_1_p3);

        JLabel label4_2_p3 = new JLabel("Hotel Games");
        label4_2_p3.setBounds(220, 340, 150, 30);
        label4_2_p3.setFont(new Font("Serif", Font.PLAIN, 18));
        label4_2_p3.setForeground(Color.WHITE);
        p3.add(label4_2_p3);

        JLabel label4_3_p3 = new JLabel("Barbecue Night");
        label4_3_p3.setBounds(220, 380, 150, 30);
        label4_3_p3.setFont(new Font("Serif", Font.PLAIN, 18));
        label4_3_p3.setForeground(Color.WHITE);
        p3.add(label4_3_p3);

        JLabel label5_p3 = new JLabel("Price: ");
        label5_p3.setBounds(50, 430, 75, 30);
        label5_p3.setFont(new Font("Serif", Font.BOLD, 20));
        label5_p3.setForeground(Color.BLACK);
        p3.add(label5_p3);

        JLabel label5_1_p3 = new JLabel("$10k");
        label5_1_p3.setBounds(150, 430, 200, 30);
        label5_1_p3.setFont(new Font("Serif", Font.PLAIN, 18));
        label5_1_p3.setForeground(Color.WHITE);
        p3.add(label5_1_p3);

        ImageIcon i1_p3 = new ImageIcon(ClassLoader.getSystemResource("icons/package3.jpg"));
        Image i2_p3 = i1_p3.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i3_p3 = new ImageIcon(i2_p3);
        JLabel regular_image = new JLabel(i3_p3);
        regular_image.setBounds(350, 20, 500, 300);
        p3.add(regular_image);



        tab.addTab("Package 1", null, p1);
        tab.addTab("Package 2", null, p2);
        tab.addTab("Package 3", null, p3);

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
