package Assignment5;

import java.util.Arrays;
import java.util.Scanner;

public class Boat_to_save_people {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int limit = sc.nextInt();
        System.out.println(numRescueBoats(nums, limit));
        sc.close();
    }

    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        int boats = 0;
        while (left <= right) {
            int sum = people[left] + people[right];
            if (sum > limit) {
                boats++;
                right--;
            } else {
                boats++;
                left++;
                right--;
            }
        }
        return boats;
    }

}
