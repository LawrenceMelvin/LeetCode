def int_to_rom(n:int)-> str:
    f = {1:'I',4:'IV',5:'V',9:'IX',10:'X',40:'XL',50:'L',90:'XC',100:'C',400:'CD',500:'D',900:'CM',1000:'M'}
    pl_val = len(str(n))-1
    result = ""
    for i in str(n):
        flag = True
        num = i+('0'*pl_val)
        ss = int(num)
        while(flag):
            for key, value in f.items():
                if ss > key:
                    min_roman = value
                    min_sub = key
                elif ss == key:
                    min_roman = value
                    min_sub =key
                    break
            print(min_roman)
            
            print(ss)
            if ss == 0:
                flag = False
            else:
                result += min_roman
                ss = ss-min_sub
                


        pl_val = pl_val-1
    print(result)
        

if __name__ == '__main__':
    print(int_to_rom(10))