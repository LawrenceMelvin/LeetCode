package Medium;

public class add_linkednode {
    public static void main(String[] args){
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        ListNode node11 = new ListNode(5);
        ListNode node12 = new ListNode(6);
        ListNode node13 = new ListNode(4);
        node11.next = node12;
        node12.next = node13;
        ListNode current = node1;
        ListNode current1 = node11;
        //int l2length = 0;
        int carry = 0;
        //ListNode dummy = new ListNode(0);
        ListNode sumll;
        while (current != null) {
            // System.out.println(current.val);
            //l2length++;
            int sum = 0;
            if(carry == 1){
                sum = current.val + current1.val+1;
            }
            else{
                sum = current.val + current1.val;
            }
            if(sum > 9){
                sum = sum%10;
                carry = 1;
            }else{
                carry = 0;
            }
            sumll =new ListNode(sum);
            sumll = sumll.next;
            current = current.next;
            current1 = current1.next;
           
        }
       // System.out.println("Lenght of the l2 = "+l2length);
       //ListNode fin = sumll;
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val){
        this.val = val;
    }
}
