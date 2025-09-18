import java.util.Scanner;

public class J03040 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0)
        {
            String input = scanner.next();

            boolean isIncrease = false;
            boolean isEqual = false;
            boolean is3_2 = false;
            boolean is6or8 = false;

            char first = input.charAt(5);
            char second = input.charAt(6);
            char third = input.charAt(7);
            char fourth = input.charAt(9);
            char fifth = input.charAt(10);

            if(first<second && second<third && third<fourth && fourth<fifth)
            {
                isIncrease = true;
            }

            if(first==second && second==third && third==fourth && fourth==fifth)
            {
                isEqual = true;
            }

            if(first==second && second==third && fourth==fifth)
            {
                is3_2 = true;
            }

            if((first=='6'||first=='8') && (second=='6'||second=='8') && (third=='6'||third=='8') && (fourth=='6'||fourth=='8') && (fifth=='6'||fifth=='8'))
            {
                is6or8 = true;
            }

            System.out.println(isIncrease||isEqual||is3_2||is6or8 ? "YES" : "NO");

        }
        scanner.close();
    }
}
