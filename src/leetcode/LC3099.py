"""
Leetcode 3099. Harshad Number
"""

class Solution:
    def sumOfTheDigitsOfHarshadNumber(self, x: int) -> int:
        return sum(int(d) for d in str(x)) if x % sum(int(d) for d in str(x)) == 0 else -1
        
        
if __name__ == "__main__":
    solution = Solution()
    print(solution.sumOfTheDigitsOfHarshadNumber(18))  # Output: 9
    print(solution.sumOfTheDigitsOfHarshadNumber(23))  # Output: -1