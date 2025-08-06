import java.util.*;
public class Solution {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int temp = a;
        int sum =0;
        while(a!=0){
        int b = a%10; sum = sum+b; a=a/10;}
        if (temp%sum==0){
            System.out.println("Harshad Number");
        }
        else{
            System.out.println("Not Harshad Number");
        }
    }}
