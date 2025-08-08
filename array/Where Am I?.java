import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int c=scan.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==c){
                System.out.print(i+" ");
                a=1;
            }
        }
        if(a==0){
            System.out.println("-1");
        }
    }
}
