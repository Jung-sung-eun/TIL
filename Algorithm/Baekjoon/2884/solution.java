import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int H;
        int M;
        
        H = sc.nextInt();
        M = sc.nextInt();
        
        if (H == 0 && M < 45) {
        	H = 23;
        	M = M + 15;
        	System.out.println(H + " " + M);
        } else if (M < 45) {
        	H -= 1;
        	M = 60 + M - 45;
        	System.out.println(H + " " + M);
        } else {
        	M = M - 45;
        	System.out.println(H + " " + M);
        }
    }
}