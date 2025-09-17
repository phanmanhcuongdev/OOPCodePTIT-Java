import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class J03027 {
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine().trim();
        br.close();
        Stack<Character>  st = new Stack<>();
        for(char c : a.toCharArray())
        {
            if(st.empty())
            {
                st.push(c);
            }
            else
            {
                if(c==st.peek()) {
                    st.pop();
                }else
                {
                    st.push(c);
                }
            }
        }

        StringBuilder result = new StringBuilder();

        for(char c:st)
        {
            result.append(c);
        }

        System.out.println(result.length()==0 ? "Empty String" : result);

    }
}
