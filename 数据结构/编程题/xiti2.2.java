import java.io.*;
import java.util.Arrays;

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
        if (m > n) {
            m = m - n;
        }
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            cin.nextToken();
            num[i] = (int) cin.nval;
        }
        int[] newNum = new int[n];
        System.arraycopy(num, m, newNum, 0, n - m);
        System.arraycopy(num, 0, newNum, n - m, m);
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                cout.println(newNum[i]);
            } else {
                cout.printf("%d ", newNum[i]);
            }
        }
        cout.flush();
    }
}
