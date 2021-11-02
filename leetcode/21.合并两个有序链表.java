package leetcode;

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
    /*
    //通过创建一个新链表来进行排序
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode list = new ListNode(-1);
        ListNode head = list;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                list.next = new ListNode(l1.val);
                list = list.next;
                l1 = l1.next;
            }else{
                list.next = new ListNode(l2.val);
                list = list.next;
                l2 = l2.next;
            }
        }
        while(l1 != null){
            list.next = new ListNode(l1.val);
            list = list.next;
            l1 = l1.next;
        }
        while(l2 != null){
            list.next = new ListNode(l2.val);
            list = list.next;
            l2 = l2.next;
        }
        return head.next;
    }
    */
    //通过修改两个链表的指针来排序
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode list = new ListNode(-1);
        ListNode head = list;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                list.next = l1;
                list = list.next;
                l1 = l1.next;
            }else{
                list.next = l2;
                list = list.next;
                l2 = l2.next;
            }
        }
        while(l1 != null){
            list.next = l1;
            list = list.next;
            l1 = l1.next;
        }
        while(l2 != null){
            list.next = l2;
            list = list.next;
            l2 = l2.next;
        }
        return head.next;
    }
}
// @lc code=end

