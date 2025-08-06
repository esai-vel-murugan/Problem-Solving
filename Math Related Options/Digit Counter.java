import java.util.*;
public class Solution {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int count = 0;
    if (n==0){
        count = 1;
    }
    else{
    if (n<0){
      n = -n;   
     }
    while(n != 0){
        n=n/10;
       count++;
    }
    }
    System.out.println(count);
    }
}
