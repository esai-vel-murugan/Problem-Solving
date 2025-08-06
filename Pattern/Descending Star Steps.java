import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int colounm = n;
        for (int i=1;i<=n;i++){
            for(int j=1;j<=colounm;j++){
                System.out.print("*");
            }
            System.out.println("");
            colounm--;
        }
    }
}
