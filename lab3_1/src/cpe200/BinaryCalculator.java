package cpe200;

import java.math.BigDecimal;

/**
 * Created by pruet on 5/9/2559.
 */

public class BinaryCalculator {
    public BigDecimal Supap01;
    public BigDecimal Supap02;

    public BinaryCalculator()
    {
        this.Supap01 = new BigDecimal(0);
        this.Supap02 = new BigDecimal(0);
    }

    public void setFirstOperand(Operand operand)
    {
        this.Supap01 = new BigDecimal(operand.operand);
    }


    public void setSecondOperand(Operand operand)
    {
        this.Supap02 = new BigDecimal(operand.operand);
    }

    public String add()
    {
        return Supap01.add(Supap02).stripTrailingZeros().toString();
    }

    public String subtract()
    {
        return Supap01.subtract(Supap02).stripTrailingZeros().toString();
    }

    public String multiply()
    {
        return Supap1.multiply(Supap02).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division()
    {
        if (Supap02.compareTo(BigDecimal.ZERO)==0){
            throw new RuntimeException("ERROR");
        }
        return Supap01.divide(Supap02,5,BigDecimal.ROUND_UP).stripTrailingZeros().toString();
    }


}
