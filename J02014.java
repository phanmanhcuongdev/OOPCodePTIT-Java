import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class J02014 {
    private static int findBalancePoint(List<Integer> lst, int n) {
        long total = 0;
        int Lsum =0;
        for(int x:lst) total+=x;
        for(int i=0;i<n;i++){
            long Rsum = total - Lsum -lst.get(i);
            if(Rsum==Lsum) return i+1;
            Lsum+=lst.get(i);
        }
        return -1;
    }
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine().trim());
        while(t-- >0)
        {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer tk = new StringTokenizer(br.readLine());
            List<Integer> input = new ArrayList<>();
            for(int i = 0;i<n;i++){
                input.add(Integer.parseInt(tk.nextToken()));
            }
            System.out.println(findBalancePoint(input,n));
        }
    }
}
