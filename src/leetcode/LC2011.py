"""
Leetcode 2011. Final Value of Variable After Performing Operations
"""

from typing import List

class Solution:
    def finalValueAfterOperations(self, operations: list[str]) -> int:
        x = 0
        for operation in operations:
            if operation == "++X" or operation == "X++":
                x += 1
            else:
                x -= 1
        return x
        
if __name__ == "__main__":
    solution = Solution()
    print(solution.finalValueAfterOperations(["--X", "X++", "X++"]))  # Output: 1
    print(solution.finalValueAfterOperations(["++X", "++X", "X++"]))  # Output: 3