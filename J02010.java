import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class J02010 {
    private static void SelectionSort(List<Byte> lst,byte n)
    {

        for(byte i=0;i<n-1;i++)
        {
            System.out.printf("Buoc %d: ",i+1);
            for(byte j=(byte)(i+1);j<n;j++)
            {
                if(lst.get(i)>lst.get(j)){
                    byte temp = lst.get(i);
                    lst.set(i,lst.get(j));
                    lst.set(j,temp);
                }
            }
            for(byte u:lst){
                System.out.print(u+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        byte n = Byte.parseByte(br.readLine().trim());
        byte t = n;
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Byte> lst = new ArrayList<>();
        while(t-->0)
        {
            lst.add(Byte.parseByte(st.nextToken()));
        }
        SelectionSort(lst,n);
    }
}
