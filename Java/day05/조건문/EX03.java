/*
 * # 로그인[1단계]
 *
 * 1. Id와 Pw를 입력받는다.
 * 2. 입력받은 데이터와 db데이터를 비교해 로그인 처리를 진행한다.
 * 예) 로그인 성공 or 로그인 실패
 */

import java.util.Scanner;
public class EX03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dbId = 1234;
        int dbPw = 1111;

        int ID, PW;

        System.out.print("ID 입력: ");
        ID = sc.nextInt();
        System.out.print("PW 입력: ");
        PW = sc.nextInt();

        if( dbId == ID && dbPw == PW) {
        System.out.println("로그인 성공");
        } else {
        System.out.println("로그인 실패");
        }
    }
}