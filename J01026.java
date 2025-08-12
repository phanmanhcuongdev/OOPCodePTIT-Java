import java.io.BufferedReader;
import java.io.InputStreamReader;

public class J01026 {
    public static void main(String[] args) throws Exception
    {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        byte t = Byte.parseByte(br.readLine().trim());
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int m = (int)Math.sqrt((double)n);
            System.out.println(m*m ==n ? "YES" : "NO");

        }
        br.close();
    }
}
