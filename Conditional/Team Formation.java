import java.util.*;
public class Solution {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     int players = scan.nextInt();
     int teams = scan.nextInt();
     int teamformed = players/teams;
     int leftout = players%teams;
     System.out.println("Total teams formed: "+teamformed);
     System.out.println("Players left out: "+leftout);  
    }
}
