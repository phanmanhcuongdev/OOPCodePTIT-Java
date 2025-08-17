import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class J02106 {
    static class FS {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String next() throws Exception {
            while (st == null || !st.hasMoreTokens()) {
                String line = br.readLine();
                if (line == null) return null;
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        }
        int nextInt() throws Exception { return Integer.parseInt(next()); }
    }

    public static void main(String[] args) throws Exception {
        FS fs = new FS();
        int n = fs.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) sum += fs.nextInt();
            if (sum >= 2) ans++;
        }
        System.out.println(ans);
    }
}
