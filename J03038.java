import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class J03038 {
    public static void main(String[] args)
    {
        Set<Character> s = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        for(char c : inp.toCharArray())
        {
            s.add(c);
        }
        scanner.close();
        System.out.println(s.size());
    }
}
