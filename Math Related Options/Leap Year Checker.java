import java.util.*;
public class Solution {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int a = scan.nextInt();
      int b = a%4;
      int c = a%100;
      int f = a%400;
      if (f==0){
          System.out.println("Leap Year");
      }
      else if(c != 0 && b == 0){
          System.out.println("Leap Year");
      }
      else{
          System.out.println("Not a Leap Year");
      }
    }
}
