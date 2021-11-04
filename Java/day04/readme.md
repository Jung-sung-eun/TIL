## 2021. 11. 04 (목)

### 반복문

#### while

```java
while (명제) {
  // while a block
}
```

#### for

- while과 동일
- 두 문법의 표현이 다를 뿐, 동작의 차이는 없음

```java
for (초기값; 명제; 증감) {
  	// for block
}
```

#### break VS return

- return은 메소드 내에서만 사용 가능

- 루프 안에서 return 사용 불가능

#### for each

- literate 객체에 특화되어 있는 반복문
- literation
  - '반복'이라는 의미
    - 첫 번째 원소부터 마지막 원소까지 접근 가능한 형태
    - 순회 한다고 표현
  - literate 객체란? : 반복 가능한 모든 객체들
  - 배열, String, ArrayList, ...

```java
for (변수: iterate) {
  	// for block
}
```

- 반복 가능한 객체 (iterate 객체)로 부터 첫 번째 원소부터 순차적으로 변수에 대입하면서 마지막 원소까지 반복적으로 처리
- 이터레이트 객체의 원소의 개수만큼 반복



#### EOF (End Of File)

- 파일의 끝
- 입력의 끝으로도 사용
- Windows : ctrl + z / Linux,  MacOs : ctrl + d


