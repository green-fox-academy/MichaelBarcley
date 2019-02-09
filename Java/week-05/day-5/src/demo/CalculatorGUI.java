package demo;

import java.awt.*;
import java.awt.event.*;

public class CalculatorGUI extends Frame implements ActionListener, WindowListener {
    Label textBeforeInputBox;
    Label textBeforeOutputSumBox;
    Label textBeforeOutputFactorialBox;
    TextField inputInteger;
    TextField outputResultSum;
    TextField outputResultFactorial;
    Button calculate;
    int sum;
    int factorialSum;

    public CalculatorGUI() {
        this.setLayout(new FlowLayout());

        this.textBeforeInputBox = new Label("Please enter a number: ");
        this.add(textBeforeInputBox);

        this.inputInteger = new TextField(25);
        this.add(inputInteger);
        this.inputInteger.addActionListener(this);

        this.textBeforeOutputSumBox = new Label("The sum from 0 to the given number: ");
        this.add(textBeforeOutputSumBox);

        this.outputResultSum = new TextField(25);
        this.outputResultSum.setEditable(false);
        this.add(outputResultSum);

        this.textBeforeOutputFactorialBox = new Label("The factorial from 0 to the given number: ");
        this.add(textBeforeOutputFactorialBox);

        this.outputResultFactorial = new TextField(25);
        this.outputResultFactorial.setEditable(false);
        this.add(outputResultFactorial);

        this.calculate = new Button("Calculate sum and factorial");
        this.add(calculate);
        this.calculate.addActionListener(this);

        this.setTitle("Hello TipTop");
        this.setSize(300, 250);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        addWindowListener(this);
    }

    public int factorialCalculator(int inputNumber) {
        if (inputNumber == 1) {
            return 1;
        } else {
            return inputNumber * factorialCalculator(inputNumber - 1);
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        dispose();
        System.exit(0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int numberIn = Integer.parseInt(inputInteger.getText());

        sum = 0;
        for (int i = 0; i <= numberIn; i++) {
            sum += i;
        }

        factorialSum = 0;
        factorialSum = factorialCalculator(numberIn);

        inputInteger.setText("");
        outputResultSum.setText(sum + "");
        outputResultFactorial.setText(factorialSum + "");
    }

    public static void main(String[] args) {
        CalculatorGUI mySimpleCalculator = new CalculatorGUI();
    }
}