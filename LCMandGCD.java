import java.util.Scanner;

public class LCMandGCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }

        int gcd = numbers[0];
        int lcm = numbers[0];

        for (int i = 1; i < n; i++) {
            gcd = findGCD(gcd, numbers[i]);
            lcm = findLCM(lcm, numbers[i]);
        }

        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
    }

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

    public static int findLCM(int a, int b) {
        return a * (b / findGCD(a, b));
    }
}
