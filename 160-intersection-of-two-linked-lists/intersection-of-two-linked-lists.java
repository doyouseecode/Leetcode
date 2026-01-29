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
        int headASize = 0;
        int headBSize = 0;

        ListNode headALink = headA;
        ListNode headBLink = headB;
        ListNode intersection = null;

        while (headALink != null || headBLink != null) {
            // This one will handle if the lists original size's are the same
            // So meaning, their intersection will start at the same location for both
            if (headALink != null && headBLink != null) {
                if (headALink == headBLink) {
                    intersection = headALink;
                }
            }

            if (headALink != null) {
                if (headALink.next != null) {
                    headASize++;
                }
                headALink = headALink.next;
            }

            if (headBLink != null) {
                if (headBLink.next != null) {
                    headBSize++;
                }
                headBLink = headBLink.next;
            }
        }


        // below 2 conditionals are used to
        if (headASize > headBSize) {
            for (int i = 0; i < headASize - headBSize; i++) {
                headA = headA.next;
            }
        } else {
            for (int i = 0; i < headBSize - headASize; i++) {
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