//Problem Source ==> https://www.interviewbit.com/problems/large-factorial/

import java.math.*;
public class LargeFactorial {
    public static String solve(int A) {
        BigInteger result = factorial(A);
        return result.toString();
    }
    public static BigInteger factorial(int num)
    {
        if(num==0 || num==1)
        {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(num).multiply(factorial(num-1));
    }
}
