package Service;

import Model.Model;
import Util.Input;
import Validator.Validator;

import java.util.InputMismatchException;

public class ModelParameters {

    private boolean setWithNoParametrs(Model model) throws InputMismatchException {
        model.setNumber((int)Input.inputDouble());
        return true;
    }

    private boolean setWithParametrs(Model model, String[] args) throws NumberFormatException {
        model.setNumber(Integer.parseInt(args[0]));
        return true;
    }
    public boolean setModelParameters(String[] args,boolean isWorked,Model model) throws InputMismatchException, NumberFormatException {
        if (Validator.areArguments(args)) {
            if (isWorked == false) {
                return setWithParametrs(model,args);
            } else {
                return setWithNoParametrs(model);
            }
        } else {
            return setWithNoParametrs(model);
        }
    }
}
