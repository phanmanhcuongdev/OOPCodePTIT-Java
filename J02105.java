import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class J02105 {
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

        int nextInt() throws Exception {
            return Integer.parseInt(next());
        }

        void close() throws Exception {
            br.close();
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner scanner = new FastScanner();
        int n = scanner.nextInt();
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                int x = scanner.nextInt();
                if(x==1) temp.add(j+1);
            }
            result.add(temp);
        }
        scanner.close();
        int cnt =1;
        for(List<Integer> u : result)
        {
            System.out.printf("List(%d) = ",cnt++);
            for(int x : u) System.out.print(x+" ");
            System.out.println();
        }
    }
}
