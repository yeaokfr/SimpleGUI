import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    private JLabel value = new JLabel();
    private JLabel literallyMe;
    private int bruh = 0;
    private int changes;
    public GUI() {
        // Create frame
        JFrame frame = new JFrame("Simple GUI");
        frame.setSize(600,400);
        // Closes program when x is clicked
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Create panel
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));
        panel.setLayout(new GridLayout(2,2,15,15));
        frame.add(panel);

        // Create buttons
        JButton b1 = new JButton("Add 1");
        JButton b2 = new JButton("Subtract 1");

        literallyMe = new JLabel();
        literallyMe.setHorizontalAlignment(JLabel.CENTER);
        literallyMe.setText("Value: " + bruh);

        panel.add(literallyMe);


        value.setHorizontalAlignment(JLabel.CENTER);
        value.setText("Number of Changes: " + changes);

        panel.add(value);

        panel.add(b1);
        panel.add(b2);



        // Adding actions to buttons
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code that is run after button1 is pressed
                b1Press();
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code that is run after button2 is pressed
                b2Press();
            }
        });


        // Makes frame show up
        // should be last so everything shows up
        frame.setVisible(true);
        panel.setVisible(true);
        literallyMe.setVisible(true);
        value.setVisible(true);

    }

    public static void main(String[] args) {
        new GUI();
    }

    // button methods
    public void b1Press() {
        bruh += 1;
        changes += 1;
        literallyMe.setText("Value: " + bruh);
        value.setText("Number of Changes: " + changes);
    }

    public void b2Press() {
        bruh -= 1;
        changes += 1;
        literallyMe.setText("Value: " + bruh);
        value.setText("Number of Changes: " + changes);
    }
}