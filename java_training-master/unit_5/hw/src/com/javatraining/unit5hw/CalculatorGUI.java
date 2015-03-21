package com.javatraining.unit5hw;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author ruslandinov
 *
 */
public class CalculatorGUI implements IDataSource
{
    private JFrame frame;
    private JPanel windowContent;
    private GridBagLayout layoutManager;

    private JTextField displayField;

    public CalculatorGUI(ActionListener actionListener)
    {
        //creating window
        frame = new JFrame("Calculator via GridBagLayout");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        //creating container for gui elements
        windowContent = new JPanel();

        //creating layout manager for gui elements container
        layoutManager = new GridBagLayout();

        //creating display field
        createDisplayField();
        //creating buttons
        createButtons(actionListener);

        //assigning layout manager to gui elements container
        windowContent.setLayout(layoutManager);

        //showing window
        frame.setContentPane(windowContent);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    private void createDisplayField()
    {
        GridBagConstraints displayFieldConstraints = new GridBagConstraints();
        displayFieldConstraints.gridx = 0;
        displayFieldConstraints.gridy = 0;
        displayFieldConstraints.gridheight = 1;
        displayFieldConstraints.gridwidth = 4;
        displayFieldConstraints.fill = GridBagConstraints.BOTH;
        displayFieldConstraints.weightx = 1.0;
        displayFieldConstraints.weighty = 1.0;
        displayFieldConstraints.anchor = GridBagConstraints.CENTER;

        displayField = new JTextField();
        layoutManager.setConstraints(displayField, displayFieldConstraints);
        windowContent.add(displayField);
    }

    private void createButtons(ActionListener actionListener)
    {
        //first row
        createButton(actionListener, "1", 0, 1);
        createButton(actionListener, "2", 1, 1);
        createButton(actionListener, "3", 2, 1);
        createButton(actionListener, "+", 3, 1, 0.25, 1.0, 15);

        //second row
        createButton(actionListener, "4", 0, 2);
        createButton(actionListener, "5", 1, 2);
        createButton(actionListener, "6", 2, 2);
        createButton(actionListener, "-", 3, 2, 0.25, 1.0, 15);

        //third row
        createButton(actionListener, "7", 0, 3);
        createButton(actionListener, "8", 1, 3);
        createButton(actionListener, "9", 2, 3);
        createButton(actionListener, "*", 3, 3, 0.25, 1.0, 15);

        //fourth row
        createButton(actionListener, "0", 0, 4);
        createButton(actionListener, ".", 1, 4);
        createButton(actionListener, "=", 2, 4);
        createButton(actionListener, "/", 3, 4, 0.25, 1.0, 15);
    }

    private JButton createButton(ActionListener actionListener, String label, int gridx, int gridy)
    {
        return createButton(actionListener, label, gridx, gridy, 1.0, 1.0, 0);
    }

    private JButton createButton(ActionListener actionListener, String label, int gridx, int gridy, double weightx, double weighty, int leftMargin)
    {
        GridBagConstraints buttonConstraints = new GridBagConstraints();
        buttonConstraints.gridx = gridx;
        buttonConstraints.gridy = gridy;
        buttonConstraints.weightx = weightx;
        buttonConstraints.weighty = weighty;
        buttonConstraints.insets = new Insets(5, leftMargin, 5, 5);
        buttonConstraints.fill = GridBagConstraints.BOTH;
        buttonConstraints.anchor = GridBagConstraints.CENTER;

        JButton button = new JButton(label);
        button.addActionListener(actionListener);

        layoutManager.setConstraints(button, buttonConstraints);
        windowContent.add(button);

        return button;
    }

    @Override
    public String getData()
    {
        return displayField.getText();
    }

    @Override
    public void setData(String data)
    {
        displayField.setText(data);
    }

    @Override
    public void appendData(String data)
    {
        displayField.setText(getData() + data);
    }

}
