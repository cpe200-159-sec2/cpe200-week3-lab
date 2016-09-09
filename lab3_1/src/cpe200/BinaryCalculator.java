package cpe200;
import java.math.BigDecimal;
/**
 * Created by pruet on 5/9/2559.
 */

public class BinaryCalculator {
    protected BigDecimal first;
    protected BigDecimal second;

    public BinaryCalculator()
    {
        first = new BigDecimal(0);
        second = new BigDecimal(0);
    }

    public void setFirstOperand(Operand operand)
    {
        first = new BigDecimal(operand.operand);
    }


    public void setSecondOperand(Operand operand)
    {
        second = new BigDecimal(operand.operand);
    }

    public String add()
    {
        return first.add(second).stripTrailingZeros().toString();
    }

    public String subtract()
    {
        return first.subtract(second).stripTrailingZeros().toString();
    }

    public String multiply()
    {
        return first.multiply(second).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division()
    {
        if(Double.parseDouble(second.toString())==0) throw new ArithmeticException("incorrect");
        else return first.divide(second,5,BigDecimal.ROUND_HALF_UP).stripTrailingZeros().toString();
    }


}
