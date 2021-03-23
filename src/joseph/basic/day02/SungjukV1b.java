package joseph.basic.day02;

import java.util.Scanner;

/*
 * @author Joseph 
 * @category javabasic
 * @version 1.1
 * @자바기초프로그램 -성적처리 프로그램
 * 
 * 이름과 성정데이터를 기보드로 직접 입력받아 처리
 * 처리결과 출력시 print 메서드 사용 
 */

public class SungjukV1b {
	public static void main(String[] args) {

		// 변수선언
		String name;
		int korean;
		int english;
		int math;
		int tot;
		double avg;
		char grd;

		// 처리
		Scanner sc = new Scanner(System.in);
		// 키포드를 이용해서 성적데이터를 입력받기 위해
		// Scanner 클래스를 초기화함

		System.out.println("이름은");
		name = sc.next();
		// 키보드를 문자데이터를 입력받아 name 변수에 대입
		System.out.println("국어는");
		korean = sc.nextInt();
		// 키보드로 숫자데이터를 입력받아 name 변수에 대입
		System.out.println("영어는");
		english = sc.nextInt();

		System.out.println("수학은");
		math = sc.nextInt();

		// 총점 평균 계산 처리
		tot = (korean + english + math);
		System.out.println(tot);

		avg = tot / 3;
		System.out.println(avg);

		grd = '가';
		System.out.println(grd);

		// 출력
		// 이름 : , 국어 , 영어, 수학
		String fmt = "이름: %s 국어 : %d ,영어 : %d ,수학 : %d\n";
		System.out.printf(fmt, name, korean, english, math);

		// 총점 : , 평균, 학점. 성적
		fmt = "총점 : %d , 평균 : %.1f, 성적 : %c";
		System.out.printf(fmt, tot, avg, grd);

	}
}