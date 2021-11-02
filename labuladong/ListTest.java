package labuladong;

public class ListTest {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7,8,9,10,11,12};
        ListNode list = ListNode.ListCreateNums(nums);
        list.listNodePrint();
        list = Reverse.reverseKGroup(list, 2);
        list.listNodePrint();
    }
}
