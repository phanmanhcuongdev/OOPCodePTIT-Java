import java.io.*;
import java.util.*;

public class J07007
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Set<String> set = new TreeSet<>();
        Scanner sc = new Scanner(new File("VANBAN.in"));
        while(sc.hasNext())
        {
            String word = sc.next().toLowerCase();
            set.add(word);
        }
        sc.close();
        for (String word : set) {
            System.out.println(word);
        }
    }
}