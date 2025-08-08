import java.util.*;
public class Solution {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int eves=0;
        int odds=0;
        int evein=0;
        int oddin=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                eves=eves+arr[i];
            }
            else{
                odds=odds+arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(i%2==0){
                evein=evein+arr[i];
            }
            else{
                oddin=oddin+arr[i];
            }
        }
        System.out.println(eves+" "+odds+" "+evein+" "+oddin);
    }
}
