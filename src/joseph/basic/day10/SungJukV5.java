package joseph.basic.day10;

import joseph.basic.sungjuk.SungJukServiceImpl;
import joseph.basic.sungjuk.SungJukVO;
import joseph.basic.sungjuk.SungjukService;

import java.util.Scanner;

//인터페이스를 이용해서 성적프로그램 작성
public class SungJukV5 {

    public static void main(String[] args) {
        //클래스에 대한 객체 생성하기
        //클래스명 객체명 = new 클래스명()

        //상속을 받은 클래스에 대한 객체 생성하기
        //클래스명 객체명 = new 클래스명()
        //부모클래스명 객체명 = new 자식클래스명() (!!)

        //Cat c = new Cat()
        //Animal cd = new Cat() -> 밑에 방식이 더 좋다 -> 부모 클래스를 객체변수를 지정하는게 더 좋다!!
        // cd = new dog()   (!!)

        //인터페이스를 구현한 클래스 객체 생성하기
        //인터페이스 객체명 = new 클래스명()
        SungJunkV5Service sjsrv = new SungJunkV5ServiceImpl();

        //성적데이터 입력받기
        SungJukVO sj = sjsrv.readSungJunk();
        
        //입력받은 성적데이터를 처리
        sjsrv.computeSungJunk(sj);
        
        //처리된 성적데이터 출력하기
        sjsrv.printSungJunk(sj);
    }
}

// 성적처리와 관련된 메서드를 따로 뽑아 인터페이스로 구현
// 보통 인터페이스의 명명법은 이름끝에 service를 추가함
interface SungJunkV5Service{
    SungJukVO readSungJunk();
    void computeSungJunk(SungJukVO sj);
    void printSungJunk(SungJukVO sj);

}

//인터페이스를 구현한 클래스는
//클래스 이름 끝에 Impl 접미사를 추가해줌
class SungJunkV5ServiceImpl implements SungJunkV5Service {

    @Override
    public SungJukVO readSungJunk() {
        Scanner sc = new Scanner(System.in);

        System.out.println("이름은 ? ");
        String name = sc.next();
        System.out.println("국어는");
        int kor = sc.nextInt();
        System.out.println("영어는");
        int eng = sc.nextInt();
        System.out.println("수학은");
        int mat = sc.nextInt();

        return new SungJukVO(name,kor,eng,mat);
    }

    @Override
    public void computeSungJunk(SungJukVO sj){
        sj.setTot(sj.getKor() + sj.getEng() + sj.getMat());
        sj.setAvg((double)sj.getTot() / 3);

        switch ((int) sj.getAvg() / 10) {
            case 10:
            case 9:
                sj.setGrd('수');
                break;
            case 8:
                sj.setGrd('우');
                break;
            case 7:
                sj.setGrd('미');
                break;
            case 6:
                sj.setGrd('양');
                break;
            default:
                sj.setGrd('가');
                break;
        }

    }

    @Override
    public void printSungJunk(SungJukVO sj) {
        String fmt ="%s %d %d %d \n %d %.1f %c\n";
        System.out.printf(fmt,sj.getName(),sj.getKor(),sj.getEng(),sj.getMat(),sj.getTot(),sj.getAvg(),sj.getGrd());
    }
}