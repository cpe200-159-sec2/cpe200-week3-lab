package cpe200;

import java.math.BigDecimal;

/**
 * Created by pruet on 5/9/2559.
 */

public class BinaryCalculator {
    private BigDecimal FirstOperand;
    private BigDecimal SecondOperand;

    public BinaryCalculator()
    {
        FirstOperand = new BigDecimal(0);
        SecondOperand = new BigDecimal(0);
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
        if(SecondOperand.compareTo(BigDecimal.ZERO)==0){
            throw new ArithmeticException("Argument 'divisor' is 0");
        }else{
            return FirstOperand.divide(SecondOperand,5,BigDecimal.ROUND_HALF_UP).stripTrailingZeros().toString();
        }
    }


}
