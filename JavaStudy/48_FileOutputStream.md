# FileOutputStream 클래스

이전, `FileWriter`를 사용하여 파일에 텍스트를 썼다.
`FileOutputStream` 클래스는 비슷한 방식으로 작동하지만, 바이트 단위로 파일에 데이터를 쓴다. 즉, 텍스트파일 뿐만 아니라 이미지, 오디오, 비디오 등 모든 종류의 파일을 다룰 수 있다.

디폴트가 덮어쓰기 이지만, 두 번째 매개변수로 `true`를 전달하여 이어쓰기 모드로 열 수도 있다.

```java
public class FileOutputStreamTest {
    public static void main(String[] args) {
        String text = "Hello, World!";

        try (FileOutputStream output = new FileOutputStream("filename.txt")) {
            output.write(text.getBytes());
            System.out.println("쓰기 성공");
        } catch (IOException e) {
            System.out.println("쓰기 실패");
            e.printStackTrace();
        }
    }
}
```
```java
// 텍스트X, 이미지 파일 복사 예제
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
  public static void main(String[] args) {
    // Copy image.jpg into copy.jpg
    try (FileInputStream input = new FileInputStream("image.jpg");
         FileOutputStream output = new FileOutputStream("copy.jpg")) {

      int b;
      while ((b = input.read()) != -1) {
        output.write(b);  // write each raw byte to the new file
      }
      System.out.println("File copied successfully.");
    } catch (IOException e) {
      System.out.println("Error handling file.");
    }
  }
}
```