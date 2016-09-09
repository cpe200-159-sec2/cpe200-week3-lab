package cpe200;

import com.sun.xml.internal.ws.wsdl.writer.document.OpenAtts;

import java.math.BigDecimal;

/**
 * Created by pruet on 5/9/2559.
 */

public class BinaryCalculator {

    private BigDecimal operand1;
    private BigDecimal operand2;

    public BinaryCalculator()
    {
        operand1 = new BigDecimal(1);
        operand2 = new BigDecimal(1);
    }

    public void setFirstOperand(Operand operand)
    {
        operand1 = new BigDecimal(operand.operand);
    }


    public void setSecondOperand(Operand operand)
    {
        operand2 = new BigDecimal(operand.operand);
    }

    public String add()
    {

        return operand1.add(operand2).stripTrailingZeros().toString();
    }

    public String subtract()
    {

        return operand1.subtract(operand2).stripTrailingZeros().toString();
    }

    public String multiply()
    {
        return operand1.multiply(operand2).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division()
    {
        return operand1.divide(operand2,5,BigDecimal.ROUND_UP).stripTrailingZeros().toString();
    }


}
