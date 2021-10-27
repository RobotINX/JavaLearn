import java.util.List;

/*
 * @lc app=leetcode.cn id=21 lang=java
 *
 * [21] 合并两个有序链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();
        ListNode current = l3;
        while(l1 != null && l2 != null){
            if(l1.val > l2.val){
                current.next = l2;
                l2 = l2.next;
            }
            else{
                current.next = l1;
                l1 = l1.next;
            }
            current = current.next;
        }
        current.next = l1 == null ? l2 : l1;
        return l3.next;
    }

}
// @lc code=end

