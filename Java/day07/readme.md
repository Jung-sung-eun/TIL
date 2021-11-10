## 2021. 11. 09

#### 참조형 변수의 반환

- 참조형 타입의 변수를 반환할 때도 마찬가지로 주소가 반환 됨

#### 재귀호출

- Recursive call

- 자기 자신을 호출하는 메서드
  - 재귀는 반복문을 이용하지 않는 반복의 또 다른 형태
  - 메서드는 실행이 될 때마다 메모리가 생성
- 재귀를 이해하는 것은 굉장히 어려움
  - 머리로 이해하는 것은 불가능이지 않을까



#### 객체지향 프로그래밍

`Object Oriented Programming`

- 객체지향 프로그래밍이 나온 가장 큰 이유는?

  - 커지는 소스코드의 양을 감당할 수 없는 것
  - 하드웨어는 계속 발전하고 처리양도 늘어나고 프로그램은 점점 더 복잡
    - 복잡해진다는 것은 소스코드가 늘어난다는 뜻
    - 늘어나는 코드의 양을 감당하기 힘듦
  - 대규모 소프트웨어의 개발의 어려움을 해소하기 위해서 나온 개념
  - 소프트웨어를 관리하는 개발하는 전체적인 방법론에 대한 얘기
    - 기획 → 요구사항 → 설계 → 구현(개발) → 배포 → 유지보수
    - 소프트웨어 공학
  - 수업시간에 다루는 클래스나 객체 대한 내용은 객체지향의 아주 일부분
  - 수업시간에 다루는 내용만 가지고 정확한 이해는 어려움
    - 전체 내용에서도 구현(개발)에 국한되어서 언어들이 객체지향  프로그래밍을 하기 위한 기능을 확인
    - 자바는 객체지향이라는 개념을 위해서 어떤 기능을 제공하는가?

- 수업 시간에 자바가 제공하는 클래스 & 객체라는 개념에 대해서 배움

  - 클래스와 객체라는건 자바에서만 사용할 수 있는 고유기능이 아님
  - 객체지향 방법론을 이루고 있는 하나의 개념(기술이자 정의), 그런 개념을 사용할 수 있는 수단을 제공

  - 다른 언어에 비해서 자바는 가장 객체지향 개념에 제일 가까운 언어
    - 다른 언어들은 완벽하게 객체지향을 제공하지는 못 함

#### 클래스

- 클래스를 아주아주 축소한 개념으로 보자면
  - 클래스는 얼마든지 확장될 수 있고 수업시간에는 아주 작은 의미의 클래스를 다루게 됨
- 사용자가 정의하는 새로운 타입 정도로 해석
  - 기본 타입을 제외한 String, Array 등은 자바에서 미리 정의된 클래스
  - 이러한 클래스를 새로운 타입을 정의
- 미리 정의된 클래스 뿐만 아니라 직접 클래스를 정의해서 사용할 수 있다는 의미
- 클래스를 정의하는 기본적인 형태

```java
class 클래스 이름 {
  // 클래스 블록
}
```

- 일반적으로 클래스의 이름은 대문자로 시작
  - 클래스를 제외한 변수의 이름이나 메서드의 이름은 소문자
  - 유일하게 클래스만 대문자로 시작
  - 반드시 지켜야 할 필요는 없지만 지켜주는게 좋음

#### 객체란?

- Object (객체) 또는 Instance (인스턴스)
- 클래스는 정의임
  - 이렇게 정의된 클래스를 사용하기 위해서 메모리에 만들어줘야 함
  - 정의된 클래스를 메모리에 생성하게 되면 `객체`라고 함
  - 인스턴스화 하다고 표현
- 객체란 메서드 호출과 같음
  - 메서드를 호출하면 메모리에 만들어짐 (콜스택)
  - 클래스를 호출하면 클래스가 메모리에 만들어 짐
    - 메서드는 실행이 끝나면 메모리에서 사라짐
    - 객체는 종료라는 개념이 없음
    - 한번 만들어지면 임의로 직접 삭제하기 전까지는 계속 메모리에 존재
      - 이것을 우리는 `객체`라고 부르기로 함
- 같은 클래스의 객체를 여러 개 생성
  - 동일한 타입의 변수가 여러 개인 것을 볼 수 있음
  - 타입이 같을 뿐 생성되는 변수는 다름 (메모리의 위치)



> 모든건 주소를 기준으로 구분할 수 있음
>
> 변수, 메서드, 클래스, 객체 구분하는 기준은 메모리
>
> 같아 보이는 객체도 주소가 다르면 다른 객체임
>
> 달라 보이는 객체도 주소가 같으면 같은 객체임



#### 클래스의 구조

