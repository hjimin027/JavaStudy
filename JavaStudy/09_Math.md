# Math
- `Math.max(x, y)`: 최댓값
- `Math.min(x, y)`
- `Math.sqrt(x)`: 제곱근
- `Math.abs(x)`: 절댓값
- `Math.pow(x, y)`: x의 y제곱(항상 double로 값 반환)

## Rounding
- `Math.round(x)`: 반올림
- `Math.ceil(x)`: 올림
- `Math.floor(x)`: 내림

## Random
`Math.random`: 0.0 이상 1.0 미만 랜덤 숫자
```java
// 0이상 100이하 랜덤 정수
int randomNum = (int)(Math.random() * 101);