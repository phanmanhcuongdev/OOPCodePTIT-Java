import java.io.BufferedReader;
import java.io.FileReader;

public class HELLOFILE {
    public static void main(String[] args) {
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("Hello.txt"));
            String line;
            while((line= br.readLine())!=null)
            {
                System.out.println(line);
            }
        }catch(Exception ex)
        {
            System.out.println("Hello.txt is not exist");
        }
    }
}
