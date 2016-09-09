package cpe200;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by pruet on 5/9/2559.
 */

public class BinaryCalculator {
    private BigDecimal FirstOperand,SecondOperand;


    public BinaryCalculator()
    {
    }

    public void setFirstOperand(Operand operand)
    {
        FirstOperand = new BigDecimal(operand.operand);
    }


    public void setSecondOperand(Operand operand)
    {
        SecondOperand = new BigDecimal(operand.operand);
    }

    public String add()
    {
        return FirstOperand.add(SecondOperand).stripTrailingZeros().toString();
    }

    public String subtract()
    {
        return FirstOperand.subtract(SecondOperand).stripTrailingZeros().toString();
    }

    public String multiply()
    {
        return FirstOperand.multiply(SecondOperand).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division()
    {
        return FirstOperand.divide(SecondOperand,5, RoundingMode.HALF_UP).stripTrailingZeros().toString();
    }


}
