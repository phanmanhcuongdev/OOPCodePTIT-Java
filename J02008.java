import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class J02008 {
    private static List<Integer> PrimesUpTo100()
    {
        int maxN = 100;
        boolean[] sieve = new boolean[maxN+1];
        Arrays.fill(sieve,true);
        sieve[0] = sieve[1] = false;
        for(int i=2;i*i<=maxN;i++)
        {
            if(sieve[i])
            {
                for(int p =i*i;p<=maxN;p+=i) sieve[p]=false;
            }
        }
        List<Integer> primes = new ArrayList<>();
        for(int i=2;i<=maxN;i++) if(sieve[i]) primes.add(i);
        return primes;
    }

    private static BigInteger lcm1toN(int n,List<Integer> primes)
    {
        if(n<2) return BigInteger.ONE;
        BigInteger result = BigInteger.ONE;
        for(int p:primes)
        {
            if(p>n) break;
            long pk = p;
            while(pk*p<=n) pk*=p;
            result = result.multiply(BigInteger.valueOf(pk));
        }
        return result;
    }

    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        List<Integer> primes = PrimesUpTo100();
        while(t-- >0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            System.out.println(lcm1toN(n,primes).toString());
        }
        br.close();
    }
}
