상수를 묶어놓은 특별한 "클래스"

`enum` 키워드 사용, 모든 상수는 대문자로 작성
```java
enum Level {
    LOW,
    MEDIUM,
    HIGH
}
```
그런 enum 상수는 점(".")으로 접근
```java
Level myVar = Level.MEDIUM;
```

### enum과 클래스의 차이
enum도 클래스와 마찬가지로, 속성과 메서드를 가질 수 있다.

다만, 그 차이는 enum이 public, static, final인 것이다. (=변경 불가, 덮어씌울 수 없음)

객체를 생성하거나, 다른 클래스를 상속할 수 없다.(하지만 인터페이스는 구현할 수 있다)

## enum 생생자
enum도 생성자를 가질 수 있다.
```java
enum Level {
    // enum 상수
    LOW("Low Level"),
    MEDIUM("Medium Level"),
    HIGH("High Level");

    //description을 저장하는 필드
    private String description;

    //생성자
    private Level(String description) {
        this.description = description;
    }

    // Getter 메서드, description 반환
    public String getDescription() {
        return description;
    }
}

public class Temp {
    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;
        System.out.println(myVar.getDescription());
    }
}
```