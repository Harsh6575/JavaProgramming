# Leetcode 899 : Orderly Queue

class Solution:
    def orderlyQueue(self, s: str, k: int) -> str:
        if k == 1:
            # Find the lexicographically smallest rotation
            min_rotation = s
            for _ in range(len(s)):
                s = s[1:] + s[0]
                if s < min_rotation:
                    min_rotation = s
            return min_rotation
        else:
            # If k > 1, we can sort the string
            return ''.join(sorted(s))

if __name__ == "__main__":
    solution = Solution()
    print(solution.orderlyQueue("cba", 1))  # Output: "acb"
    print(solution.orderlyQueue("baaca", 3))  # Output: "aaabc"