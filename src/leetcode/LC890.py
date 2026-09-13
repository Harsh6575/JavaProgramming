"""
Leetcode 890. Find and Replace Pattern
"""

from typing import List

class Solution:
    def findAndReplacePattern(self, words: List[str], pattern: str) -> List[str]:
        def matches(word: str) -> bool:
            if len(word) != len(pattern):
                return False

            char_map = {}
            used_chars = set()

            for w_char, p_char in zip(word, pattern):
                if p_char in char_map:
                    if char_map[p_char] != w_char:
                        return False
                else:
                    if w_char in used_chars:
                        return False
                    char_map[p_char] = w_char
                    used_chars.add(w_char)

            return True

        return [word for word in words if matches(word)]

if __name__ == "__main__":
    solution = Solution()
    print(solution.findAndReplacePattern(["abc","deq","mee","aqq","dkd","ccc"], "abb"))  # Output: ["mee","aqq"]