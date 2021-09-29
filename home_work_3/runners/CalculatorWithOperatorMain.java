package home_work_3.runners;

//  4.1 + 15 * 7 + (28 / 5) ^ 2

import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main (String[] args) {
        CalculatorWithOperator calc = new CalculatorWithOperator();
        double add = calc.add(15, 7);
        double div = calc.div(28.0, 5);
        double pow = calc.pow(div, 2);
        double plus = calc.plus(4.1, add);
        double result = calc.plus(plus, pow);

        System.out.println(result);
    }
}
