

//头节点的值不为空的
public class ListNode{
    int val;
    ListNode next;
    public ListNode(){}
    public ListNode(int val){
        this.val = val;
    }
    public ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
    public ListNode(ListNode next){
        this.next = next;
    }
    boolean listPrint(){
        ListNode current = this;
        System.out.println(current.val);
        while(current.next != null){
            System.out.println(current.next.val);
            current = current.next;
        }
        return true;
    }
    boolean listAdd(int val){
        ListNode current = this;
        while(current.next != null){
            current = current.next;
        }
        current.next = new ListNode(val);
        return true;
    }
    boolean listDelete(){
        ListNode current = this;
        ListNode pre = current;
        while(current.next != null){
            pre = current;
            current = current.next;
        }
        pre.next = null;
        return true;
    }
    boolean listGet(){
        ListNode current = this;
        while(current.next != null){
            current = current.next;
        }
        System.out.println(current.val);
        return true;
    }
}