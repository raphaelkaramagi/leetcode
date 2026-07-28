class Solution:
    def isValid(self, s: str) -> bool:
        mapping = {'(': ')', '{': '}', '[': ']'}
        stack = []

        for char in s:
            if char in mapping:
                stack.append(mapping[char])
            else:
                if not stack or stack.pop() != char:
                    return False
                    
        return not stack
