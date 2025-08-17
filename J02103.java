import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class J02103 {
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
    }

    static int[][] matrixTranspose (int m,int n,int a[][])
    {
        int[][] result = new int[n][m];

        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                result[j][i]=a[i][j];

        return result;
    }

    static int[][] matrixMultiple(int m,int n,int o,int a[][],int b[][])
    {
        int[][] result = new int[m][m];

        for(int i = 0;i < m; i++)
            for(int j=0;j<o;j++)
                for(int k =0 ;k<n;k++)
                {
                    result[i][j]+=a[i][k]*b[k][j];
                }

        return result;
    }

    public static void main(String[] args) throws Exception
    {
        FastScanner scanner = new FastScanner();

        int t = scanner.nextInt();

        for(int ts = 1;ts<=t;ts++)
        {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            int[][] a = new int[m][n];

            for(int i=0;i<m;i++)
                for(int j=0;j<n;j++)
                    a[i][j]=scanner.nextInt();

            int[][] result = matrixMultiple(m,n,m,a,matrixTranspose(m,n,a));

            System.out.printf("Test %d:\n",ts);

            for(int i=0;i<m;i++){
                for(int j=0;j<m;j++)
                {
                    System.out.print(result[i][j]);
                    if(j!=m-1) System.out.print(" ");

                }
                System.out.println();
            }

        }
    }
}
