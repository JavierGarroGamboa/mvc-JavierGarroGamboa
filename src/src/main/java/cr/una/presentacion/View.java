package cr.una.presentacion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class View extends JFrame implements Observer, ActionListener {

    Model _model;
    Controller _controller;
    JButton ok;
    JButton clean;
    JTextField firsName;
    JLabel name;
    JLabel welcome;
    JPanel panel;

    public View() {
        super("Information");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ok = new JButton("OK");
        clean = new JButton("Clean");
        name = new JLabel("FirsName: ");
        welcome = new JLabel();
        firsName = new JTextField(15);
        panel = new JPanel();

        panel.add(name);
        panel.add(firsName);
        panel.add(ok);
        panel.add(clean);
        add(panel);

        ok.setName("ok");
        clean.setName("clean");
        name.setName("name");
        firsName.setName("firsName");
        panel.setName("panel");
        welcome.setName("welcome");

        FlowLayout flow = new FlowLayout();
        setLayout(flow);

        ok.addActionListener(this);
        clean.addActionListener(this);

        pack();

        setVisible(true);
    }

    @Override
    public void update(Observable observable, Object o) {
        this.repaint();
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


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object source = actionEvent.getSource();
        if (source == ok) {
            panel.remove(ok);
            panel.remove(clean);
            panel.remove(firsName);
            panel.remove(name);
            panel.add(welcome);
            welcome.setText("Bienvenido " + firsName.getText());
        } else if (source == clean) {
            firsName.setText("");
        }
    }

    public static void main(String[] args) {

    }
}
