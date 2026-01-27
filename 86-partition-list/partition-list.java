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
    public ListNode partition(ListNode head, int x) {
        ListNode left = new ListNode(0);
        ListNode right = new ListNode(0);

        ListNode leftRail = left;
        ListNode rightRail = right;

        while(head!=null){
            if(head.val < x){
                leftRail.next = head;
                leftRail = leftRail.next;
            }
            else{
                rightRail.next = head;
                rightRail = rightRail.next;
            }
            head = head.next;
        }

        leftRail.next = right.next;
        rightRail.next = null;


        return left.next;


    }
}