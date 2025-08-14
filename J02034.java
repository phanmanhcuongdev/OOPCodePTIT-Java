import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import static java.lang.Integer.max;

public class J02034 {
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> A = new ArrayList<>();
        int max = 1;
        int t = n;
        while(t>0)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens())
            {
                int temp = Integer.parseInt(st.nextToken());
                A.add(temp);
                max=max(temp,max);
                t--;
            }
        }
        br.close();
        StringBuilder sb = new StringBuilder();
        for(int i =1;i<=max;i++)
        {
            if(!A.contains(i)) sb.append(i).append("\n");
        }
        if(sb.length()==0) System.out.println("Excellent!");
        else System.out.println(sb);
    }
}
