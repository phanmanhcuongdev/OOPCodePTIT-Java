import java.io.*;
import java.util.*;

public class J07004
{
     public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        Map<Integer, Integer> freq = new HashMap<>();
        while (sc.hasNext()) {
            String token = sc.next();
            try
            {
                int x = Integer.parseInt(token);
                freq.put(x, freq.getOrDefault(x, 0) + 1);
            }
            catch(Exception ex)
            {
                continue;
            }
        }
        sc.close();
        Map<Integer, Integer> sorted = new TreeMap<>(freq);
        for (Map.Entry<Integer,Integer> entry : sorted.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " " + value);
        }
    }
}