import java.util.*;
public class Solution {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int age = scan.nextInt();
        double height = scan.nextDouble();
        scan.nextLine();
        String name = scan.nextLine();
        System.out.printf("%s is %d years old and %.2f meters tall.",name,age,height);
    }
}
