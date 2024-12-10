def longest_palindrome(s:str) -> str:
    if len(s)<=1:
        return s
    else:
        longest = ""
        for i in range(len(s)):
            for j in range(i+1,len(s)+1):
                current = s[i:j]
                print(current)
                if current == current[::-1] and len(current) >= len(longest):
                    longest = current
    return longest

if __name__ =='__main__':
    s="ac"
    print(longest_palindrome(s))


