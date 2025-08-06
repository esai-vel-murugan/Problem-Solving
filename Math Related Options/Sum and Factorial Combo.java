import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
         int sum = 0;
         int Product = 1;
        for(int i=1;i<=n;i++){
           sum = sum+i;
           Product = Product*i;
        }
        System.out.println(sum);
        System.out.println(Product);
    }
}
