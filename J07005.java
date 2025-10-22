import java.util.*;
import java.io.*;

public class J07005
{
    public static void main(String[] args)
    {
        int[] count = new int[1001];
        try(DataInputStream dis = new DataInputStream(new FileInputStream("DATA.IN"))) {
            while (dis.available() > 0) {
                int x = dis.readInt();
                if (x >= 0 && x < 1000) {
                    count[x]++;
                }
            }
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }

        for(int i=0;i<1001;i++)
        {
            if(count[i]>0)
            {
                System.out.printf("%d %d\n",i,count[i]);
            }
        }

    }
}