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
        if (head == null || head.next == null) {
            return head;
        }
        else {
            ListNode temp = head;
            head = reverseList(temp.next);
            ListNode temp2 = head;
            while(temp2.next != null) {
                temp2 = temp2.next;
            }
            temp2.next = temp;
            temp.next = null;
            return head;
        }
        
    }
}
