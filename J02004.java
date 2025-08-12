import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class J02004
{
    public static void main (String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
        ArrayList<Integer> input = new ArrayList<>();
        String input_arr = br.readLine();
         for (String s : input_arr.trim().split("\\s+")) {
            input.add(Integer.parseInt(s));
        }
         boolean check =true;
         for(int i=0;i<n/2;i++)
         {
             if(input.get(i)!=input.get(n-i-1))
             {
                 check=false;
                 break;
             }
         }
         System.out.println(check ? "YES" : "NO");
        }
        br.close();
    }
}
