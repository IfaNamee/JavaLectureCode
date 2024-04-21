package Week_8_Graphic_user_interfaces.Hello_GUI_App;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloGUI extends JFrame {
    private JPanel mainPanel;
    private JButton clickMeButton;
    private JLabel myFirstLabel;

    HelloGUI() {
        setContentPane(mainPanel);
        setPreferredSize(new Dimension(200,200));  // Change size of screen play.
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code here - this will run when button is clicked
                myFirstLabel.setText("Hello GUI programmers!");
            }
        });
    }
}
