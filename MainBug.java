import java.util.Scanner;

public class MainBug {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int start = s.nextInt();
        System.out.print("Enter the second number: ");
        int end = s.nextInt();

        if ((start > 0) && (end > 0) && (end > start + 1)) { // no errors: find the prime numbers between start and end
            System.out.println("List of prime numbers between " + start + " and " + end + ":");
            int count = 0;
            for (int i = start + 1; i < end; i++) {
                if (isPrime(i)) {
                    System.out.println(i);
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("--- (there are no prime numbers!)");
            }
        }
        else { // There is an error, print it
            System.out.println("Error: the limits are wrong!");
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) { // 1 is not considered a prime number
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}  
