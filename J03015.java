import java.util.Scanner;

public class J03015 {

    private static StringBuilder Sub(String A,String B)
    {
        StringBuilder result = new StringBuilder();

        int i = A.length()-1;
        int j = B.length()-1;
        int borrow = 0;

        while(i>=0)
        {
            int digitA = A.charAt(i)-'0'-borrow;
            int digitB = (j>=0) ? B.charAt(j) - '0' : 0;

            if(digitA<digitB)
            {
                digitA+=10;
                borrow = 1;
            }else
            {
                borrow = 0;
            }

            int diff = digitA - digitB;

            result.append(diff);

            i--;
            j--;

        }
        return result.reverse();
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String A = scan.next().replaceFirst("^0+","");
        String B = scan.next().replaceFirst("^0+","");

        String Lon = "";
        String Be = "";

        if(A.length()>B.length())
        {
            Lon = A;
            Be = B;
        }
        else
        {
            if(A.length()<B.length())
            {
                Lon = B;
                Be = A;
            }
            else
            {
                if(A.equals(B))
                {
                    System.out.println(0);
                    return;
                }

                for(int i =0 ;i< A.length();i++)
                {
                    if(A.charAt(i)>B.charAt(i))
                    {
                        Lon = A;
                        Be = B;
                        break;
                    }
                    if(A.charAt(i)<B.charAt(i))
                    {
                        Lon = B;
                        Be = A;
                        break;
                    }
                }

            }
        }

        StringBuilder result = new StringBuilder();
        if(A.equals(Be)) result.append("-");
        result.append(Sub(Lon,Be));

        System.out.println(result.toString().replaceFirst("^0+",""));

    }
}
