public class Hello{
  public static void main(String[] args){
    // 변수의 선언(메모리 공간을 만듬)
  	int a;
    // 변수의 정의(만들어진 메모리에 값을 저장)
    a = 4;
    // 실제 메모리에 잘 저장이 되어 있는지 확인
    // 메모리를 직접 들여다 보지 않는 한 확인 X
    System.out.println(a);
    
    // 변수의 선언과 정의를 동시에
    // 변수(메모리)의 초기화
    int b = 10;
    System.out.println(b);
    
    // 이름으로 사용할 수 없는 경우
    // int new;
    
    char ch = 'A';
    System.out.println(ch);
    
    // 문자열 변수를 선언하고 할당하는 방법 두가지
    // String str = new String("Hello");
    String str = "Hello";
    System.out.println(str);
  }
}
