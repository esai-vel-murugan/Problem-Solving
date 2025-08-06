import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte a = scan.nextByte();
        byte b = scan.nextByte();
        if (a >= 18 && b >= 60){
            System.out.println("Eligible for marathon");
         }
        else{
            System.out.println("Not eligible for marathon");
        }
    }
}
