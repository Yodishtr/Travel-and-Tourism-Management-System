import javax.swing.*;
import java.awt.*;

/**
 * Class representing a loading screen after user has logged into the app
 */

public class Loading extends JFrame implements Runnable{

    Thread thread;
    JProgressBar progressBar;

    public Loading(){
        setBounds(500, 200, 650, 400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel text = new JLabel("My Travel App");
        text.setBounds(190, 20, 400, 40);
        text.setForeground(Color.BLUE);
        text.setFont(new Font("Raleway", Font.BOLD, 35));
        add(text);

        progressBar = new JProgressBar();
        progressBar.setBounds(170, 100, 300, 35);
        add(progressBar);

        JLabel progressLabel = new JLabel("Loading, please wait...");
        progressLabel.setBounds(225, 130, 400, 40);
        progressLabel.setForeground(Color.BLUE);
        progressLabel.setFont(new Font("Raleway", Font.BOLD, 15));
        add(progressLabel);

        JLabel user_name = new JLabel("Happy to see you again Sully");
        user_name.setBounds(200, 200, 400, 40);
        user_name.setForeground(Color.black);
        user_name.setFont(new Font("Calibri", Font.BOLD, 15));
        add(user_name);



        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void run(){
        try {
            for (int i = 1; i <= 101; i++){
                int max = progressBar.getMaximum();

            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        new Loading();
    }
}
