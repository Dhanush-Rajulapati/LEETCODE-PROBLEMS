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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int len = length(head);
        int l = len/k;
        int rem = len%k;
        ListNode []res = new ListNode[k];
        ListNode start = head;
        int idx = 0;
        while(rem > 0)
        {
            int count = 0;
            while(count < l)
            {
                head = head.next;
                count++;
            }
            res[idx] = start;
            start = head.next;
            head.next = null;
            head = start;
            idx++;
            rem--;
        }
        while(head != null)
        {
            int count = 0;
            while(head != null && count < l-1)
            {
                head = head.next;
                count++;
            }
            res[idx] = start;
            start = head.next;
            head.next = null;
            head = start;
            idx++;
        }
        return res;
    }
    public int length(ListNode head)
    {
        int res = 0;
        while(head != null)
        {
            res++;
            head = head.next;
        }
        return res;
    }
}