import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int coloumn = scan.nextInt();
        for (int i=1; i<=row;i++){
            for (int j=1;j<=coloumn;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
