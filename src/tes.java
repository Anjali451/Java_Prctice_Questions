// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class tes {
    public static void main(String[] args) {
        int N = 5;
        int arr[] = {1, 2, 3, 4, 5};
        int n = 2;
        
        for(int i=0; i<N; i++){
            int bits = binary(arr[i]);
            int bitsLeft = eat(bits, n);
            System.out.print(bitsLeft);
        }
        
        
    }
    
     public static int binary(int num){
            int sum = 0;
            while(num > 0){
               int rem = num % 2;
               sum = sum*10 + rem;
               num = num/2;
            }
            
            return sum;
        }
        
        
         public static int eat(int bits, int n){
            int temp = bits;
            int count = 0;
            while(bits != 0){
                int rem = bits % 10;
                count++;
            }
            if(count == n){
                temp = 0;
            }else{
                while(n != 0){
                    temp = temp % 10;
                }
            }
            return temp;
        }
}