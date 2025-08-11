import java.util.Scanner;

public class J01004 {
    private static boolean isPrimeNumber(int n)
    {
        if(n<=1) return false;
        for(int i = 2; i*i<=n;i++)
        {
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t>0)
        {
            int x = scanner.nextInt();
            System.out.println( isPrimeNumber(x) ? "YES" : "NO" );
            t--;
        }
    }
}
