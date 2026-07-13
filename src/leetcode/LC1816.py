# Leetcode 1816: Truncate Sentence

class Solution:
    def truncateSentence(self, s: str, k: int) -> str:
        words = s.split()
        return ' '.join(words[:k])

if __name__ == "__main__":
    solution = Solution()
    print(solution.truncateSentence("Hello how are you Contestant", 4))  # Output: "Hello how are you"
    print(solution.truncateSentence("What is the solution to this problem", 4))  # Output: "What is the solution"