## 2021. 11. 17

### 변수

- 이름 규칙
  - 숫자 : 앞에서 사용할 수 없음
  - 특수문자 : ($, _, ..) 사용할 수 없음
  - 예약어 : (for, while, ...) 사용할 수 없음



### 생성자

- 특징

  - 리턴 타입이 없음

  - 클래스의 이름과 동일

  - 오버로딩은 가능, 오버라이딩 불가능 → 상속되지 않기 때문에

  - 객체가 생성될 때 자동으로 실행



### 자바 언어의 특징

- 운영체제 독립적 (맥, 윈도우즈, 리눅스)
- 객체지향 언어
- 멀티 스레드 지원



### 자바에서 스레드를 구현하는 두가지 방법

1. Thread클래스를 상속받아서 클래스를 정의하는 방법
   - 자바에서는 다중 상속을 지원하지 않음
   - run() 메서드를 정의
   - start() 메서드를 호출하는 것으로 스레드를 실행
     - class SubProcess extends Thread
2. Runnable 인터페이스를 상속받아서 구현하는 방법
   - 인터페이스는 여러 개 상속하는 것이 가능
   - 자바는 최대 1개의 클래스 & 1개 이상의 인터페이스를 상속
   - run()  메서드를 반드시 구현해줘야 사용 가능
     - run()만 정의되어 있는 인터페이스
   - start() 메서드를 호출하여 스레드를 실행
     - class SubProcess implements Runnnable



### 클래스

```java
class 클래스이름
```

### 추상 클래스

```java
// 선언만 되어있고 내부 기능이 정의되지 않은 메서드
abstract class 클래스이름
```

- 추상 메서드가 하나라도 있으면 추상클래스

### 인터페이스

```java
interface 인터페이스이름
```

- 모든 메서드가 전부 추상 메서드인 경우



#### 추상 클래스 & 인터페이스는 인스턴스화(객체)할 수 없음

- **반드시 상속을 통해서 추상 메서드를 전부 구현**



### 클래스의 구성 요소

- 속성 (멤버변수)
- 기능 (메서드)
- 생성자
- 소멸자 (없다고 봐도 무방..)
  - 객체가 사라질 때, 생성한 메모리를 회수, ...
  - finalize()

#### 클래스의 특징

- java파일 하나에 public class는 한 개가 원칙

```java
public class // 제한없이 접근
default class // 동일 패키지에서만 접근
private // 멤버변수, 메서드
static // 멤버변수, 메서드
final // 변수 → 상수
final class // 변경될 수 없는 클래스, 확장 불가, 다른 클래스에서 상속될 수 없음
final interface (x) // 무조건 상속을 통해서 추상메서드를 구현해야하는 상속될 수 없음 (있으나 마나임) 
abstract // 클래스, 메서드
```



```java
import java.util.*;

// this, super

class A {
  //  생성자를 정의하지 않으면 디폴트가 생성자가 실행
  A() {
    System.out.pirntln("A() 생성자 호출");
  }
  // 생성자도 오버로딩이 가능
  // 이름은 같아야하고 매개변수는 달라야 함 (개수, 타입)
  A(int a, int b) { // this(), super()나 모두 반드시 생성자의 제일 처음에 실행
    this(); // 같은 클래스의 다른 생성자를 호출
    System.out.pirntln("A(int a, intb) 생성자 호출");
  }
  protected void method() {
    System.out.println("메서드 실행");
  }
}

class B extends A {
  
  private int member;
  
  B() {
    super(10, 20); // 다른 클래스의 생성자 호출은 반드시 제일 처음에 실행
    System.out.println("B() 생성자 호출");
  }
  
  // 오버라이딩 (메서드 재정의)
  // 메서드 이름이 같고 매개변수도 같아야 함
  // 부모 클래스에서 정의된 접근 지정자보다 더 좁은 접근 지정자를 쓸 수 없음
  private void method() {
    System.out.println("재정의된 메서드");
  }
  
  // 공개되지 않은 속성에 접근하기 위해서 메서드를 제공해줄 필요가 있음
  // getter, setter
  public int get_member() {
    return this.member;
  }
}

public class Main {
  public static void main(String[] args) {
    B b = new B();
    b.method();
    System.out.println(b.get_method());
  }
}
```



### 다형성

- 하나의 객체가 여러 개의  타입을 가질 수 있음
  - 오버라이딩, 오버로딩



#### 싱글톤 Singleton

```java
class Singleton {
  
  private static Singleton one = null;
  
  // 아무도 생성할 수 업섹 생성자의 접근 지정자를 private로 정의
  private Singleton() {}
    
    // 아무도 생성할 수 없으면 안되닌까
    // 생성을 도와주는 메서드
    public static Singleton getObjet() {
      // 생성자 호출이 가능
      if (one == null) one = new Singleton();
      return one;
    }
  }
```



### HashMap 

-  key, value의 형태