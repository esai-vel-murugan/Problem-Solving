import java.util.*;
public class Solution {
    public static int gcd(int a, int b){
      while (b !=0 ){
          int temp = b;
          b = a%b;
          a = temp;
      }
        return a;
    }

    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     int a = scan.nextInt();
     int b = scan.nextInt();
     int ans = gcd(a,b);
     System.out.println(ans);
    }
}
