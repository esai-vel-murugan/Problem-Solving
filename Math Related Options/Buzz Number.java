import java.util.*;
public class Solution {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int a = scan.nextInt();
      int b = a%10;
      if (a%7 == 0 || b==7){
          System.out.println("Buzz Number");
      }
        else{
          System.out.println("Not Buzz Number");
        }
    }
}
