"""
Leetcode 2418. Sort the People
"""

class Solution:
    def sortPeople(self, names: list[str], heights: list[int]) -> list[str]:  
        return [name for _, name in sorted(zip(heights, names), reverse=True)]
        
if __name__ == "__main__":
    solution = Solution()
    print(solution.sortPeople(["Mary","John","Emma"], [180,165,170]))  # Output: ["Mary","Emma","John"]