"""
Leetcode 1347. Minimum Number of Steps to Make Two Strings Anagram
"""

class Solution:
    def minSteps(self, s: str, t: str) -> int:
        count_s = [0] * 26
        count_t = [0] * 26

        for char_s, char_t in zip(s, t):
            count_s[ord(char_s) - ord('a')] += 1
            count_t[ord(char_t) - ord('a')] += 1

        steps = 0
        for i in range(26):
            if count_s[i] > count_t[i]:
                steps += count_s[i] - count_t[i]

        return steps

if __name__ == "__main__":
    solution = Solution()
    print(solution.minSteps("bab", "aba"))  # Output: 1