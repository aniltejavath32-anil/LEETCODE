1import java.util.HashMap;
2
3class Solution {
4    public int lengthOfLongestSubstring(String s) {
5        int n = s.length();
6        int maxLength = 0;
7        HashMap<Character, Integer> map = new HashMap<>();
8        
9        for (int right = 0, left = 0; right < n; right++) {
10            char currentChar = s.charAt(right);
11            
12            if (map.containsKey(currentChar)) {
13                left = Math.max(map.get(currentChar) + 1, left);
14            }
15            
16            map.put(currentChar, right);
17            maxLength = Math.max(maxLength, right - left + 1);
18        }
19        
20        return maxLength;
21    }
22}
23