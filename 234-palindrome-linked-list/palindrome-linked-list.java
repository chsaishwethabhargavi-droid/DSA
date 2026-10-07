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
    public boolean isPalindrome(ListNode head) {
        ListNode i =head;
        ListNode j = head;
        while(j!=null&&j.next!=null){
            i=i.next;
            j = j.next.next;
        }
         ListNode prev = null;

        while (i != null) {
            ListNode next = i.next;
            i.next = prev;
            prev = i;
            i = next;
        }
        ListNode z = head;
        ListNode x = prev;
        while(x!=null){
            if(z.val!=x.val){
                return false;
            }
            x=x.next;
            z=z.next;
        }
        return true;
    }
}