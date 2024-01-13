package Easy;

import java.util.Scanner;

public class plus_one {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] digits = new int[n];
        for(int i=0;i<n;i++){
            digits[i] = sc.nextInt();
        }
        if(digits[digits.length-1] < 9){
            digits[digits.length-1] = digits[digits.length-1] + 1;
        }else{
            //System.out.println("Start");
            int i = digits.length-1;
            //System.out.println("i = "+i);
            while(i>=0){
                //System.out.println("WHILE LOOP");
                if(digits[i] == 9 && i==0){
                    digits = new int[digits.length+1];
                    digits[i] = 1;
                    digits[i+1] = 0;
                    break;
                }
                else if(digits[i] ==9 && i!=0){
                   // System.out.print("PASSED");
                    digits[i] = 0;
                    i--;
                }
                else{
                    digits[i] = digits[i]+1;
                    break;
                }
            }
        }
        for(int j=0;j<digits.length;j++){
            System.out.print(digits[j]+" ");
        }
        sc.close();
    }
}
