"""
Leetcode 3100. Water Bottles II
"""

class Solution:
    def maxBottlesDrunk(self, numBottles: int, numExchange: int) -> int:
        total_bottles = numBottles
        empty_bottles = numBottles

        while empty_bottles >= numExchange:
            empty_bottles -= numExchange
            empty_bottles += 1

            total_bottles += 1
            numExchange += 1

        return total_bottles

if __name__ == "__main__":
    solution = Solution()
    print(solution.maxBottlesDrunk(13, 6))  # Output: 15
    print(solution.maxBottlesDrunk(10, 3))   # Output: 13