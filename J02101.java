import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class J02101 {
    static class FastScanner {
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
        FastScanner fs = new FastScanner();
        int T = fs.nextInt();
        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            int n = fs.nextInt();
            int[][] a = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = fs.nextInt();
                }
            }

            for (int i = 0; i < n; i++) {
                if ((i & 1) == 0) {
                    for (int j = 0; j < n; j++) sb.append(a[i][j]).append(' ');
                } else {
                    for (int j = n - 1; j >= 0; j--) sb.append(a[i][j]).append(' ');
                }
            }

            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ' ')
                sb.setLength(sb.length() - 1);
            System.out.println(sb.toString());
            sb.setLength(0);
        }
    }
}
