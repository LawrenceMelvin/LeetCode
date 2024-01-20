package Medium;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class longest_substring {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        //ArrayList<String> list = new ArrayList<String>();
        List<Character> list = new ArrayList<>(); 
        int index = 0;
        int len = 0;
        int max_length = Integer.MIN_VALUE;
        int final_index = 0;
       // int next_index = 0;
        while(index <= s.length()-1){
            list.add(s.charAt(index));
            len++;
            //s.charAt(index);
            System.out.println(len+"-"+list);
            if(len > max_length){
                max_length = len;
                final_index = index;
            }
            if(index != s.length()-1){
                if(list.contains(s.charAt(index+1))){
                    list.clear();
                    len = 0;
                }
            }
            index++;
        }
        System.out.println("MAX LENGTH"+max_length);
        System.out.println("MAX INDEX"+final_index);
        System.out.println(s.substring(Math.abs(final_index-max_length+1), final_index+1));
        sc.close();
    }
}
