public class CompositeNumbers {
    public static void main(String[] args) {
        int a = 10, b = 50;

        System.out.println("Composite numbers between " + a + " and " + b + " are:");
        for (int i = a; i <= b; i++) {
            if (isComposite(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isComposite(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return true;
            }
        }
        return false;
    }
}
