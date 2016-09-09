package cpe200;

import java.math.BigDecimal;

/**
 * Created by pruet on 5/9/2559.
 */

public class BinaryCalculator {
    /* your code here */
    private BigDecimal Firstoper;
    private BigDecimal Secondoper;

    public BinaryCalculator()
    {
        /* your code here */
        Firstoper = new BigDecimal(0);
        Secondoper = new BigDecimal(0);
    }

    public void setFirstOperand(Operand operand)
    {
        /* your code here */
        Firstoper = new BigDecimal(operand.operand);
    }


    public void setSecondOperand(Operand operand)
    {
        /* your code here */
        Secondoper = new BigDecimal(operand.operand);
    }

    public String add()
    {
        /* your code here */
        return Firstoper.add(Secondoper).stripTrailingZeros().toString();
    }

    public String subtract()
    {
        /* your code here */
        return Firstoper.subtract(Secondoper).stripTrailingZeros().toString();
    }

    public String multiply()
    {
        /* your code here */
        return Firstoper.multiply(Secondoper).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division()
    {
        /* your code here */
        if(Secondoper.equals(0)){
            throw new ArithmeticException("Error");
        }
        return Firstoper.divide(Secondoper,5,BigDecimal.ROUND_HALF_UP).stripTrailingZeros().toString();
    }


}
