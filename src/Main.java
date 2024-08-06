import array.LargeFactorial;
import hashing.FindTheLengthOfLargestSubarrayWith0Sum;
import hashing.Maximum_distance_between_two_occurrences_of_same_element_in_array;
import hashing.Two_Sum;

public class Main {
    public static void main(String[] args) {
        int[] Arr = { 1, 2, 4, 1, 3, 4, 2, 5, 6, 5 };
        System.out.printf(
                "Maximum distance between two occurrences of same element in array:%d", Maximum_distance_between_two_occurrences_of_same_element_in_array.
                maxDistance(Arr, 10));
    }
}