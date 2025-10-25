# FileInputStream 클래스
이진 데이터를 다루거나, raw byte 단위를 다룰 대 `FileInputStream` 클래스를 사용한다.

```java
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) {
        // try-with-resources: FileInputStream 자동 닫기
        try (FileInputStream input = new FileInputStream("filename.txt")) {
            int i;  // 파일에서 읽은 바이트를 저장할 변수

            // 파일 끝까지 읽기 (-1: EOF, End Of File)
            while ((i = input.read()) != -1) {
                System.out.print((char) i);  // 바이트를 문자로 변환하여 출력
            }
        } catch (IOException e) {
            System.out.println("파일 입출력 오류: " + e.getMessage());
        }
    }
}
```
`FileInputStream`의 강력한 장점은 텍스트 뿐만 아니라 **어느 타입의 파일**이든 다룰 수 있다는 것이다.
```java
/* 이미지를 복사하는 예시 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Temp {
    public static void main(String[] args) {
        // try-with-resources: FileInputStream 자동 닫기
        try (FileInputStream input = new FileInputStream("image.jpg";
             FileOutputStream output = new FileOutputStream("copy_image.jpg"))) {
            int i;  // 파일에서 읽은 바이트를 저장할 변수
            // 파일 끝까지 읽기 (-1: EOF, End Of File)
            while ((i = input.read()) != -1) {
                output.write(i);  // 읽은 바이트를 출력 파일에 쓰기
            }
            System.out.println("파일 복사가 완료되었습니다.");
        } catch (IOException e) {
            System.out.println("파일 입출력 오류: " + e.getMessage());
        }
    }
}
```