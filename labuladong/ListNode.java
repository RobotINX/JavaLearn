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
    //a new function to print the list by post order recursive
    public void postOrderPrint(){
        if(this.next == null){
            System.out.print(this.val + " ");
            return;
        }
        this.next.postOrderPrint();
        System.out.print(this.val + " ");
    }
    //a new function to print the list by pre order recursive
    public void preOrderPrint(){
        System.out.print(this.val + " ");
        if(this.next == null){
            return;
        }
        this.next.preOrderPrint();
    }
    //isPalindrome by recursive
    ListNode isPalindromeLeft = null;
    public boolean isPalindrome(){
        isPalindromeLeft = this;
        return isPalindrome(this);
    }
    public boolean isPalindrome(ListNode right){
        if(right == null)   return true;
        boolean result = isPalindrome(right.next);
        result = result && (isPalindromeLeft.val == right.val);
        isPalindromeLeft = isPalindromeLeft.next;

        return result;
    }
}