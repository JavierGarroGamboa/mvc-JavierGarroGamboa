package cr.una.presentacion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class View extends JFrame implements Observer, ActionListener {

    int x, y;
    Model _model;
    Controller _controller;
    JLabel result;
    JLabel result2;
    JButton o1;
    JButton o2;
    JButton o3;
    JButton o4;
    JButton o5;
    JButton o6;
    JButton o7;
    JButton o8;
    JButton o9;
    JButton o0;
    JButton sum;
    JButton subtraction;
    JButton multiplication;
    JButton division;
    JButton ok;
    JButton clean;
    JPanel panel;

    public View() {
        super("Information");
        this.setSize(300, 300);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLookAndFeel();

        x = 0;
        y = 0;
        result = new JLabel(" Result: ");
        result2 = new JLabel(" Undefined");
        o1 = new JButton("  1  ");
        o2 = new JButton("  2  ");
        o3 = new JButton("  3  ");
        o4 = new JButton("  4  ");
        o5 = new JButton("  5  ");
        o6 = new JButton("  6  ");
        o7 = new JButton("  7  ");
        o8 = new JButton("  8  ");
        o9 = new JButton("  9  ");
        o0 = new JButton("  0  ");
        sum = new JButton("  +  ");
        subtraction = new JButton("  -  ");
        multiplication = new JButton("  *  ");
        division = new JButton("  /  ");
        ok = new JButton("OK");
        clean = new JButton("Clean");

        panel = new JPanel();

        panel.add(result);
        panel.add(result2);
        panel.add(o1);
        panel.add(o2);
        panel.add(o3);
        panel.add(o4);
        panel.add(o5);
        panel.add(o6);
        panel.add(o7);
        panel.add(o8);
        panel.add(o9);
        panel.add(o0);
        panel.add(sum);
        panel.add(multiplication);
        panel.add(subtraction);
        panel.add(division);
        panel.add(ok);
        panel.add(clean);
        add(panel);

        ok.setName("ok");
        clean.setName("clean");

        FlowLayout flow = new FlowLayout();
        setLayout(flow);

        o1.addActionListener(this);
        o2.addActionListener(this);
        o3.addActionListener(this);
        o4.addActionListener(this);
        o5.addActionListener(this);
        o6.addActionListener(this);
        o7.addActionListener(this);
        o8.addActionListener(this);
        o9.addActionListener(this);
        o0.addActionListener(this);
        sum.addActionListener(this);
        subtraction.addActionListener(this);
        multiplication.addActionListener(this);
        division.addActionListener(this);
        ok.addActionListener(this);
        clean.addActionListener(this);

        pack();

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object source = actionEvent.getSource();
        if (x == 0) {
            if (source == o0) {
                x = 0;
            } else if (source == o1) {
                x = 1;
            } else if (source == o2) {
                x = 2;
            } else if (source == o3) {
                x = 3;
            } else if (source == o4) {
                x = 4;
            } else if (source == o5) {
                x = 5;
            } else if (source == o6) {
                x = 6;
            } else if (source == o7) {
                x = 7;
            } else if (source == o8) {
                x = 8;
            } else if (source == o9) {
                x = 9;
            }
        } else if (y == 0) {
            if (source == o0) {
                y = 0;
            } else if (source == o1) {
                y = 1;
            } else if (source == o2) {
                y = 2;
            } else if (source == o3) {
                y = 3;
            } else if (source == o4) {
                y = 4;
            } else if (source == o5) {
                y = 5;
            } else if (source == o6) {
                y = 6;
            } else if (source == o7) {
                y = 7;
            } else if (source == o8) {
                y = 8;
            } else if (source == o9) {
                y = 9;
            }
        } else if (source == sum) {
            _controller.calculateResult(1, x, y);
            String cadena = String.valueOf(_controller.calculateResult(1, x, y));
            result2.setText(cadena);
        } else if (source == subtraction) {
            String cadena = String.valueOf(_controller.calculateResult(2, x, y));
            result2.setText(cadena);
        }else if (source == multiplication) {
            String cadena = String.valueOf(_controller.calculateResult(3, x, y));
            result2.setText(cadena);
        }else if (source == division) {
            String cadena = String.valueOf(_controller.calculateResult(4, x, y));
            result2.setText(cadena);
        }

    }

    @Override
    public void update(Observable observable, Object o) {
        this.repaint();
    }

    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception exc) {
            System.err.println("Couldn't use the system "
                    + "look and feel: " + exc);
        }
    }

    public Model get_model() {
        return _model;
    }

    public void set_model(Model _model) {
        this._model = _model;
        _model.addObserver(this);
    }

    public Controller get_controller() {
        return _controller;
    }

    public void set_controller(Controller _controller) {
        this._controller = _controller;
    }

    public static void main(String[] args) {
        new View();
    }
}
