package u4cpp;

import java.math.BigInteger;

public class RecursiveMath {
    //recursive power
    public static double pow(double base, int exponent){
        if (exponent == 0){
            return 1.0;
        }
        return base * pow(base, exponent - 1);
    }

    //recursive factorial
    public static BigInteger getFactorial(int n){
        if (n == 0 || n == 1){
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(n).multiply(getFactorial(n - 1));
    }

    //recursive fibonacci
    public static int getFibonacciNumber(int n){
        if (n == 1 || n == 2){
            return 1;
    }
    return getFibonacciNumber(n - 1) + getFibonacciNumber(n - 2);
}

}
