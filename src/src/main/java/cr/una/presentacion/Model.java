package cr.una.presentacion;

import cr.una.logica.Bus;

import java.util.Observable;
import java.util.Observer;

public class Model extends Observable {

    Bus _bus;

    public Model() {
        _bus = new Bus("",0,0);
    }

    public void toAssign(){
        
    }

    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
        setChanged();
        notifyObservers();
    }
}
