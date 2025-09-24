# 클래스 생성
`class` 키워드 사용
```java
/* 이름이 Main인 클래스 생성 */
public class Main {
    int x = 5;
}
```
반드시! 대문자로 시작하고, 자바 파일의 이름이 클래스 이름과 일치해야 함을 기억!!

# 객체 생성
클래스 Main을 생성했으므로, 객체를 만드는 데 사용할 수 있다. `new` 키워드 사용
```java
public class Main {
    int x = 5;

    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println(myObj.x);
    }
}
```
## 객체 여러 개 생성
한 클래스에 대해 여러 객체를 생성할 수 있다.
```java
...
Main myObj1 = new Main();   //Object1
Main myObj2 = new Main();   //Object2
...
```

# 여러 클래스 사용
```java
/* Main.java */
public class Main {
    int x = 5;
}
```
```java
/* Second.java */
class Second {
    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println(myObj.x);
    }
}
```
두 파일을 모두 컴파일하고,
```bash
C:\Users\YourName>javac Main.java
C:\Users\YourName>javac Second.java
```
Second.java를 실행하면,
```bash
C:\Users\YourName>java Second
```
결과는 다음과 같다.
```bash
5
```