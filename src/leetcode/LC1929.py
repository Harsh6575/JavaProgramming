class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        return nums + nums

if __name__ == "__main__":
    solution = Solution()
    print(solution.getConcatenation([1, 2, 1]))  # Output: [1, 2, 1, 1, 2, 1]
    print(solution.getConcatenation([1, 3, 2, 1]))  # Output: [1, 3, 2, 1, 1, 3, 2, 1]