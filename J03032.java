import java.util.Scanner;

public class J03032 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        byte t = scanner.nextByte();scanner.nextLine();
        while(t-->0)
        {
            String line = scanner.nextLine().trim();
            String[] words = line.split("\\s+");
            StringBuilder result = new StringBuilder();
            for(String u:words)
            {
                result.append((new StringBuilder(u)).reverse().append(" "));
            }

            System.out.println(result);

        }
        scanner.close();
    }
}
