import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.printf("%d * %d = %d\n",n,i,n*i);
        }
    }
}
