import java.util.*;

public class Main {
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        n = sc.nextInt();
        
        for (int i = 0; i <= n; i++) {
            for (int j = n-i; j > 0; j--) {
                System.out.print(" ");
        }
        for (int j = i; j > 0; j--) {
            System.out.pirnt("*");
        }
        System.out.println();
       }
    }
}