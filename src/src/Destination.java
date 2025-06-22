import javax.swing.*;
import java.awt.*;

/**
 * a class representing the button pressed when the user is looking for a specific destination
 */
public class Destination extends JFrame implements Runnable{

    Thread t1;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10;
    JLabel[] arrLabels = new JLabel[]{l1, l2, l3, l4, l5, l6, l7, l8, l9};
    JLabel caption;

    public Destination(){
        setBounds(500, 200, 800, 600);
        setLayout(null);

        caption = new JLabel();
        caption.setBounds(50, 500, 1000, 70);
        caption.setFont(new Font("Helvetica Neue", Font.PLAIN, 30));
        caption.setForeground(Color.WHITE);
        add(caption);

        ImageIcon i1 = null, i2 = null , i3 = null,
                i4 = null, i5 = null, i6 = null, i7 = null, i8 = null, i9 = null;
        ImageIcon[] images = new ImageIcon[]{i1, i2, i3, i4, i5, i6, i7, i8, i9};

        Image image1 = null, image2 = null , image3 = null,
                image4 = null, image5 = null, image6 = null, image7 = null, image8 = null, image9 = null;
        Image[] actual_images = new Image[]{image1, image2, image3, image4, image5, image6,
                image7, image8, image9};

        ImageIcon j1 = null, j2 = null , j3 = null,
                j4 = null, j5 = null, j6 = null, j7 = null, j8 = null, j9 = null;
        ImageIcon[] jimages = new ImageIcon[]{j1, j2, j3, j4, j5, j6, j7, j8, j9};

        for (int i = 0; i < 9; i++) {
            if (i == 1){
                images[i] = new ImageIcon(ClassLoader.getSystemResource("icons/dest" + (i + 1) +".png"));
                actual_images[i] = images[i].getImage().getScaledInstance(800, 600, Image.SCALE_SMOOTH);
                jimages[i] = new ImageIcon(actual_images[i]);
                arrLabels[i] = new JLabel(jimages[i]);
                arrLabels[i].setBounds(0, 0, 800, 600);
                add(arrLabels[i]);
            } else if (i == 6){
                images[i] = new ImageIcon(ClassLoader.getSystemResource("icons/dest" + (i + 1) +".jpeg"));
                actual_images[i] = images[i].getImage().getScaledInstance(800, 600, Image.SCALE_SMOOTH);
                jimages[i] = new ImageIcon(actual_images[i]);
                arrLabels[i] = new JLabel(jimages[i]);
                arrLabels[i].setBounds(0, 0, 800, 600);
                add(arrLabels[i]);
            } else {
                images[i] = new ImageIcon(ClassLoader.getSystemResource("icons/dest" + (i + 1) + ".jpg"));
                actual_images[i] = images[i].getImage().getScaledInstance(800, 600, Image.SCALE_SMOOTH);
                jimages[i] = new ImageIcon(actual_images[i]);
                arrLabels[i] = new JLabel(jimages[i]);
                arrLabels[i].setBounds(0, 0, 800, 600);
                add(arrLabels[i]);
            }
        }
        t1 = new Thread(this);
        t1.start();

        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void run(){
        try{
            int i = 0;
            while(i < 9){
                arrLabels[i].setVisible(true);
                Thread.sleep(2500);
                arrLabels[i].setVisible(false);
                i++;
                if (i == 9){
                    i = 0;
                }
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args){
        new Destination();
    }
}
