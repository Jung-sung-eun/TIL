## 2021. 11. 02 (화)

#### 문자 (문자열)

- 문자(' '), 문자열(" ")
  - 여러 개의 단일 문자의 집합(문자열)
- 눈에 보이는 것이 전부 아님
  - 특히 문자열 뒤에 엔터가 붙는 경우가 있음
    - EX) "Hello" Vs. "HelloCRLF"
  - "내가 모르는 어떤 문자가 섞여 있을 수도 있다"라고 인지 하는 것이 중요

- 미리 기억을 해두면 좋음
  - 엔터 (CR(0x0d) LF (0x0a))
    - LF (0x0a) 하나로만 표현하는 경우 있음
  - 공백 (0x20), 탭 (0x09)
    - 공백도 문자 (띄어쓰기, 공백을 입력한다고 표현하지는 않음)
    - 빈 문자와 공백 문자는 엄격히 구분 (", '')
  - 서로 다른 문자인데 같은 경우
    - EX) 대표적으로 역슬래시(백스페이스 아래 키 아래)



```java
public class Main {
  public static void main(String[] args) {
    int a = 10; // 10진수
    int b = 012; // 8진수(0,1,2,3,4,5,6,7)
    int c = 0xa; // 16진수(0,..9,A,B,C,D,E,F)
    System.out.println(a == b); // true
    System.out.println(a == c); // true
    
    // 16진수는 문자가 아니고 숫자!
    // 숫자는 대/소 개념이 없음
    System.out.println(0x0a == 0x0A); // true
    
    // 문자라면 얘기가 달라짐
    // 문자는 대/소를 엄격하게 구분
    System.out.println('a'=='A'); // false
    
    // 문자도 결국은 숫자
    System.out.println('a' == 0x61); // true
    System.out.println('a' == 97); // true
    
    // 자바에서 정수의 기본 타입은 int (4)
    int basic = 2147483647;
    System.out.println(basic); // 2147483647
    
    // 음수 표현
    int minus = 2147483648;
    Sytstem.out.println(minus); // -2147483648
    
    // long 타입을 이용하면 최대 8바이트까지 가능 (부호를 제외하고 63비트)
    long big = 2147483648L;
    System.out.println(big); // 2147483648
    
    // 아스키 값이 같으면 같은 문자
    System.out.println( '\\' == 0x5c); // true
    
    // 문자열의 비교는 지원 없음
    System.out.println("apple" .equals("apple")); // true
    System.out.println("apple" .equals("Apple")); // false
    
    // 문자열 이스케이프
    // 따옴표를 출력하고 싶은 경우
    System.out.println("\"Hello, World\"");
    
    // 이렇게 쓰면 클로징 쿼터가 없는 것과 마찬가지
    // 클로징 쿼터를 새로 입력하거나, 역슬래시도 역슬래시로 이스케이프
    System.out.println('\\' == 0x5c);
    
    // 윈도우즈에서 경로 표현할 때 문제가 생김
    // 윈도우즈에서 경로의 구분자가 역슬래시
    String path = "C:\\Windows\\Boot\\PCAT\\de-DE";
    System.out.println(path);
    
    // 반대인 경우 [뉴라인(\n), 실제 LF의 값과 동일, 라인의 끝에 나타냄, 엔터]
    System.out.println("Hello \n World");
  }
}
```



#### 문자열 이스케이프

1. 문자를 사용할 때 충돌이 발생하는 경우

- 용도가 정해지 문자들이 있음
  - 대표적으로 ' '(작은 따옴표), " "(큰 따옴표)가 있음 (문자, 문자열)
  - 다른 용도로 사용하고 싶은 경우
- 탈출 (본래용도가 아닌, 일반적인 )

2. 반대일 경우

- 특별한 의미가 없는 문자, 특별한 의미를 부여해서 사용
- 엔터를 입력할 수 없음
  - 엔터를 대신할만 문자를 만들어서 사용 (\n)
- 입력하기 어려운 문자에 대해서 표현할 수 있는 방법을 미리 정의



### 변수와 상수, 리터럴

#### 상수 constant

- 변하지 않는 수
- 변수의 상수화
  - 프로그래밍의 본질은 변수를 어떻게 변화 (처리)
    - 덧셈, 뺄셈, ...
  - 결과적으로 메모리의 들어있는 값을 내가 원하는 값으로 바꾸는 과정
- 이렇게 메모리에 들어있는 값을 변하지 않게 만들어 주는 것 (상수화)

#### 타입 변환

- 타입이 가지는 가장 중요한 의미는 '크기'
  - 크기에 따른 문제
  - 작은 자료형에서 큰 자료형으로 문제가 되지 않음
  - 큰 자료형 (long, double)에서 작은 자료형 (int, short, float)
  - 실수에서 정수로 바꾸는 경우
    - 가수부가 떨어져 나가면서 지수부만 남게 됨 (올림, 반올림, 버림)
    - 컴퓨터는 실수를 정확하게 처리 못함
    - 일반적으로 실수를 근사한 값으로 변경해서 처리
- 문자 ➡️ 숫자
- 숫자 ➡️ 문자

#### 표준 입/출력

