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
    public ListNode rotateRight(ListNode head, int k) {
        int cnt = 0;
        if(head == null || head.next == null || k == 0) return head ;
        ListNode t = head;
        while(t != null){
            t = t.next;
            cnt++;        }
        k = k%cnt;
        if(k==0) return head;
        for(int i = 0; i<k; i++){
            ListNode curr = head;
            ListNode temp = curr.next;

            while(temp.next != null){
                temp =  temp.next;
                curr = curr.next;
            }
            temp.next = head;
            head = temp;
            curr.next = null;
        }
        return head;
    }
}