package Day3;

import java.util.Scanner;

public class Flipping_an_image {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println(flipAndInvertImage(a));
        sc.close();
    }

    // Approach (Using Two pointers)
    public static int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            int j = 0;
            int k = image[0].length - 1;
            while (j <= k) {
                int temp = image[i][j];
                image[i][j] = image[i][k];
                image[i][k] = temp;
                image[i][j] ^= 1;
                if (j != k) {
                    image[i][k] ^= 1;
                }
                j++;
                k--;
            }
        }
        return image;
    }
}
