package joseph.basic.day08;

public class EX05 {
    public static void main(String[] args) {
        //Q73
        Fan f1 = new Fan();
        System.out.println(f1.speed);
        System.out.println(f1.on);
        System.out.println(f1.radius);
        System.out.println(f1.color);

        System.out.println();
        Fan f2 = new Fan();
        System.out.println(f2.speed);
        System.out.println(f2.on);
        System.out.println(f2.radius);
        System.out.println(f2.color);

        // 시험값 지정
        Fan f3 = new Fan();
        f3.speed = f3.FAST; // speed = 3;
        f3.radius = 10;
        f3.color = "yellow";
        f3.on = true;
        // 클래스를 통해 객체를 생성하고
        // 객체의 멤버 변수에 값을 초기화 - 다소 번거로움
        // 이럴경우에 생성자를 이용해야한다 !!!

        Fan f4 = new Fan(2,false,5,"blue");
        // 매개변수 생성자를 사용하면
        // 객체의 멤버면수에 값을 초기화하기가 편함

        Fan f5 = new Fan(2,false,5,"pink");

        Account a1 = new Account(1122,20000,4.5,"2014-08-15 14:34:29");
    }
    static class Fan{
        final int SLOW = 1; // 상수 선언은 "FINAL"라는 기능을 사용한다
        final int MEDIUM = 2; // 상수 선언은 "FINAL"라는 기능을 사용한다
        final int FAST = 3; // 상수 선언은 "FINAL"라는 기능을 사용한다

        private int speed;
        private boolean on;
        private double radius;
        private String color;

        //생성자 생성 단축키 alt + enter
        public Fan() { //생성자, 멤버변수 초기화
            speed = SLOW;
            on = false;
            radius = 5.0;
            color = "blue";

        }
        // alt + insert 매개변수를 이용한 생성자를 생성한다
        public Fan(
                int speed, boolean on, double radius, String color) {
            this.speed = speed;
            this.on = on;
            this.radius = radius;
            this.color = color;
        }
    } //Fan

    static class Account{
        private int aid ;
        private int balance;
        private double interestRate;
        private String dateCreated;

        public Account(){ } //0이기 때문에 딱히 생성하지 않아도 된다

        // 매개변수 생성
        public Account(
                int aid, int balance, double interestRate,String dateCreated) {
            this.aid = aid;
            this.balance = balance;
            this.interestRate = interestRate;
            this.dateCreated = dateCreated;
        }
    }// Account

    class Student {
        private int hakbun;
        private String name;
        private String addr;
        private String birth;
        private String dname;
        private int prof;
    }

    class Subject {
        private int sno;
        private String sname;
        private String sdesc;
        private String ssec;
    }

    class Professor {
        private int pno;
        private String name;
        private String field;
        private String tech;
    }

    class Major {
        private String mname;
        private String offpos;
        private String phone;
        private int chief;
    }

} //Class
