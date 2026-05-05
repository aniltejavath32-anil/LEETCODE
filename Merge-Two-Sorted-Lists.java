1class Solution {
2    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
3        ListNode dummy = new ListNode(0);
4        ListNode current = dummy;
5
6        while (list1 != null && list2 != null) {
7            if (list1.val <= list2.val) {
8                current.next = list1;
9                list1 = list1.next;
10            } else {
11                current.next = list2;
12                list2 = list2.next;
13            }
14            current = current.next;
15        }
16
17        if (list1 != null) {
18            current.next = list1;
19        } else {
20            current.next = list2;
21        }
22
23        return dummy.next;
24    }
25}
26