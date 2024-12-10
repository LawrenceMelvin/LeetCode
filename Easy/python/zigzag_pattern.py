zig = "PAYPALISHIRING"
# 3 - PAHNAPLSIIGYIR - PAHNAPLSIIGYIR
# 4 - PINALSIGYAHRPI - PINAASRGYPHIPI - j>1 PINALSIGYAHRPI
numRow = 4
dis = numRow+int(numRow/2)
count = numRow
for j in range(0,numRow):
    if j >1:
        count = count -j
    # print(count)
    for i in range(j,len(zig),dis):
        if j>0 and j<numRow and i != len(zig)-1 and count>0:
            print(count,j,i)
            print(zig[i],end="")
            mid = zig[i+(count)]
            print(mid,end="")
        # print(zig[i:i+dis])
        else:
            # print(i)
            print(zig[i],end="")
    
    