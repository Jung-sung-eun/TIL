import java.util.*;

public class Main {
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int n, sum = 0;
        n = sc.nextInt();
        
        for (; n > 0; n--) {
            sum += n;
        }
        System.out.println(sum);
    }
}