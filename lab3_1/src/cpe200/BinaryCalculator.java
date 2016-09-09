package cpe200;

import java.math.BigDecimal;

/**
 * Created by pruet on 5/9/2559.
 */

public class BinaryCalculator {

    private Operand firstOperand;
    private Operand secondOperand;
    public BinaryCalculator()
    {
        /* your code here */
        firstOperand = new Operand(0);
        secondOperand = new Operand(0);


    }

    public void setFirstOperand(Operand operand)
    {
        /* your code here */
        this.firstOperand = new Operand(operand.operand);

    }


    public void setSecondOperand(Operand operand)
    {
        /* your code here */
        this.secondOperand = new Operand(operand.operand);
    }

    public String add()
    {

        /* your code here */
        double first = Double.parseDouble(firstOperand.operand);
        double second = Double.parseDouble(secondOperand.operand);

        double sum = first + second ;
        String s = Double.toString(sum);

        return s = s.indexOf(".") < 0 ? s : s.replaceAll("0*$", "").replaceAll("\\.$", "");
    }

    public String subtract()
    {
        /* your code here */

        double first = Double.parseDouble(firstOperand.operand);
        double second = Double.parseDouble(secondOperand.operand);

        double sum = first - second ;

        String s = Double.toString(sum);

        s = String.format("%.5f",sum);
        return s = s.indexOf(".") < 0 ? s : s.replaceAll("0*$", "").replaceAll("\\.$", "");

    }

    public String multiply()
    {
        /* your code here */
        double first = Double.parseDouble(firstOperand.operand);
        double second = Double.parseDouble(secondOperand.operand);
        double sum = first * second ;

        String s = Double.toString(sum);

        return s = s.indexOf(".") < 0 ? s : s.replaceAll("0*$", "").replaceAll("\\.$", "");
    }

    /* This method should throw an exception when divide by zero */
    public String division()
    {
        /* your code here */
        double first = Double.parseDouble(firstOperand.operand);
        double second = Double.parseDouble(secondOperand.operand);
        if(second ==0) throw new RuntimeException("ERROR");
        double sum = first / second ;
        String s = Double.toString(sum);
        s = String.format("%.5f",sum);

        return s = s.indexOf(".") < 0 ? s : s.replaceAll("0*$", "").replaceAll("\\.$", "");


    }


}
