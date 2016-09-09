package cpe200;

import java.lang.*;

/**
 * Created by pruet on 5/9/2559.
 */

public class BinaryCalculator {
    double val1;
    double val2;

    public BinaryCalculator()
    {
        val1 = val2 = 0.0d;
    }

    public void setFirstOperand(Operand operand)
    {
        val1 = Double.parseDouble(operand.operand);
    }


    public void setSecondOperand(Operand operand)
    {
        val2 = Double.parseDouble(operand.operand);
    }

    protected String format(double val) {
        if (Math.abs(1e5 * val - 1e5 * Math.round(val)) < 1) {
            return String.format("%d", (long)val);
        } else {
            return String.format("%s", (double) Math.round(1e5 * val) / 100000);
        }
    }

    public String add()
    {
        double result = val1 + val2;
        return format(result);
    }

    public String subtract()
    {
        double result = val1 - val2;
        return format(result);
    }

    public String multiply()
    {
        double result = val1 * val2;
        return format(result);
    }

    /* This method should throw an exception when divide by zero */
    public String division()
    {
        if (Math.abs(val2) < 1e-5) throw new RuntimeException("Cannot divide by zero");
        double result = val1 / val2;
        return format(result);
    }


}
