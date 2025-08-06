import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int temp = 1;
        int b =n-1;
        
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=temp;j++){
                System.out.print("*");
            }
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            temp = temp+2;
            System.out.println(""); 
        }
        
        for (int i=1;i<=n-1;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }temp = temp-2;
            for (int j=1;j<=temp-2;j++){
                System.out.print("*");
            }
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            System.out.println(""); 
        }    
    }
}
