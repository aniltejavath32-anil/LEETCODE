1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        int[] result = {-1, -1};
4        result[0] = findBound(nums, target, true);
5        result[1] = findBound(nums, target, false);
6        return result;
7    }
8
9    private int findBound(int[] nums, int target, boolean isFirst) {
10        int left = 0, right = nums.length - 1;
11        int bound = -1;
12
13        while (left <= right) {
14            int mid = left + (right - left) / 2;
15            if (nums[mid] == target) {
16                bound = mid;
17                if (isFirst) {
18                    right = mid - 1;
19                } else {
20                    left = mid + 1;
21                }
22            } else if (nums[mid] < target) {
23                left = mid + 1;
24            } else {
25                right = mid - 1;
26            }
27        }
28        return bound;
29    }
30}
31
32