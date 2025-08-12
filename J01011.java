import java.util.Scanner;

public class J01011 {
    private static int USCLN(int a, int b)
    {
        while(b!=0){
            int t = a%b;
            a=b;
            b=t;
        }
        return a;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        byte t = scanner.nextByte();scanner.nextLine();
        while(t-->0)
        {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            scanner.nextLine();
            int uscln = USCLN(a,b);
            long BSCNN =(long) a*b/uscln;
            System.out.printf("%d %d\n",BSCNN,uscln);
        }
        scanner.close();
    }
}
