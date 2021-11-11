```java
import java.util.*;

class Tv {
  boolean power;
  int channel;
  
  // true or false
  void power() {power = !power;}
  void channelUp() {channel++;}
  void channelDown() {channel--;}
}

// java는 다중상속(1개 이상의 클래스를 상속)을 지원하지 않음
// 무조건 하나의 클래스만 상속
class CaptionTv extends Tv {
  
  // 자식 클래스에서 새로 추가된 속성
  String text;
  void caption() {} 
}

class Other {
  
}

// java파일 하나당 하나의 public 클래스를 가질 수 있음
public class Ex01 {
  public static void main(String[] args){
    	
      // is-a 관계 즉, 상속관계에서만 사용이 가능
    	// CaptionTv는 Tv다 (CaptionTv is a Tv)
    	Tv t1 = new TV();
    	//CaptionTv c = new CaptionTv();
    	Tv t2 = new CaptionTv();
    	CaptionTv c = new CaptionTv();
    
    	t2.power();
    	t2.channelUp();
    	// t2.text 	// TV타입의 참조형 변수는 자식 타입의 속성까지 알 수 없음
    	// t2.caption();
    
    	c.power();
    	c.channelDown();
    	
    	
    	// 참조변수와 객체의 타입이 다르면 안됨
    	// Tv t3 = new Other();
    
    	// Tv는 CaptionTv이다는 성립하지 않음
    	// CaptionTv c = new Tv();
    	
  }
}
```

#### 추상 클래스

- 추상 메서드를 포함하는 클래스를 `추상클래스`라고 함
  - 추상 메서드란 메서드 내부가 정의되지 않은 메서드를 `추상메서드`라고 함
- 완성되지 않은 클래스
  - 인스턴스화 할 수 없음
  - 객체로 생성될 수 없다는 의미
  - 반드시 상속을 통해서 추상 메서드를 메서드 재정의(오버라이딩)을 통해서 메서드 내부를 정의해야만 인스턴스화할 수 있음

#### 인터페이스

- 추상 클래스의 종류
- 추상 메서드만을 가지는 추상 클래스 `인터페이스`라고 함

```java
import java.util.*;

interface Interface {
  public abstract void abstractMethod1();
  public abstract void abstractMethod2();
  public abstract void abstractMethod3();
}

// 인터페이스의 상속은 extends가 아닌 implements로 상속이 됨
// 여러 개의 인터페이스를 상속 받아서 구현
// java는 다중 상속을 허용하지 않지만 한개의 클래스(일반,추상) 여러 개의 인터페이스

class sample implements Interface {
  public void abstractMethod(){}
  public void abstractMethod(){}
  public void abstractMethod(){}
}

public class Ex03 {
  public static void main(String[] args) {
    Sample s = new Sample();
  }
}
```



```java
import java.util.*;

// 동물 클래스를 정의
class Animal {
  String name;
  
  public void setName(String name) {
    this.name = name;
  }
}

// 동물 클래스를 상속받은 호랑이
class Tiger extends Animal {
  
}

// 동물 클래스를 상속받은 원숭이
class Monkey extends Aniaml {
  
}

// 동물원 클래스를 정의
class zoo {
  
  // 메서드 오버로딩
  public void food () {
    // 호랑이가 입력으로 오면 닭을 출력
    // 원숭이가 입력으로 오면 바나나를 출력
    System.out.println("닭");
  }
  
  public void food (Monkey monkey) {
    // 호랑이가 입력으로 오면 닭을 출력
    // 원숭이가 입력으로 오면 바나나를 출력
    System.out.println("바나나");
  }
}

public class Ex04 {
  public static void main(String[] args) {
    Zoo zoo = new Zoo();
    Tiger tiger = new Tiger();
    Monkey monkey = new Monkey();
    zoo.food(tiger);
    zoo.food(monkey);
  }
}
```

