import java.io.BufferedReader;
import java.io.InputStreamReader;

public class J03006 {
    public static void main(String[] args) throws Exception
    {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringBuilder x = new StringBuilder(br.readLine());
            boolean check = true;
            for(int i=0;i<x.length();i++)
            {
                if((x.charAt(i)-'0')%2!=0)
                {
                    check=false;
                    break;
                }
            }
            String reverse_x = x.reverse().toString();
            System.out.println(check&&x.toString().equals(reverse_x) ? "YES" : "NO");
        }
        br.close();
    }
}
