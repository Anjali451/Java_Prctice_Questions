package Sorting;

public class SelectionSort {
    public static void sort(int a[]){
        int minIndex = -1;
        int temp = 0;
        for(int i = 0; i<a.length -1; i++)
        {
            minIndex = i;
            for(int j = i+1 ; j<a.length; j++){
                if(a[j] < a[minIndex]){
                    minIndex = j;
                }
            }
            temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }

        for(int num : a){
            System.out.print(num + " ");
        }
    }
}
