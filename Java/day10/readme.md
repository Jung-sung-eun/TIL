#### 리스트

- List 인터페이스를 구현한 클래스들
  - ArrayList, LinkedList
  - 선형자료구조의 한 종류

```java
import java.util.*;
public class Ex01 {
  public static void main (String[] args) {
    // 객체 생성
    ArrayList arr = new ArrayList();
    
    // 원소를 추가하는 방법 (add)
    arr.add(10);
    arr.add(20);
    arr.add(30);
    
    // 배열의 내의 원소를 확인 (get)
    System.out.println(arr.get(0));
    
    // 배열의 크기를 확인하고 싶은 경우 (size)
    System.out.println(arr.size());
    
    // 배열에 원소를 삽입하는 경우 (add)
    arr.add(1,15);
    
    // 배열 내의 모든 원소를 확인하고 싶은 경우에 순회
    for (int i = 0; i < arr.size(); i++) {
      System.out.println(arr.get(i));
    }
    
    // 배열의 원소를 검색하는 경우
    System.out.println(arr.contains("15"));
    
    // 배열에서 원소를 삭제하는 경우 (remove)
    
    // 매개변수가 객체인 경우 (기본타입이 아닌 경우)
    arr.remove("10");
    for (int i = 0; i < arr.size(); i++) {
      System.out.println(arr.get(i));
    }
  }
}
```

#### Generics

- 명시된 타입 이외에 다른 타입의 원소를 넣을 수 없음
- 자동으로 타입이 확인이 되는 이점이 있음

```java
import java.util.*;
public class Ex02 {
  public static void main (String[] args) {
    ArrayList arr = new ArrayList();
    
    // 원소의 타입이 String임을 알고 있음
    // arr.add("Java");
    // arr.add("Python");
    // arr.add("C++");
    
    // 배열내의 원소를 꺼내오는 경우
    // ArrayList는 원소의 타입을 Object로 인식을 함
    // 항상 타입변환을 염두해 두어야 함
    // String str = (String)arr.get(0);
    // System.out.println(str);
    
    ArrayList<String> arr = new ArrayList();
		arr.add("Java");
		arr.add("Python");
		arr.add("C++");
		
		// 별도의 타입 체크가 필요하지 않게 됨
		String str = arr.get(0);
		System.out.println(str);
  }
}
```

#### Map (맵)

- Key & Value 형태의 자료형
  - 배열은 인덱스가 정해져 있음 (0부터 순차적으로 번호가 부여)
  - 인덱스 대신에 사용자가 지정한 키를 가지고 인덱싱할 수 있음
- Map 인터페이스를 구현해서 정의된 여러가지 클래스들
  - HashMap, LinkedHashMap, TreeMap, ...

```java
import java.util.*;
public class Ex03 {
	public static void main(String [] args) {
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		// 원소를 추가하는 경우 (put)
		map.put("first", "장동건");
		map.put("second", "원빈");
		
		// 원소를 확인 하는 방법 (get)
		System.out.println( map.get("first") );
		
		// 전체 원소를 확인하려면
		System.out.println(map.entrySet());
		
		// for each
		for( Map.Entry<String, String>item : map.entrySet()) {
			System.out.printf("key: %s, value: %s\n", item.getKey(), item.getValue());
		}
		
		// 키만 확인
		System.out.println(map.keySet());
		
		for( String key: map.keySet()) {
			System.out.println(map.get(key));
		}
		
		// 원소를 삭제하는 경우(remove)
		// 키에 해당하는 원소를 삭제하는 해당하는 돌려줌
		System.out.println( map.remove("first") );
		
		// 크기 확인 (size)
		System.out.println(map.size());
		
	}
}
```


