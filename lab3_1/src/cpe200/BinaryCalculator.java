package cpe200;

import java.math.BigDecimal;

/**
 * Created by pruet on 5/9/2559.
 */

public class BinaryCalculator {
    private Operand firstOperand;
    private Operand secondOperand;
    double first, second, sum;


    public BinaryCalculator() {
        firstOperand = new Operand(0);
        secondOperand = new Operand(0);
    }

    public void setFirstOperand(Operand operand) {
        first = new Double(operand.operand);
    }


    public void setSecondOperand(Operand operand) {
        second = new Double(operand.operand);
    }

    public String add() {
        sum = first + second;
        String value = Double.toString(sum).replace(".0", "");
        return value;
    }

    public String subtract() {

        sum = first - second;
        String value = String.format("%.1f", sum).replace(".0", "");
        return value;
    }

    public String multiply() {

        sum = first * second;
        String value = Double.toString(sum).replace(".0", "");
        return value;
    }

    /* This method should throw an exception when divide by zero */
    public String division() {
        BigDecimal i;
        if (second != 0) {

            sum = first / second;

        } else {
            throw new RuntimeException("0");
        }
        //String value = String.format("%.5f", sum).replace(".0", "").replaceAll("0", "");
        i=new BigDecimal(sum).setScale(5,BigDecimal.ROUND_HALF_EVEN).stripTrailingZeros();

        return i.toString();
    }


}
