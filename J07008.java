import java.util.*;
import java.io.*;

public class J07008{
    private static int n;
    private static int[] a;
    static ArrayList<String> res = new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        n = sc.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        sc.close();

        backtrack(0, new ArrayList<>());

        Collections.sort(res);

        for (String s : res) System.out.println(s);
    }

    static void backtrack(int i, ArrayList<Integer> current) {
        if (i == n) {
            if (current.size() >= 2 && isIncreasing(current)) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < current.size(); j++) {
                    if (j > 0) sb.append(" ");
                    sb.append(current.get(j));
                }
                res.add(sb.toString());
            }
            return;
        }
        backtrack(i + 1, current);

        current.add(a[i]);
        backtrack(i + 1, current);
        current.remove(current.size() - 1);
    }

    static boolean isIncreasing(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size() - 1; i++)
            if (arr.get(i) >= arr.get(i + 1))
                return false;
        return true;
    }
}