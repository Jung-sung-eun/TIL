/*
 * # 최대값 구하기[1단계]
 * # 같은수는 없다고 가정합니다
 * 1. 숫자 3개를 입력받는다.
 * 2. 입력받은 3개의 수를 비교하여,
 * 3. 가장 큰 수(MAX)를 출력한다.
 */

import java.util.Scanner;
public class EX10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x, y, z;
		int max = 0;
		
		System.out.print("정수1 입력 : ");
		x = sc.nextInt();
		
		System.out.print("정수2 입력 : ");
		y = sc.nextInt();
		
		System.out.print("정수3 입력 : ");
		z = sc.nextInt();
		
		max = -1;
		
		if (max < x) {max = x;}
		if (max < y) {max = y;}
		if (max < z) {max = z;}
		
		System.out.printf("최대값: %d\n", max);
	}
}