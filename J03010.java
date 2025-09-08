import java.util.*;

public class J03010 {
    private static String baseEmail(String name) {
        String cleaned = name.trim().toLowerCase().replaceAll("\\s+", " ");
        String[] parts = cleaned.split(" ");
        StringBuilder sb = new StringBuilder();

        sb.append(parts[parts.length - 1]);

        for (int i = 0; i < parts.length - 1; i++) {
            sb.append(parts[i].charAt(0));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());

        Map<String, Integer> count = new LinkedHashMap<>();
        List<String> outputs = new ArrayList<>();

        while (t-- > 0) {
            String name = sc.nextLine();
            String base = baseEmail(name); // ví dụ: "vinhnq"
            int c = count.getOrDefault(base, 0) + 1;
            count.put(base, c);

            if (c == 1) outputs.add(base + "@ptit.edu.vn");
            else        outputs.add(base + c + "@ptit.edu.vn");
        }
        sc.close();

        for (String s : outputs) System.out.println(s);
    }
}
