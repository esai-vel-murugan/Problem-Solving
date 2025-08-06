import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int amnt = scan.nextInt();
        scan.nextLine();
        String check = scan.nextLine();
        if (check.equals("available")){
            if (amnt%100 == 0){
                System.out.println("Amount "+amnt+" can be withdrawn");
            }}
        else {
              if(amnt%500 == 0){
                System.out.println("Amount "+amnt+" can be withdrawn");
                }
              else{
               System.out.println("Enter amount in multiples of 500");  
           }
        } 
    }
}
