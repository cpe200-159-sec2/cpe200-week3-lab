package cpe200;

import java.math.BigDecimal;

/**
 * Created by pruet on 5/9/2559.
 */

public class BinaryCalculator {
    private Operand firstoperand;
    private Operand secondoperand;
    private Double first,second,sum;

    public BinaryCalculator()
    {
        firstoperand = new Operand(0);
        secondoperand = new Operand(0);
    }

    public void setFirstOperand(Operand operand)
    {
        first = new Double(operand.operand);
    }

    public void setSecondOperand(Operand operand)
    {
        second = new Double(operand.operand);
    }

    public String add()
    {
        sum = first + second;
        String value = Double.toString(sum).replace(".0","");
        return value;
    }

    public String subtract()
    {
        sum = first - second;
        String value = String.format("%.1f",sum).replace(".0","");
        return value;
    }

    public String multiply()
    {
        sum = first * second;
        String value = Double.toString(sum).replace(".0","");
        return value;
    }

    /* This method should throw an exception when divide by zero */
    public String division()
    {
        BigDecimal x;
        if(second !=0) {
            sum = first / second;
        }else {
            throw new RuntimeException("0");
        }
        x = new BigDecimal(sum).setScale(5,BigDecimal.ROUND_HALF_UP).stripTrailingZeros();
        //String value = String.format("%.5f,sum").replace(".0","").replaceAll("0","");
        return x.toString();
    }
}
