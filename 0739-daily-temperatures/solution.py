class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        # Stack containing the indexes of the temperatures (so its easy to substract to find distance between temps, and find where in output to place distance)
        # Iterate through temperatures, append to stack the INDEX of a temp IF it is first or is LESS than the current top of the stack (stack peek)
        # IF temp is greater than temp at top of stack, pop top, find distance, and put the distance at the index you just popped
        # ELSE add the current index to stack 
        # When end is reached, if elements still in stack, assign a 0 at each of those indeces

        stack = []
        result = [0] * len(temperatures)

        for index, temp in enumerate(temperatures):
            while stack:
                if temp > temperatures[stack[-1]]:
                    top = stack.pop()
                    result[top] = (index-top)
                else:
                    break
            stack.append(index)

        return result

