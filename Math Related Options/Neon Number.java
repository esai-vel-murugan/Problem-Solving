import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int temp = a;
        int b=0;
        int sum = 0;
        int exponend = a*a;
        while (exponend!=0){
            b = exponend%10;
            sum=sum+b; 
            exponend=exponend/10;
        }
        if (sum == temp){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
