## 2021. 11. 16 화

#### 2차원 배열

```java
import java.uti.*;
public class Main {
  public static void main(String[] args) {
    
    // 2차원 배열
    int [][] arr2D = new int[5][5];
    
    // 초기화된 2차원 배열의 선언
    // 배열의 원소로 배열을 갖는 형태
    // 문자열 배열도 2차원 배열과 동일한 형태
    int [][] arrInit = {
      
      		{10, 20, 30},
      		{40, 50, 60}
    };
    
    // 2차원 배열에서 원소에 대한 참조
    System.out.println(Arrays.toString(arrInit[0]));
    System.out.println(arrInit[0][1]);
  }
}
```

