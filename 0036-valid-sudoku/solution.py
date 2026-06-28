from collections import defaultdict

class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        rows = defaultdict(set)
        cols = defaultdict(set)
        squares = defaultdict(set)
        
        for r in range(9):
            for c in range(9):
                num = board[r][c]
                
                if num == ".":
                    continue
                    
                square_key = (r // 3, c // 3)
                
                if num in rows[r] or num in cols[c] or num in squares[square_key]:
                    return False
                    
                rows[r].add(num)
                cols[c].add(num)
                squares[square_key].add(num)
                
        return True
