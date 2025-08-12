import java.io.*;
import java.util.*;

public class J01022 {
    private static final int MAX_N = 93;
    private static final long[] M = new long[MAX_N + 1];
    private static char fb(long a,long b)
    {
        if(a==1) return '0';
        if(a==2) return '1';
        if(b<=M[(int)(a-2)]) return fb(a-2,b);
        return fb(a-1,b-M[(int)(a-2)]);
    }
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        byte t =  Byte.parseByte(br.readLine().trim());
        M[1]=1;M[2]=1;
        for(int i =3;i<= MAX_N;i++) M[i]= M[i-1]+M[i-2];

        StringBuilder out = new StringBuilder();
        while(t-->0)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            out.append(fb(a,b)).append("\n");
        }
        br.close();
        System.out.print(out);
    }
}
