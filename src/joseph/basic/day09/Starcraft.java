package joseph.basic.day09;

public class Starcraft {
    public static void main(String[] args) {
        //SCV s = new SCV();
        // SCV s = new SCV("SCV",45,5,2.81,50,0);
        // SCV 유닛을 만들때 마다 초기값을 지정하는 것은
        // 다소 번거로움
        //즉, 동일한 속성을 가진 유닛을 만들때 마다
        //메개변수를 통해 객체를 만드는 것은 비효율적임
        // 이런경우, 생성자내에서 초기값을 지정하는 것이 나음

        SCV s = new SCV();
        s.attack();
        s.move();
        s.specialAbility();
        System.out.println();

        Marine m = new Marine();
        m.attack();
        m.move();
        m.specialAbility();
        System.out.println();

        Firebat f = new Firebat();
        f.attack();
        f.move();
        f.specialAbility();
        System.out.println();

    }
}

 abstract class Unit{
    protected String name;
    protected int hp;
    protected int power;
    protected double mvspd;
    protected int mineral;
    protected int gas;

//     public Unit(String name, int hp, int power, double mvspd, int mineral, int gas) {
//         this.name = name;
//         this.hp = hp;
//         this.power = power;
//         this.mvspd = mvspd;
//         this.mineral = mineral;
//         this.gas = gas;
//     }

     protected Unit() {
     }

     abstract public void attack();
     abstract void move();
     abstract void specialAbility();
 }

 class SCV extends Unit{
     final String fmtattck = "융합절단기를 이용해서 대상에 %d의 피해를 주고있습니다\n";
     final String fmtmove =  "지정한 위치로 %.2f 속도로 이동중입니다\n";
     final String fmtspabty = "대상을 수리하는 중입니다\n";


     public SCV() {
         name = "SCV";
         hp = 45;
         power = 0;
         mvspd = 2.81;
         mineral = 50;
         gas = 0;
     }



     @Override
     public void attack() {
         //sout("융합절단기를 이용해서.....")
         //추상메서드를 이용해서 부모클래스에 정의된 
         //attack메서드를 유닛에 맞게 재정의함 
         System.out.printf(fmtattck,power);
     }

     @Override
     void move() {
         System.out.printf(fmtmove,mvspd);
     }

     @Override
     void specialAbility() {
         System.out.printf(fmtspabty);
     }
 }

 class Marine extends Unit{

     final String fmtattck = "가우스소총을 이용해서 대상에 %d의 피해를 주고있습니다\n";
     final String fmtmove =  "지정한 위치로 %.2f 속도로 이동중입니다\n";
     final String fmtspabty = "전투자극제를 사용해서 이동속도는 50%%증가, 공격속도 33%% 증가합니다\n";
    
    public Marine() {
         name = "해병대";
         hp = 50;
         power = 30;
         mvspd = 2.95;
         mineral = 50;
         gas = 0;
     }

     @Override
     public void attack() {
         System.out.printf(fmtattck,power);
     }

     @Override
     void move() {
         System.out.printf(fmtmove,mvspd);
     }

     @Override
     void specialAbility() {
         System.out.printf(fmtspabty);
     }
 }

 class Firebat extends Unit{

     final String fmtattck = "화염방사기를 이용해서 대상에 %d의 피해를 주고있습니다\n";
     final String fmtmove =  "지정한 위치로 %.2f 속도로 이동중입니다\n";
     final String fmtspabty = "전투자극제를 사용해서 이동속도는 50%%증가, 공격속도 33%% 증가합니다\n";
    
    public Firebat() {
         name = "화염방사병";
         hp = 50;
         power = 8 * 2;
         mvspd = 1.875;
         mineral = 50;
         gas = 25;
     }

     @Override
     public void attack() {
         System.out.printf(fmtattck,power);
     }

     @Override
     void move() {
         System.out.printf(fmtmove,mvspd);
     }

     @Override
     void specialAbility() {
         System.out.printf(fmtspabty);
     }
 }