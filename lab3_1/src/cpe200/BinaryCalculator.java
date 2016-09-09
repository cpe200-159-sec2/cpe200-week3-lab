package cpe200;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by pruet on 5/9/2559.
 */

public class BinaryCalculator {
    /* your code here */
    BigDecimal firstOperand;
    BigDecimal secondOperand;


    public BinaryCalculator() {
        /* your code here */
        firstOperand = new BigDecimal(0);
        secondOperand = new BigDecimal(0);

    }

    public void setFirstOperand(Operand operand) {
        /* your code here */
        firstOperand = new BigDecimal(operand.operand);
    }


    public void setSecondOperand(Operand operand) {
        /* your code here */
        secondOperand = new BigDecimal(operand.operand);
    }

    public String add() {
        /* your code here */
        return firstOperand.add(secondOperand).stripTrailingZeros().toString();
    }

    public String subtract() {
        /* your code here */
        return firstOperand.subtract(secondOperand).stripTrailingZeros().toString();
    }

    public String multiply() {
        /* your code here */
        return firstOperand.multiply(secondOperand).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() {
        /* your code here */
        if (secondOperand.toString() == "0") {
            throw new IllegalArgumentException("Argument divisor is 0");
        }
        return firstOperand.divide(secondOperand, 5, RoundingMode.HALF_UP).stripTrailingZeros().toString();

    }
}


