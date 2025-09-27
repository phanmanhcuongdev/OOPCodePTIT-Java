import java.util.Scanner;
import java.util.*;

public class J05033
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        List<Time> list = new ArrayList<>();

        while(t-->0)
        {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            list.add(new Time(a,b,c));
        }
        Collections.sort(list);  // dùng compareTo bên trong Time

        for (Time time : list) {
            System.out.println(time.toString());
        }
    }
}
class Time implements Comparable<Time>
{
    private int hour;
    private int minute;
    private int second;

     public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public int compareTo(Time other) {
        if (this.hour != other.hour)
            return this.hour - other.hour;
        if (this.minute != other.minute)
            return this.minute - other.minute;
        return this.second - other.second;
    }

    @Override
public String toString() {
    return hour + " " + minute + " " + second;
}
}