import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int n = scan.nextInt();
        int evensum = 0;
        int oddsum = 0;
        if (n<0){
            n = -n;
        }
        while (n!=0){
            int a = n%10;
            if (a%2==0){
                evensum = evensum+a;
            }
            else{
                oddsum = oddsum+a;
            }
            n = n/10;
        }
        System.out.printf("%d %d",oddsum,evensum);
    }
}
