import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class J02013 {
    public static void BubbleSort(List<Integer> lst,int n)
    {
        for(int i=0;i<n-1;i++)
        {
            boolean check = false;
            for(int j=0;j<n-i-1;j++)
            {
                if(lst.get(j)>lst.get(j+1))
                {
                    check =true;
                    int temp = lst.get(j);
                    lst.set(j,lst.get(j+1));
                    lst.set(j+1,temp);
                }
            }
            if(!check) break;
            System.out.printf("Buoc %d: ",i+1);
            for(int u:lst) System.out.print(u+" ");
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int t =n ;
        List<Integer> lst = new ArrayList<>();
        StringTokenizer tk = new StringTokenizer(br.readLine());
        br.close();
        while(t-->0)
        {
            lst.add(Integer.parseInt(tk.nextToken()));
        }
        BubbleSort(lst,n);
    }
}
