1class Solution {
2    public void nextPermutation(int[] nums) {
3        int i = nums.length - 2;
4        while (i >= 0 && nums[i] >= nums[i + 1]) {
5            i--;
6        }
7
8        if (i >= 0) {
9            int j = nums.length - 1;
10            while (nums[j] <= nums[i]) {
11                j--;
12            }
13            swap(nums, i, j);
14        }
15        reverse(nums, i + 1);
16    }
17
18    private void swap(int[] nums, int i, int j) {
19        int temp = nums[i];
20        nums[i] = nums[j];
21        nums[j] = temp;
22    }
23
24    private void reverse(int[] nums, int start) {
25        int end = nums.length - 1;
26        while (start < end) {
27            swap(nums, start, end);
28            start++;
29            end--;
30        }
31    }
32}
33