import java.math.BigInteger;
import java.util.Scanner;

public class J03011 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        byte t = Byte.parseByte(scanner.nextLine().trim());

        while(t-->0)
        {
            BigInteger a = new BigInteger(scanner.nextLine());
            BigInteger b = new BigInteger(scanner.nextLine());
            System.out.println(a.gcd(b));
        }
        scanner.close();

    }
}
