package labuladong;

public class ListTest {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,5,4,3,2,1};
        ListNode list = ListNode.ListCreateNums(nums);
        list.listNodePrint();
        System.out.println(list.isPalindrome());;
    }
}
