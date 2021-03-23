package joseph.basic.day06;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EX04 {
    public static void main(String[] args) {
        //Q12 생년월일 checkBirth
//        System.out.println(" '-'를 포함한 주민등록 번호를 입력하세요.");
//        Scanner sc = new Scanner(System.in);
//        String jumin = sc.nextLine();
//        int manage = 0;
//        SimpleDateFormat format = new SimpleDateFormat("yyyyMMDD");
//        String today = format.format(new Date());
//        System.out.println("오늘 날짜 확인 : " + today);
//
//        int thisYear = Integer.parseInt(sc.nextLine(0,4));
//        int thisMonth = Integer.parseInt(sc.nextLine(4,6));
//        int thisDay = Integer.parseInt(sc.nextLine(6,8));
//
//        int juminYear = Integer.parseInt(sc.nextLine(0,2));
//        int juminmonth = Integer.parseInt(sc.nextLine(2,4));
//        int juminday = Integer.parseInt(sc.nextLine(4,6));
//
//        if
        //Q16 잔돈계산 computeChange
        int value;
        int money;
        int change;
        int count;

        Scanner scan = new Scanner(System.in);
        System.out.println("물건값 입력 = ");
        value = scan.nextInt();

        System.out.println("손님이 지불한 돈 입력 = ");
        money = scan.nextInt();

        //거스름돈 계산
        change = money - value;

        //5천원짜리 갯수 계산
        count = change / 5000;

        //거스름돈에 포함된 5000원짜리를 뺀 나머지 돈 저장
        change = change % 5000;
        System.out.println("5000dnjs ->" + count + "장");

        //천원짜리 갯수 계산
        count = change / 1000;
        System.out.println("1000원 ->" + count + "장");

        //500원 짜리 갯수 계산
        count = change / 500;
        change= change % 500;
        System.out.println("500원 ->" + count + "개");

        //100원짜리 갯수 계산
        count = change/100;
        //거스름돈에 포함된 100원짜리를 뺀 나머지 돈 저장
        change = change % 100;
        System.out.println("100원 -> " + count + "개");

        //50원짜리 갯수 계산
        count = change/50;
        //거스름돈에 포함된 50원짜리를 뺀 나머지 돈 저장
        change = change % 50;
        System.out.println("50원 -> " + count + "개");

        //10원짜리 갯수 계산
        count = change/10;
        System.out.println("10원 -> " + count + "개");

    }

    }
