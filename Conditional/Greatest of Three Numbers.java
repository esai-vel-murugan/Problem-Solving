import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if (a!=b){
            if (a!=c){
                if (a>c){
                    System.out.println(a+" is the greatest");
                }
                else{
                    System.out.println(c+" is the greatest");
                }}
            else{
                System.out.println("There is a tie for the greatest number");
               }
        }
        
        else{
           if (b==a){
              System.out.println("There is a tie for the greatest number"); 
           }
           else if(b>c){
               System.out.println(b+" is the greatest");
           }
            else{
               System.out.println(c+" is the greatest"); 
            }
            
            } 
    }
}
