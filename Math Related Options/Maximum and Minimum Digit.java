import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int max = 0;
        int min = 0;
        if (a<0){
            a = -a;
        }
        while(a!=0){
        int b = a%10;
        if (max<b){
            max =  b;
        }
        else{
            min = b;
        }
        a = a/10;
        }
       System.out.printf("%d %d",max,min);
    }
}
