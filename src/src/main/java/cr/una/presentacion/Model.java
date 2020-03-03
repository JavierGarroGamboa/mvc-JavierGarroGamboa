package cr.una.presentacion;

import cr.una.logica.MathOperation;

import java.util.Observable;
import java.util.Observer;

public class Model extends Observable {

    MathOperation _math;

    public Model() {
        _math = new MathOperation();
    }

    public double toAssign(int data, double x, double y) {
        switch (data) {
            case 1:
                return _math.sum(x, y);
            case 2:
                return _math.subtraction(x, y);
            case 3:
                return _math.multiplication(x, y);
            case 4:
                return _math.division(x, y);
            default:
                return 0;
        }
    }

    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
        setChanged();
        notifyObservers();
    }
}