```java
import java.util.*;

/*
 * 
 * 동물원 클래스를 가정
 * 호랑이가 들어오면 닭을 먹이로 주고
 * 원숭이가 들어오면 바나나를 먹이로 주고 ..
 * 
 */

// 동물 클래스를 정의
class Animal {
	String name;
	
	public void setName(String name) {
		this.name = name;
	}
}

//인터페이스를 도입해 봄
interface Ground {
	
}

//interface Birds {
//	public String getAction();
//}

// 추상 클래스로 바꿔보기
abstract class Birds extends Animal {

	// 추상 메서드와 일반 메서드가 같이 구현
	public abstract String getAction();
	public void getName() { System.out.printf("너의 이름은: %s\n", this.name); }
}

interface Foodable {
	public void food();
}

//interface ActionFoodable {
//	public String getAction();
//	public void food();
//}

// 인터페이스라면 extends를 통해서 여러개의 인터페이스를 상속받을 수 있음 
interface GroundFoodable extends Ground, Foodable {
	
}


class Tiger extends Animal implements GroundFoodable{
	public void food() { System.out.println("닭");}
}

class Monkey extends Animal implements Ground, Foodable{
	public void food() { System.out.println("바나나");}
}

class Lion extends Animal implements Ground, Foodable {
	public void food() { System.out.println("소고기");}
}

class Eagle extends Birds implements Foodable {
	Eagle() { this.name = "독수리"; }
	public String getAction() { return "Fly"; }
	public void food() { System.out.println("지렁이");}
}

class Duck extends Birds implements Foodable {
	Duck() { this.name = "오리"; }
	public String getAction() { return "Fly"; }
	public void food() { System.out.println("물고기");}
}

class Tazo extends Birds implements Foodable {
	Tazo() { this.name = "타조"; }
	public String getAction() { return "Walk"; }
	public void food() { System.out.println("사료");}
}


// 동물원 클래스를 정의
class Zoo {
	
	public void action( Ground ground ) {
		System.out.println("Walk");
	}
	
	public void action( Birds bird ) {
		System.out.println(bird.getAction());
		bird.getName();
	}
	
//	public void food( Animal animal ) {
//		// 동물에 따라서 음식을 다르게 표현
//		// 객체지향은 아래와 같이 코드가 늘어나는 것을 좋아하지 않음
//		if ( animal instanceof Tiger ) System.out.println("닭");
//		else if ( animal instanceof Monkey ) System.out.println("바나나");
//		else if ( animal instanceof Lion ) System.out.println("소고기");
//		else if ( animal instanceof Eagle) System.out.println("지렁이");
//		
//	}
	public void food( Foodable animal ) {
		animal.food();
	}
}


public class Ex04 {
	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		Tiger tiger = new Tiger();
		Monkey monkey = new Monkey();
		Lion lion = new Lion();
		Eagle eagle = new Eagle();
		Duck duck = new Duck();
		Tazo tazo = new Tazo();
		
		
		zoo.action( tiger );
		zoo.action( monkey );
		zoo.action( lion );
		zoo.action(duck);
		zoo.action(eagle);
		zoo.action(tazo);
		
		zoo.food(tiger);
		zoo.food(monkey);
	}
}
```

#### 패키지

- 자바의 클래스들을 모아 놓은 폴더
  - 폴더의 경로를 표현할  사용하는 구분자
    - 윈도우즈 : \ 
    - 맥, 리눅스 : /
  - 자바에서는 패키지의 경로를 표현할 때 `.`을 사용

> 패키지 주의 사항
>
> - 모든 클래스는 반드시 하나의 패키지에 포함
> - 하나의 소스파일(.java)에는 첫 번째 문장으로 단 한번의 패키지를 선언할 수 있다.

- 패키지란?
  - 동일한 특징을 갖는 열개의 클래스를 하나의 폴더로 관리하는 방법

#### 예외처리

