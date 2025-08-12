import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class J01010 {
    private static final Map<Character, Character> CUT = new HashMap<>();
    static {
        CUT.put('0', '0');
        CUT.put('1', '1');
        CUT.put('8', '0');
        CUT.put('9', '0');
    }

    private static String cutHalf(String n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);
            Character out = CUT.get(c);
            if (out == null) return "INVALID";
            sb.append(out);
        }

        int idx = 0;
        while (idx < sb.length() && sb.charAt(idx) == '0') idx++;
        String res = sb.substring(idx);
        return res.isEmpty() ? "INVALID" : res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte t = scanner.nextByte();scanner.nextLine();
        while (t-- > 0) {
            String n = scanner.nextLine().trim();
            System.out.println(cutHalf(n));
        }
        scanner.close();
    }
}