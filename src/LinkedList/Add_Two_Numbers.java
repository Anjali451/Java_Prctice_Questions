package LinkedList;

public class Add_Two_Numbers {
    public static LinkedListNode number(LinkedListNode l1, LinkedListNode l2){
        LinkedListNode dumy = new LinkedListNode();

        LinkedListNode temp = dumy;

        LinkedListNode curr1 = l1;
        LinkedListNode curr2 = l2;

        int carry = 0;

        while(curr1 != null || curr2 != null || carry == 1){

            int sum = 0;

            if(curr1 != null){
                sum += curr1.data;
                curr1 = curr1.next;
            }

            if(curr2 != null){
                sum += curr2.data;
                curr2 = curr2.next;
            }

            sum += carry;
            carry = sum/10;

            LinkedListNode newNode = new LinkedListNode(sum % 10);
            temp.next = newNode;
            temp = temp.next;
        }

        return dumy.next;
    }
}
