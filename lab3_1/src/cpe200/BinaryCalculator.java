package cpe200;

import java.math.BigDecimal;

/**
 * Created by pruet on 5/9/2559.
 */

public class BinaryCalculator {

    private BigDecimal x,y,z;

    public BinaryCalculator()
    {
        x = new BigDecimal(0);
        y = new BigDecimal(0);
    }

    public void setFirstOperand(Operand operand)
    {
        this.x = new BigDecimal(operand.operand);
    }


    public void setSecondOperand(Operand operand)
    {
        this.y = new BigDecimal(operand.operand);
    }

    public String add()
    {
        z = x.add(y);
        z = z.stripTrailingZeros();
        return z.toString();
    }

    public String subtract()
    {
        z = x.subtract(y);
        z = z.stripTrailingZeros();
        return z.toString();
    }

    public String multiply()
    {
        z = x.multiply(y);
        z = z.stripTrailingZeros();
        return z.toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division()
    {
        if(y.equals("0")) return "Error";
        z = x.divide(y,5,BigDecimal.ROUND_HALF_UP);
        z = z.stripTrailingZeros();
        return z.toString();
    }

}
