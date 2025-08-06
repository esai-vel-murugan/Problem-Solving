import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int base = scan.nextInt();
        int exp = scan.nextInt();
        int product = 1;
        for (int i=1;i<=exp;i++){
            product = product*base;
        }
        System.out.println(product);
    }
}
