package Day3;

import java.util.*;

public class Largest_Rectangle_Histogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

        }
        System.out.println(largest_rectangle(a));
        sc.close();

    }

    public static int largest_rectangle(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int area = 0;
        for (int i = 0; i < arr.length; i++) {
            while (!st.empty() && arr[i] < arr[st.peek()]) {
                int h = arr[st.pop()];
                int r = i;
                if (st.empty()) {
                    area = Math.max(area, h * r);
                } else {
                    int l = st.peek();
                    area = Math.max(area, h * (r - l - 1));
                }
            }
            st.push(i);
        }
        int r = arr.length;
        while (!st.empty()) {
            int h = arr[st.pop()];
            if (st.empty()) {
                area = Math.max(area, h * r);
            } else {
                int l = st.peek();
                area = Math.max(area, h * (r - l - 1));
            }
        }
        return area;

    }

}