- 코드를 작성하면서 발생하는 예외 (에러, 경고, ...) 에 대한 처리 방법 2가지

  1. 고전적인 예외처리 (LBYL)

  - Look Before Tou Leap (도약하기 전에 확인 해라)

  - 코드를 실행하기 전에 예외가 발생하지 않도록 미리 검증하고 실행을 하자

  - 즉, 발생할 수 있는 모든 예외적인 상황들에 대해서 미리 예측하고 미연에 하지 않겠다는 뜻

  - 현실적으로 불가능한 방법

    - 만약에 가능했으면 여러분들은 아마 패치나 업데이트라는 개념을 모르고 살았을 것

    - 완벽하게 예외를 제어할 수 없음

    - 안전한 소프트웨어는 불가능 하다는 것이 학계 정설

    - 전통적으로 예외를 처리해오던 방법

    - 아직도 사용

  2. EAFP

  - It's Easier Ask Forgiveness Than Permission
  - 허락보다 용서가 쉽다(광고 문구)
  - 일단, 실행하고 예외가 발생하면 그때 처리하자
  - 실제로 고전적인 방법보다 예외 관리가 더 쉬워지는 그런 경우가 있습니다.

#### 예외의 종류

- 에러는 예외의 한 종류
- 예외에도 여러가지(경고, 에러, ... )
- 에러는 에러가지 예외들 중에서도 프로그램 실행에 영향을 줄 만큼 심각한 오류
- 에러 또한 여러가지 종류가 있음
  - 컴파일 에러
    - 컴파일 할 때 발생하는 에러(javac)
      - *.java → *.class
    - 대부분이 문법적인 오류가 있는 경우
    - 처리가 쉬움
  - 런타임 에러
    - 문법 오류는 체크가 끝(실행에 문제가 없는 상태)
    - 실행했을 때 문제가 나오는 경우
    - 재현되지 않는 에러는 해결이 불가능 한 경우가 많음

#### 예외의 기본 구조

```
try {
  ...
} catch(예외1) {
  ...
} catch(예외2) {
  ...
}
```

- 예외가 발생할 것 같은 코드를 `try`구문으로 감싸줌
  - 자바는 try 블록에 있는 명령어에 대해서 모니터링을 수행
- 예외가 발생하면
  - catch 블록으로 예외를 넘기게 됨
  - catch 구문에서 해당 예외를 처리
- If - else if와 방식이 동일

#### 예외의 흐름

- 예외가 발생하는 곳과 예외가 처리되는 곳이 다를 수 있음
- 예외는 발생을 하면 어디에서든 처리를 해줘야 함

```java
import java.util.*;

// 모든 예외는 Exception 클래스를 상속 받아서 정의
// 직접 예외를 정의
class MyException extends Exception {
	MyException() {
		System.out.println("내가 만든 예외");
	}
}

// 예외의 흐름
class Sub {
	public int convToInt( String strs ) {
		try {
			return Integer.parseInt(strs); // 예외가 발생하는 곳
		} catch(Exception e) {
			System.out.println("예외가 발생한 곳에서 처리");
			// 예외도 객체
			throw new ArithmeticException();
		}
//		return 0;
	} 
}

class Other extends Object {
	public int middleMethod( String strs ) throws MyException {
		Sub s = new Sub();
		try {
			return s.convToInt(strs);
		} catch (ArithmeticException e) {
			System.out.println("middleMethod에서 예외가 처리됨");
			throw new MyException();
		}
//		return 0;
	}
}

public class ex01 {
	public static void main(String [] args) {
		Other exam = new Other();
		int num = 0;
		try {
			num = exam.middleMethod("a");
		} catch(Exception e) {
			System.out.println("결국 여기까지 오고야 말았구나");
		}
		System.out.println(num);
	}
}
```



### 프로세스 Process

- 윈도우즈에서 실행 중인 프로세스 확인하는 방법
  -  ctrl + shift + esc
- 운영체제에서 작업을 실행하는 단위 (상태)
  - 포그라운드 프로세스 (눈에 보이는 실행)
  - 백그라운드 프로세스 (눈에 보이지 않는 실행)

- **스레드** 
  - 프로세스의 작업 단위
  - 프로세스는 자신이 해야 되는 작업을 여러 개의 스레드로 작게 쪼갤 수 있음
  - 이렇게 쪼개진 여러 개의 스레드를 '동시'에 실행 (병렬)
