/*
 * # ATM[1단계] : 이체하기
 * 
 * 1. 이체할 계좌번호를 입력받는다.
 * 2. 계좌번호가 일치하면,
 * 3. 이체할 금액을 입력받는다.
 * 4. 이체할 금액 <= myMoney    : 이체가능
 *             myMoney   - 이체할 금액
 *             yourMoney + 이체할 금액
 *    이체할 금액  > myMoney     : 이체불가
 */

import java.util.*;
public class EX12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	    int account = 1234;
	    int myMoney = 9876;
	    int yourMoney = 120000;
	
	    int inputAccount, amount;
	    
	    System.out.print("이체할 계좌번호 입력: ");
	    inputAccount = sc.nextInt();
	    if ( account == inputAccount ) {
	    System.out.print("이체할 금액을 입력: ");
	    amount = sc.nextInt();
	    if (amount <= myMoney) {
	    	myMoney -= amount;
	    	yourMoney += amount;
	    }else {
	    	System.out.println("잔액이 부족합니다");
	        }	    	
	    } else {
	    	System.out.print("계좌번호를 확인해주세요");
	    }
	    
	    // 잔액확인
	    System.out.printf("내 계좌 잔액: %d원\n", myMoney);
	    System.out.printf("상대방 계좌 잔액: %d원\n", yourMoney);
	}
}