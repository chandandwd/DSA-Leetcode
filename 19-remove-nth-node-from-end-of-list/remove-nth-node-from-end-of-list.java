class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int cnt = 0;
        ListNode temp = head;

        while (temp != null) {
            cnt++;
            temp = temp.next;
        }

        if (n == cnt) {
            return head.next;
        }

        temp = head;
        for (int i = 0; i < cnt - n - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;
    }
}