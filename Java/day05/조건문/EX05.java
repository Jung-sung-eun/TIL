/*
 * # 구구단 게임[1단계]
 * 
 * 1. 구구단 문제를 출제하기 위해, 숫자 2개를 입력받는다.
 * 2. 입력받은 숫자를 토대로 구구단 문제를 출력한다.
 * 예)    3 x 7 = ?
 * 3. 문제에 해당하는 정답을 입력받는다.
 * 4. 정답을 비교 "정답!" 또는 "땡!"을 출력한다.
 */

import java.util.Scanner;
public class EX05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y, ans, myAns;
		System.out.print("첫번째 숫자 입력: ");
		x = sc.nextInt();
		
		System.out.print("두번째 숫자 입력: ");
		y = sc.nextInt();
		
		ans = x * y;
		
		System.out.printf("%d * %d = ?\n", x, y);
		System.out.print("정답입력: ");
		myAns = sc.nextInt();
		
		if( ans == myAns ) {
        System.out.println("정답!");
        } else {
        System.out.println("땡!!!");
        }
	}
}