package Easy;

import java.util.Scanner;

public class happy_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //System.out.println(result);
        double result = 0;
        while (result!=1) {
            result = 0;
            while(n >= 1){
                result = result+Math.pow(n%10,2);
                n = n/10;
            }
            result = result+n;
            n = (int)result;
            
           // System.out.println(n);
            System.out.println(result);
        }
    }
}
