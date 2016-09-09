package cpe200;

import java.math.BigDecimal;

/**
 * Created by pruet on 5/9/2559.
 */

public class BinaryCalculator {
    BigDecimal first,secound;

    public BinaryCalculator()
    {

    }

    public void setFirstOperand(Operand operand)
    {
        first = new BigDecimal(operand.operand);
    }


    public void setSecondOperand(Operand operand)
    {
        secound = new BigDecimal(operand.operand);
    }

    public String add()
    {
        first = first.add(secound).stripTrailingZeros();
        return first.toString();
    }

    public String subtract()
    {
        first = first.subtract(secound).stripTrailingZeros();
        return first.toString();
    }

    public String multiply()
    {
        first = first.multiply(secound).stripTrailingZeros();
        return first.toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division()
    {
        if(secound.toString() == "0"){

            throw new RuntimeException();
        }
        first = first.divide(secound,5,BigDecimal.ROUND_HALF_UP).stripTrailingZeros();
        return first.toString();
    }


}
