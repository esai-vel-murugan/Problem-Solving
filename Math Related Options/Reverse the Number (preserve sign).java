import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sign = 1;
        if (n < 0) {
            sign=-1;   
            n=-n;      
        }
        int reversed = 0;
        while (n != 0) {
            int digit =n%10;
            reversed=reversed*10+digit;
            n = n/10;
        }
        reversed=reversed*sign; 
        System.out.println(reversed);
    }
}
