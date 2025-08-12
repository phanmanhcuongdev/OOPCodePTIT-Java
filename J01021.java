
import java.io.InputStreamReader;
import java.util.Scanner;

public class J01021 {
    private static final int MOD = 1000000007 ;
    private static long pow(long a, long b) {
        long res = 1;
        a %= MOD;
        while (b > 0) {
            if (b % 2 == 0) {
                a = (a * a) % MOD;
                b /= 2;
            } else {
                res = (res * a) % MOD;
                b--;
            }
        }
        return res;
    }
    public static void main(String[] args)
    {
        Scanner br = new Scanner(new InputStreamReader(System.in));
        long a = br.nextLong();long b = br.nextLong();br.nextLine();
        while(a!=0 || b!=0)
        {
            System.out.println(pow(a,b));
            a = br.nextLong();b = br.nextLong();br.nextLine();
        }
        br.close();
    }
}
