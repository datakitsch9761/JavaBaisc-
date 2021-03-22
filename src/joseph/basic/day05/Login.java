package joseph.basic.day05;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// 키보드로 아이디, 비밀번호 입력해서
		// 로그인 성공여부를 출력하는 프로그램
		// account : abc123
		// password : 987xyz
		// 1. account x , password x -> 로그인 실패!
		// 2. account o , password x -> 비밀번호가 틀렸습니다
		// 3. account x , password o -> 아이디가 틀려요
		// 4. account o , password o -> 아이디가 틀려요
		// => 입력값에 따른 결과처리가 복잡하므로 단순화시킴
		// 입력처리가 복잡해지면 코드도 복잡하게 짤 수 밖에 없다
		// 즉 1,2,3 -> 로그인 실패 4, 로그인 성공

		// 변수선언
		String userid;
		String passwd;
		Scanner sc = new Scanner(System.in); // control space then install
		String result;

		// 아이디비번 입력받기
		System.out.println("아이디는? ");
		userid = sc.next();

		System.out.println("비밀번호는 ? ");
		passwd = sc.next();

		// 문자열 비교시 == 이 아닌 equals 메서드로 사용할것
		// if (userid.equals("abc123")) { // 아이디를 올바르게 입력한 경우
		// if (passwd == "987xyz")
		// result = "로그인 성공!!";
		// else
		// result = "비밀번호가 틀려요!";
		// } else { // 아이디를 오르게 입력하지 않은경우
		// if (passwd == "987xyz")
		// result = "아이디는 틀리고, 비밀버호는 맞아요!!";
		// else
		// result = "아이디와 비밀번호가 틀려요";
		// }
		// 로그인 ㅅ ㅓㅇ공여부를 4가지 경우에 따라 작성 - 코드 복잡
		// if(userid.equals("abc123")) {
		// if(passwd.equals("987xyz"))
		// result = "로그인 성공!";
		// else
		// result = "로그인실패!";
		// } else
		// result = "로그인실패!";

		// 로그인 성공여부를 3가지 경우에 따라 작성 - 코드 다소 단순
		if (userid.equals("abc123") && passwd.equals("987xyz"))
			result = "로그인 성공!";
		else
			result = "로그인 실패!";

		// 조건식들을 논리식으로 재작성 - 코드가 단순해짐

		System.out.println(result);
	}
}