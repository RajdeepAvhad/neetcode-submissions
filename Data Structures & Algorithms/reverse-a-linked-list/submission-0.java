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
    public ListNode reverseList(ListNode head) {

        if(head==null || head.next==null)
        {
            return head;
        }

        ListNode prev = null;
        ListNode pres = head;
        

        while(pres!=null)
        {
            ListNode next = pres.next;
            pres.next = prev;
            prev = pres;
            pres = next;

            if(pres != null)
            {
                next = next.next;
            }
        }

        head = prev;

        return head;



    }
}
