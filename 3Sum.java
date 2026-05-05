1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> threeSum(int[] nums) {
5        List<List<Integer>> res = new ArrayList<>();
6        Arrays.sort(nums);
7
8        for (int i = 0; i < nums.length - 2; i++) {
9            if (i > 0 && nums[i] == nums[i - 1]) continue;
10
11            int left = i + 1;
12            int right = nums.length - 1;
13
14            while (left < right) {
15                int sum = nums[i] + nums[left] + nums[right];
16                
17                if (sum == 0) {
18                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
19                    while (left < right && nums[left] == nums[left + 1]) left++;
20                    while (left < right && nums[right] == nums[right - 1]) right--;
21                    left++;
22                    right--;
23                } else if (sum < 0) {
24                    left++;
25                } else {
26                    right--;
27                }
28            }
29        }
30        return res;
31    }
32}
33