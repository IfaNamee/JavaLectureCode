package Week_8_Graphic_user_interfaces.Movie_GUI;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MovieGUI extends JFrame {
    private JTextField movieTitleTextField;
    private JSlider ratingSlider;
    private JCheckBox woundSeeAgainCheckBox;
    private JPanel mainPanel;
    private JLabel sliderValueLabel;
    private JLabel movieOpinionLabel;
    private JButton quitButton;

    MovieGUI() {
        setContentPane(mainPanel);
        setPreferredSize(new Dimension(400,300));  // size display on screen.
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        configureEventHandlers();
    }

    private void configureEventHandlers() {
        ratingSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {

                String valueLabelText = ratingSlider.getValue() + " stars";
                sliderValueLabel.setText(valueLabelText);

                updateOpinion();
            }
        });

        woundSeeAgainCheckBox.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                updateOpinion();
            }
        });

        // Update movie name following as we write.
        movieTitleTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateOpinion();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateOpinion();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // ignore this one
            }
        });

        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (JOptionPane.showConfirmDialog(MovieGUI.this,
                        "Are you sure you want to quit?","Quit",
                        JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
                    dispose();
                }
            }
        });
    }

    private void updateOpinion() {
        String movieName = movieTitleTextField.getText().strip();

        if (movieName.isEmpty()) {
            movieOpinionLabel.setText("Movie opinion");

        } else {
            int rating = ratingSlider.getValue();
            boolean seeAgain = woundSeeAgainCheckBox.isSelected();

            String template = "You rated %s %d stars. You %s see again";

            //        String seeAgainString = "would";
            //        if (!seeAgain) {
            //            seeAgainString = "would not";
            //        }

            // alternative - ternary operator, setting values based on condition.
            String seeAgainString = (seeAgain) ? "would" : "wound not";

            String opinion = String.format(template, movieName, rating, seeAgainString);

            movieOpinionLabel.setText(opinion);
        }
    }
}
