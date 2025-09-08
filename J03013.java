import java.util.Scanner;
import java.math.*;

public class J03013 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        byte t = Byte.parseByte(scanner.nextLine().trim());

        while (t-- > 0) {
            BigInteger a = new BigInteger(scanner.next());
            BigInteger b = new BigInteger(scanner.next());

            int len_a = a.toString().length();
            int len_b = b.toString().length();

            int maxLength = Math.max(len_a,len_b);

            BigInteger res = a.subtract(b).abs();
            int len_res = res.toString().length();
            StringBuilder result = new StringBuilder() ;

            for(int i =1;i<=maxLength-len_res;i++)
            {
                result.append('0');
            }
            result.append(res.toString());

            System.out.println(result);
        }
        scanner.close();
    }
}