package cr.una.logica;

public class Bus {
    String name;
    int register;
    int numberPassengers;

    /**
     *
     * @param name
     * @param register
     * @param numberPassengers
     */
    public Bus(String name, int register, int numberPassengers) {
        this.name = name;
        this.register = register;
        this.numberPassengers = numberPassengers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegister() {
        return register;
    }

    public void setRegister(int register) {
        this.register = register;
    }

    public int getNumberPassengers() {
        return numberPassengers;
    }

    public void setNumberPassengers(int numberPassengers) {
        this.numberPassengers = numberPassengers;
    }
}
