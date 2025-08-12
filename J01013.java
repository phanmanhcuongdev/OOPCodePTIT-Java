import java.io.*;


public class J01013 {
    private static int MAX = 2000000;
    private static int[] spf = new int[MAX+1];

    private static void getReady()
    {
        for(int i=1;i<=MAX;i++) spf[i]=i;
        for(int i=2;i*i<=MAX;i++)
            if(spf[i]==i)
            {
                for(int j=i*i;j<=MAX;j+=i)
                {
                    if(spf[j]==j) spf[j]=i;
                }
            }
    }

    private static long factorizeSum(int n)
    {
        long result=0;
        while(n>1)
        {
            result+=spf[n];
            n/=spf[n];
        }
        return result;
    }

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine().trim());

        getReady();

        long total=0;
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(reader.readLine().trim());
            total += factorizeSum(n);
        }
        System.out.println(total);

    }
}
