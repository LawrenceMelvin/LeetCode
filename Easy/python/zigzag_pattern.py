zig = "PAYPALISHIRING"
numRow = 4
dis = numRow+int(numRow/2)
t=[]
for j in range(0,numRow):
    for i in range(j,len(zig),dis):
        # print(zig[i:i+dis])
        print(zig[i],end="")
    