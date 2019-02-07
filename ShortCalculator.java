public class ShortCalculator 
{
    short result;
    public Short perfOperation(char op, short num1, short num2)
    {
        switch(op)
        {
            case '+':
            result = (short) (num1 + num2);
            break;
            
            case '-':
            result = (short) (num1 - num2);
            break;
            
            case '*':
            result = (short) (num1 * num2);
            break;
            
            case '/':
            result = (short) (num1 / num2);
            break;
            
            case '%':
            result = (short) (num1 % num2);
            break;

        }
        return result;

    }
}
