package joseph.basic.sungjuk;

import java.util.Scanner;

public class SungJukServiceImpl implements SungjukService {

    //싱글톤 패턴 시작

    private static SungjukService sjsrv = null;

    private void SungJukServiceImpl() {
    }

    public static SungjukService getInstance() {
        if (sjsrv == null) sjsrv = new SungJukServiceImpl();
        return sjsrv;
    }

    @Override
    public void displayMenu() {
        String displaymenu = "====================\n" + "     성적 프로그램 v3    \n" + "====================\n"
                + "    1.성적 데이터 입력   \n" + "    2.성적 프로그램 조회    \n" + "    3.성적 데이터 상세조회    \n"
                + "    4.성적데이터 삭세  \n" + "    5.성적데이터 삭제    \n" + "    0.성적데이터 종료    \n"
                + "=======================\n" + " 작업을 선택하세요 : ";
        System.out.print(displaymenu);

    }

    @Override
    public SungJukVO readSungJuk() {
        Scanner sc = new Scanner(System.in);

        System.out.println("이름은 ? ");
        String name = sc.next();
        System.out.println("국어는");
        int kor = sc.nextInt();
        System.out.println("영어는");
        int eng = sc.nextInt();
        System.out.println("수학은");
        int mat = sc.nextInt();

        return new SungJukVO(name, kor, eng, mat);
    }

    @Override
    public void computeSungJuk(SungJukVO sj) {
        sj.setTot(sj.getKor() + sj.getEng() + sj.getMat());
        sj.setAvg((double) sj.getTot() / 3);

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
    public void printSungJuk(SungJukVO sj) {
        String fmt = "%s %d %d %d \n %d %.1f %c\n";
        System.out.printf(fmt, sj.getName(), sj.getKor(), sj.getEng(), sj.getMat(), sj.getTot(), sj.getAvg(), sj.getGrd());
    }
}

