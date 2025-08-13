import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class J02007 {
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        for(int i=1;i<=t;i++)
        {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            Map<Integer,Integer> result= new LinkedHashMap<>();
            while(n-->0)
            {
                int m =Integer.parseInt(st.nextToken());
                result.put(m,result.getOrDefault(m,0)+1);
            }
            System.out.printf("Test %d:\n",i);
            for(Map.Entry<Integer,Integer> entry : result.entrySet())
            {
                System.out.printf("%d xuat hien %d lan\n",entry.getKey(),entry.getValue());
            }
        }
    }
}
