package Week_8_Graphic_user_interfaces.Currency_converter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class CurrencyConverter extends JFrame {
    private JTextField dollarsTextField;
    private JButton convertButton;
    private JLabel convertionResultLabel;
    private JPanel mainPanel;
    private JComboBox<String> currencyComboBox;

    private final String Euros = "Euros";

    private final String Pounds = "Pounds";

    private Map<String, Double> exchangeRates = Map.of(Euros, 0.84, Pounds, 0.75);

    CurrencyConverter() {
        setContentPane(mainPanel);
        setPreferredSize(new Dimension(500,300));
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        getRootPane().setDefaultButton(convertButton);

        currencyComboBox.addItem(Euros);
        currencyComboBox.addItem(Pounds);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // What was typed in the JTextField dollarsTextField?
                String dollarString = dollarsTextField.getText();

                try {
                    // Convert to a numbers
                    double dollars = Double.parseDouble(dollarString);
                    String toCurrency = (String) currencyComboBox.getSelectedItem();

                    double exchangeRate = exchangeRates.get(toCurrency);

                    // Convert to a target currency.
                    double convertedValue = dollars * exchangeRate;

                    // display result in euroResultLabel JLabel
                    String resultString = String.format("%.2f dollars is equivalent to %.2f euros", dollars,
                            convertedValue, toCurrency);

                    convertionResultLabel.setText(resultString);

                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(CurrencyConverter.this,
                            "Please enter a number without any $ or other characters.");
                }
            }
        });
    }
}
