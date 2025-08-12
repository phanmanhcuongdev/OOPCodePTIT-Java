import java.io.BufferedReader;
import java.io.InputStreamReader;

public class J01016 {
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in = br.readLine().trim();
        br.close();
        int result = 0;
        for(int i=0;i<in.length();i++)
        {
            if(in.charAt(i)=='4'||in.charAt(i)=='7') result++;
        }

        System.out.println(result==4||result==7 ? "YES" : "NO");
    }
}
