package labuladong;

import static labuladong.ListNode.*;
public class ListTest {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6};
        ListNode list = ListCreateNums(nums);
        list.listNodePrint();
    }
}
