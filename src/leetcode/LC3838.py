"""
Leetcode 3838. Weighted Word Mapping
"""

from typing import List

class Solution:
    def mapWordWeights(self, words: List[str], weights: List[int]) -> str:
      result = ""
      for word in words:
          weight = sum(weights[ord(c) - ord('a')] for c in word)
          result += chr(ord('z') - (weight % 26))
      return result

if __name__ == "__main__":
    solution = Solution()
    print(solution.mapWordWeights(["abcd","def","xyz"], [5,3,12,14,1,2,3,2,10,6,6,9,7,8,7,10,8,9,6,9,9,8,3,7,7,2]))  # Output: "rij"