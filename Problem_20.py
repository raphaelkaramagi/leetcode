from collections import deque

class Solution:
    def isValid(self, s: str) -> bool:
        open = ['(','{','[']
        closed = [')','}',']']

        # FIFO Queue for reverse compelments (ie open brackets)
        reverseComplements = deque()
        # LIFO Stack for normal complements to open brackets (closed brackets)
        complements = deque()
        chars = list(s)
        
        for i in range(len(chars)):
            char = chars[i]
            if(i==0 and char in closed):
                return False
            if((len(complements) != 0) and (char != complements[-1]) and (char in closed)):
                return False
            if(char in open):
                complements.append(closed[open.index(char)])
            
            if(char in closed):
                reverseComplements.append(open[closed.index(char)])
                if(len(complements) > 0):
                    complements.pop()
                    reverseComplements.popleft()
            
        if(len(complements) > 0 or len(reverseComplements) >0):
            return False

        return True


if __name__ == "__main__":
    mySolution = Solution()
    print(mySolution.isValid('[])'))


    """
IDEAL SOLUTION

def isValid(self, s: str) -> bool:
        stack = []
        # Use a dictionary (hashMap) to map opening brackets to their corresponding closing brackets
        # Or, map closing brackets to their opening counterparts (as done here, more convenient for pop check)
        mapping = {")": "(", "}": "{", "]": "["}

        for char in s:
            if char in mapping.values():  # It's an opening bracket
                stack.append(char)
            elif char in mapping:  # It's a closing bracket
                # If the stack is empty, or the top of the stack doesn't match
                # the expected opening bracket for the current closing bracket
                if not stack or mapping[char] != stack.pop():
                    return False
            # else:
            #     # For problem 20, input 's' consists only of '()[]{}'.
            #     # If problem allowed other chars, we would 'continue' here or return False for invalid chars.
            #     pass 

        # If the stack is empty, all opening brackets had a matching closing bracket
        return not stack

    """



    