import math
from typing import List

class Solution:

    def combinator(self, n: int, k: int) -> int:
        return math.comb(n,k)

    def generate(self, numRows: int) -> List[List[int]]:
        output = []
        
        for row in range(numRows):
            # Inner Loop can be repalced by:
            """ subOutput = [self.combinator(row, k) for k in range(row + 1)]
                    output.append(subOutput)
            """

            subOutput = []
            k=0
            while(len(subOutput) <= row):
                subOutput.append(self.combinator(row, k))
                k+=1
            output.append(subOutput)

        return output
        
solution_instance = Solution()
print(solution_instance.generate(5))    