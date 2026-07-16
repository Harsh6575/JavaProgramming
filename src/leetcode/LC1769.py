# Leetcode 1769: Minimum Number of Operations to Move All Balls to Each Box

class Solution:
    def minOperations(self, boxes: str) -> list[int]:
        n = len(boxes)
        result = [0] * n
        for i in range(n):
            for j in range(n):
                if boxes[j] == '1':
                    result[i] += abs(i - j)
        return result

if __name__ == "__main__":
    solution = Solution()
    print(solution.minOperations("110"))  # Output: [1, 1, 3]
    print(solution.minOperations("001011"))  # Output: [11, 8, 5, 4, 3, 4]