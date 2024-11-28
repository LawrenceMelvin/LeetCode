s = "0P"

for i in s:
    if i.isalpha():
        continue
    else:
        # print(s[i])
        s = s.replace(i,"")

print(s)
if s.upper() == s[::-1].upper():
    print(True)
else:
    print(False)