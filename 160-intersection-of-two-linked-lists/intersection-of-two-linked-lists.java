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

        while (headALink != null) {
            lenA++;
            headALink = headALink.next;
        }
        while (headBLink != null) {
            lenB++;
            headBLink = headBLink.next;
        }


        // below 2 conditionals are used to
        if (lenA > lenB) {
            for (int i = 0; i < lenA - lenB; i++) {
                headA = headA.next;
            }
        } else {
            for (int i = 0; i < lenB - lenA; i++) {
                headB = headB.next;
            }
        }

        while (headA != null || headB != null) {
            if (headA != null && headB != null) {
                if (headA == headB) {
                    return headA;
                }
            }
            if (headA != null) {
                headA = headA.next;
            }

            if (headB != null) {
                headB = headB.next;
            }
        }

        return null;
    }
}