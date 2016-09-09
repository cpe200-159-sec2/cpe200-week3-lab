package cpe200;

import java.math.BigDecimal;

/**
 * Created by pruet on 5/9/2559.
 */

public class BinaryCalculator {
    /* your code here */
    public   BigDecimal First;
    public   BigDecimal Second;


    public BinaryCalculator()
    {
        this.First = new BigDecimal(0);
        this.Second = new BigDecimal(0);
    }

    public void setFirstOperand(Operand operand)
    {
       this.First = new BigDecimal(operand.operand);
    }


    public void setSecondOperand(Operand operand)
    {
        this.Second = new BigDecimal(operand.operand);
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
        /* your code here */

        return First.multiply(Second).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division()
    {if (Second.compareTo(BigDecimal.ZERO)==0){
        throw new RuntimeException("Error");
    }
        return First.divide(Second,5,BigDecimal.ROUND_UP).stripTrailingZeros().toString();
    }


}
