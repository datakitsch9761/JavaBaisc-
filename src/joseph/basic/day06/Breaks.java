package joseph.basic.day06;

public class Breaks {
    public static void main(String[] args) {
        // 반복문 제어하기 break, continue;
        // break :  반복문 실행을 중단하는 명령

        // ex) 1 ~ 100까지의 총합을 구하는 프로그램 작성
        // 단, 총합이 500을 넘는 경우에는 실행을 중단한다
        int sum = 0;
        int i;

        for(i = 0; i <= 100; i++){
            sum += i;
            if(sum >= 500)break;
                //부분합이 500 이상인 경우 반복실행을 중지함
        }
        System.out.println("총합 : " + sum);
        System.out.println("중지지점 : " + i);

        // ex) 주사위의 눈이 6이 나올때까지 굴려보는
        // 프로그램을 작성하세요. 또한, 6이 나올때까지의
        // 굴린 횟수도 같이 출력하세요
        // Math.random과 break문을 사용

        int dice = 0;
        int count =0;

        while(true) {
            dice = (int) (Math.random() * 6) + 1;
            ++count;
            System.out.println(dice + " ");
            if(dice == 6)break;
        }
        System.out.print("굴린 총 횟수 : " + count);



    }
}
