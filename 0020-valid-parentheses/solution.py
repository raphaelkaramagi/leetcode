from collections import deque

class Solution:
    def isValid(self, s: str) -> bool:
        if not s: return True
        
        bracket_map = {"{": "}", "(": ")", "[": "]"}
        stack = deque()

        for char in s:
            if char in bracket_map:
                stack.append(bracket_map[char])
            else:
                if not stack or char != stack.pop():
                    return False

        return not stack
