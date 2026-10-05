"""
Leetcode 1678. Goal Parser Interpretation
"""

class Solution:
    def interpret(self, command: str) -> str:
        result = ""
        i = 0
        while i < len(command):
            if command[i] == 'G':
                result += 'G'
                i += 1
            elif command[i:i+2] == '()':
                result += 'o'
                i += 2
            elif command[i:i+4] == '(al)':
                result += 'al'
                i += 4
        return result
        

if __name__ == "__main__":
    solution = Solution()
    print(solution.interpret("G()(al)"))  # Output: "Goal"
    print(solution.interpret("G()()()()(al)"))  # Output: "Gooooal"