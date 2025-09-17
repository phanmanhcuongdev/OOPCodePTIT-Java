import java.util.Scanner;

public class J03024 {
    private static String Check(String a)
    {
        int odd = 0;

        for(char c : a.toCharArray())
        {
            if(c>'9'||c<'0') return "INVALID";
            if(c=='1'||c=='3'||c=='5'||c=='7'||c=='9') odd++;
        }

        if(odd>a.length()-odd&&a.length()%2==1) return "YES";
        if(odd<a.length()-odd&&a.length()%2==0) return "YES";
        return "NO";
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        byte t = input.nextByte();
        while(t-->0)
        {
            String num = input.next();
            System.out.println(Check(num));
        }
        input.close();
    }
}
