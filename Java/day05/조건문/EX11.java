/*
 * # 코인 게임
 * 
 * 1. 0 또는 1의 랜덤 숫자를 저장한다.
 * 2. 0은 동전의 앞면, 1은 동전의 뒷면이다.
 * 3. 동전의 앞뒷면을 맞추는 게임이다.
 * 
 */

import java.util.*;
public class EX11 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		int ans = 0;
		int coin = rand.nextInt(2); // 0 ~ 1, 1 ~ 100: radn.nextInt(100) + 1
		
		System.out.print("동전의 앞면(0), 뒷면(1) 입력: ");
		ans = sc.nextInt();
		
		if ( coin == 0 ) {
        System.out.println("앞면");
        } else {
        System.out.println("뒷면");
        }
		
		if ( coin == ans) {
        System.out.println("정답!");
        } else {
        System.out.println("땡!!!");
        }
	}
}