import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class J07003
{
    private static String DevideAndSum(String x)
    {
        int half = x.length()/2;
        BigInteger a = new BigInteger(x.substring(0,half));
        BigInteger b = new BigInteger(x.substring(half,x.length()));
        BigInteger sum = a.add(b);
        return sum.toString();
    }
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner scanner = new Scanner(new File("DATA.in"));
        String x = scanner.nextLine();
        String c;
        while(true) {
            c = DevideAndSum(x);
            System.out.println(c);
            if(c.length()==1) break;
            x = c;
        }
    }
}