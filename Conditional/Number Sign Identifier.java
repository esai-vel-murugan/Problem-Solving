import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a<0){
            System.out.println("Negative");
        }
        else if(a>0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Zero");
        }
    }
}
