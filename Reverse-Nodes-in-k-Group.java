1
2class Solution {
3    public ListNode reverseKGroup(ListNode head, int k) {
4        // 1. Check if there are at least k nodes left
5        ListNode curr = head;
6        int count = 0;
7        while (curr != null && count < k) {
8            curr = curr.next;
9            count++;
10        }
11
12        // If we have k nodes, reverse them
13        if (count == k) {
14            // Reverse the first k nodes
15            ListNode prev = null;
16            ListNode next = null;
17            curr = head;
18            for (int i = 0; i < k; i++) {
19                next = curr.next;
20                curr.next = prev;
21                prev = curr;
22                curr = next;
23            }
24
25            // 2. Recursively call for the rest of the list
26            // After reversal, 'head' is the end of this group
27            if (next != null) {
28                head.next = reverseKGroup(next, k);
29            }
30
31            // 'prev' is the new head of this reversed group
32            return prev;
33        }
34
35        // If less than k nodes remain, leave them as is
36        return head;
37    }
38}
39