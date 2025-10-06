# 패키지
연관된 클래스들을 그룹화하기 위해 사용. 파일 디렉토리의 폴더를 생각하면 됨.
- built-in 패키지: 자바API의 패키지
- 사용자 정의 패키지

## Built-in Package
미리 작성되었고, JDE(Java Development Environmentt)에 포함되었음.

입력 관리, 데이터베이스 프로그래밍, 그 외 기타등등 여러 기능을 포함함. 해당 리스트는 오라클 웹사이트에서 확인 가능: https://docs.oracle.com/javase/8/docs/api/

라이브러리는 **패키지**와 **클래스**로 구분됨. 패키지 내 단일 클래스(메서드와 속성들)을 가져오거나, 패키지를 통째로 import할 수 있음.

`import` 키워드 사용
```java
import java.util.Scanner;
// java.util: 패키지
// .Scanner: 클래스
```

## 사용자 정의 패키지
파일 구조가 다음과 같다고 하자.
```
ㄴ root
    ㄴ mypack
        ㄴ MyPackageClass.java
```
1. 패키지를 생성하기 위해 `package` 키워드를 사용한다.
```java
/* MyPackageClass.java */
package mypack;
class MyPackageClass {
    public static void main(String[] args) {
        System.out.println("This is my package!");
    }
}
```
2. MyPackageClass.java를 저장하고, 컴파일한다.
```bash
C:\Users\YourName > javac MyPackageClass.java
```
3. 그 다음, 패키지를 컴파일한다.
```bash
C:\Users\YourName > javac -d . MyPackageClass.java
```
이는 컴파일러가 "mypack" 패키지를 생성하도록 한다.

`-d` 키워드는 클래스 파일을 어디에 저장할지 지정하도록 특정한다. 위의 코드에서는 "`.`"을 사용해, 현재 위치한 폴더를 지정했다.
> 현재 위치: 점(`.`)<br>
> 상위 폴더: 점 2개(`..`)<br>

*__주의__: 패키지 이름은 소문자로 작성되어야 한다. 클래스 이름과 겹칠 수 있기 때문에!*

4. 위의 예시와 같이 패키지를 컴파일하면, "mypack"이라는 새로운 폴더가 생성된다.

5. MyPackageClass.java를 실행하고 싶으면, 다음과 같이 입력하면 된다.
```bash
C:\Users\YourName > java mypack.MyPackageClass
```