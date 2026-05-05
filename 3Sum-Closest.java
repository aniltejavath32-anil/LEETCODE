1import java.util.Arrays;
2
3class Solution {
4    public int threeSumClosest(int[] nums, int target) {
5        Arrays.sort(nums);
6        int closestSum = nums[0] + nums[1] + nums[2];
7        
8        for (int i = 0; i < nums.length - 2; i++) {
9            int left = i + 1;
10            int right = nums.length - 1;
11            
12            while (left < right) {
13                int currentSum = nums[i] + nums[left] + nums[right];
14                
15                if (Math.abs(target - currentSum) < Math.abs(target - closestSum)) {
16                    closestSum = currentSum;
17                }
18                
19                if (currentSum < target) {
20                    left++;
21                } else if (currentSum > target) {
22                    right--;
23                } else {
24                    return currentSum;
25                }
26            }
27        }
28        return closestSum;
29    }
30}
31