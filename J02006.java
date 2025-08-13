import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.HashSet;

import java.util.StringTokenizer;

public class J02006 {
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        HashSet<Integer> temp = new HashSet<>();
        st  = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens())
        {
            temp.add(Integer.parseInt(st.nextToken()));
        }
        st  = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens())
        {
            temp.add(Integer.parseInt(st.nextToken()));
        }
        br.close();
        ArrayList<Integer> result = new ArrayList<>(temp);
        result.sort(null);

        for(int u: result){
            System.out.printf("%d ",u);
        }
    }
}
