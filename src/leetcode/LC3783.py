"""
Leetcode 3783. Mirror Distance
"""

class Solution:
    def mirrorDistance(self, n: int) -> int:
        return abs(n - int(str(n)[::-1]))

if __name__ == "__main__":
    solution = Solution()
    print(solution.mirrorDistance(25))  # Output: 27