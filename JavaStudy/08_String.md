# Java String
문자열을 저장하기 위해 사용, 큰따옴표 사용

## String Method
- `length()`: 문자열의 길이
- `toUpperCase()`: 대문자로
- `toLowerCase()`: 소문자로
- `indexOf(_"찾는문자열"_)`: 찾는 문자열이 처음 나타나는 인덱스 반환
- `charAt(_인덱스_)`: 특정 위치에 있는 문자
- `equals()`: 문자열 비교
- `trim()`: 공백 제거

# 문자열 연결 Concatenation
- `+` 연산자 사용
- `concat()` 메소드 사용
    ```java
    String firstName = "John ";
    String lastName = "Doe";
    System.out.println(firstname.concat(lastName));
    ```
(`+`가 더 선호되긴 함)

## 숫자와 문자열
```java
String x = "10";
int y = 20;
String z = x + y;
```

# 특수문자 출력
이스케이프 문자
|Escape character|Result|
|-|-|
|&#92;'|'|
|&#92;"|"|
|&#92;&#92;|&#92;|

그 외 추가
|Code|Result|
|-|-|
|&#92;n|다음 줄로|
|&#92;r|Carriage Return|
|&#92;t|Tab|
|&#92;b|Backspace|
|&#92;f|Form Feed|
- &#92;r: 커서를 다음 줄로 넘기지 않고 첫 번째 위치로 넘김(&#92;r 뒷부분은 이전에 작성한 부분에 덮어쓰기)
    예: "aaaaa&#92;rbb" → bbaaa
- &#92;f: 커서를 다음 페이지 시작부분으로 넘김