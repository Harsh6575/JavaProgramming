"""
Leetcode 3925. Concatenate Array With Reverse
"""

class Solution:
    def concatWithReverse(self, nums: list[int]) -> list[int]:
        return nums + nums[::-1]

if __name__ == "__main__":
    solution = Solution()
    nums = [1, 2, 3]
    result = solution.concatWithReverse(nums)
    print(result)  # Output: [1, 2, 3, 3, 2, 1]