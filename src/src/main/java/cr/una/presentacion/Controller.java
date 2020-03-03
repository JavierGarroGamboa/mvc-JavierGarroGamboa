package cr.una.presentacion;

public class Controller {
    Model _model;
    View _view;

    /**
     *
     * @param _model
     * @param _view
     */
    public Controller(Model _model, View _view) {
        this._model = _model;
        this._view = _view;
        _view.set_model(_model);
        _view.set_controller(this);
    }

    /**
     *
     * @param data
     * @param x
     * @param y
     */
    public double calculateResult(int data, double x, double y) {
        return  _model.toAssign(data, x, y);
    }


}
