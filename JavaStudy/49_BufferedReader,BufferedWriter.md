# BufferedReader 클래스

`BufferedReader`와 `BufferedWriter`는 문자 입력과 출력을 빠르게 처리한다.

- `BufferedReader`는 `readLine()` 메서드를 제공하여 한 줄씩 읽을 수 있다.
- `BufferedWriter`는 `newLine()` 메서드를 제공하여 텍스트를 효율적으로 쓸 수 있다.

이 클래스들은 보통 `FileReader` 및 `FileWriter`와 함께 사용된다. buffered 클래스는 메모리 버퍼를 사용하여 입출력 성능을 향상시킨다.

## 텍스트 파일 읽기
`BufferedReader`, `FileReader`
```java
public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("filename.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
```

# BufferedWriter 클래스
기본: 덮어쓰기. 추가 모드: true
```java
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
    try (BufferedWriter bw = new BufferedWriter(new FileWriter("filename.txt"))) {
        bw.write("First line");
        bw.newLine();  // add line break
        bw.write("Second line");
        System.out.println("파일에 성공적으로 작성했습니다.");
    } catch (IOException e) {
        System.err.println("Error: " + e.getMessage());
    }
  }
}
```