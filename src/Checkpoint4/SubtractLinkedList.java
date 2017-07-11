package Checkpoint4;

/**
 * Created by ruchitmehta
 *
 */
public class SubtractLinkedList {

    public static void main(String args[]){
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(4);
        ListNode n4 = new ListNode(9);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        SubtractLinkedList ob = new SubtractLinkedList();
        ob.subtract(n1);

    }

    public ListNode subtract(ListNode head){
        if(head == null)
            return head;

        ListNode slow = head, fast = head;

        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println(slow.val);

        return head;
    }


}
