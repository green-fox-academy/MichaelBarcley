package week05.demo;

import java.awt.*;
import java.awt.event.*;

public class CalculatorGUI extends Frame implements ActionListener {
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

        this.inputInteger = new TextField(20);
        this.add(inputInteger);
        this.inputInteger.addActionListener(this);

        this.textBeforeOutputSumBox = new Label("The sum from 0 to the given number: ");
        this.add(textBeforeOutputSumBox);

        this.outputResultSum = new TextField(20);
        this.outputResultSum.setEditable(false);
        this.add(outputResultSum);

        this.textBeforeOutputFactorialBox = new Label("The factorial from 0 to the given number: ");
        this.add(textBeforeOutputFactorialBox);

        this.outputResultFactorial = new TextField(20);
        this.outputResultFactorial.setEditable(false);
        this.add(outputResultFactorial);

        this.calculate = new Button("Calculate");
        this.add(calculate);

        this.setTitle("Hello TipTop");
        this.setSize(245, 245);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    public int factorialCalculator(int inputNumber) {
        if (inputNumber == 1) {
            return 1;
        } else {
            return inputNumber * factorialCalculator(inputNumber - 1);
        }
    }
    

    public static void main(String[] args) {
        CalculatorGUI mySimpleCalculator = new CalculatorGUI();
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
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
}