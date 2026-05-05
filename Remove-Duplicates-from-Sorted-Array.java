1class Solution {
2    public int removeDuplicates(int[] nums) {
3        if (nums.length == 0) return 0;
4        
5        int k = 1; 
6        
7        for (int i = 1; i < nums.length; i++) {
8            if (nums[i] != nums[i - 1]) {
9                nums[k] = nums[i];
10                k++;
11            }
12        }
13        
14        return k;
15    }
16}
17