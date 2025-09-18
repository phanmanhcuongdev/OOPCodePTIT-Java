import java.math.BigInteger;
import java.util.Scanner;

public class J03033 {
    private static BigInteger gcd(BigInteger a,BigInteger b)
    {
        while(!b.equals(BigInteger.ZERO))
        {
            BigInteger t = a.remainder(b);
            a=b;
            b=t;
        }
        return a;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0)
        {
            BigInteger a = scanner.nextBigInteger();
            BigInteger b = scanner.nextBigInteger();

            System.out.println((a.multiply(b)).divide(gcd(a,b)));

        }
        scanner.close();
    }
}
