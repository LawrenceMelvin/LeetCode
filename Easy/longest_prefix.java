package Easy;

import java.util.Scanner;

public class longest_prefix {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strs = new String[n];
        for(int i=0;i<n;i++){
            strs[i] = sc.next();
        }
        String output = "";
        int str_lenght = Integer.MAX_VALUE;
        String small_index = "";
        for(int i=0;i<strs.length;i++){
            if(strs[i].length() < str_lenght){
                str_lenght = strs[i].length();
                small_index = strs[i];
            }
        }
        //System.err.println("Length of the smallest String in array = "+str_lenght);
        if (str_lenght == 0) {
            output = small_index;
        }else{
            while(true){
                int count = 0;
                for(int j =0;j<strs.length-1;j++){
                    if(!strs[j].substring(0,str_lenght).equals(strs[j+1].substring(0,str_lenght))){
                        str_lenght--;
                    }else{
                        count++;
                    }
                }
               //System.out.println("COUNT = "+count);
               //System.out.println(str_lenght);
               if(str_lenght == 0){
                    break;
               }
                if(count == strs.length-1){
                    break;
                }
            }
            output = strs[0].substring(0,str_lenght);
            /*
            int j=1;
            while(true){
                if(!strs[j-1].substring(0,str_lenght).equals(strs[j].substring(0,str_lenght))){
                    str_lenght--;
                    j=1;
                }else{
                    j++; 
                }
            }
             */
        }
        //System.out.println("Final longest prefix length = "+str_lenght);
        System.err.println(output);
        sc.close();
    }
}
