"""
Leetcode 2894. Divisible and Non-divisible Sums Difference
"""

class Solution:
    def differenceOfSums(self, n: int, m: int) -> int:
        ans = 0
        for i in range(1,n+1):
            if i%m != 0:
                ans += i
            else:
                ans -= i
        return ans
        
if __name__ == "__main__":
    solution = Solution()
    print(solution.differenceOfSums(10,3))  # Output: 19
    print(solution.differenceOfSums(5,6)) # Output: 15