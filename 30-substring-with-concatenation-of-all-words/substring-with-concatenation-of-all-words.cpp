#include <vector>
#include <string>
#include <unordered_map>

using namespace std;

class Solution {
public:
    vector<int> findSubstring(string s, vector<string>& words) {
        vector<int> result;
        int n = s.length(), m = words.size(), len = words[0].length();
        if (n < m * len) return result;

        unordered_map<string, int> wordCount;
        for (const string& w : words) wordCount[w]++;

        for (int i = 0; i < len; i++) {
            unordered_map<string, int> window;
            int left = i, count = 0;
            for (int j = i; j <= n - len; j += len) {
                string word = s.substr(j, len);
                if (wordCount.count(word)) {
                    window[word]++;
                    count++;
                    while (window[word] > wordCount[word]) {
                        window[s.substr(left, len)]--;
                        count--;
                        left += len;
                    }
                    if (count == m) result.push_back(left);
                } else {
                    window.clear();
                    count = 0;
                    left = j + len;
                }
            }
        }
        return result;
    }
};
