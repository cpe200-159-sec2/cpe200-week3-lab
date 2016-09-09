package cpe200;

import java.math.BigDecimal;

/**
 * Created by pruet on 5/9/2559.
 */

public class BinaryCalculator {
    BigDecimal first, second;

    public BinaryCalculator() {

    }

    public void setFirstOperand(Operand operand) {
        first = new BigDecimal(operand.operand);
    }


    public void setSecondOperand(Operand operand) {
        second = new BigDecimal(operand.operand);
    }

    public String add() {
        first = first.add(second).stripTrailingZeros();
        return first.toString();
    }

    public String subtract() {
        first = first.subtract(second).stripTrailingZeros();
        return first.toString();
    }

    public String multiply() {
        first = first.multiply(second).stripTrailingZeros();
        return first.toString();
    }

    public String division() {
        if (second.toString().equals("0")) {
            throw new RuntimeException();
        } else
            first = first.divide(second, 5, BigDecimal.ROUND_HALF_UP).stripTrailingZeros();
        return first.toString();
    }
}