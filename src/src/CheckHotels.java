import javax.swing.*;
import java.awt.*;

/**
 * A class representing the hotels that are available for the client to then book
 * Displays the hotels as a slideshow.
 */
public class CheckHotels extends JFrame {

    public CheckHotels(){
        setBounds(500, 200, 800, 600);
        setLayout(null);

        ImageIcon i1, i2, i3, i4, i5, i6, i7, i8, i9, i10;
        ImageIcon[] images = new ImageIcon[10];
        for (int i = 0; i < 10; i++) {
            images[i] = new ImageIcon(ClassLoader.getSystemResource("icons/hotel" + (i + 1) +".jpg"));
            Image image2 = images[i].getImage().getScaledInstance(800, 600, Image.SCALE_SMOOTH);
            ImageIcon Icon3 = new ImageIcon(image2);
            JLabel image1 = new JLabel(Icon3);
            image1.setBounds(0, 0, 800, 600);
            add(image1);
        }


        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public static void main(String[] args){
        new CheckHotels();
    }
}
