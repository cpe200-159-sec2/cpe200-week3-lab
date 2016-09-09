package cpe200;

import java.math.BigDecimal;

/**
 * Created by pruet on 5/9/2559.
 */

public class BinaryCalculator {
    public BigDecimal firstOP;
    public BigDecimal secondOP;

    public BinaryCalculator() {
        firstOP = new BigDecimal(0);
        secondOP = new BigDecimal(0);
    }

    public void setFirstOperand(Operand operand) {
        firstOP = new BigDecimal(operand.operand);
    }


    public void setSecondOperand(Operand operand) {
        secondOP = new BigDecimal(operand.operand);
    }

    public String add() {
        return firstOP.add(secondOP).stripTrailingZeros().toString();
    }

    public String subtract() {

        return firstOP.subtract(secondOP).stripTrailingZeros().toString();
    }

    public String multiply() {
        return firstOP.multiply(secondOP).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() {
        if (secondOP.toString().equals(0)) throw new ArithmeticException("Error");
        else return firstOP.divide(secondOP, 5, BigDecimal.ROUND_HALF_UP).stripTrailingZeros().toString();
    }


}
