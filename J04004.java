import java.util.Scanner;

public class J04004 {
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
        long a1 = scanner.nextLong();
        long b1 = scanner.nextLong();
        long a2 = scanner.nextLong();
        long b2 = scanner.nextLong();

        long x1 = gcd(a1,b1);
        long x2 = gcd(a2,b2);

        a1/=x1;b1/=x1;a2/=x2;b2/=x2;

        long a3 = a1*b2+a2*b1;
        long b3 = b1*b2;

        long x3 = gcd(a3,b3);

        a3/=x3;b3/=x3;

        System.out.printf("%d/%d",a3,b3);

    }
}
