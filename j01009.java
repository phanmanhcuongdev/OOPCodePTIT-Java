import java.util.Scanner;

public class j01009 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        byte x = scanner.nextByte();
        scanner.close();
        long result=0;
        long fact=1;
        for(byte i =1;i<=x;i++){
            fact*=i;
            result+=fact;
        }
        System.out.println(result);
    }
}
