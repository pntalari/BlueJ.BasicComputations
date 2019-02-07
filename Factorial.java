import java.math.BigInteger;

public class Factorial {

    public BigInteger factorialOf(Integer value){
        BigInteger factres = new BigInteger("1");
        for (int i = 1; i<= value; i++)
        {
            factres = factres.multiply(BigInteger.valueOf(i));
        }
        return factres;
    }

}
