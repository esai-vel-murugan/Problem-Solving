import java.util.*;
public class Solution {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        int index=0;
        int n=scan.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int c=scan.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==c){
                index=i;
                break;
            }
            else{
                index=-1;
            }
        }
        System.out.println(index);
    }
}
