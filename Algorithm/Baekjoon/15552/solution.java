import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int T, A, B;
    	T = Integer.parseInt(br.readLine());
    	for (; T > 0; T--) {
    		String line = br.readLine();
    		A = Integer.parseInt(line.split(" ")[0]);
    		B = Integer.parseInt(line.split(" ")[1]);
    		bw.write(A+B + "\n"); // bw.write(String.valueOf(A+B) + "\n");
    	}
    	bw.flush();
    	bw.close();
    	br.close();
    }
}