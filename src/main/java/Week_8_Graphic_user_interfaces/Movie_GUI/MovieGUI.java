package Week_8_Graphic_user_interfaces.Movie_GUI;

import javax.swing.*;

public class MovieGUI extends JFrame {
    private JTextField movieTitleTextField;
    private JSlider ratingSlider;
    private JCheckBox woundSeeAgainCheckBox;
    private JPanel mainPanel;
    private JLabel sliderValueLabel;
    private JLabel movieOpinionLabel;

    MovieGUI() {
        setContentPane(mainPanel);
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        
    }
}
