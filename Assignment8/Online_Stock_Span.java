package Assignment8;

import java.util.Scanner;
import java.util.Stack;

public class Online_Stock_Span {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] stock = new int[n];
        for (int i = 0; i < n; i++) {
            stock[i] = sc.nextInt();
        }
        Cal_Span(stock);
        sc.close();
    }

    public static void Cal_Span(int[] arr) {
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < ans.length; i++) {
            while (!st.isEmpty() && arr[i] >= arr[st.peek()]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = i + 1;
            } else {
                ans[i] = i - st.peek();
            }
            st.push(i);
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}