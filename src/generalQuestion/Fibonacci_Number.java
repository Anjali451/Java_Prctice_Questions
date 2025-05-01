package generalQuestion;

//RECURSIVE METHOD O(2^n)
public class Fibonacci_Number {
    public int fib(int n){
        if(n == 0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return fib(n-1) + fib(n - 2);
        }
    }

//BRUTE FORCE METHOD  O(n)
    public void fibo(int n){
        int num1 = 0;
        int num2 = 1;
        System.out.println(num1);
        System.out.println(num2);
        while(n > 0){
            int temp = num2 + num1;
            num1 = num2;
            num2 = temp;
            System.out.println(num1);
            System.out.println(num2);
            n--;
        }
    }
}
