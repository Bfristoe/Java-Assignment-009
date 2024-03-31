import java.math.BigInteger;

public class Big {
    public static void main(String[] args) {
        System.out.println("Would you like to play a game?");
        printTable(10000);
    }
    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i=1; i<=n; i++) {
            result = result.multiply(BigInteger.valueOf(i)); // Multiplying the result with current number
        }

        return result; // Returning the final factorial result
    }

    public static void printTable(int n) {
        for (int i = 0; i <= n; i++) {
            BigInteger fact = factorial(i);
            System.out.println(i + "/" + fact);
        }
    }

}