import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        int product = 1;
        while (n>0){
            int a = n%10;
            sum = sum+a;
            product = product*a;
            n=n/10;
        }
        if(sum==product){
            System.out.println("Spy Number");
        }
        else{
           System.out.println("Not a Spy Number"); 
        }
    }
}
