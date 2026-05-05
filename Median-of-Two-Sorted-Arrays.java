1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        if (nums1.length > nums2.length) {
4            return findMedianSortedArrays(nums2, nums1);
5        }
6
7        int m = nums1.length;
8        int n = nums2.length;
9        int left = 0, right = m;
10
11        while (left <= right) {
12            int partitionX = (left + right) / 2;
13            int partitionY = (m + n + 1) / 2 - partitionX;
14
15            int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
16            int minRightX = (partitionX == m) ? Integer.MAX_VALUE : nums1[partitionX];
17
18            int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
19            int minRightY = (partitionY == n) ? Integer.MAX_VALUE : nums2[partitionY];
20
21            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
22                if ((m + n) % 2 == 0) {
23                    return ((double)Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2;
24                } else {
25                    return (double)Math.max(maxLeftX, maxLeftY);
26                }
27            } else if (maxLeftX > minRightY) {
28                right = partitionX - 1;
29            } else {
30                left = partitionX + 1;
31            }
32        }
33        return 0.0;
34    }
35}
36