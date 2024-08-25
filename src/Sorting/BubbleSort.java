package Sorting;

public class BubbleSort {
    public static void sort(int a[]){
        for(int i = 0; i<a.length; i++)
        {
            for(int j = 1 ; j<a.length - i-1; j++){
                if(a[j] < a[j - 1]){
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1]  = temp;
                }
            }
        }

        for(int num : a){
            System.out.print(num + " ");
        }
    }
}
