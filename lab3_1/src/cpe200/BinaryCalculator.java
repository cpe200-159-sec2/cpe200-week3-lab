package cpe200;
import java.math.BigDecimal;

/**
 * Created by pruet on 5/9/2559.
 */

public class BinaryCalculator {
    BigDecimal firstoperand;
    BigDecimal secondoperand;

    public BinaryCalculator()
    {

    }

    public void setFirstOperand(Operand operand)
    {
        firstoperand = new BigDecimal(operand.operand);
    }


    public void setSecondOperand(Operand operand)
    {
        secondoperand = new BigDecimal(operand.operand);
    }

    public String add()
    {
        firstoperand = firstoperand.add(secondoperand).stripTrailingZeros();
        return firstoperand.toString();
    }

    public String subtract()
    {
        firstoperand = firstoperand.subtract(secondoperand).stripTrailingZeros();
        return firstoperand.toString();
    }

    public String multiply()
    {
        firstoperand = firstoperand.multiply(secondoperand).stripTrailingZeros();
        return firstoperand.toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division()
    {
        if(secondoperand.equals(0)) {
            throw new RuntimeException("DividedByZero");
        }
        else {
            firstoperand = firstoperand.divide(secondoperand, 5, BigDecimal.ROUND_HALF_UP).stripTrailingZeros();
            return firstoperand.toString();
        }
    }


}
