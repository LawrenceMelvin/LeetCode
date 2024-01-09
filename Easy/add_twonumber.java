package Easy;

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
        sc.close();
        int i = linkedList2.size();
        int carry = 0;
        while (i>0) {
            int sum = carry;
            sum = linkedList1.get(i) + linkedList2.get(i);
        }
    }

    /*
    public static void iteratelinkedlist(LinkedList<Integer> linkedList){
        for(int i=0;i<linkedList.size();i++){
            System.out.println(linkedList.get(i)+" ");
        }
    }
     */
}
