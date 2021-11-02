package labuladong;

public class ListTest {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6};
        ListNode list = ListNode.ListCreateNums(nums);
        list.listNodePrint();
        list = Reverse.reverseBetweent(list, 2, 4);
        list.listNodePrint();
    }
}
