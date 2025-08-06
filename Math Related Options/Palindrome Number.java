import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int temp =n;
        int b=0;
        if(n<0){
            n = -n;
        }
        while (n!=0){
            int a = n%10;
            b = b*10+a;
            n = n/10;
        }
        if (b==temp){
            
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