- 속성 (변수) & 기능 (메서드)로 정의될 수 있음
  - 클래스 내의 변수를 멤버변수라고 표현
  - 하나의 클래스에는 여러 개의 변수와 여러 개의 메서드를 정의
  - 클래스 내의 변수와 메서드는 해당 클래스의 특징을 반영

```java
// 간단한 클래스를 정의
// 수업시간에는 사람 이라는 클래스를 정의
// 객체를 살아있는 생물이나, 물건처럼 취급
// 사람을 모델로 해서 클래스를 정의
class Person {
	
}


public class Chapter6 {

	public static void main(String[] args) {
		
		// 정의된 객체를 생성(메모리에 만들어줍니다)
		// new 연산자를 이용해서 클래스를 호출
		// 이렇게 객체를 생성하면, 이후에 객체에 접근할 수 있는 
		// 방법이 없습니다. 
		// 그렇기 때문에 참조 변수를 둡니다. 
		System.out.println( new Person() );
		
		// 변수(참조변수)를 통해서 객체에 접근
		// 일반적으로, 객체지향 프로그래밍 에서는 변수를 하나의 객체로 취급
		// 정확하게는 변수와 객체는 다릅니다
		// 변수를 객체와 동일시 해서 코드를 작성해도 무방
		Person p1 = new Person();
		
		// 아래의 두 객체는 같은 객체가 됩니다. 
		// 얕은 복사(주소 복사)
		Person p2 = p1;
		System.out.println(p1);
		System.out.println(p2);

	}
}
```

#### 자바의 변수 종류

- 지역변수
  - 메서드 내에서 정의된 변수 (매개변수 포함)
- 객체변수 (인스턴스 변수)
  - 메서드 외부, 클래스 내에서 정의된 변수
  - 반드시 객체를 통해서만 접근
    - `객체.속성명`
  - 객체 변수는 각 객체에 속한 고유 메모리에 만들어짐
    - 메서드의 지역변수와 마찬가지
    - 객체간의 속성은 공유되지 않음

#### this?

- 객체 자기 자신을 나타냄

```java
class Person {

	static int share = 10;
	
	String name;
	int age;	
	
	// 객체의 속성을 출력해주는 메서드를 정의
	void info() {
		// 이렇게 출력을 하고 싶은 것 
		System.out.printf("이름: %s, 나이: %d\n", this.name, this.age);
	}
	
	// 속성을 정의하는 메서드를 추가
	// setter라고 표현 
	// 메서드의 이름 앞에 set을 붙여서 표현
	void set_name(String name) {
		// 전달받은 매개변수로 객체변수를 초기화
		// 둘 다 지역변수의 name
		// 지역변수와 객체변수가 이름이 동일하면 지역변수가 우선
		System.out.print("this: ");
		System.out.println(this);
		
		// this를 이용해서 객체변수를 구분
		this.name = name;
	}
}

public class Chapter6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person();
		Person p2 = new Person();
		
		// 메서드는 어떻게 객체를 구분할까?
		p1.set_name("문자열");
		System.out.print("p1: ");
		System.out.println(p1);
		p1.info();
		
		p2.set_name("아무 문자열");
		System.out.print("p2: ");
		System.out.println(p2);		
		p2.info();
	}
}
```

#### 생성자 Constructor

- 생성 메서드 정도로 이해
  - 약간 특별한 메서드
  - 초기화할 때 

```java
class Person {

	static int share = 10;
	
	String name;
	int age;	
	
	// 생성자
	// 반환 타입이 없다
	// 클래스의 이름과 메서드의 이름이 같아야 함 
	// 생성자를 통한 객체변수의 초기화
	Person(String name, int age) {
		System.out.println("생성자의 실행");
		this.name = name;
		this.age = age;
	}
	
	void info() { 
		System.out.printf("이름: %s, 나이: %d\n", this.name, this.age);
	}
	
	void set_name(String name) {
		this.name = name;
	}
}

public class Chapter6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 생성자는 직접 호출하지 않음!
		// 객체를 생성할 때, 자동으로 호출

		// 생성자에 정의된 파라미터의 타입, 개수, 순서
		Person p1 = new Person("장동건", 20);
		Person p2 = new Person("원빈", 22);
		
		// 객체가 생성될 때, 초기화가 됐으면 ... 
		p1.info();
		p2.info();
	}
}
```



#### Static method VS Instance method

- 인스턴스 메서드 (Instance Method)
  - 생성자를 제외한 지금까지 정의된 메서드는 전부 `인스턴스 메서드`임
  - 객체를 통해서 호출할 수 있음
- 클래스 메서드 (Static Method)
  - 클래스 변수와 객체 변수는 메모리에 생성되는 시점이 다름
  - 클래스 변수는 객체보다 먼저 메모리에 생성
  - 객체변수는 객체가 생성될 때, 메모리에 생성

