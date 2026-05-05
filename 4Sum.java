1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> fourSum(int[] nums, int target) {
5        List<List<Integer>> result = new ArrayList<>();
6        if (nums == null || nums.length < 4) return result;
7
8        Arrays.sort(nums);
9        int n = nums.length;
10
11        for (int i = 0; i < n - 3; i++) {
12            if (i > 0 && nums[i] == nums[i - 1]) continue;
13            
14            for (int j = i + 1; j < n - 2; j++) {
15                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
16
17                int left = j + 1;
18                int right = n - 1;
19
20                while (left < right) {
21                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
22
23                    if (sum == target) {
24                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
25                        while (left < right && nums[left] == nums[left + 1]) left++;
26                        while (left < right && nums[right] == nums[right - 1]) right--;
27                        left++;
28                        right--;
29                    } else if (sum < target) {
30                        left++;
31                    } else {
32                        right--;
33                    }
34                }
35            }
36        }
37        return result;
38    }
39}
40