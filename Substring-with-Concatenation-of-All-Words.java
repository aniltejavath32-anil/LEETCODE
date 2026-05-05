1import java.util.*;
2
3class Solution {
4    public List<Integer> findSubstring(String s, String[] words) {
5        List<Integer> result = new ArrayList<>();
6        if (s == null || words == null || words.length == 0) return result;
7
8        int wordLen = words[0].length();
9        int wordCount = words.length;
10        int totalLen = wordLen * wordCount;
11        
12        Map<String, Integer> wordMap = new HashMap<>();
13        for (String word : words) {
14            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
15        }
16
17        for (int i = 0; i <= s.length() - totalLen; i++) {
18            String sub = s.substring(i, i + totalLen);
19            if (isValid(sub, wordMap, wordLen)) {
20                result.add(i);
21            }
22        }
23
24        return result;
25    }
26
27    private boolean isValid(String sub, Map<String, Integer> wordMap, int wordLen) {
28        Map<String, Integer> seen = new HashMap<>();
29        for (int i = 0; i < sub.length(); i += wordLen) {
30            String word = sub.substring(i, i + wordLen);
31            seen.put(word, seen.getOrDefault(word, 0) + 1);
32            if (seen.get(word) > wordMap.getOrDefault(word, 0)) {
33                return false;
34            }
35        }
36        return true;
37    }
38}
39