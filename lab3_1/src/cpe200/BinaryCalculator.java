package cpe200;

import java.math.BigDecimal;

/**
 * Created by pruet on 5/9/2559.
 */

public class BinaryCalculator {
    BigDecimal firstOperand;
    BigDecimal secondOperand;


    public BinaryCalculator()
    {

    }

    public void setFirstOperand(Operand operand)
    {
        firstOperand = new BigDecimal(operand.operand);

    }


    public void setSecondOperand(Operand operand)
    {
        secondOperand = new BigDecimal(operand.operand);

    }

    public String add()
    {
        return firstOperand.add(secondOperand).stripTrailingZeros().toString();
    }

    public String subtract()
    {
        return firstOperand.subtract(secondOperand).stripTrailingZeros().toString();
    }

    public String multiply()
    {
        return firstOperand.multiply(secondOperand).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division()
    {
        firstOperand = firstOperand.divide(secondOperand,5,BigDecimal.ROUND_UP).stripTrailingZeros();

        return firstOperand.toString();
    }


}
