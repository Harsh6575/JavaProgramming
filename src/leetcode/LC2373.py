"""
Leetcode 2373. Largest Local Values in a Matrix
"""

from typing import List

class Solution:
    def largestLocal(self, grid: List[List[int]]) -> List[List[int]]:
        n = len(grid)
        res = []
        for i in range(n - 2):
            row = []
            for j in range(n - 2):
                max_val = max(
                    grid[i][j], grid[i][j+1], grid[i][j+2],
                    grid[i+1][j], grid[i+1][j+1], grid[i+1][j+2],
                    grid[i+2][j], grid[i+2][j+1], grid[i+2][j+2]
                )
                row.append(max_val)
            res.append(row)
        return res
    
if __name__ == "__main__":
    solution = Solution()
    print(solution.largestLocal([[9,9,8,1],[5,6,2,6],[8,2,6,4],[6,2,2,2]]))  # Output: [[9,9],[8,6]]