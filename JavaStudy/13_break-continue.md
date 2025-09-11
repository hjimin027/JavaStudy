# `break`
루프 밖으로 건너뛰기
# `continue`
루프의 한 반복을 건너뛰고, 다음 루프로

# 예시
```java
// 2를 출력하는 것은 건너뛰고, 4에서 루프 중단
for (int i = 0; i < 6; i++) {
    if (i==2) {
        continue;
    }
    if (i==4) {
        break;
    }
    System.out.println(i);
}
```