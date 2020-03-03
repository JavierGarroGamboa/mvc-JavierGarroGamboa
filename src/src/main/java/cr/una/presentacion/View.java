package cr.una.presentacion;

import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

public class View extends JFrame implements Observer {

    Model _model;
    Controller _controller;

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
    public void update(Observable observable, Object o) {

    }
}
