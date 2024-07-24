public class EvenSumFibonacci {
    public static void main(String[] args) {
        int n = 10; // Change the value of n to the desired number
        int a = 0, b = 1, c, sum = 0;
        
        System.out.println("Even Fibonacci Series up to " + n + ":");
        
        while (b <= n) {
            if (b % 2 == 0) {
                System.out.print(b + " ");
                sum += b;
            }
            c = a + b;
            a = b;
            b = c;
        }
        
        System.out.println("\nSum of Even Fibonacci Series up to " + n + " is: " + sum);
    }
}
