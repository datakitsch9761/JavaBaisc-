package joseph.basic.day14;
    //Qxx - 두수를 입력받아 두사이의 모든 값의
    // 총합을 구하는 코드를 작성하세요
    // ex) 10, 3 => 3,4,5,6,7,8,9,10에 대한 총합
    // ex) 3,10 => 3,4,5,6,7,8,9,10에 대한 총합
    //divide and 컨커 방식으로 작성

import java.util.Scanner;

public class EX07 {
    public static void main(String[] args) {
        //가우스 덧셈을 이용하면 간단히 계산이 가능하다
        //해당 방식은 상위레벨의 코딩 방법이다
        //공식의 예시 :  (i +j) x (j - 1 + 1) / 2 // i < j - 1
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자는 ? ");
        int num1 = sc.nextInt(); //1
       System.out.println("두번째 숫자는 ? ");
        int num2 = sc.nextInt(); //10

        int sum = 0;

        sum = (num1 + num2) * (Math.abs(num2 - num1) + 1) / 2;
        System.out.println(sum);

        String fmt = "%d와 %d 사이의 합은 %d";
        System.out.printf(fmt, num1, num2, sum);
        }
    }
