package Medium;

import java.util.LinkedList;
import java.util.Scanner;

public class add_twonumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 3;
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        for(int i=0;i<n;i++){
            linkedList1.add(sc.nextInt());
        }
        for(int i=0;i<n;i++){
            linkedList2.add(sc.nextInt());
        }
        LinkedList<Integer> sumll = new LinkedList<>();
        int i = linkedList2.size()-1;
        int carry = 0;
        int sum = 0;
        while (i>=0) {
            //int sum = carry;
            //System.out.print(linkedList1.get(i)+" ");
            if(carry == 1){
                sum = linkedList1.get(i) + linkedList2.get(i)+1;
                carry = 0;
            }else{
                sum = linkedList1.get(i) + linkedList2.get(i);
            }
            if(sum >= 10){
                carry = 1;
                sum = sum%10;
            }
            sumll.add(sum);
            i--;
        }
        System.out.println(sumll);
    }

    /*
    public static void iteratelinkedlist(LinkedList<Integer> linkedList){
        for(int i=0;i<linkedList.size();i++){
            System.out.println(linkedList.get(i)+" ");
        }
    }
     */
}
