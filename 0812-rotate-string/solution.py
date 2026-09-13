class Solution:
    def rotateString(self, s: str, goal: str) -> bool:
        # Iterate i until letter matches first letter of goal
        # In that loop, get left pointer at i and right at index 0, go through i until None, checking if it matches goal as you iterate, then use right pointer
        # If no match at any point, continue the main i loop checking for letters
        if len(s) != len(goal):
            return False

        for i in range(len(s)):
            if s[i] != goal[0]:
                continue
            else:
                pointer = i
                goalPointer = 0

                while(goalPointer<=len(goal)-1):
                    if(pointer<=len(s)-1):
                        if(s[pointer]==goal[goalPointer]): 
                            goalPointer+=1
                            pointer+=1
                        else:
                            break
                    else:
                        pointer = 0
                        if(s[pointer]==goal[goalPointer]):
                            goalPointer+=1
                            pointer+=1
                        else:
                            break

                if goalPointer > len(goal)-1:
                    return True
                
        return False
