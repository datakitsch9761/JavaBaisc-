package joseph.basic.day16;

import joseph.basic.sungjuk.SungJukServiceV3;
import joseph.basic.sungjuk.SungJukServiceV3Impl;

import java.util.Scanner;

public class SungJukV7cMain {

    //성적처리프로그램 V7c -> ArrayList + 텍스트기반스트림
    //입력한 성적데이터를 json 직렬화를 통해 텍스트 기반 피일에 저장
    //json 직렬화 : 각 데이터 항목을 반정형형식으로 파일에 저장하는 방식
    //{항목명1 : 항목값1, 항목명2 : 항목값2, 항목명3 : 항목값3 , 항목명4 : 항목값4 }
    //따라서,프로그램 종료시 입력했던 데이터는 그대로 유지됨
    //SungJukServiceV3
    //initSungJuk3, saveSungJuk3 (파일처리/json 직렬화)추가

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SungJukServiceV3 sjsrv = SungJukServiceV3Impl.getInstance(); //해당 부분 에러??

        String menu = "";
        sjsrv.initSungJuk3();

        while(true) {
            sjsrv.displayMenu();
            menu = sc.next();

            switch (menu){
                case "1":sjsrv.newSungJuk();break;
                case "2":sjsrv.showSungJuk();break;
                case "3":sjsrv.showOneSungJuk();break;
                case "4":sjsrv.modifySungJuk();break;
                case "5":sjsrv.removeSungJuk();break;
                case "0":sjsrv.saveSungJuk3();
                    System.exit(0);break;
                default:
                    System.out.println("잘못 입력하셨습니다.!!");
            }
        }

    }
}
