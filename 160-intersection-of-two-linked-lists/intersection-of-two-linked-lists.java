/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0;
        int lenB = 0;

        ListNode headALink = headA;
        ListNode headBLink = headB;

        // Compute lengths
        while (headALink != null) {
            lenA++;
            headALink = headALink.next;
        }
        while (headBLink != null) {
            lenB++;
            headBLink = headBLink.next;
        }

        headALink = headA;
        headBLink = headB;

        // Align heads
        if (lenA > lenB) {
            for (int i = 0; i < lenA - lenB; i++)
                headALink = headALink.next;

        } else {
            for (int i = 0; i < lenB - lenA; i++)
                headBLink = headBLink.next;
        }

        while (headALink != null || headBLink != null) {
            if (headALink != null && headBLink != null) {
                if (headALink == headBLink) {
                    return headALink;
                }
            }
            if (headALink != null) {
                headALink = headALink.next;
            }

            if (headBLink != null) {
                headBLink = headBLink.next;
            }
        }

        return null;
    }

}