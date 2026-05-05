1class Solution {
2    public boolean isPalindrome(int x) {
3        if (x < 0 || (x % 10 == 0 && x != 0)) {
4            return false;
5        }
6
7        int revertedNumber = 0;
8        while (x > revertedNumber) {
9            revertedNumber = revertedNumber * 10 + x % 10;
10            x /= 10;
11        }
12
13        return x == revertedNumber || x == revertedNumber / 10;
14    }
15}
16
17