```java
class Person {

	static int share = 10;
	
	String name;
	int age;	
	
	Person(String name, int age) {
		System.out.println("생성자의 실행");
		this.name = name;
		this.age = age;
	}
	
	// 클래스 메서드(static method)
	static void get_share() {
      
    // static이 붙은 변수에만 접근이 가능
		System.out.println(share);
		
		// 객체변수에 대한 접근은 불가능
		// System.out.println(this.name);
		// System.out.prinln(name);
	}
	
	void info() { 
		System.out.printf("이름: %s, 나이: %d\n", this.name, this.age);
	}
	
	void set_name(String name) {
		this.name = name;
	}
}

public class Chapter6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 객체를 생성하지 않아도 클래스를 통해서 호출
		Person.get_share();
		
		Person p1 = new Person("장동건", 20);
		Person p2 = new Person("원빈", 22);
		 
		p1.info();
		p2.info();		
	}
}
```



### 클래스의 특징

- 메서드와 변수를 하나의 타입으로 묶어놓은 것이 클래스라고 볼 수 있음
  - 비슷한 특징을 가지고 있는 여러 메서드와 변수를 특징별로 클래스화한 것
  - 그렇게 되면 관리가 더 편해지는 장점을 얻을 수 있음
- 그러다보니 추가적으로 여러가지 특징들이 발생
  - 은닉성 (캡슐화) : 클래스를 보호하기 위한 장치
  - 상속성 (Inherit) : 클래스의 재사용성을 더 확대한 개념
  - 다형성 (Polymorphism) : 오버로딩 (Overloading), 오버라이딩 (Overriding)

#### 은닉성 (캡슐화)

- 클래스 내에서 정의된 변수나 메서드에 대해서 외부에서 함부로 접근하지 못하도록 비공개로 하는 것
  - 객체지향에서 클래스는 제공되는 기능이 어떻게 동작하는지 알 필요가 없다고 얘기하는 것
  - 외부에서는 클래스에 정의된 속성이나 기능을 전부 알 수 없도록 하는 것
  - 필요한만큼만 공개하고 나머지는 몰라도 ''사용할 수 있어''라고 하는 것
- 일반적으로 객체지향 프로그래밍에서는 모든 속성은 비공개로 하는 것을 원칙으로 함
  - 외부에서 접근이 필요한 경우가 있다면 메서드를 통해서 접근할 수 있도록 제공하는 것이 좋음
- **접근제어자 (Access Modifier)**

1. private : 동일 클래스 내에서만 접근
2. default : 동일 패키지에서만 접근
3. protected : 해당 클래스를 상속받은 외부 패키지의 클래스까지 가능
4. public : 제한이 없음
   - private → default → protected → public

```java
class Person {

	static int share = 10;
	
	private String name;
	private int age;	
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	static void get_share() {
		System.out.println(share);
	}
	
	void info() { 
		System.out.printf("이름: %s, 나이: %d\n", this.name, this.age);
	}
	
	// setter
	void set_name(String name) {
		this.name = name;
	}
	
	// getter
	String get_name() {
		return this.name;
	}
}

public class Chapter6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person.get_share();
		
		Person p1 = new Person("장동건", 20);
		Person p2 = new Person("원빈", 22);
		 
		p1.info();
		p2.info();

		// private 속성이나 메서드에 대해서는 외부 접근이 불가
//		p1.name;
		
		// 비공개 속성인 경우 클래스에서 제공하는 메서드를 통해서 접근
		System.out.println(p1.get_name());
		
	}
}
```



#### 상속

- '물려받는다'라는 의미
- 클래스의 재사용성을 더 극대화한 개념
  - 잘 정의된 클래스가 있다면 다시 정의해서 사용하지 않고 재사용할 수 있게 해보자
  - 물려받은 클래스를 더 확장해서 사용
- 클래스와 클래스 간의 관계를 표현
  - 하나의 프로그램을 만들 때 하나의 클래스만 사용되지는 않음
  - 여러 개의 클래스가 서로 유기적으로 잘 연결되어서 동작
  - 객체지향 프로그래밍에서 가장 중요한 건 클래스의 설계
  - 클래스들의 관계
    - is - a (상속)
    - has - a (다른 클래스의 객체들 속성으로 갖는 경우)
  - EX) '모든 학생은 사람이다'라고 할 수 있음
    - 학생 is 사람
    - 반대는 성립하지 않음 (모든 사람은 학생이다)
    - 클래스의 상속은 큰 개념에서 작은 개념으로 상속
    - 학생도 사람이닌까 사람이 갖는 기본적인 속성이나 기능은 같을 것이라고 가정
      - 학생이라는 클래스를 정의 한다면?
      - 사람에 대한 속성이나 기능을 새로 정의 (X)
      - 미리 정의된 사람 클래스를 상속 받아서 나머지 학생에 대한 속성이나 기능만 추가하면 되도록
