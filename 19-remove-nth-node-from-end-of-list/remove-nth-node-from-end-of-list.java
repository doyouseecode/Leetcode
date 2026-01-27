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


        public ListNode removeNthFromEnd(ListNode head, int n) {
        // 1 2 3 4 5, n = 2
        // length = 5
        // 1 2 3 5
        int len = length(head);
        if(len == n){
            return head.next;
        }

        ListNode temp = head;
        for (int i = 0; i < len - 1 - n; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        // list.size--;

        return head;
    }

    static int length(ListNode head) {
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        return size;
    }
}