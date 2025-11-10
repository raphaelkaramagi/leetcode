from collections import deque


class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        mapping = {")": "(", "}": "{", "]": "["}

        for char in s:
            if char in mapping.values():  # It's an opening bracket
                stack.append(char)  # append closing bracket (complement) to stack
            elif char in mapping:  # It's a closing bracket
                # if stack is empty, or the top of the stack doesn't match
                if not stack or mapping[char] != stack.pop():
                    return False

        return not stack

