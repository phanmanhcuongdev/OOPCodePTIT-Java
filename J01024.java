import java.io.BufferedReader;
import java.io.InputStreamReader;

public class j01024 {
    private static boolean check(String m)
    {
        for(int i=0;i<m.length();i++)
        {
            if(m.charAt(i)!='1'&&m.charAt(i)!='2'&&m.charAt(i)!='0') return false;
        }
        return true;
    }
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        byte t = Byte.parseByte(br.readLine().trim());
        while(t-->0){
            String input = br.readLine().trim();
            System.out.println(check(input) ? "YES" : "NO");
        }
        br.close();
    }
}
