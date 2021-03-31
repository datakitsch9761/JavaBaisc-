package joseph.basic.day12;

import java.util.Random;
import java.util.Scanner;

public class EX06 {
    public static void main(String[] args) {
    //연습문제 Q14(1,2,3)
        int data1 = 1234567890;
        System.out.println(data1 / 86400);
        System.out.println(Math.round((double)data1 / 86400));

        int data2 = 98765;
        System.out.println(data2/ 3600);
        System.out.println(Math.round((double)data2 / 3600));

        int data3 = 12345;
        System.out.println(data3 / 60);
        System.out.println(Math.round((double)data3/60));


    //복권발행 프로그램을 작성하세요
    //복권 3자리를 입력바등ㅁ
    //임의의 복권 3자리 숫자 생성
    //모두 일치 = 상금 1백만원
    //불일치 다음 기회를!!
    //자리에 상관없이 숫자만 일치하면 됨!
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int mathch = 0;

        System.out.println("복권 3자리 숫자를 입력하세요");
        int yourkey = sc.nextInt();

        int lottokey = rnd.nextInt(1000); //-> 바운드를 걸어줘야한다 0 ~ 999번까지 임의의 숫자

        //입력값과 난수 비교!!(복잡한 코드)
//        char lkey1 = String.valueOf(lottokey).charAt(0);
//        char lkey2 = String.valueOf(lottokey).charAt(1);
//        char lkey3 = String.valueOf(lottokey).charAt(2);
//
//        char ykey1 = String.valueOf(yourkey).charAt(0);
//        char ykey2 = String.valueOf(yourkey).charAt(1);
//        char ykey3 = String.valueOf(yourkey).charAt(2);
//
//        if(lkey1 == ykey1 || lkey1 == ykey2 || lkey1 == ykey3)++mathch;
//        if(lkey2 == ykey1 || lkey2 == ykey2 || lkey2 == ykey3)++mathch;
//        if(lkey3 == ykey1 || lkey3 == ykey2 || lkey3 == ykey3)++mathch;

        //단순한 코드
        for(int i = 0; i < 3 ; ++i) {
            char lkey = String.valueOf(lottokey).charAt(i);
            for (int j = 0; j < 3; ++j) {
                char ykey = String.valueOf(yourkey).charAt(j);
                if(lkey == ykey) ++mathch;
            }
        }
        System.out.println(yourkey + "/" + lottokey);
        System.out.println("일치갯수 : " + mathch);














    }
}
