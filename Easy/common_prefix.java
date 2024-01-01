package Easy;

import java.util.Scanner;

public class common_prefix {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strs = new String[n];
        for(int i=0;i<n;i++){
            strs[i] = sc.next();
        }
        String output = "";
        boolean notequal = true;
       //System.out.println(strs.length);
        int s=1;
        while (notequal) {
            int equal_count = 0;
            if(strs[0].isEmpty()){
                break;
            }
            String ns = strs[0].substring(0,s);
            for(int i=1;i<strs.length;i++){
                if(strs[i].isEmpty()){
                    break;
                }
                if(ns.equals(strs[i].substring(0,s))){
                    equal_count++;
                }
            }
            System.out.println(equal_count);
            if(equal_count == strs.length-1){
                s++;
            }else{
                output = strs[0].substring(0,s-1);
                break;
            }
        }
        System.out.println(output);
    }
}
