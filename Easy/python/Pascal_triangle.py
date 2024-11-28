from typing import List

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        result = []
        for i in range(1,numRows+1):
            p=[]
            for j in range(i):
                if j>0 and j<i-1:
                    p.append(result[i-2][j-1]+result[i-2][j])
                else:
                    p.append(1)
            result.append(p)
        return result
    
    def main(self):
        numRows = int(input("Enter the number = "))
        self.generate(numRows)