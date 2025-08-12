import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J01012 {
    private static int Solve(int n)
    {
        if(n%2==1) return 0;
        n=n/2;
        List<Integer> factor = new ArrayList<>() ;
        for(int i= 2;i * i <= n;i++)
        {
            int cnt = 0;
            while(n%i==0)
            {
                n/=i;
                cnt++;
            }
            if(cnt>0) factor.add(cnt);
        }
        int result = 1;
        for(int i=0;i<factor.size();i++)
        {
            result*=(factor.get(i)+1);
        }
        if (n > 1) {
            result *= 2; // mũ = 1 => (1 + 1)
        }
        return result;
    }

    public static void main(String[] args)
    {
        Scanner scanner  = new Scanner(System.in);
        byte t = Byte.parseByte(scanner.nextLine().trim());
        while(t-- > 0)
        {
            int n = Integer.parseInt(scanner.nextLine().trim());
            System.out.println(Solve(n));
        }
    }
}
