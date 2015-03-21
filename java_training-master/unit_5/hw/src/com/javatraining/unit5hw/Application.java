package com.javatraining.unit5hw;

/**
 * @author ruslandinov
 *
 */
public class Application
{
    private static CalculatorGUI gui;
    private static CalculatorEventHandler eventHandler;

    public static void main(String[] args)
    {
        createEventHandler();
        createGUI();
    }

    private static void createEventHandler()
    {
        eventHandler = new CalculatorEventHandler();
    }

    private static void createGUI()
    {
        gui = new CalculatorGUI(eventHandler);
        eventHandler.setDataSource(gui);
    }

}
