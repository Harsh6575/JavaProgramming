"""
Leetcode 3190. Find Minimum Operations to Make All Elements Divisible by Three
"""

from typing import List

class Solution:
    def minimumOperations(self, nums: List[int]) -> int:
        operations = 0
        for i in range(len(nums)):
            if nums[i] % 3 != 0:
                operations += 1
        return operations

if __name__ == "__main__":
    solution = Solution()
    nums = [1, 2, 3, 4]
    result = solution.minimumOperations(nums)
    print(result)  # Output: 3