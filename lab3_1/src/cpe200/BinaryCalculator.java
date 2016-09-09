package cpe200;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by pruet on 5/9/2559.
 */

public class BinaryCalculator {
     Operand firstOperand,secondOperand;
     Double sum,first,second;
    String sum1;

    public BinaryCalculator()
    {
        firstOperand = new Operand(0);
        secondOperand = new Operand(0);
    }

    public void setFirstOperand(Operand operand)
    {
        first=new Double(operand.operand);
    }


    public void setSecondOperand(Operand operand)
    {
        second=new Double(operand.operand);
    }

    public String add()//a+b
    {
        sum=first+second;
        sum1=Double.toString(sum);

        return sum1 = sum1.indexOf(".") < 0 ? sum1 : sum1.replaceAll("0*$", "").replaceAll("\\.$", "");
    }

    public String subtract()//a-b
    {
        sum=first-second;
        sum1 = Double.toString(sum);
        sum1=String.format("%.5f",sum);

        return sum1 = sum1.indexOf(".") < 0 ? sum1 : sum1.replaceAll("0*$", "").replaceAll("\\.$", "");
    }

    public String multiply()// a*b
    {
        sum=(first*second);
        sum1 = Double.toString(sum);

        return sum1 = sum1.indexOf(".") < 0 ? sum1 : sum1.replaceAll("0*$", "").replaceAll("\\.$", "");
    }

    /* This method should throw an exception when divide by zero */
    public String division() {
        if (second == 0) {
            throw new RuntimeException("ERROR");
        } else {
            sum = (first / second);
            String sum1 = Double.toString(sum);
            sum1=String.format("%.5f",sum);

            return sum1 = sum1.indexOf(".") < 0 ? sum1 : sum1.replaceAll("0*$", "").replaceAll("\\.$", "");

        }
    }




}
