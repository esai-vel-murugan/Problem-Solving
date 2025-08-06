import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int temp=1;
        for(int i=1; i<=n; i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
        for(int j=1; j<=temp;j++){
            System.out.print("*");  
        }   
        for(int j =1;j<n-i;j++){
           System.out.print(" "); 
        }
            temp = temp+2;
            System.out.println("");
      }
    }
}
