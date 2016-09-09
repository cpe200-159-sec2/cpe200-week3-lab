package cpe200;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by pruet on 5/9/2559.
 */

public class BinaryCalculator {
    BigDecimal oper1, oper2;

    public BinaryCalculator()
    {

    }

    public void setFirstOperand(Operand operand)
    {
        oper1 = new BigDecimal(operand.operand);
    }


    public void setSecondOperand(Operand operand)
    {
        oper2 = new BigDecimal(operand.operand);
    }

    public String add()
    {
        return oper1.add(oper2).stripTrailingZeros().toString();
    }

    public String subtract()
    {
        return oper1.subtract(oper2).stripTrailingZeros().toString();
    }

    public String multiply()
    {
        return oper1.multiply(oper2).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division()
    {
        if(oper2.compareTo(BigDecimal.ZERO) == 0){
            throw new RuntimeException("Error!");
        }else return oper1.divide(oper2,5, RoundingMode.HALF_UP).stripTrailingZeros().toString();
    }


}
