import java.util.Scanner;

public class j01005 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t>0)
        {
            int n = scanner.nextInt();
            int h = scanner.nextInt();
            double a = 1.0;

            double bigArea = a*h/2.0;

            double smallArea = bigArea/n;

            for(int i=1;i<=n-1;i++){
                double currentArea = smallArea*i;
                double currentA = Math.sqrt(currentArea/bigArea);
                double currentH = currentArea/(1.000000/2.000000*currentA);
                System.out.printf("%.6f ",currentH);
            }
            System.out.println();
            t--;
        }
    }
}
