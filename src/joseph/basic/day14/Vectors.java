package joseph.basic.day14;

import java.util.Arrays;
import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {
        //vector
        //ArrayList와 동일한 내부구조를 가지고 있음
        //=>동적배열, 저장순서중요, 중복데이터 허용
        //멀티쓰레드 환경에서 안전하게 객체를 추가하고 삭제할 수 있음 => 동기화기능을 지원한다
        //따라서, ArrayList에서는 동기화 옵션이 빠져 있기때문에
        //vector에 비교해서 속도가 빠르다

        //중요 메서드
        //add,get,set,remove

        //백터 정의 및 데이터 추가
        Vector<String> names = new Vector<>();
        //List<String> names = new Vector<>();

        names.add("헤교");
        names.add("지현");
        names.add("수지");
        names.add(1,"아이유");

        //배열을 이용해서 동적배열을 초기화함
        Vector<Integer> nums = new Vector<>(Arrays.asList(1,2,3,4,5));
        //List<Integer> nums = new Vector<>(Arrays.asList(1,2,3,4,5));

        //벡터내 데이터 출력
        for(String name : names){
            System.out.println((name + "/"));
        }
        System.out.println("");

        for(Integer num : nums){
            System.out.println(num + "/");
        }
        System.out.println("");

        //백터 크기 및 용량
        System.out.println(
                names.size() + "/" + names.capacity());

        System.out.println(
                nums.size() + "/" + names.capacity());

        //백터의 특정 요소 출력
        System.out.println(names.get(1));

        //백터 삭제
       names.remove(1); //두번째 요소 제거
        names.clear(); //모든 요소 삭제

        //백터 특정요소 수정
        nums.add(3,10);
        nums.set(0,100); //첫번째 요소 값을 100으로 수정
        System.out.println(nums.get(0) + "/" + nums.get(3));
    }
}
