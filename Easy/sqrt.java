package Easy;

import java.util.Scanner;

public class sqrt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int odd_number =1;
        int count = 0;
        while (true) {
            if(x-odd_number>=0){
                x = x-odd_number;
                count++;
                odd_number = odd_number+2;
            }else{
                break;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
