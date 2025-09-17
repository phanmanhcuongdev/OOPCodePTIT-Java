import java.util.Scanner;

public class J03021 {

    private static char[] MAP = new char[26];
    static {
        String[] groups = {"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
        char digits = '2';
        for(String g : groups)
        {
            for(char ch : g.toCharArray()) MAP[ch-'A'] = digits;
            digits++;
        }
    }

    static char t9(char c)
    {
        if ('a' <= c && c <= 'z') c = (char)(c - 'a' + 'A');
        if ('A' <= c && c <= 'Z') return MAP[c - 'A'];
        return '?';
    }

    static String toT9(String s) {
    StringBuilder sb = new StringBuilder(s.length());
    for (char c : s.toCharArray()) sb.append(t9(c));
    return sb.toString();
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        while(t-->0)
        {
            String input = scan.next();
            String T9Num = toT9(input).replace("?","");
            System.out.println(T9Num.equals(new StringBuilder(T9Num).reverse().toString()) ? "YES" : "NO");
        }
        scan.close();
    }
}
