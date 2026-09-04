"""
Leetcode 1470. Shuffle the Array
"""

from typing import List

class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        result = []
        for i in range(n):
            result.append(nums[i])
            result.append(nums[i + n])
        return result
        
if __name__ == "__main__":
    solution = Solution()
    nums = [2, 5, 1, 3, 4, 7]
    result = solution.shuffle(nums, 3)
    print(result)  # Output: [2, 3, 5, 4, 1, 7]