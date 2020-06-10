package Controller;

import Model.Model;
import Service.*;
import Util.Input;
import Util.OutPut;
import Validator.Validator;

import java.util.NoSuchElementException;

public class Controller {

    boolean isWorked = false;
    boolean areSetModelParameters = false;

    Model model = new Model();
    OutPut outPut = new OutPut();
    ModelParameters modelParameters = new ModelParameters();
    Work work = new Work();

    public void run(String[] args) {
        String isContinued = "y";
        while (isContinued.equals("y") || isContinued == "yes") {
            if (!Validator.areArguments(args) || isWorked) {
                outPut.printInstruction();
            }
            try {
                areSetModelParameters = modelParameters.setModelParameters(args, isWorked, model);
            } catch (NumberFormatException e) {
                areSetModelParameters = false;
                outPut.printError();
            } catch (NoSuchElementException e) {
                areSetModelParameters = false;
                outPut.printError();
            }
            if (areSetModelParameters) {
                outPut.printResult(work.numberToWord(model.getNumber()));
            }
            isWorked = true;
            outPut.printContinueInstruction();
            isContinued = Input.inputString().toLowerCase();
        }
    }
}

