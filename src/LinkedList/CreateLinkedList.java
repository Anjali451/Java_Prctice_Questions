package LinkedList;

public class CreateLinkedList {
    public static LinkedListNode create(int nums[]){
        LinkedListNode root = new LinkedListNode(nums[0]);
        LinkedListNode temp = root;

        for(int i = 1; i< nums.length; i++){
            LinkedListNode node = new LinkedListNode(nums[i]);
            temp.next = node;
            temp = temp.next;
        }

        return  root;
    }
}
