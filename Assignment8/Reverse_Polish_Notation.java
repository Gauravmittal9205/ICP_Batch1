package Assignment8;

import java.util.Scanner;
import java.util.Stack;

public class Reverse_Polish_Notation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s[] = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        System.out.println(evalRPN(s));
        sc.close();
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("/")) {
                int a = st.pop();
                int b = st.pop();
                st.push(b / a);
            } else if (tokens[i].equals("*")) {
                int a = st.pop();
                int b = st.pop();
                st.push(b * a);
            } else if (tokens[i].equals("+")) {
                int a = st.pop();
                int b = st.pop();
                st.push(b + a);
            } else if (tokens[i].equals("-")) {
                int a = st.pop();
                int b = st.pop();
                st.push(b - a);
            } else {
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.pop();

    }

}
