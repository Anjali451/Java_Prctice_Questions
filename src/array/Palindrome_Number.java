package array;

public class Palindrome_Number {
    public boolean isPalindrome(int x){
        int reversed = 0;

        if(x<0)
            return false;

        while (x%10 != 0){
            reversed = (x%10) + (reversed*10);
            x /=10;
        }

        return x == reversed;
    }
}
