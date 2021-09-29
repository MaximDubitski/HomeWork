package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main (String[] args){
        CalculatorWithMathExtends calc = new CalculatorWithMathExtends();
        double add = calc.add(15, 7);
        double div = calc.div(28.0, 5);
        double pow = calc.pow(div, 2);
        double plus = calc.plus(4.1, add);
        double result = calc.plus(plus, pow);

        System.out.println(result);
    }
}
