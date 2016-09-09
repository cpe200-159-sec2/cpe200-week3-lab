package cpe200;

/**
 * Created by pruet on 5/9/2559.
 */
import java.math.BigDecimal;

public class BinaryCalculator {
    BigDecimal first,second;

    public BinaryCalculator()
    {

    }

    public void setFirstOperand(Operand operand)
    {
        first=new BigDecimal(operand.operand);
    }


    public void setSecondOperand(Operand operand)
    {
        second=new BigDecimal(operand.operand);
    }

    public String add()
    {
        first=first.add(second).stripTrailingZeros();
        return first.toString();
    }

    public String subtract()
    {
        first=first.subtract(second).stripTrailingZeros();
        return first.toString();
    }

    public String multiply()
    {
        first=first.multiply(second).stripTrailingZeros();
        return first.toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division()
    {
        if (second.toString()=="0")
        {
            throw new IllegalArgumentException("Argument divisor is 0");
        }
            first=first.divide(second,5,BigDecimal.ROUND_HALF_UP).stripTrailingZeros();

        return first.toString();
    }


}
