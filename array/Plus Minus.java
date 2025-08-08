import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int posc=0;
        int negc=0;
        int zeroc=0;
        float negs=0;
        float zeros=0;
        float poss=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                negc++;
            }
            else if(arr[i]==0){
                zeroc++;
            }
            else{
                posc++;
            }
        }
        negs=(float) negc/n;
        zeros=(float) zeroc/n;
        poss=(float) posc/n;
        System.out.printf("%.6f",poss);
        System.out.println();
        System.out.printf("%.6f",negs);
        System.out.println();
        System.out.printf("%.6f",zeros);
    }
}
