import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class J02017 {
    private static int solve(List<Integer> lst){
        Stack<Integer> st = new Stack();
        for(int u:lst)
        {
            if(st.empty())
            {
                st.push(u);
            }
            else
            {
                if((st.peek()+u)%2==0)
                {
                    st.pop();
                }else
                {
                    st.push(u);
                }
            }
        }
        return st.size();
    }
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer tk = new StringTokenizer(br.readLine());
        List<Integer> input = new ArrayList<>();
        for(int i = 0;i<n;i++){
            input.add(Integer.parseInt(tk.nextToken()));
        }
        System.out.println(solve(input));
        br.close();
    }
}