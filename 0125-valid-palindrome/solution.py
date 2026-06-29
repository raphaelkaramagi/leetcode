class Solution:
    def isPalindrome(self, s: str) -> bool:
        alnumLow = "".join([char for char in s.lower() if char.isalnum()])
        reverse = alnumLow[::-1]
        if alnumLow == reverse:
            return True
        return False

