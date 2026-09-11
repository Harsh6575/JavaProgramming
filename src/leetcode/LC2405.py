"""
Leetcode 2405. Optimal Partition of String
"""

class Solution:
    def partitionString(self, s: str) -> int:
        seen = set()
        partitions = 0

        for char in s:
            if char in seen:
                partitions += 1
                seen.clear()
            seen.add(char)

        return partitions + 1
    
if __name__ == "__main__":
    solution = Solution()
    print(solution.partitionString("abacaba"))  # Output: 4