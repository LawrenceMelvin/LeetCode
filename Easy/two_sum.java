package Easy;

import java.util.Scanner;

public class two_sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        int[] output = new int[2];
        for(int i=0;i<N;i++){
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        //int  j = 1;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    output[0] = i;
                    output[1] = j;
                    count++;
                    break;
                }
            }
            if(count>0){
                break;
            }
        }
        System.out.println("["+output[0]+","+output[1]+"]");
    }
}
