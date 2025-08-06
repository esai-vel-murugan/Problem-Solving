import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.printf("Sum: %d\n",a+b);
        System.out.printf("Difference: %d\n", a-b);
        System.out.printf("Product: %d\n", a*b);
        System.out.printf("Quotient: %d\n", a/b);
        System.out.printf("Remainder: %d\n", a%b);
    }
}
