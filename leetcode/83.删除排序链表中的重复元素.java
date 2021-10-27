import java.util.List;

/*
 * @lc app=leetcode.cn id=83 lang=java
 *
 * [83] 删除排序链表中的重复元素
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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode start = head;
        ListNode pre = head;
        while(head.next != null){
            head = head.next;
            if(head.val != pre.val){
                pre = head;
            }
            else if(head.val == pre.val){
                pre.next = head.next;
            }
        }
        return start;
    }
}
// @lc code=end

