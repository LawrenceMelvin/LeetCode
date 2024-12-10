def merge_the_tools(string,k):
    result = []
    p=''
    for i in range(len(string)):
        if string[i] not in p:
            p+=string[i]
        if (i+1)%k==0:
            result.append(p)
            p=''
    print(result)

        
        


if __name__ == '__main__':
    string, k = input(),int(input())
    merge_the_tools(string,k)