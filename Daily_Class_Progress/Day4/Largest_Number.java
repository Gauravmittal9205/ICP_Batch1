package Day4;

import java.util.Arrays;

public class Largest_Number {

    public String largestNumber(int[] nums) {
        String str[] = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            str[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(str, (a, b) -> (b + a).compareTo(a + b));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            sb.append(str[i]);
        }
        if (sb.toString().startsWith("0")) {
            return "0";
        }
        return sb.toString();

    }

}
