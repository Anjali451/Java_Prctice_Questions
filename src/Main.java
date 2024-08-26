import Sorting.InsertionSort;
import Sorting.LinearSearch;
import Sorting.SelectionSort;
import array.LargeFactorial;
import hashing.CountNumberofPairsWithAbsoluteDifferenceK;
import hashing.FindTheLengthOfLargestSubarrayWith0Sum;
import hashing.Maximum_distance_between_two_occurrences_of_same_element_in_array;
import hashing.Two_Sum;

import LinkedList.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int l1[] = {2,4,3};
        LinkedListNode root1 = CreateLinkedList.create(l1);

        int l2[] = {5,6,4};
        LinkedListNode root2 = CreateLinkedList.create(l2);

        LinkedListNode root = Add_Two_Numbers.number(root1, root2);
        LinkedListNode temp = root;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}