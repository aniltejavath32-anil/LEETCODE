1class Solution {
2    public ListNode mergeKLists(ListNode[] lists) {
3        if (lists == null || lists.length == 0) return null;
4
5        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
6
7        for (ListNode list : lists) {
8            if (list != null) {
9                pq.add(list);
10            }
11        }
12
13        ListNode dummy = new ListNode(0);
14        ListNode curr = dummy;
15
16        while (!pq.isEmpty()) {
17            ListNode smallest = pq.poll();
18            curr.next = smallest;
19            curr = curr.next;
20
21            if (smallest.next != null) {
22                pq.add(smallest.next);
23            }
24        }
25
26        return dummy.next;
27    }
28}
29