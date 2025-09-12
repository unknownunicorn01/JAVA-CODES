class Solution(object):
    def solveSudoku(self, board):
        """
        :type board: List[List[str]]
        :rtype: None Do not return anything, modify board in-place instead.
        """
        l1=[]
        l2=[]
        l3=[]
        l4=[]
        l5=[]
        l6=[]
        l7=[]
        l8=[]
        l9=[]
        idx1=int()
        idx2=int()
        isVal=True
        board=[l1,l2,l3,l4,l5,l6,l7,l8,l9]
        for i in range(8):
            for j in range(8):
                if(board[i][j]=="."):
                    if(k != board[j][i] and k not in board[i]):
                        k=j+1
                        idx1=i
                        idx2=j
                        isVal=False
                    else:
                        isVal=True
                        break
            if(isVal==False):
                board[idx1][idx2]=k
        return board[idx1][idx2]
                



a=Solution()
print(a.solveSudoku(["5","3",".",".","7",".",".",".","."],["6",".",".","1","9","5",".",".","."],[".","9","8",".",".",".",".","6","."],["8",".",".",".","6",".",".",".","3"],["4",".",".","8",".","3",".",".","1"],["7",".",".",".","2",".",".",".","6"],[".","6",".",".",".",".","2","8","."],[".",".",".","4","1","9",".",".","5"],[".",".",".",".","8",".",".","7","9"]))