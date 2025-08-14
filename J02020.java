import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class J02020 {
    static void generate(int n, int k) {
        int[] a = new int[k + 1];
        for (int i = 1; i <= k; i++) a[i] = i;
        int count = 0;

        while (true) {
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= k; i++) {
                if (i > 1) sb.append(' ');
                sb.append(a[i]);
            }
            System.out.println(sb);
            count++;

            int i = k;
            while (i >= 1 && a[i] == n - k + i) i--;
            if (i == 0) break;

            a[i]++;
            for (int j = i + 1; j <= k; j++) a[j] = a[j - 1] + 1;
        }

        System.out.println("Tong cong co " + count + " to hop");
    }
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(token.nextToken());
        int k = Integer.parseInt(token.nextToken());
        generate(n,k);
    }
}
