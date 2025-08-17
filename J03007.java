import java.io.BufferedReader;
import java.io.InputStreamReader;

public class J03007 {
    public static void main(String[] args) throws Exception
    {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringBuilder x = new StringBuilder(br.readLine());

            int cnt=0;
            for(int i=0;i<x.length();i++)
            {
                cnt+=(x.charAt(i)-'0');
            }
            String reverse_x = x.reverse().toString();
            System.out.println(x.toString().equals(reverse_x)&&cnt%10==0&&x.charAt(0)==x.charAt(x.length()-1)&& x.charAt(0)=='8' ? "YES" : "NO");
        }
        br.close();
    }
}
