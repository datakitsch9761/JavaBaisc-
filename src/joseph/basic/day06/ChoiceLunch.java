package joseph.basic.day06;

import java.util.Random;

public class ChoiceLunch{

public static void main(String[] args) {
    //배열을 이용한 점심메뉴 고르기
    String[] menu =
            {"김밥","라면","돈까스","우동","짜장면","햄버거","짬뽕"};
    // 점심메뉴를 배열로 정의

    //random rnd = new Random();//
    //int idx =rnd.nextInt()7;
    //난수 생성
    //메뉴는 7개이므로 idx변수의 범위는 0 ~ 6;

    //Math random를 이용해서 실제난수가
    //만들어 지는 원리를 알아봄
    double magic = Math.random();
    System.out.println(magic);

    // 0 - 9 사이 임의의 난수 생성
    System.out.println(magic * 10);
    System.out.println((int)(magic * 10));

    // 0 - 99 사이 임의의 난수 생성
    System.out.println((int)(magic * 100));

    //0 ~ (n-1) 범위 난수 : random * b
    //0 ~ (100 - 1) 범위 난수
    // a 이상 b 미만 난수

    System.out.println(magic * 100);

    //메뉴출력을 위한 난수 생성 표션식
    int idx = (int)(Math.random() * 7);
    System.out.println(menu[idx]);
    // 생성된 난수로 선택된 메뉴 출력
}
}