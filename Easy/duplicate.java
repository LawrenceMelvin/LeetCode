package Easy;

import java.util.Scanner;

public class duplicate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int k_sum = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] != nums[j]){
                    break;
                }else{
                    nums[j] = -101;
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==-101 && nums[j]!=-101){
                    //System.out.println("YES");
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
            if(nums[i] != -101){
                k_sum++;
            }
        } 
        System.out.println("K = "+k_sum);
        for(int k=0;k<nums.length;k++){
            System.out.print(nums[k]+",");
        }
    }
}
