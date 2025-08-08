import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int evec=0;
        int oddc=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                evec++;
            }
            else{
                oddc++;
            }
        }
        System.out.println(evec);
        System.out.println(oddc);
    }
}
