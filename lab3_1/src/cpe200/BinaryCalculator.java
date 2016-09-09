package cpe200;

/**
 * Created by pruet on 5/9/2559.
 */

public class BinaryCalculator {
    Double Num1,Num2;
    String Ans;

    public BinaryCalculator()
    {
        /* your code here */
    }

    public void setFirstOperand(Operand operand)
    {
        Num1 = Double.parseDouble(operand.operand);
    }


    public void setSecondOperand(Operand operand)
    {
        Num2 = Double.parseDouble(operand.operand);
    }

    public String add()
    {
        Double ans = Num1 + Num2;
        int tmp = ans.intValue();
        if (tmp == ans)
            return Integer.toString(tmp);
        return Double.toString(ans);
    }

    public String subtract()
    {
        Double ans = Num1 - Num2;
        int tmp = ans.intValue();
        if (tmp == ans)
            return Integer.toString(tmp);
        long temp = Math.round(ans*100000);
        ans = (double)temp;
        ans /= 100000;
        return Double.toString(ans);
    }

    public String multiply()
    {
        Double ans = Num1 * Num2;
        int tmp = ans.intValue();
        if (tmp == ans)
            return Integer.toString(tmp);
        return Double.toString(ans);
    }

    /* This method should throw an exception when divide by zero */
    public String division()
    {
        if (Num2 == 0)
            throw new RuntimeException();
        Double ans = Num1 / Num2;
        int tmp = ans.intValue();
        if (tmp == ans)
            return Integer.toString(tmp);
        long temp = Math.round(ans*100000);
        ans = (double)temp;
        ans /= 100000;
        return Double.toString(ans);
    }


}
