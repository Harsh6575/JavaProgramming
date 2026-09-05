"""
Leetcode 3668. Restore Finishing Order
"""

from typing import List

class Solution:
    def recoverOrder(self, order: List[int], friends: List[int]) -> List[int]:
        friend_set = set(friends)
        result = []
        for num in order:
            if num in friend_set:
                result.append(num)
        return result
        
if __name__ == "__main__":
    solution = Solution()
    order = [3,1,2,5,4]
    friends = [1,3,4]
    result = solution.recoverOrder(order, friends)
    print(result)  # Output: [3, 1, 4]