import java.io.BufferedReader;
import java.io.InputStreamReader;

public class J01018 {
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        byte t  = Byte.parseByte(br.readLine().trim());
        while(t-- >0)
        {
            boolean check = true;
            String in = br.readLine().trim();
            int result = 0;
            result+=(in.charAt(0)-'0');
            for(int i=0;i<in.length()-1;i++)
            {
                result+=(in.charAt(i+1)-'0');
                if(in.charAt(i)-in.charAt(i+1)!=-2&&in.charAt(i)-in.charAt(i+1)!=2)
                {
                    check = false;
                    break;
                }
            }
            System.out.println(check&&result%10==0 ? "YES" : "NO");
        }
        br.close();
    }
}
