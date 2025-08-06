import java.util.*;
public class Solution {
    public static int count(int value){
    int count = 0;
     while (value!=0){
         count++;
         value = value/10;
     }
        return count;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int value = a*a;
        //int temp =value;
        int cou = count(value);
        int prod = 0;
        if (cou == 2){
          prod = value%10;
        }
        else{
           prod = value%100; 
        }
       if (prod == a){
           System.out.println("Automorphic");
       }
        else{
           System.out.println("Not Automorphic"); 
        }
    }
}
