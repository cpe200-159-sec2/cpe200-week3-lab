package cpe200;

import java.math.BigDecimal;

/**
 * Created by pruet on 5/9/2559.
 */

public class BinaryCalculator {
    BigDecimal First,Second;


    public BinaryCalculator()
    {
        BigDecimal First;
        BigDecimal Second;
    }

    public void setFirstOperand(Operand operand)
    {
        First = new BigDecimal(operand.operand);

    }


    public void setSecondOperand(Operand operand)
    {
        Second = new BigDecimal(operand.operand);
    }

    public String add()
    {
        return First.add(Second).stripTrailingZeros().toString();
    }

    public String subtract()
    {
        return First.subtract(Second).stripTrailingZeros().toString();
    }

    public String multiply()
    {
        return First.multiply(Second).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division()
    {
        if(Second.equals(0)){
            throw new RuntimeException("Error");
        }
        return First.divide(Second,5,BigDecimal.ROUND_HALF_UP).stripTrailingZeros().toString();
    }


}
