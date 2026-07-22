from collections import Counter

class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        # If len(s1) > len(s2) false
        # Make s1 into a counter object/dict (stays the same)
        # Iterate sliding window over s2 (left pointer, right pointer starts at length of s1) 
        # Window valid if the counter of it and s1 are the same
        # For initial window, make a new counter object of those first chars, and as window slides, +=1 for new char on right and -=1 for char leaving on the left, and this window is valid if its equal to the s1 counter 
        # If window becomes invalid (counters not the same), increase left and right (window moves over) and update the counter
        # If window stays valid whole way with pointer, true, if  broken before that, left and right +=1

        ls1 = len(s1)
        ls2 = len(s2)
        if(ls1 > ls2):
            return False

        left = 0
        right = ls1-1
        s1Counts = Counter(s1)
        windowCounts = Counter(s2[0:ls1])

        while(right<ls2):
            if windowCounts == s1Counts:
                return True
            elif right!=ls2-1:
                windowCounts[s2[left]]-=1
                if windowCounts[s2[left]] == 0:
                    del windowCounts[s2[left]]
                left+=1
                right+=1
                windowCounts[s2[right]]+=1
            else:
                break

        return False


