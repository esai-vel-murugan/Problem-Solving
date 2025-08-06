import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        if (n==0){
            System.out.printf("%d",sum);
        }
        else{
            if (n<0){
                n = -n;
            }
            while(n!=0){
                int a = n%10;
                sum = sum+a;
                n = n/10;
            }
        System.out.println(sum);
        }
    }
}
