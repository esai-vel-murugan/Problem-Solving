import java.util.*;
public class Solution {
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        int end = scan.nextInt();

        boolean found = false;

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No prime numbers");
        }
    }
}
