import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t, a, b;
        
        t = sc.nextInt();
        for (; t > 0; t--) {
        	a = sc.nextInt();
        	b = sc.nextInt();
        	System.out.println(a+b);
        }
    }
}