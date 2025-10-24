# `try`-with-resources

## close resources
파일, 스트림, 또는 다른 리소스들을 사용한 후, **닫는** 것이 매우 중요하다!!! 닫지 않으면 메모리 누수가 발생할 수 있고, 해당 파일을 다시 여는 것이 불가능할 수도 있다.

자바 이전에는 `close()` 메서드를 호출하여 수동으로 리소스를 닫는 것이 일반적이었다.

## try-with-resources
자바 7부터는 `try`-with-resources 구문이 도입되었다.

리소스는 `try(...)`의 괄호 안에 선언되며, `try` 블록이 종료될 때 자동으로 닫힌다(에러가 발생하더라도 자동으로 닫힘).

```java
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        // try-with-resources 구문
        try (FileOutputStream output = new FileOutputStream("filename.txt")) {
            String data = "Hello, World!";
            output.write(data.getBytes());
            // 원래는 이 위치에 close() 호출이 필요했음
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
```

리소스가 자동으로 닫히므로 더 안전하고, `close()`를 사용할 필요가 없어 코드가 더 간결해진다.