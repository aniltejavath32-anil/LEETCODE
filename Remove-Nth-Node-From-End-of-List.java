1class Solution {
2    public ListNode removeNthFromEnd(ListNode head, int n) {
3        ListNode dummy = new ListNode(0);
4        dummy.next = head;
5        ListNode fast = dummy;
6        ListNode slow = dummy;
7
8        // Move fast so there is a gap of n nodes between fast and slow
9        for (int i = 0; i <= n; i++) {
10            fast = fast.next;
11        }
12
13        // Move both until fast reaches the end
14        while (fast != null) {
15            fast = fast.next;
16            slow = slow.next;
17        }
18
19        // Skip the nth node from the end
20        slow.next = slow.next.next;
21
22        return dummy.next;
23    }
24}
25