package com.javatraining.unit5hw;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * @author ruslandinov
 *
 */
public class CalculatorEventHandler implements ActionListener
{
    private IDataSource dataSource;

    private String firstArg;
    private String secondArg;
    private String operation;
    private String result;

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() instanceof JButton && dataSource != null)
        {
            handleCommand(e.getActionCommand());
        }
    }

    private void handleCommand(String actionCommand)
    {
        if (actionCommand == "=")
        {
            handleEquals();
        }
        else if ("+-/*".indexOf(actionCommand) > -1)
        {
            handleOperation(actionCommand);
        }
        else if (actionCommand == ".")
        {
            handleDot();
        }
        else if ("0123456789".indexOf(actionCommand) > -1)
        {
            handleDigit(actionCommand);
        }
    }

    private void handleOperation(String operation)
    {
        //checking if can handle operation
        if (firstArg != null && this.operation == null)
        {
            this.operation = operation;
            System.out.println("handleOperation(): operation " + operation + " is accepted");

            dataSource.appendData(" " + operation + " ");
        }
        else
        {
            System.out.println("handleOperation(): IGNORING operation " + operation);
        }
    }

    private void handleEquals()
    {
        if (firstArg != null && operation != null && secondArg != null && this.result == null)
        {
            double result = evaluateExpression();
            this.result = Double.toString(result);

            System.out.println("handleEquals(): evaluating expresion " + dataSource.getData() + " = " + this.result);

            dataSource.appendData(" = " + this.result);
        }
        else
        {
            System.out.println("handleEquals(): IGNORING, NOT ENOUGH DATA!");
        }
    }

    private double evaluateExpression()
    {
        double first = Double.parseDouble(firstArg);
        double second = Double.parseDouble(secondArg);
        double result = 0;

        switch (operation)
        {
        case "+":
            result = first + second;
            break;

        case "-":
            result = first - second;
            break;

        case "*":
            result = first * second;
            break;

        case "/":
            result = first / second;
            break;
        }

        return result;
    }

    private void handleDot()
    {
        if (firstArg != null && operation == null && firstArg.indexOf(".") < 0)
        {
            System.out.println("handleDot(): adding dot to 1st argument");

            dataSource.appendData(".");
            firstArg += ".";
        }
        else if (secondArg != null && result == null && secondArg.indexOf(".") < 0)
        {
            System.out.println("handleDot(): adding dot to 2nd argument");

            dataSource.appendData(".");
            secondArg += ".";
        }
        else
        {
            System.out.println("handleDot(): ignoring dot");
        }
    }

    private void handleDigit(String digit)
    {
        //entering new digit after expression was evaluated
        if (result != null)
        {
            reset();

            dataSource.setData(digit);
            firstArg = digit;

            System.out.println("handleDigit(): digit " + digit + " appended to 1st argument");
        }
        //initializing first argument
        else if (firstArg == null)
        {
            dataSource.appendData(digit);
            firstArg = digit;

            System.out.println("handleDigit(): digit " + digit + " appended to 1st argument");

        }
        //appending digits to first argument
        else if (operation == null)
        {
            dataSource.appendData(digit);
            firstArg += digit;

            System.out.println("handleDigit(): digit " + digit + " appended to 1st argument");

        }
        //initializing second argument
        else if (secondArg == null)
        {
            dataSource.appendData(digit);
            secondArg = digit;

            System.out.println("handleDigit(): digit " + digit + " appended to 2nd argument");

        }
        //appending digits to second argument
        else
        {
            dataSource.appendData(digit);
            secondArg += digit;

            System.out.println("handleDigit(): digit " + digit + " appended to 2nd argument");

        }
    }

    private void reset()
    {
        firstArg = null;
        operation = null;
        secondArg = null;
        result = null;

        dataSource.setData("");
    }

    public void setDataSource(IDataSource dataSource)
    {
        this.dataSource = dataSource;
    }

}
