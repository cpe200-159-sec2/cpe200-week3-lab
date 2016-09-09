package cpe200;

import java.math.BigDecimal;

/**
 * Created by pruet on 5/9/2559.
 */

public class BinaryCalculator {
    /* your code here */
    private Operand firstOperand;
    private Operand secondOperand;
    private Double first;
    private Double second;


    public BinaryCalculator()
    {
        firstOperand = new Operand('0');
        secondOperand = new Operand('0');
    }

    public void setFirstOperand(Operand operand)
    {
        this.firstOperand = operand;
    }


    public void setSecondOperand(Operand operand)
    {
        secondOperand = operand;
    }

    public String add()
    {
        first = Double.parseDouble(firstOperand.operand);
        second = Double.parseDouble(secondOperand.operand);
        String sum = new Double(first+second).toString();

        return sum.indexOf(".") < 0 ? sum : sum.replaceAll("0*$","").replaceAll("\\.$","");
    }

    public String subtract()
    {
        first = Double.parseDouble(firstOperand.operand);
        second = Double.parseDouble(secondOperand.operand);
        Double sumdb = first-second;
        String sum = new Double(first-second).toString();
        sum = String.format("%.5f",sumdb);

        return sum.indexOf(".") < 0 ? sum : sum.replaceAll("0*$","").replaceAll("\\.$","");
    }

    public String multiply()
    {
        first = Double.parseDouble(firstOperand.operand);
        second = Double.parseDouble(secondOperand.operand);
        String sum = new Double(first*second).toString();

        return sum.indexOf(".") < 0 ? sum : sum.replaceAll("0*$","").replaceAll("\\.$","");

    }

    /* This method should throw an exception when divide by zero */
    public String division()
    {
        first = Double.parseDouble(firstOperand.operand);
        second = Double.parseDouble(secondOperand.operand);
        if(second==0) throw new RuntimeException("ERROR");
        Double sumdb = first/second;

        String sum = new Double(first/second).toString();
        sum = String.format("%.5f",sumdb);
        return sum.indexOf(".") < 0 ? sum : sum.replaceAll("0*$","").replaceAll("\\.$","");

    }


}
