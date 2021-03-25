package joseph.basic.day08;

public class ValueObject {

    public static void main(String[] args) {
        //setter / getter
        //기본적으로 클래스의 멤버변수의 접근지정자는
        //private으로 선언하는 것이 좋음 - data hiding 차원
        //이렇게 선언하는 경우 외부 클래스에서 멤버변수에
        // 접근이 불가능하게 되는데, 이때 setter/getter 메서드를
        // 이용하면 접근불가 변수를 조작할 수 있음

        C sj = new C();

        //sj.name ="혜교";
        //sj.kor = 99;
        //sj.eng = 54;
        //sj.mat = 32;
        // 멤버변수가 private으로 선언되었으므로
        // 접근 불가 - 값 대입 실패!!
        // OOP에서는 객체의 변수를 외부에서 직접 접근하는 것을
        // 권장하고 있지 않음
        // 즉, 데이터는 외부에서의 접근을 막는 다는 의미임
        // 만일, 접근하려면 객체에서 공개한 메서드를 통해서만
        // 가능하도록 유도함 - setter / getter

        sj.setName("헤교");
        sj.setKorea(99);
        sj.setEng(57);
        sj.setMat(32);
        // setter를 이용해서 객체의 변수에 값 대입

        System.out.println(sj.getName());
        System.out.println(sj.getKorea());
        System.out.println(sj.getEng());
        System.out.println(sj.getMat());

    } //main

} //class

    class C {
    private String name;
    private int kor;
    private int eng;
    private int mat;

    // setter 정의 : public set변수명(변수명)
    // 외부에서 객체의 멤버면수에 값을 설정할때 사용
    public void setName(String name) {
        this.name = name;
    }

    public void setKorea(int kor) {
        this.kor = kor;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    // getter 정의 : public 반환유형 get변수명()
    public String getName() {
        return name;
    }

    public int getKorea() {
        return kor;
    }

    public int getEng() {
        return eng;
    }

    public int getMat() {
        return mat;
    }
}
    //간단하게 만드는 방법 멤버변수
    class D {
        private String userid;
        private String passwd;
        private String email;

        public D() {
        }

        // Alt + Insert -> 아무것도 클릭하지 않고 그냥 생성
        public D(String userid, String passwd, String email) {
            this.userid = userid;
            this.passwd = passwd;
            this.email = email;
        }
        // Alt + Insert -> Getter
        public String getUserid() {
            return userid;
        }

        public void setUserid(String userid) {
            this.userid = userid;
        }

        public String getPasswd() {
            return passwd;
        }

        // Alt + Insert => setter
        public void setPasswd(String passwd) {
            this.passwd = passwd;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }
    class Person{
        private String name;
        private String gender;
        private int age;
        private int height;
        private int weight;

        // 생성자
        public Person(String name, String gender, int age, int height, int weight) {
            this.name = name;
            this.gender = gender;
            this.age = age;
            this.height = height;
            this.weight = weight;
        }
        // get
        public String getName() {
            return name;
        }

        public String getGender() {
            return gender;
        }

        public int getAge() {
            return age;
        }

        public int getHeight() {
            return height;
        }

        public int getWeight() {
            return weight;
        }
        //set
        public void setName(String name) {
            this.name = name;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

    }
    class Bookinfo {
        private String bkname;
        private String writer;
        private String trlator;
        private String publisher;
        private String Pubdate;
        private int bkprice;
        private double discount;
        private int saleprice;
        private int point;

        public Bookinfo(String bkname, String writer, String trlator, String publisher, String pubdate, int bkprice, double discount) {
            this.bkname = bkname;
            this.writer = writer;
            this.trlator = trlator;
            this.publisher = publisher;
            Pubdate = pubdate;
            this.bkprice = bkprice;
            this.discount = discount;
        }

        public String getBkname() {
            return bkname;
        }

        public void setBkname(String bkname) {
            this.bkname = bkname;
        }

        public String getWriter() {
            return writer;
        }

        public void setWriter(String writer) {
            this.writer = writer;
        }

        public String getTrlator() {
            return trlator;
        }

        public void setTrlator(String trlator) {
            this.trlator = trlator;
        }

        public String getPublisher() {
            return publisher;
        }

        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }

        public String getPubdate() {
            return Pubdate;
        }

        public void setPubdate(String pubdate) {
            Pubdate = pubdate;
        }

        public int getBkprice() {
            return bkprice;
        }

        public void setBkprice(int bkprice) {
            this.bkprice = bkprice;
        }

        public double getDiscount() {
            return discount;
        }

        public void setDiscount(double discount) {
            this.discount = discount;
        }

        public int getSaleprice() {
            return saleprice;
        }

        public void setSaleprice(int saleprice) {
            this.saleprice = saleprice;
        }

        public int getPoint() {
            return point;
        }

        public void setPoint(int point) {
            this.point = point;
        }
    }