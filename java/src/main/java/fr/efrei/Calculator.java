package fr.efrei;

public class Calculator {

    public static Integer calculate(String input) {

        String[] res = input.split(" ");

        if(res.length == 1) return Integer.parseInt(res[0]);
        return applyOperand(Integer.parseInt(res[0]), Integer.parseInt(res[1]), res[2]) ;

    }

    private static Integer applyOperand(Integer n1, Integer n2, String operand) {
        switch(operand) {
            case "+":
                return n1 + n2;
            case "-":
                return n1 - n2;
            case "*":
                return n1 * n2;
            default:
                return 0;
        }

    }


}

