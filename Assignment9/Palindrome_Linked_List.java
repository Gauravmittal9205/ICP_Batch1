package Assignment9;

import java.util.ArrayList;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Palindrome_Linked_List {

    public static boolean isPalindrome(ListNode head) {
        ArrayList<Integer> a = new ArrayList<>();
        while (head != null) {
            a.add(head.val);
            head = head.next;
        }
        int i = 0;
        int j = a.size() - 1;
        while (i < j) {
            if (a.get(i) != a.get(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
