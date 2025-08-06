import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        for(int i=1 ;i<=n ;i++){
            if (n%i==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
