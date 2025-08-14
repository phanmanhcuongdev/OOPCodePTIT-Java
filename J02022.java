import java.io.BufferedReader;
import java.io.InputStreamReader;

public class J02022
{
    private static void generatePermutations(int n) {
        boolean[] used = new boolean[n + 1];
        int[] perm = new int[n];
        backtrack(0, n, perm, used);
    }

    static boolean check(int n,int[] perm)
    {
        for(int i=0;i<n-1;i++)
        {
            if(perm[i]-perm[i+1]==1||perm[i]-perm[i+1]==-1) return false;
        }
        return true;
    }

    private static void backtrack(int idx, int n, int[] perm, boolean[] used) {
        if (idx == n) {
            if(!check(n,perm)) return;
            for (int i = 0; i < n; i++) {
                System.out.print(perm[i]);
            }
            System.out.println();
            return;
        }
        for (int num = 1; num <= n; num++) {
            if (!used[num]) {
                used[num] = true;
                perm[idx] = num;
                backtrack(idx + 1, n, perm, used);
                used[num] = false;
            }
        }
    }
    public static void main(String[] args) throws Exception
    {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        while(t -- >0)
        {
            int n = Integer.parseInt(br.readLine());
            generatePermutations(n);
        }
        br.close();
    }
}
