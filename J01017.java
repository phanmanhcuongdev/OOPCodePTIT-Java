import java.io.BufferedReader;
import java.io.InputStreamReader;

public class J01017 {
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        byte t  = Byte.parseByte(br.readLine().trim());
        while(t-- >0)
        {
            boolean check = true;
            String in = br.readLine().trim();
            for(int i=0;i<in.length()-1;i++)
            {
                if(in.charAt(i)-in.charAt(i+1)!=-1&&in.charAt(i)-in.charAt(i+1)!=1)
                {
                    check = false;
                    break;
                }
            }
            System.out.println(check ? "YES" : "NO");
        }
    }
}
