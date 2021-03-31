package joseph.basic.day11;

import java.util.Random;
import java.util.Scanner;

public class ExerciseQ25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        //int[] userNum = {num1,num2,num3};

        System.out.println("0부터 999까지의 복권 숫자 3자리를 입력하세요");

        System.out.println("첫번째 숫자");
        num1 = sc.nextInt();

        System.out.println("두번째 숫자");
        num2 = sc.nextInt();

        System.out.println("세번째 숫자");
        num3 = sc.nextInt();


        int[] lotto = new int[3];
        Random rnd = new Random();
        lotto[0] = rnd.nextInt(45) + 1;
        lotto[1] = rnd.nextInt(45) + 1;
        lotto[2] = rnd.nextInt(45) + 1;

        for (int i = 0; i < 3; ++i) {
            System.out.println(lotto[i]);
        }
        //if(userNum == lotto)
            System.out.println("축하합니다 상금100만원에 당첨되셧습니다");
        //else
            System.out.println("아쉽지만, 다음기회를!");
    }
}