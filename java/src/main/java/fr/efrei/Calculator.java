package fr.efrei;

import java.util.ArrayList;
import java.util.Arrays;

public class Calculator {

    public static Integer calculate(String input) {

        ArrayList<String> res = new ArrayList<>(Arrays.asList(input.split(" ")));

        if(res.size() == 1) return Integer.parseInt(res.get(0));
        if(res.size() == 3) return applyOperand(Integer.parseInt(res.get(0)), Integer.parseInt(res.get(1)), res.get(2));
        while(res.size() > 1) {
            Integer memory = applyOperand(Integer.parseInt(res.get(0)), Integer.parseInt(res.get(1)), res.get(2));
            res.remove(0);
            res.remove(0);
            res.set(0, memory.toString());
        }
        return Integer.parseInt(res.get(0));
    }

    private static Integer applyOperand(Integer n1, Integer n2, String operand) {
        switch(operand) {
            case "+":
                return n1 + n2;
            case "-":
                return n1 - n2;
            case "*":
                return n1 * n2;
            case "/":
                return n1 / n2;
            default:
                return 0;
        }

    }


}

