package labuladong;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    //create a list by giving a nums array
    public static ListNode ListCreateNums(int[] nums) {
        if(nums.length == 0){
            return null;
        }
        ListNode head = new ListNode(nums[0]);
        ListNode list = head;
        for(int i = 1; i < nums.length; i++){
            list.next = new ListNode(nums[i]);
            list = list.next;
        }
        return head;
    }

    //print the list
    public void listNodePrint(){
        ListNode head = this;
        while(head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}