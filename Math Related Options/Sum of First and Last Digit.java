import java.util.*;
public class Solution {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
     int n = scan.nextInt();
     if (n<0){
         n = -n;
     }
     int temp = n;
     int temp1 = 0;
     int a = n%10;
     while (n!=0){
        int c = n%10;
        if (c !=0){
            temp1 = n;
        }
        n = n/10;
     }
    int sum = temp1+a;
    System.out.println(sum);
    }
}
