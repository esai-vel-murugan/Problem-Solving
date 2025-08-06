import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a>=90 && a<=100){
            System.out.println("Grade A");
        }
        else if (a>=80 && a<=89){
            System.out.println("Grade B");
        }
        else if (a>=70 && a<=79){
            System.out.println("Grade C");
        }
        else if (a>=60 && a<=69){
            System.out.println("Grade D");
        }
        else if (a>=50 && a<=59){
            System.out.println("Grade E");
        }
        else{
            System.out.println("Fail");
        }
    }
}
