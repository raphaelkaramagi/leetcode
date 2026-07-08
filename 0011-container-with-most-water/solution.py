class Solution:
    def maxArea(self, height: List[int]) -> int:
        # while leftIndex < rightIndex
        # area = (right - left) * min(leftHeight,rightHeight)
        # maxArea = max(area, maxArea)

        leftIndex = 0
        rightIndex = len(height)-1
        output = 0

        while leftIndex < rightIndex:
            area = (rightIndex - leftIndex) * min(height[leftIndex],height[rightIndex])
            output = max(output, area)
            if(height[leftIndex] < height[rightIndex]):
                leftIndex+=1
            else:
                rightIndex-=1

        return output 

