# ArrayList

크기가 가변적인 배열.

`java.util` 패키지에 포함되었으며, `List` 인터페이스를 구현한 클래스이다.

내장 배열과 달리, 요소를 추가하거나 삭제할 때마다 크기가 자동으로 조절된다. 요소를 자유롭게 추가/삭제할 수 있다. (배열은 새로 배열을 생성해야 함)

## 생성
```java
import java.util.ArrayList;

ArrayList<String> cars = new ArrayList<String>();
```
이제 `add()`, `get()`, `remove()` 등의 메서드를 사용할 수 있다.

## 요소 추가: `add()`
```java
ArrayList<String> cars = new ArrayList<String>();
cars.add("Volvo");
cars.add("BMW");
cars.add("Ford");
System.out.println(cars);
// 결과 >>> [Volvo, BMW, Ford]
```
인덱스 지정 가능: `add(int index, E element)`
```java
cars.add(1, "Audi");
System.out.println(cars);
// 결과 >>> [Volvo, Audi, BMW, Ford]
```

## 요소 접근: `get()`
```java
String car = cars.get(0);
System.out.println(car);
// 결과 >>> Volvo
```

## 요소 수정: `set()`
```java
cars.set(0, "Opel");
System.out.println(cars);
// 결과 >>> [Opel, Audi, BMW, Ford]
```

## 요소 삭제: `remove()`
```java
cars.remove(1);
System.out.println(cars);
// 결과 >>> [Opel, BMW, Ford]
```

(+) 모든 요소 삭제: `clear()`

## 크기 확인: `size()`
```java
int size = cars.size();
System.out.println(size);
// 결과 >>> 3
```
반복문을 사용할 때 유용하다.

예) `for (int i=0; i < cars.size(); i++) { ... }`

# 다른 타입들
`ArrayList`의 요소들은 객체여야 한다. 기본형 타입들은 사용할 수 없다. 앞서 든 예시들은 `String` 객체를 사용했다(원시 타입이 아니다). 다른 타입들, 예를 들어 `int`를 사용하려면, 래퍼 클래스인 `Integer`를 사용해야 한다.

```java
ArrayList<Integer> numbers = new ArrayList<Integer>();
numbers.add(10);
numbers.add(20);
System.out.println(numbers);
// 결과 >>> [10, 20]
```

## 정렬: `Collections.sort()`
리스트를 알파벳순, 숫자순 등으로 정렬할 수 있다.

```java
import java.util.Collections;

Collections.sort(cars);
System.out.println(cars);
// 결과 >>> [Audi, BMW, Ford, Opel, Volvo]
```

## `var` 키워드
Java 10부터는 `var` 키워드를 사용하여 타입을 생략할 수 있다. 컴파일러가 자동으로 타입을 추론한다.

```java
// 기존 방식
ArrayList<String> cars = new ArrayList<String>();

// var 키워드 사용
var cars = new ArrayList<String>();
```