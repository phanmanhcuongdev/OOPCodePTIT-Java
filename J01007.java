import java.util.Scanner;

public class J01007 {
    private static boolean isFindFibonacci(long x)
    {
        if(x==0||x==1) return true;
        long a=0;
        long b=1;
        long c=-1;
        while(c<x){
            c = a+b;
            a=b;
            b=c;
        }
        if (c!=x) return false;
        return true;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        byte t = scanner.nextByte();
        while(t>0)
        {
            t--;
            long x = scanner.nextLong();
            System.out.println(isFindFibonacci(x) ? "YES" : "NO" );
        }
    }
}
