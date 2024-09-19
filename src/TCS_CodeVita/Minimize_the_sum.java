package TCS_CodeVita;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Minimize_the_sum {
    public static int minimize(int a[], int k){
        int sum = 0;
        int n = a.length;

        PriorityQueue< Integer > maxHeap =new PriorityQueue <> ((one, two)->two - one);

        for (int i = 0; i < n; i++)
            maxHeap.add (a[i]);

        while (k > 0 && maxHeap.size () > 0)
        {
            int max = maxHeap.poll ();
            maxHeap.add (max / 2);
            k = k - 1;
        }

        while (maxHeap.size () > 0)
            sum = sum + maxHeap.poll ();
        return sum;
    }
}
