package joseph.basic.day05;

import java.util.Scanner;

public class LeapYearQ27 {

	public static void main(String[] args) {
		// 윤연 여부를 출력하는 프로그램
		// 지구의 공전주기와 자전주기의 불일치로 발생
		// 공전주기 : 365.24일
		// 자전주기 하루주기 : 0.24일
		// 이 둘간의 주기의 오차때문에 4년마다 하루를 추가하는 방법으로
		// 오류를 보정함
		// 조건 1 : 4로 나눠 떨어지지만, 100으로 나눠 떨어지지 않음
		// 조건 2 : 단 400으로 나눠 덜어짐
		// 1600(윤년), 2020(윤년), 1900(평년) 2021(?)

		// 변수 선언
		int year;
		String result = "";

		Scanner sc = new Scanner(System.in);

		System.out.print("년도를 입력하세요 ");
		year = sc.nextInt();

		if (year % 4 == 0 && year % 100 != 0 || (year % 400 == 0))
			result = "윤연이 맞습니다 !";
		else
			result = "평년입니다! ";
		System.out.print(result);
	}
}
