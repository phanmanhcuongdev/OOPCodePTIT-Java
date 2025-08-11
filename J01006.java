import java.util.Scanner;

public class J01006 {
    private static long findFibonacci(byte x)
    {
        if(x==1||x==2) return 1;
        long a=1;
        long b=1;
        long c=-1;
        for(byte i = 3; i<=x;i++){
            c = a+b;
            a=b;
            b=c;
        }
        return c;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        byte t = scanner.nextByte();
        while(t>0)
        {
            t--;
            byte x = scanner.nextByte();
            System.out.println(findFibonacci(x));
        }
    }
}
