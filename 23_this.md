# `this` 키워드
`this` 키워드는 메서드나 생성자의 현재 객체를 참조할 때 사용한다.

클래스의 속성이 메서드나 생성자의 파라미터와 같은 이름을 가지고 있을 때, 혼동을 피하기 위해 자주 사용된다.

## 클래스 속성 접근
생성자나 메서드에 클래스 변수와 동일한 이름의 파라미터(매개변수)가 있는 경우 → 메서드나 생성자에서 `this` 사용
```java
public class Main {
    int x;  //클래스 변수 x

    //생성자, 매개변수 x
    public Main(int x) {
        this.x = x; //클래스변수 x를 참조
    }

    public static void main(String[] args) {
        Main myObj = new Main(5);
        System.out.println("value of x: " + myObj.x);
    }
}
```
`this.x = x;`는 "`this.x`(클래스변수)가 `x`(매개변수)의 값을 갖는다는 의미다.

## 다른 생성자에서 생성자 호출
`this()` 형태로 사용, 디폴트값을 설정하거나 코드를 재사용할 때 유용
```java
public class Temp {
    int modelYear;
    String modelName;

    //파라미터 1개일 때 생성자
    public Temp(String modelName){
        this(2020, modelName); //생성자 내에서 다른 생성자 호출
    }

    //파라미터 2개일 때 생성자
    public Temp(int modelYear, String modelName){
        this.modelYear = modelYear;
        this.modelName = modelName;
    }

    public void printInfo(){
        System.out.println(modelYear + " " + modelName);
    }

    public static void main(String[] args) {
        Temp car1 = new Temp(2022, "Sonata");
        car1.printInfo();

        Temp car2 = new Temp("Avante");
        car2.printInfo();
    }
}
```