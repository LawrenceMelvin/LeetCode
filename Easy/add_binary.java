package Easy;

import java.util.Scanner;

public class add_binary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        //Binary addition - with out built in functions
        // we can use Integer.toBinaryString(a+b) -- add two binary number
        StringBuilder result = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int carry =0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
            }
            if (sum == 0 || sum == 1) {
                result.append(sum);
                carry = 0;
            }
            else if (sum == 2) {
                result.append("0");
                carry = 1;
            }
            else {
                result.append("1");
                carry = 1;
            }
            i--;
            j--;
        }
        if (carry == 1) {
            result.append("1");
        }
        System.out.println(result.reverse().toString());
        sc.close();
    }
}
