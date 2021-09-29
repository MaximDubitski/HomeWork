package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {

    private long countOperation = 0;

    public void incrementCountOperation(){
        countOperation++;
    }

    @Override
    public double pow(double a, int b) {
        incrementCountOperation();
        return super.pow(a, b);
    }

    @Override
    public double abs(double a) {
        incrementCountOperation();
        return super.abs(a);
    }

    @Override
    public double sqrt(double a) {
        incrementCountOperation();
        return super.sqrt(a);
    }

    @Override
    public double plus(double a, double b) {
        incrementCountOperation();
        return super.plus(a, b);
    }

    @Override
    public double minus(double a, double b) {
        incrementCountOperation();
        return super.minus(a, b);
    }

    @Override
    public double div(double a, double b) {
        incrementCountOperation();
        return super.div(a, b);
    }

    @Override
    public double add(double a, double b) {
        incrementCountOperation();
        return super.add(a, b);
    }

    public long getCountOperation() {
        return countOperation;
    }
}
