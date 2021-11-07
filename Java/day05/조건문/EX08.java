/*
 * # 로그인[3단계]
 * 
 * 1. Id를 입력받아 dbId와 일치할 경우에만 Pw를 입력할 수 있다.
 * 2. Id가 틀린 경우, "Id를 확인해주세요"라는 메세지를 출력한다.
 * 3. Pw가 틀린 경우, "Pw를 확인해주세요"라는 메세지를 출력한다.
 * 4. Id와 Pw와 모두 일치하는 경우, "로그인 성공"라는 메세지를 출력한다.
 */

import java.util.Scanner;
public class EX08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
    int dbId = 1234;
    int dbPw = 1111;
    int ID, PW;
    
    System.out.print("아이디를 입력하세요: ");
    ID = sc.nextInt();
    if ( dbId == ID ) {
      System.out.print("패스워드를 입력하세요: ");
      PW = sc.nextInt();
      
      if (dbPw == PW) { System.out.println("로그인 성공!");}
      else { System.out.println("패스워드를 확인해주세요"); }
    } else {
      System.out.println("아이디를 확인해주세요");
    }	
	}
}