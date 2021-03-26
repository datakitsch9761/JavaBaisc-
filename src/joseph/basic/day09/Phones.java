package joseph.basic.day09;

public class Phones {
    public static void main(String[] args) {
        //일반폰 -> 전화걸기, 전화받기
        //mp폰 -> 전화걸기, 전화받기, 음악재생,동영상보기
        //스마트폰 ->전화걸기,전화받기,사진찍기,인터넷,게임

        NormalPhone n = new NormalPhone();
        n.sendPhone();

        MP3phone m = new MP3phone();
        m.playMusic();

        SmartPhone s = new SmartPhone();
        s.takePicture();
    }
}

interface PhoneInterface{
    void sendPhone();
    void callPhone();
}

interface MP3Interface{
        void playMusic();
        void movie();
        }

interface SmartPhoneInterface{
    void takePicture();
    void surfInternet();
    void PlayGame();
}


class NormalPhone implements PhoneInterface{
    @Override
    public void sendPhone() {
        System.out.println("전화 거는 중....");
    }

    @Override
    public void callPhone() {
        System.out.println("전화 받는 중.....");
    }
}

class SmartPhone
        implements PhoneInterface, SmartPhoneInterface{

    @Override
    public void sendPhone() {}

    @Override
    public void callPhone() {}

    @Override
    public void takePicture(){System.out.println("사진을 찍습니다");}

    @Override
    public void surfInternet(){System.out.println("인터넷을 합니다");}

    @Override
    public void PlayGame(){System.out.println("게임을 합니다");}
}

// 클래스 보다 interface 방식이 더 효과적이다
class MP3phone implements PhoneInterface, MP3Interface{
    @Override
    public void playMusic() {System.out.println("음악을 재생합니다");}

    @Override
    public void movie() {System.out.println("동영상을 재생합니다");}

    @Override
    public void sendPhone() {}

    @Override
    public void callPhone() {}
}




//상속 extends : 부모클래스가 가진 특성과 기능을 변화없이 받음
//구현 implements : 부모클래스가 정해준 틀에 맞춰 새롭게 작성
//따라서, 아래처럼 짜는 것은 다소 세련되지 못함
class MP3Phone2 extends NormalPhone implements MP3Interface{
    @Override
    public void playMusic() { }

    @Override
    public void movie() { }
}

    