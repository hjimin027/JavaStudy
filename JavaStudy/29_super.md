# `super`
서브클래스가 부모 클래스를 참조할 때 사용

주로 다음 경우에 사용한다:
- 부모 클래스의 속성과 메서드를 접근할 때
- 부모 클래스의 생성자를 호출할 때

## 부모 클래스의 메서드에 접근
부모 클래스의 메서드와 같은 이름을 갖고 있을 때
```java
class Animal {
    public void animalSound() {
        System.out.println("동물이 내는 소리");
    }
}

class Dog extends Animal {
    public void animalSound() {
        super.animalSound();    //부모클래스의 메서드 호출
        System.out.println("개는 멍멍");
    }
}

public class Temp {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.animalSound();
    }
}
```
결과:
```
동물이 내는 소리
개는 멍멍
```

## 부모 생성자 호출
```java
class Animal {
    Animal() {
        System.out.println("Animal 생성자");
    }
}

class Dog extends Animal {
    Dog() {
        super();    // 부모 생성자 호출
        System.out.println("Dog 생성자");
    }
}

public class Temp {
    public static void main(String[] args) {
        Dog myDog = new Dog();
    }
}
```
결과:
```
Animal 생성자
Dog 생성자
```
서브클래스 생성자에서, super()가 반드시 첫 문장이어야 한다.