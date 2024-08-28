package hashing;

public class Remove_Duplicates_from_Sorted_Array {
    public int removeDuplicates(int[] nums){
        int k = 0;
        for(int j =1; j<nums.length; j++){
            if(nums[k] != nums[j]){
                k++;
                nums[k] = nums[j];
            }
        }
        return k;
    }
}