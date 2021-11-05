package labuladong;

public class ListTest {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7,8,9};
        ListNode list = ListNode.ListCreateNums(nums);
        list.listNodePrint();
        list = list.listDeleteNode(list, 10);
        list.listNodePrint();
    }
}
