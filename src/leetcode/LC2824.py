# Leetcode 2824: Count Pairs Whose Sum is Less than Target
from ast import List

class Solution:
    def countPairs(self, nums: List[int], target: int) -> int:
        nums.sort()

        left = 0
        right = len(nums) - 1

        count = 0

        while left < right:
            if nums[left] + nums[right] < target:
                count += right - left
                left += 1
            else:
                right -= 1
        return count

if __name__ == "__main__":
    solution = Solution()
    print(solution.countPairs([-1, 1, 2, 3, 1], 2))  # Output: 3
    print(solution.countPairs([-6, 2, 5, -2, -7, -1, 3], -2))  # Output: 10