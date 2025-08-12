import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class J02005 {
    public static void main(String[] args ) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        st =new StringTokenizer(br.readLine());
        ArrayList<Integer> A = new ArrayList<>();
        while (st.hasMoreTokens()) {
             A.add(Integer.parseInt(st.nextToken()));
        }

        HashSet<Integer> setA = new HashSet<>(A);
        A.clear();
        A.addAll(setA);

        st =new StringTokenizer(br.readLine());

        br.close();

        ArrayList<Integer> B = new ArrayList<>();
        while (st.hasMoreTokens()) {
             B.add(Integer.parseInt(st.nextToken()));
        }

        HashSet<Integer> setB = new HashSet<>(B);
        B.clear();
        B.addAll(setB);

        A.sort(null);

        for(int x:A)
        {
            if(B.contains(x)) System.out.print(x+" ");
        }
    }
}
