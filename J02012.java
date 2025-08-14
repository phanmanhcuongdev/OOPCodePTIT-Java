import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class J02012 {
    private static void InsertionSort(List<Integer> lst, int n)
    {
        List<Integer> sort = new ArrayList<>();
        sort.add(lst.getFirst());
        System.out.println("Buoc 0: "+lst.getFirst());
        for(int i=1;i<n;i++)
        {
            int insert = lst.get(i);
            boolean checkMax = true;
            for(int j=0;j<sort.size();j++){
                if(insert<sort.get(j))
                {
                    sort.add(j,insert);
                    checkMax = false;
                    break;
                }
            }
            if(checkMax) sort.add(insert);
            System.out.printf("Buoc %d: ",i);
            for(int u:sort) System.out.print(u+" ");
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
        InsertionSort(lst,n);
    }

}
