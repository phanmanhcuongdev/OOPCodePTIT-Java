import java.math.BigInteger;
import java.util.Scanner;

public class J03039 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0)
        {
            BigInteger a = scanner.nextBigInteger();
            BigInteger b = scanner.nextBigInteger();
            System.out.println(a.remainder(b).equals(BigInteger.ZERO) ||  b.remainder(a).equals(BigInteger.ZERO) ? "YES" : "NO");
        }
    }
}
