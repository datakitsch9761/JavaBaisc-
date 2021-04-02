package joseph.basic.day14;

import java.util.*;

public class Sets {
    public static void main(String[] args) {
        //Set -> 집합의 특징 : 교별 집합이라는 의미이다
        //객체를 중복해서 저장할 수 없고
        //저장순서가 유지되지 않음

        HashSet<String> names = new HashSet<>();
        //Set<String> names = new HashSet<>();
        names.add("혜교");
        names.add("지현");
        names.add("수지");
        names.add("혜교"); //해당 부분이 출력되지 않는다 왜일까?? -> 중복데이터를 허용하지 않는다

        for(String name : names){
            System.out.println(name);
        }

        HashSet<Integer> nums = new HashSet<>(Arrays.asList(10,9,8,7,6)); //순서가 바뀌어서 출력된다!!

        for(Integer num : nums){
            System.out.println(num);
        }
        System.out.println("");

        //banana, peach, apple등을 set으로 저장 :
        HashSet<String> fruits = new HashSet<>();
        //Set<String> fruits = new HashSet<>();
        fruits.add("banana");
        fruits.add("peach");
        fruits.add("apple");

        for(String fruit : fruits){
            System.out.println(fruit + "");
            //정렬이 되지 않은 채로 출력된다
        }
        System.out.println("");

        //set에서 중복을 걸러내는 과정
        //객체를 저장하기 전에 먼저 객체의 해시코드를 알아냄
        //저장되어 있는 객체들의 해시코드를 비교해서
        //같은 해시코드가 존재한다면 동일객체로 판단 - 저장하지 않음
        //객체의 해시코드를 알려면 hashcode메서드를 사용한다

        for(String fruit : fruits){
            System.out.println(fruit.hashCode() + "");
            //정렬이 되지 않은 채로 출력된다
        }
        System.out.println("");

        //set에 저장된 요소들을 정렬하기
        //Set을 List로 변환한 후 정력
        List<String> fList = new ArrayList(fruits); //다이아몬드 <>기호에 컬랙션 선언을 해야한다
        Collections.sort(fList);
        for(String f : fList ){
            System.out.print(f + "/");
        }
        System.out.println("");

        //HashSet의 개별요소 출력
        //set에는 get메서드가 지원되지 않음
        //단, contains를 이용해서 검색을 통한 개별값 출력은 가능
        System.out.println(names.contains("혜교"));
        //System.out.println(names.indexof("혜교")); -> 해당 기능 지원 안됨

        //HashSet의 개별요소 삭제
        //remove, clear지원
    }
}
