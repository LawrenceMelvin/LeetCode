def merge_the_tools(string,k):
    t = []
    for i in range(0,len(string),k):
        #print(string[i])
        t.append(string[i:i+k])
        s = string[i:i+k]
        # for r in range(len(s)):
        #     if s[r] in [h for h in s]:
        [h for h in s]


    for j in t:
        print(j)
        
        


if __name__ == '__main__':
    string, k = input(),int(input())
    merge_the_tools(string,k)