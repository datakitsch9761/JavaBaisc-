package joseph.basic.day12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
        //컬렉션 프레임 워크
        //다수의 데이터를 쉽고 효과적으로 처리할 수 있도록
        //표준화된 방법을 제공하는 클래스의 집합
        //즉, 데이터를 저장하는 자료구조와 테이터를 처리하는
        //알고리즘을 구조화하여 클래스로 구현한것

        //주요인터페이스
        //List : 자료입력순서 중요 O, 중복 요소 허용 O
        //Set : 자료입력순서 중요 X , 중복 요소 허용 X
        //Map : 키와 값으로 구성된 자료구조, 검색속도가 빠름

        //ArrayList
        //List인터페이스를 구현한 클래스
        //크기가 가변적으로 변하는 선형리스트(동적배열)
        //즉, 리스트의 저장용량이 꽉 차면 자동으로 용량이 늘어난다는 특징
        List<Integer> nums = new ArrayList<>();
        nums.add(123);
        nums.add(456);
        nums.add(789);
        nums.add(1, 000);//특정위치에 요소추가
        System.out.println(nums.size());
        //리스트의 크기 출력

        System.out.println(nums.get(1));
        //get : 지정한 위치의 요소를 추출해준다

        //리스트의 모든 요소 출력1 "for"문을 이용한다
        for (int i = 0; i < nums.size(); ++i)
            System.out.println(nums.get(i) + "/");
        System.out.println("");

        //리스트의 모든 요소 출력2(추천 방법) -> 향상된 for문을 사용
        //for(객체의 요소타입 변수명 : 객체명)
        for (Integer num : nums) {
            System.out.println(num + "");
        }

        //리스트의 모든 요소 출력3
        Iterator iter = nums.iterator();
        while (iter.hasNext())
            System.out.println(iter.next() + "");
        System.out.println("");

        //리스트의 모든 요소 출력4
        //contains(찾을데이터), 결과는 true, false
        //indexOf(찾을데이터), 결과는 위치값, -1
        System.out.println(nums.contains(456));
        System.out.println(nums.contains(987));

        System.out.println(nums.contains(456));
        System.out.println(nums.contains(987));

        //회원 객체를 리스트로 저장
        List<Member> members = new ArrayList<>();
        members.add(new Member("abc123", "987xyz"));
        members.add(new Member("def456", "xyz987"));
        members.add(new Member("ghi789", "456wvu"));

        //회원정보 출력
        //for(Member member: members) {
        //System.out.println(member.userid + "/" + member.passwd + "/");
        System.out.println(members);


        //def456회원을 검색하려면 어덯게?
        //System.out.println(members.contains("def456"));
        //System.out.println(members.indexOf("def456"));
        //비교대상을 잘못 지정함
        //즉, member 객체의 멤버면수와 비교해야 됨
        //members.get(0).userid.equals("def456");
        //members.get(1).userid.equals("def456");
        //members.get(2).userid.equals("def456");
        //반복문으로 코드를 최적화 시킨다


        for(Member m : members) {
            if (m.userid.equals("def456")) {
                System.out.println("데이터 찾음!");
                break;
            }
        }

    }
}

class Member {
    String userid;
    String passwd;

    @Override
    public String toString() {
        String fmt = "{userid : %s, password : %s}";
        String result = String.format(fmt, userid, passwd);
        return result;
    }

    public Member(String userid, String passwd) {
        this.userid = userid;
        this.passwd = passwd;
    }
}
