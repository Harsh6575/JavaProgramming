"""
Leetcode 3794. Reverse String Prefix
"""

class Solution:
    def reversePrefix(self, s: str, k: int) -> str:
        return s[:k][::-1] + s[k:]
    
if __name__ == "__main__":
    solution = Solution()
    print(solution.reversePrefix("abcd", 2))  # Output: "bacd"