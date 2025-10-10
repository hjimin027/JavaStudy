# User Input(Scanner)
`java.util` 패키지의 `Scanner` 사용

```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter username");
        String userName = sc.nextLine();
        System.out.println("Hello, " + userName);
    }
}
```

## Input Type
위 코드에서 `nextLine()`와 같이, 타입별로 다르게 사용한다.

예) `nextBoolean()`, `nextInt()`, `nextLine()` 등...

타입이 요구하는 타입과 다르면, `InputMismatchException` 등 에러가 발생한다.