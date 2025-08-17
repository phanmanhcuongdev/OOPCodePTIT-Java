import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.StringTokenizer;

public class J03004 {
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();
            while(st.hasMoreTokens())
            {
                String part = st.nextToken();
                String s = part.toLowerCase(Locale.ROOT);
                part = s.substring(0,1).toUpperCase(Locale.ROOT) + s.substring(1);
                sb.append(part).append(" ");
            }
            sb.deleteCharAt(sb.length()-1);
            System.out.println(sb);
        }
        br.close();
    }
}
