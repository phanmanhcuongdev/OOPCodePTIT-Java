import java.util.*;
import java.io.*;

public class J07002
{
    private static Integer TryParseInt(String x)
    {
        try
        {
            return Integer.parseInt(x);
        }
        catch(NumberFormatException e)
        {
            return null;
        }
    }
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner scanner = new Scanner(new File("DATA.in"));
        List<String> tokens = new ArrayList<String>();
        while (scanner.hasNextLine()) {
            String[] parts = scanner.nextLine().split("\\s+");
            Collections.addAll(tokens, parts);
        }
        scanner.close();
        long result = 0;
        for(String x : tokens)
        {
            Integer v = TryParseInt(x); // dùng Integer
            if (v != null) {            // chỉ cộng khi parse thành công
                result += v;
            }
        }
        System.out.println(result);
    }

}