import java.io.BufferedReader;
import java.io.InputStreamReader;

public class J03008 {
    static boolean isPrimeNumber(StringBuilder x) {
        for (int i = 0; i < x.length(); i++) {
            char c = x.charAt(i);
            if (c != '2' && c != '3' && c != '5' && c != '7') return false;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String line = br.readLine().trim();
            StringBuilder x = new StringBuilder(line);
            String reverse_x = new StringBuilder(line).reverse().toString();
            System.out.println(line.equals(reverse_x) && isPrimeNumber(x) ? "YES" : "NO");
        }
        br.close();
    }
}
