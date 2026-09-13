class Solution:
    def simplifyPath(self, path: str) -> str:
        #Optimal solution using .split() for processing by tokens
        stack = []
        
        for part in path.split('/'):
            if part == '..':
                if stack:
                    stack.pop()
            elif part and part != '.':
                stack.append(part)
        # Uses .join to each token has a '/' with no trailing /. Adds a / at the front
        return '/' + '/'.join(stack)

