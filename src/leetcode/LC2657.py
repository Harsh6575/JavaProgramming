"""
Leetcode 2657. Find the Prefix Common Array of Two Arrays
"""

from typing import List

class Solution:
    def findThePrefixCommonArray(self, A: List[int], B: List[int]) -> List[int]:
        prefix_common = []
        seen = set()
        common_count = 0

        for a, b in zip(A, B):
            if a not in seen:
                seen.add(a)
            else:
                common_count += 1
            if b not in seen:
                seen.add(b)
            else:
                common_count += 1
            prefix_common.append(common_count)
        return prefix_common

if __name__ == "__main__":
    solution = Solution()
    print(solution.findThePrefixCommonArray([1, 3, 2, 4], [3, 1, 2, 4]))  # Output: [0, 2, 3, 4]