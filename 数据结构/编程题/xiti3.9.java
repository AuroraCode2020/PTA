import java.io.*;
import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        cin.nextToken();
        int n = (int) cin.nval;
        cin.nextToken();
        int m = (int) cin.nval;
        String s = new String();
        char[] c;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            cin.nextToken();
            s = cin.sval;
            c = s.toCharArray();
            int j;
            boolean isOutput = false;
            for (j = 0; j < c.length; j++) {
                if (c[j] == 'S') {
                    if (stack.size() == m) {
                        cout.println("NO");
                        isOutput = true;
                        break;
                    } else {
                        stack.add('S');
                    }
                } else if (c[j] == 'X') {
                    if (stack.isEmpty() == true) {
                        cout.println("NO");
                        isOutput = true;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if (j == c.length && stack.isEmpty() == true) {
                cout.println("YES");
            } else if (isOutput == false) {
                cout.println("NO");
            }
            stack.clear();
        }
        cout.flush();
    }
}