- 표준을 통한 입/출력
  - 표준이라는 이름을 사용(입/출력이 이미 정해져 있음을 의미)
  - 표준 입력 장치 : 키보드 / 표준 출력 장치 : 모니터

#### 표준 출력

- 표준 출력의 기본 형태는 문자열
  - println : 한 줄을 출력하기 때문에 라인의 끝에 뉴라인이 자동으로 출력
  - printf
    - format string(문자열 꾸미기)
    - 출력할 때 출력형태로 직접 지정
    - 출력할 문자열을 미리 구성하고 출력
    - 출력하려는 문자열 내에 %가 붙은 문자를 형식지정자
      - boolean 형태 : %b
      - 정수 형태 : %d
      - 문자열 형태 : %s
      - 문자 형태 : %c
      - 실수 형태 : %f(부동소수점 형태로 출력)

#### 표준 입력

- 표준 입력은 문자 (문자열)만 입력 가능
  - 숫자나 다른 형태는 입력❌

- Scanner 클래스를 이용하면 제일 쉽게 표준 입력을 처리
  - 사용은 쉬운데 속도는 느림 (코딩 테스트에서는 잘 사용)
    - InputStream (1바이트 입력)
    - InputStreamReader (1문자 입력)
    - BufferedReader (문자열 입력)

#### 객체 object

- 변수는 곧 객체, 객체는 변수
- 직역하면 '사물'이라는 뜻
- 변수 (메모리)를 단순한 값으로 해석하지 않고 살아있는 생물, 물체 정도로 파악

#### 파일 입/출력

- 경로 (Path)
  - 폴더나 파일이 있는 위치를 한 줄의 문자열로 표현
  - 일반적으로 파일의 구조는 계층적 구조로 표현 (상위, 하위)
  - 윈도우즈 기준 최상위 폴더 (드라이브, 문자, 이름/C:, D:, ...)
    - 드라이브 문자 이름 하드 디스크(SSD, HDD, USB, ...)마다 문자 이름이 할당
    - "C:" 어떠한 경로든 문자 이름부터 시작 (절대경로)
    - 드라이브 문자 이름으로 시작하지 않으면 상대경로
    - 특수 경로
      - 현재 폴더: .
      - 상위 폴더 : ..
  - 현재 폴더를 절대경로 (폴더와 폴더(파일) 사이의 구분자는 역슬래시를 사용)
    - C:\sungeun\StartJava\src\Hello.java
    - 출발지가 항상 일정 (최상위 폴더)
  - 현재 폴더를 상대경로
    - 현재 위치(작업폴더)에 따라서 경로가 바뀜
    - ..\bin\Hello.class
- 개인 폴더에  sample.txt 파일을 만들기 (자바를 통해서)
  - 개인 폴더의 위치 (경로)
  - C:\sungeun
- 파일의 이름
  - 경로를 포함한 전체 이름이 파일 이름
  - 파일이름.확장자 (xlsx, hwp, doc, jpg, png, txt)

#### 파일의 출력

- 파일에 쓰기
  - 출력이 표준 장치에서 파일로 바뀐 것

```java
public class Main{
	public static void main(String[] args) {
		int num = 10;
		short small = 10;
		// 정수의 형변환 (타입 캐스팅)
		// 크기가 달라짐
		
		small = (short)num; // 강제 형변
		System.out.println(small);
    
    float real = (float)12.34;
    num = (int)real;
    System.out.println(num);
    // 정수와 실수간의 형변환
    // int & float의 크기는 같은데 (지수부 & 가수부로 나눠서 생각)
    // float real = (float)12.78;
    
    System.out.println(Math.round(real)); // 반올림
    System.out.println((int)Math.ceil(real)); // 올림
    System.out.println((int)Math.floor(real)); // 버림
		}
}
```



```java
public class Main {
  public static void main(String[] args) throws IOException{
    Scanner SC = new Scanner(System.in);
    System.out.println(sc.next()); // 단어 입력
    System.out.println(sc.nextLine()); // 라인 입력
    System.out.println(sc.nextInt()); // 정수로 변환
  }
}
```

```java
import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    // 파일 입출력 스트림을 열어준다 (객체)
    // 기존에 파일이 존재하면 기존의 파일은 삭제하고 새로 만들어짐 (주의!)
    // FileOutputStream output = new FileOutputStream("/Users/sungeun/workspace/eclipse/StartJava/sample.md");
    
    // 기존의 파일을 지우고 않고 추가하고 싶은 경우
    FileWriter fw = new FileWriter("/Users/sungeun/workspace/eclipse/StartJava/sample.md"); 
    PrintWriter pw = new PrintWriter(fw);
    
    // 문자 리터럴 타입의 String 타입인데
    // 네트워크/파일 입/출력 String은 사용X
    // Byte 타입만 가능
    //output.write("파일에 기록하고 있습니다." .getBytes());
    //fw.write("String 타입인데 기록이 되네?\n");
    //fw.write("여러줄을 쓰면 어떻게 되지?");
    pw.println("첫번째줄");
    pw.println("두번쨰줄");
    
    // 열러진 출력 스트림을 닫아줌
    // 자바 프로그램이 종료되면 자동으로 닫힘
    // 바꿔 말하면 종료되기 전까지는 계속 열려있는 상태
    //output.close();
    //fw.close();
    pw.close();
  }
}
```

