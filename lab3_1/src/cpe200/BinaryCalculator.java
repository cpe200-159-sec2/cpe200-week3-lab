package cpe200;
import java.math.BigDecimal;

/**
 * Created by pruet on 5/9/2559.
 */

public class BinaryCalculator {
    Operand firstOperand;
    Operand secondOperand;
    double sum=0,first=0,second=0;


    public BinaryCalculator()
    {
        firstOperand = new Operand(0);
        secondOperand= new Operand(0);
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

        sum = (first+second);

        String sums =  Double.toString(sum);
        return sums = sums.indexOf(".") < 0 ? sums : sums.replaceAll("0*$", "").replaceAll("\\.$", "");

    }

    public String subtract()
    {
        sum=(first-second);
        String sums =  Double.toString(sum);
        sums = String.format("%.5f", sum);
        return sums = sums.indexOf(".") < 0 ? sums : sums.replaceAll("0*$", "").replaceAll("\\.$", "");
    }

    public String multiply()
    {
        sum=(first*second);
        String sums =  Double.toString(sum);
        return sums = sums.indexOf(".") < 0 ? sums : sums.replaceAll("0*$", "").replaceAll("\\.$", "");
    }

    /* This method should throw an exception when divide by zero */
    public String division()
    {
        if(second==0)
        {
            throw new RuntimeException( "ERROR" ) ;
        }
        sum=(first/second);


        String sums =  Double.toString(sum);
        sums = String.format("%.5f", sum);
        return sums = sums.indexOf(".") < 0 ? sums : sums.replaceAll("0*$", "").replaceAll("\\.$", "");
    }


}
