from collections import deque
import operator

class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        # Iterate over nums, and add each element to a stack if not a stack
        # If current element is an operator op = (+,/,*,-) pop the top 2 stack elements to cur = []
        # Do cur[1] op cur[0] and push the result to top of the stack
        # Continue iterating until a new operator is found
        # Return the final element in the stack 

        stack = deque()
        operators = ['+','-','*','/']
        ops = {
        "+": operator.add,
        "-": operator.sub,
        "*": operator.mul,
        "/": operator.truediv
    }

        for item in tokens:
            if item in operators:
                temp = []
                temp.append(stack.pop())
                temp.append(stack.pop())
                stack.append(ops[item](int(temp[1]),int(temp[0])))
            else:
                stack.append(item)

        return int(stack.pop())


