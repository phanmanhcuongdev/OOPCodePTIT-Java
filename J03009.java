import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class J03009 {
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if(line==null)
            return;
        int t = Integer.parseInt(line.trim());

        StringBuilder out = new StringBuilder();
        for(int tc=0;tc<t;tc++) {
            String s1 = br.readLine();
            String s2 = br.readLine();
            if (s1 == null) s1 = "";
            if (s2 == null) s2 = "";

            Set<String> inS2 = new HashSet<>();

            if (!s2.trim().isEmpty()) {
                for (String w : s2.trim().split("\\s+")) {
                    if (!w.isEmpty()) inS2.add(w);
                }
            }

            Set<String> result = new TreeSet<>();
            if (!s1.trim().isEmpty()) {
                for (String w : s1.trim().split("\\s+")) {
                    if (!w.isEmpty() && !inS2.contains(w)) result.add(w);
                }
            }

            boolean first = true;
            for (String w : result) {
                if (!first) out.append(' ');
                out.append(w);
                first = false;
            }
            if (tc < t - 1) out.append("\n");
        }
        System.out.print(out.toString());
    }
}
