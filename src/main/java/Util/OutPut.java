package Util;

public class OutPut {

    public void printInstruction() {
        System.out.println("Введите число:\n"+
                "После ввода нажмите enter");
    }

    public void printResult(String result) {
        System.out.println(result);
    }

    public void printError() {
        System.err.println("Неправильный параметр!");
    }

    public void printContinueInstruction() {
        System.out.println("Если хотите продолжить нажмите y/yes?");
    }
}