- 부모 클래스, 자식 클래스

```java
class Person {

	static int share = 10;
	
	String name;
	int age;	
	
//	Person(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
	
	static void get_share() {
		System.out.println(share);
	}
	
	void info() { 
		System.out.printf("이름: %s, 나이: %d\n", this.name, this.age);
	}
	
	void set_name(String name) {
		this.name = name;
	}
	
	String get_name() {
		return this.name;
	}
}

// Person 클래스를 상속 받아서 Student 클래스 정의
class Student extends Person{
	// 정의된게 없어도 
	// 물려받은 속성과 기능을 사용할 수 있다. 
}

public class Chapter6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.info();
	}
}
```



### 다형성 (Polymorphism)

#### 오버로딩 (Overloading)

- 상속과는 무관한 개념
- 오버로딩의 조건
  1. 오버로딩하는 메서드의 이름은 반드시 같아야 함
  2. 오버로딩하는 메서드의 매개변수도 반드시 
     - 매개변수의 개수와 타입

```java
// Person클래스를 상속 받아서 Student클래스를 정의
class Person extends Student{
 	// 오버로딩
  int add() {
  return 10 + 20;
	} 
	int add (int a) {
  	return a + 30;
	}
  int add (int a, int b) {
    return a + b;
  }
  int add (int a, int b, int c) {
    return a + b + c;
  }
  String add (String c, String d) {
    return c + d;
  }
}

public class Chapter6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();

		System.out.println( s1.add());
		System.out.println( s1.add(10));
		System.out.println( s1.add(10, 20) );
		System.out.println( s1.add("Hello", "Java"));
		System.out.println( s1.add(10, 20, 30));
  }
}
```

#### 오버라이딩 (Overriding)

- 메서드 재정의
- 부모 클래스로부터 물려받은 메서드를 그대로 사용하지 않고 자식이 재정의해서 사용x
- 오버라이딩 조건
  - 재정의하려는 메서드와 물려받은 메서드의 이름이 같아야 함
  - 리턴 타입, 매개변수 개수, 타입이 모두 같아야 함

```java
class Person {

	static int share = 10;
	
	String name;
	int age;	
	
	// 생성자 오버로딩
	Person() {} // 기본 생성자는 아무것도 하지 않음
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	static void get_share() {
		System.out.println(share);
	}
	
	void info() { 
		System.out.printf("이름: %s, 나이: %d\n", this.name, this.age);
	}
	
	void set_name(String name) {
		this.name = name;
	}
	
	String get_name() {
		return this.name;
	}
}

// Person 클래스를 상속 받아서 Student 클래스 정의
class Student extends Person{
	
	String school;
	
	// 생성자는?
	// 상속되지 않음
	// 생성자를 정의하지 않으면 기본 생성자가 존재
	// 생성자를 따로 정의 한다면 기본 생성자는 안만들어짐
	// 기본 생성자
	
	Student() {};
	Student( String name, int age, String school ) {
		// super( name, age ); // 부모 클래스의 생성자를 직접 호출
		this.name = name;
		this.age = age;
		this.school = school;
	}
	
	// info() 메서드를 재정의 한다면
	void info() {
		// 부모 클래스의 메서드를 사용하고 싶다면?
		// super: 부모 클래스, super.속성
		// super(): 부모 클래스의 생성자
		// this: 객체 자기 자신
		super.info();
		System.out.printf("학교이름: %s\n", this.school);
	}
}

public class Chapter6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("장동건", 20, "멀티캠퍼스");
		s1.info();
	}
}
```

#### 싱글톤 패턴 (Singleton pattern)

- 디자인 패턴중에 하나인 싱글톤 패턴이 있음

- 동일한 타입(클래스)의 여러 객체를 생성
  - 하나의 객체만 생성하게 강제
  - 즉, 클래스 하나당 객체 하나

```java
class Singleton {

	private static Singleton one = null;
	private Singleton() {}
	
	// 아무도 생성할 수 없으면 안되니깐 
	// 생성을 도와주는 메서드
	public static Singleton getObject() {
		// 생성자 호출이 가능
		if ( one == null ) one = new Singleton();
		return one;
	}
}

public class SingletonTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 아무도 객체를 만들수 없습니다.
		// Singleton single = new Singleton();
		Singleton single = Singleton.getObject();
		System.out.println(single);
		
		// 더 이상의 새로운 객체는 생성불가
		Singleton single2 = Singleton.getObject();
		System.out.println(single2);
		
		System.out.println( Singleton.getObject() );

	}
}
```


