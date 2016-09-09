package cpe200;

import java.util.DoubleSummaryStatistics;

/**
 * Created by pruet on 5/9/2559.
 */

public class BinaryCalculator {
    /* your code here */
    private Operand firstOperand;
    private Operand secondOperand;

    public BinaryCalculator()
    {
        /* your code here */
    }

    public void setFirstOperand(Operand operand)
    {
        /* your code here */
       firstOperand = operand;
    }


    public void setSecondOperand(Operand operand)
    {
        /* your code here */
        secondOperand = operand;

    }

    public String add()
    {
        /* your code here */
        if(firstOperand.equals(".")||secondOperand.equals(".")){
            return Double.toString(Double.valueOf(firstOperand.operand)+Double.valueOf(secondOperand.operand));
        }else{
            return Integer.toString(Integer.valueOf(firstOperand.operand)+Integer.valueOf(secondOperand.operand));
        }

    }

    public String subtract()
    {
        /* your code here */
        if(firstOperand.equals(".")||secondOperand.equals(".")){
            return Double.toString(Double.valueOf(firstOperand.operand)-Double.valueOf(secondOperand.operand));
        }else{
            return Integer.toString(Integer.valueOf(firstOperand.operand)-Integer.valueOf(secondOperand.operand));
        }

    }

    public String multiply()
    {
        /* your code here */
        if(firstOperand.equals(".")||secondOperand.equals(".")){
            //double sum = Double.toString(Double.valueOf(firstOperand.operand))
            return Double.toString(Double.valueOf(firstOperand.operand)*Double.valueOf(secondOperand.operand));
        }else{
            return Integer.toString(Integer.valueOf(firstOperand.operand)*Integer.valueOf(secondOperand.operand));
        }

    }

    /* This method should throw an exception when divide by zero */
    public String division() {
        /* your code here */
        if(firstOperand.equals(".")||secondOperand.equals(".")){
            return Double.toString(Double.valueOf(firstOperand.operand)/Double.valueOf(secondOperand.operand));
        }else{
            return Integer.toString(Integer.valueOf(firstOperand.operand)/Integer.valueOf(secondOperand.operand));
        }
    }


}
