"""
Leetcode 2798. Number of Employees Who Met the Target
"""

from typing import List

class Solution:
    def numberOfEmployeesWhoMetTarget(self, hours: List[int], target: int) -> int:
        return sum(1 for h in hours if h >= target)
    
if __name__ == "__main__":
    solution = Solution()
    print(solution.numberOfEmployeesWhoMetTarget([0, 1, 2, 3, 4], 2))  # Output: 3