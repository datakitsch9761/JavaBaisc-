package joseph.basic.day05;

import java.util.Scanner;

public class CardCheckQ33 {

	public static void main(String[] args) {
		// 문자열.charat(자릿수) : 지정한 자리수의 문자하나 추출
		// 문자열.substring(시작, 끝) :
		// 지정한 시작위치에서 끝 1 위치의 문자들 추출
		// 123456-1234567
		// jumin.charat(0)
		// jumin.substring(7,8) : 1
		// 신용카드 번호를 보고
		// 어던 종류와 은행인지 알려주는 프로그램
		// 3:JCB
		// 4:VISA
		// 5:MASTER
		String cardnum;
		String cardtype = "";
		String cardbank = "";
		String fmt = "카드 종류는 %s 이고요. %s 입니다";
		Scanner sc = new Scanner(System.in);

		System.out.print("카드번호를 입력하세요 : ");
		cardnum = sc.next();

		// if (cardnum.charAt(0) == '3')
		// cardtype = "JCB 카드";
		// else if (cardnum.charAt(0) == '4')
		// cardtype = "VISA 카드";
		// else if (cardnum.charAt(0) == '5')
		// cardtype = "MASTER 카드";
		// else
		// cardtype = "유효하지 않는 카드입니다";

		switch (cardnum.charAt(0)) {
		case '3':
			cardtype = "JCB 카드";
			break;
		case '4':
			cardtype = "VISA 카드";
			break;
		case '5':
			cardtype = "MASTER 카드";
			break;
		}
		// System.out.println(cardtype);

		switch (cardnum) {
		case "356317":
			cardbank = "NH  농협카드";
			break;
		case "356901":
			cardbank = "신한카드";
			break;
		case "356912":
			cardbank = "KB국민카드";
			break;
		case "404825":
			cardbank = "BC카드";
			break;
		case "438676":
			cardbank = "신한카드";
			break;
		case "457973":
			cardbank = "국민은행";
			break;
		case "515594":
			cardbank = "신한카드";
			break;
		case "524353":
			cardbank = "외한카드";
			break;
		case "540926":
			cardbank = "국민은행";
			break;
		}// switch
		System.out.printf(fmt, cardtype, cardbank);
	} // main

}
