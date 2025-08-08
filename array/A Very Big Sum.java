import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n = scan.nextInt();
        long temp=0;
        long arr[]=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextLong();
        }
        for(int i=0;i<n;i++){
            temp = temp+arr[i];
        }
        System.out.println(temp);
    }
}
