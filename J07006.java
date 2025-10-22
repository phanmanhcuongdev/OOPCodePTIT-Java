import java.io.*;
import java.util.*;

public class J07006{
    public static void main(String[] args)
    {
        Map<Integer,Integer> map = new TreeMap<>();

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in")))
        {
            ArrayList<Integer> list = (ArrayList<Integer>) ois.readObject();
            // Đếm tần suất xuất hiện
            for (Integer x : list) {
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
        }
        catch(IOException | ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }

        // In kết quả theo thứ tự tăng dần
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}