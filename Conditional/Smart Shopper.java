import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rs1 = scan.nextInt();
        int q1 = scan.nextInt();
        int rs2 = scan.nextInt();
        int q2 = scan.nextInt();
        int rs3 = scan.nextInt();
        int q3 = scan.nextInt();
        int bud = scan.nextInt();
        int tot1 = rs1*q1;
        int tot2 = rs2*q2;
        int tot3 = rs3*q3;
 
        float beftot =(float) (tot1+tot2+tot3);
        float afttot =(float) (beftot*0.10);
        afttot = afttot+beftot;

        System.out.printf("Total (Before Tax): %.2f\n",beftot);
        System.out.printf("Total (After Tax): %.2f\n",afttot);
        if(afttot<=bud){
            System.out.println("Within Budget");
        }
        else{
            System.out.println("Over Budget");
        }
    }
}
