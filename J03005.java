import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.StringTokenizer;

public class J03005 {
    static String capFirst(String s) {
        s = s.toLowerCase(Locale.ROOT);
        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        for (int t = 0; t < n; t++) {
            String line;
            while ((line = br.readLine()) != null && line.trim().isEmpty()) {}
            String[] a = line.trim().split("\\s+");

            String lastName = a[0].toUpperCase(Locale.ROOT);
            StringBuilder given = new StringBuilder();
            for (int i = 1; i < a.length; i++) {
                if (i > 1) given.append(' ');
                given.append(capFirst(a[i]));
            }

            System.out.println(given + ", " + lastName);
        }
    }
}

