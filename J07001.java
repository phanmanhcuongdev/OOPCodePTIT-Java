import java.util.*;
import java.io.*;

public class J07001{
    public static void main(String[] args)
    {
        try(BufferedReader br = new BufferedReader(new FileReader("DATA.in"))){
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e)
        {

        }
    }
}