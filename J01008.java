import java.util.Scanner;

public class J01008 {
    private static String factorize(int n)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i * i <= n; i++) {
            int cnt = 0;
            while (n % i == 0) {
                cnt++;
                n /= i;
            }
            if(cnt>0)
            {
                sb.append(i);sb.append("(");sb.append(cnt);sb.append(")");sb.append(" ");
            }

        }
        if (n > 1) {
            sb.append(n);sb.append("(");sb.append(1);sb.append(")");
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        byte t = scanner.nextByte();
        for(byte i = 1; i <= t ; i++)
        {
            int n = scanner.nextInt();
            System.out.printf("Test %d: " + factorize(n)+"\n",i);
        }
    }
}
