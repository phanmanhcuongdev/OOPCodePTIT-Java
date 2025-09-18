import java.util.Scanner;

public class J04003 {
    private static long gcd(long a,long b)
    {
        while(b!=0)
        {
            long t = a%b;
            a=b;b=t;
        }
        return a;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        scanner.close();
        System.out.printf("%d/%d",a/gcd(a,b),b/gcd(a,b));
    }
}
