package joseph.basic.day14;

import javax.crypto.spec.PSource;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lotto645V2 {
    public static void main(String[] args) {
        //로또 645 프로그램 만들기
        //Set방법을 이용해서 1 ~45사이 임의의 6개의 숫자 생성
        //중복은 허용하지 않음
        //Random - nextInt, while문을 사용해서 작성

//        for (int i = 1; i <= 6; ++i) {
//            int key = rnd.nextInt(45) + 1;
//            System.out.print(key + " ");
//        } //중복이 발생한다

//        Random rnd = new Random();
//        Set<Integer> lotto = new HashSet<>();
//
//        for (int i = 1; i <= 6; ++i) {
//            int key = rnd.nextInt(45) + 1;
//            lotto.add(key);
//        }
//        for(Integer k : lotto) ;
//        System.out.print(k + " ");
        //중복 발생시 Lotto 변수의 갯수가 하나씩 줄어듬
        //통계에서 "복원추출" 개념을 사용 - 한번 뽑은 것을 다시 뽑을 수 있음
        //비복원 보다는 복원추출이 더 좋다!!!

        Set<Integer> lotto = new HashSet<>();

        while (lotto.size() <= 6) {
            Random rnd = new Random();
            int key = rnd.nextInt(45) + 1;
            lotto.add(key);
        } //중복값이 나오지 않을때까지 계속 무한 반복

        for (Integer k : lotto)
            System.out.print(k + " ");
    }
}
