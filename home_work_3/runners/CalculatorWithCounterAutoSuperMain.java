package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main (String[] args){
        CalculatorWithCounterAutoSuper calc = new CalculatorWithCounterAutoSuper();
        double add = calc.add(15, 7);
        double div = calc.div(28.0, 5);
        double pow = calc.pow(div, 2);
        double plus = calc.plus(4.1, add);
        double result = calc.plus(plus, pow);

        System.out.println(result);
        System.out.println("Кол-во использований = " + calc.getCountOperation());
    }
}
