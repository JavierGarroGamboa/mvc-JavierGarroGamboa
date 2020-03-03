package cr.una.presentacion;

import java.util.Observable;
import java.util.Observer;

public class Model extends Observable {

    public Model() {
    }

    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
        setChanged();
        notifyObservers();
    }
}
