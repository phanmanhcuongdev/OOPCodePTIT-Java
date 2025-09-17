import java.util.Scanner;

public class J03025 {
    private static String Check(String a)
    {
        int len = a.length()/2;
        int cnt = 0;
        for(int i=0;i<len;i++)
        {
            if(a.charAt(i)!=a.charAt(a.length()-1-i)) cnt++;
        }

        if(a.length()%2==0&&cnt==1)
        {
            return "YES";
        }

        if(a.length()%2==1&&(cnt==1||cnt==0))
        {
            return "YES";
        }

        return "NO";
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        byte t = input.nextByte();

        while(t-->0)
        {
            String a = input.next();
            System.out.println(Check(a));
        }
        input.close();
    }
}
