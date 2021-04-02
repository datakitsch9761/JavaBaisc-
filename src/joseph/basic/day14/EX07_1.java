package joseph.basic.day14;

import java.util.Scanner;

public class EX07_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1부터 N까지 정수의 합을 구하시오!!");
        System.out.print("N까지의 합");
        int n = sc.nextInt();
        int sum = 0;

        if(n % 2 == 0){
            sum = (1 +n) * (n/2);
        } else {
            sum = (1 + n) * (n / 2) + (n/2 +1);
        }
        System.out.print(sum);
    }
}
