import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class J02104 {
    static class FastScanner{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String next() throws Exception
        {
            while(st == null || !st.hasMoreTokens())
            {
                String line = br.readLine();
                if(line == null) return null;
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        }
        int nextInt() throws Exception {return Integer.parseInt(next());}
        void close() throws Exception {br.close();}
    }
    static class Pair {
    int first;
    int second;

    Pair(int f, int s) {
        this.first = f;
        this.second = s;
    }
}
    public static void main(String[] args) throws Exception
    {
        FastScanner scanner = new FastScanner();
        int n = scanner.nextInt();
        List<Pair> result = new ArrayList<>();
        for(int i = 0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int x = scanner.nextInt();
                if(x==1&&j>i) result.add(new Pair(i+1,j+1));
            }
        }
        scanner.close();
        for (Pair p : result) {
            System.out.println("("+p.first + "," + p.second+")");
        }

    }
}
