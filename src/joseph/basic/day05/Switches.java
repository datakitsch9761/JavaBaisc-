package joseph.basic.day05;

import java.util.Scanner;

public class Switches {

	public static void main(String[] args) {
		// Switch
		// 둘이상의 조건의 결과값에 따라 명령문을
		// 선택적으로 실행하도록 작성하는 제어문
		// swith(상수) { // 상수는 반드시 정수이어야 한다!
		// case 상수1 : 실행문 1; break;
		// case 상수2 : 실행문 2; break;
		// case 상수3 : 실행문 3; break;
		// default : 실행문 4;
		// }

		// 시간을 입력하면 시간을 의미하는 단어를 출력하는 프로그램

		int daytime;
		Scanner sc = new Scanner(System.in);
		String result = "";
		System.out.println("시간을 입력하세요");
		daytime = sc.nextInt();
		// System.out.println("시간을 입력하세요");
		// daytime = sc.nextInt();

		// if(daytime >= 7 && daytime < 12)
		// result = "morning hours";
		// else if (daytime >= 12 && daytime <1)
		// result = "noon";
		// 조건이 많은 경우 if ~ else if 는 다소 복잡해 짐

		switch (daytime) {
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
			result = "Morning hours";
			break;

		case 12:
		case 13:
			result = "noon";
			break;
		case 14:
		case 15:
		case 16:
		case 17:
			result = "afternoon hours";
			break;

		case 18:
		case 19:
		case 20:
			result = "evening hours";
			break;

		case 21:
		case 22:
		case 23:
			result = "night hours";
			break;

		case 24:
			result = "midnight";
			break;
		case 1:
		case 2:
		case 3:
		case 4:
			result = "early morning";
			break;

		case 5:
		case 6:
			result = "dawn";
			break;
		}
		System.out.println(result);
	}
}
