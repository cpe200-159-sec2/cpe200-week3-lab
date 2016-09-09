package cpe200;

/**
 * Created by pruet on 5/9/2559.
 */

import java.math.BigDecimal;
import java.math.RoundingMode;


public class BinaryCalculator {
    /* your code here */
    private Operand input1;
    private Operand input2;
    public BinaryCalculator()
    {
        /* your code here */
        input1 = new Operand('0');
        input2 = new Operand('0');

    }

    public void setFirstOperand(Operand operand)
    {
        /* your code here */
        this.input1 = operand;

    }


    public void setSecondOperand(Operand operand)
    {
        /* your code here */
        this.input2 = operand;
    }

    public String add()
    {
        /* your code here */
        BigDecimal tmp1 = new BigDecimal(this.input1.operand);
        BigDecimal tmp2 = tmp1.add(new BigDecimal(this.input2.operand)).stripTrailingZeros();
        return tmp2.toString();

        //return null;
    }

    public String subtract()
    {
        /* your code here */
        BigDecimal tmp1 = new BigDecimal(this.input1.operand);
        BigDecimal tmp2 = tmp1.subtract(new BigDecimal(this.input2.operand)).stripTrailingZeros();
        return tmp2.toString();
    }

    public String multiply()
    {
        /* your code here */
        BigDecimal tmp1 = new BigDecimal(this.input1.operand);
        BigDecimal tmp2 = tmp1.multiply(new BigDecimal(this.input2.operand)).stripTrailingZeros();
        return tmp2.toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division()
    {
        /* your code here */
        BigDecimal tmp1 = new BigDecimal(this.input1.operand);
        BigDecimal tmp2 = new BigDecimal(this.input2.operand);
        if(tmp2.compareTo(BigDecimal.ZERO)==0)
            throw new IllegalArgumentException("Argument 'divisor' is 0");
        tmp2 = tmp1.divide(tmp2,5, RoundingMode.HALF_UP).stripTrailingZeros();
        return tmp2.toString();
    }


}
