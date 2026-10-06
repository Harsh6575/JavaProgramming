"""
Leetcode 3731. Find Missing Elements
"""

from typing import List

class Solution:
    def findMissingElements(self, nums: List[int]) -> List[int]:
        return [i for i in range(min(nums), max(nums) + 1) if i not in nums]

if __name__ == "__main__":
    solution = Solution()
    print(solution.findMissingElements([1, 2, 4, 5]))  # Output: [3]
    print(solution.findMissingElements([7, 8, 9, 6])) # Output: []