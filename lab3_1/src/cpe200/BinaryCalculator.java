package cpe200;

/**
 * Created by pruet on 5/9/2559.
 */

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BinaryCalculator {
    public BigDecimal firstOp;
    public BigDecimal secondOp;

    public BinaryCalculator() {
        firstOp = new BigDecimal(0.0);
        secondOp = new BigDecimal(0.0);
    }

    public void setFirstOperand(Operand operand) {
        firstOp = new BigDecimal(operand.operand);
    }


    public void setSecondOperand(Operand operand) {
        secondOp = new BigDecimal(operand.operand) ;
    }

    public String add() {

        return firstOp.add(secondOp).stripTrailingZeros().toString();
    }

    public String subtract() {
        return firstOp.subtract(secondOp).stripTrailingZeros().toString();
    }

    public String multiply() {
        return firstOp.multiply(secondOp).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() {
        if(firstOp.equals(0))throw new RuntimeException("Stack underflow");
               else return firstOp.divide(secondOp,5, BigDecimal.ROUND_HALF_UP).stripTrailingZeros().toString();
    }


}
