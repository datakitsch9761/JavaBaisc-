package joseph.basic.day08;

public class Inheritance { //extends feature

    public static void main(String[] args) {
        //상속
        //객체지향 3대 개념의 하나
        //기존의 클래스에 기능을 추가하거나 재정의해서
        //새로운 클래스를 만드는것을 의미한다

        //상속을 이용하면 기존에 만들어둔 클래스의
        //모든 필드와 메서드를 이용해서
        //새로운 클래스를 편리하게 만들수 있음
        //기존클래스를 부모 / 상위 / 슈퍼 클래스라 하고
        // 새롭게 작성된 클래스를 자식/sub class라고 한다

        //상속의 장점
        //기존 작성된 클래스를 재활용
        //클래스의 계층구조 파악 용이
        //소프트웨어의 생산성이 향상

        //형식
        //class 클래스명 "extends" -> 상속이라는 뜻  부모클래스명 { }

        Tiger2 t = new Tiger2();
        System.out.println(t.eye);
        System.out.println(t.leg);




    }
}

class Eagle {
    String eye;
    String mouth;
    String wing;

    public void eat() { }
    public void sleep() { }
    public void fly() { }
}

class Tiger {
    String eye;
    String mouth;
    String leg;

    public void eat(){}
    public void mouth(){}
    public void leg(){}
}

class Goldfish {
    String eye;
    String mouth;
    String fin;

    public void eat(){}
    public void mouth(){}
    public void fin(){}
}

class Animal{
    String eye;
    String mouth;

    public void eat(){}
    public void sleep (){}
}

class Eagle2 extends Animal{
    String wing;
    public void fly(){}
} //상속시 extends 사용 animal에 있는 속성 말고 eagle에만 있는 속성

class Tiger2 extends Animal{
    String leg;
    public void run(){}
}

class Goldfish2 extends Animal{
    String fin;
    public void swim(){}
}