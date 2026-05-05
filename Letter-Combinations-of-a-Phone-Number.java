1import java.util.*;
2
3class Solution {
4    private static final String[] KEYPAD = {
5        "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
6    };
7
8    public List<String> letterCombinations(String digits) {
9        List<String> result = new ArrayList<>();
10        if (digits == null || digits.length() == 0) {
11            return result;
12        }
13        backtrack(result, digits, new StringBuilder(), 0);
14        return result;
15    }
16
17    private void backtrack(List<String> result, String digits, StringBuilder current, int index) {
18        if (index == digits.length()) {
19            result.add(current.toString());
20            return;
21        }
22
23        String letters = KEYPAD[digits.charAt(index) - '0'];
24        for (char c : letters.toCharArray()) {
25            current.append(c);
26            backtrack(result, digits, current, index + 1);
27            current.deleteCharAt(current.length() - 1);
28        }
29    }
30}
31