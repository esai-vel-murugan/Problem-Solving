import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char a = scan.next().charAt(0);
        if (a>=97 && a<=122){
            System.out.println("Lowercase Alphabet");
        }
        else if(a>=65 && a<=90){
             System.out.println("Uppercase Alphabet");
        }
        else if(a>=48 && a<=57){
             System.out.println("Digit");
        }
        else{
             System.out.println("Special Character");
        }
    }
}
