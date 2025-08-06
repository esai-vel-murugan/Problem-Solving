import java.util.*;
public class Solution { 
    public static int exponent(int b, int count){
        int result = 1;
        for(int i=1;i<=count;i++){
            result = result*b;
        }
        return result;
    }
    
    public static int count(int n){
        int a = 0;
        int count =0;
        while(n!=0){
            a = n%10;
            count++;
            n = n/10; 
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int temp = n;
        int sum = 0;
        while (temp!=0){
            int b = temp%10;
            b = exponent(b,count(n));
            sum = sum+b;
            temp = temp/10;
        }
        if (sum == n){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
