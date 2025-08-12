import java.io.BufferedReader;
import java.io.InputStreamReader;


public class J01014
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        byte t = Byte.parseByte(br.readLine().trim());
        while(t-->0)
        {
            long res = 1;
            long n = Long.parseLong(br.readLine().trim());
            for(long i=2;i*i<=n;i++)
            {
                while (n%i==0)
                {
                    n/=i;
                    res=i;
                }
            }
            System.out.println(Math.max(res,n));

        }
        br.close();
    }
}
