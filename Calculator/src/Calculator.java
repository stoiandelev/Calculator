
//awt -> Java AWT (Abstract Window Toolkit) is an API
// to develop GUI or window-based applications in java.
// Java AWT components are platform-dependent i.e. components are
// displayed according to the view of operating system

import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {

    int c, n;
    String s1, s2, s3, s4, s5;
    Frame frame;
    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9,
            buttonAdd, buttonSubtract, buttonMultiple, buttonDivide, buttonEquals, buttonClear;

    Panel panel;
    TextField textField;
    GridLayout gridLayout;

    Calculator() {
        //title of Frame
        frame = new Frame("Calculator");
        frame.setLayout(new FlowLayout());
        panel = new Panel();

        button0 = new Button("0");
        button0.addActionListener(this);

        button1 = new Button("1");
        button1.addActionListener(this);

        button2 = new Button("2");
        button2.addActionListener(this);

        button3 = new Button("3");
        button3.addActionListener(this);

        button4 = new Button("4");
        button4.addActionListener(this);

        button5 = new Button("5");
        button5.addActionListener(this);

        button6 = new Button("6");
        button6.addActionListener(this);

        button7 = new Button("7");
        button7.addActionListener(this);

        button8 = new Button("8");
        button8.addActionListener(this);

        button9 = new Button("9");
        button9.addActionListener(this);

        buttonAdd = new Button("+");
        buttonAdd.addActionListener(this);

        buttonSubtract = new Button("-");
        buttonSubtract.addActionListener(this);

        buttonMultiple = new Button("*");
        buttonMultiple.addActionListener(this);

        buttonDivide = new Button("/");
        buttonDivide.addActionListener(this);

        buttonEquals = new Button("=");
        buttonEquals.addActionListener(this);

        buttonClear = new Button("Clear");
        buttonClear.addActionListener(this);

        textField = new TextField(20);

        //add text field in Frame
        frame.add(textField);

        gridLayout = new GridLayout(4, 4);
        panel.setLayout(gridLayout);

        panel.add(button0);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(buttonAdd);
        panel.add(buttonSubtract);
        panel.add(buttonMultiple);
        panel.add(buttonDivide);
        panel.add(buttonEquals);
        panel.add(buttonClear);

        frame.add(panel);
        frame.setSize(400, 200);
        frame.setVisible(true);
        frame.setBackground(Color.GREEN);


        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button0) {
            s3 = textField.getText();
            s4 = "0";
            s5 = s3 + s4;
            textField.setText(s5);
        }

        if (e.getSource() == button1) {
            s3 = textField.getText();
            s4 = "1";
            s5 = s3 + s4;
            textField.setText(s5);
        }

        if (e.getSource() == button2) {
            s3 = textField.getText();
            s4 = "2";
            s5 = s3 + s4;
            textField.setText(s5);
        }

        if (e.getSource() == button3) {
            s3 = textField.getText();
            s4 = "3";
            s5 = s3 + s4;
            textField.setText(s5);
        }

        if (e.getSource() == button4) {
            s3 = textField.getText();
            s4 = "4";
            s5 = s3 + s4;
            textField.setText(s5);
        }

        if (e.getSource() == button5) {
            s3 = textField.getText();
            s4 = "5";
            s5 = s3 + s4;
            textField.setText(s5);
        }

        if (e.getSource() == button6) {
            s3 = textField.getText();
            s4 = "6";
            s5 = s3 + s4;
            textField.setText(s5);
        }

        if (e.getSource() == button7) {
            s3 = textField.getText();
            s4 = "7";
            s5 = s3 + s4;
            textField.setText(s5);
        }

        if (e.getSource() == button8) {
            s3 = textField.getText();
            s4 = "8";
            s5 = s3 + s4;
            textField.setText(s5);
        }

        if (e.getSource() == button9) {
            s3 = textField.getText();
            s4 = "9";
            s5 = s3 + s4;
            textField.setText(s5);
        }

        if (e.getSource() == buttonAdd) {
            s1 = textField.getText();
            textField.setText("");
            c = 1;
        }

        if (e.getSource() == buttonSubtract) {
            s1 = textField.getText();
            textField.setText("");
            c = 2;
        }

        if (e.getSource() == buttonMultiple) {
            s1 = textField.getText();
            textField.setText("");
            c = 3;
        }

        if (e.getSource() == buttonDivide) {
            s1 = textField.getText();
            textField.setText("");
            c = 4;
        }

        if (e.getSource() == buttonEquals) {
            s2 = textField.getText();

            if (c == 1) {
                n = Integer.parseInt(s1) + Integer.parseInt(s2);
                textField.setText(String.valueOf(n));
            }

            if (c == 2) {
                n = Integer.parseInt(s1) - Integer.parseInt(s2);
                textField.setText(String.valueOf(n));
            }

            if (c == 3) {
                n = Integer.parseInt(s1) * Integer.parseInt(s2);
                textField.setText(String.valueOf(n));
            }

            if (c == 4) {
                double n = Double.parseDouble(s1) / Double.parseDouble(s2);
                textField.setText(String.format("%.2f", n));
            }
        }

        if (e.getSource() == buttonClear) {
            textField.setText("");

        }


    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    }
}
