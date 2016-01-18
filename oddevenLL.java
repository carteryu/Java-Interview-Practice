/*

Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.

You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.

*/


public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head==null || head.next==null || head.next.next==null) return head;
        ListNode oddDummyHead = new ListNode(-1);
        ListNode evenDummyHead = new ListNode(-1);
        oddDummyHead.next = head;
        evenDummyHead.next = head.next;
        ListNode oddCur = head;
        ListNode evenCur = head.next;
        while (evenCur!=null && evenCur.next!=null) {
            oddCur.next = evenCur.next;
            evenCur.next = evenCur.next.next;
            oddCur = oddCur.next;
            evenCur = evenCur.next;
        }
        oddCur.next = evenDummyHead.next;
        return oddDummyHead.next;
    }
}