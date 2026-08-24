from collections import defaultdict

class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        # Thinking about for each car, how much time they need to reach the target: time = (target-position)/speed
        # (e.g. example 1: car 0 = (12-10)/2 = 1sec, car 1 = (12-8)/4 = 1sec, car 2 = (12-0)/1 = 12sec, car 3 = (12-5)/1=7sec, car 4 = (12-3)/3 = 3 sec)
        # A car meets another car (hence joins a fleet) if its time needed <= that other car (AKA other time >= its time)
        # Fleet is formed when a car from further back has time <= car ahead
        # Dict of distance:time - [10:1,8:1,0:12,5:7,3:3] 
        # Sort in descending order of keys - [10:1, 8:1, 5:7, 3:3, 0:12]
        # Iterate over the values
        #   For each time, if stack[-1] time >= current time: continue (skip adding to stack)
        #       else add the time to stack
        # Output the size of the stack

        mappings = defaultdict(int)
        for i in range(len(position)):
            mappings[position[i]] = (target-position[i])/speed[i]
        reverse_distance = sorted_dict = dict(sorted(mappings.items(), key=lambda x: x[0], reverse=True))

        stack = []
        for time in reverse_distance.values():
            if stack:
                if stack[-1] >= time:
                    continue
                else:
                    stack.append(time)  
            else:
                stack.append(time)
            
        return len(stack)
        

        


        
