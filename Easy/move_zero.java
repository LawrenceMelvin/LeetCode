import java.util.Scanner;

public class move_zero {

    /*Easy solution*/
    public static void easySolution(int n){
        int [] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int cop[] = new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                cop[j] = nums[i];
                j++;
            }
        }
        for(int c=0;c<cop.length;c++){
            System.out.println(cop[c]);
        }
    }

    /*Solution with one arrya  */
    public static void leetSolution(int n){
        int nums[] = new int[n];
        int pos=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                pos = i;
            }
            else if(nums[i]!=0 && i>pos) {
                
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        easySolution(n);
    }
}
