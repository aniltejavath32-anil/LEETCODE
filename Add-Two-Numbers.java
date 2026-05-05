1
2class Solution {
3    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
4        ListNode dummy = new ListNode(0);
5        ListNode curr = dummy;
6        int carry = 0;
7
8        while (l1 != null || l2 != null || carry != 0) {
9            int x = (l1 != null) ? l1.val : 0;
10            int y = (l2 != null) ? l2.val : 0;
11            int sum = carry + x + y;
12            carry = sum / 10;
13            curr.next = new ListNode(sum % 10);
14            curr = curr.next;
15            if (l1 != null) l1 = l1.next;
16            if (l2 != null) l2 = l2.next;
17        }
18
19        return dummy.next;
20    }
21}
22