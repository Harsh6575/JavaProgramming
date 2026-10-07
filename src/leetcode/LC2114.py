"""
Leetcode 2373. Largest Local Values in a Matrix
"""

from typing import List

class Solution:
    def mostWordsFound(self, sentences: list[str]) -> int:
        max_words = 0
        for sentence in sentences:
            word_count = len(sentence.split())
            max_words = max(max_words, word_count)
        return max_words
        
if __name__ == "__main__":
    solution = Solution()
    print(solution.mostWordsFound(["alice and bob love leetcode", "i think so too", "this is great"]))  # Output: 6