import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class J02011 {
    private static void SelectionSort(List<Integer> lst, int n)
    {
        for(int i=0;i<n-1;i++)
        {
            int min = i;
            for(int j=i+1;j<n;j++)
            {
                if(lst.get(min)>lst.get(j)){
                    min=j;
                }
            }
            int temp=lst.get(min);
            lst.set(min,lst.get(i));
            lst.set(i,temp);
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
        SelectionSort(lst,n);
    }

}
