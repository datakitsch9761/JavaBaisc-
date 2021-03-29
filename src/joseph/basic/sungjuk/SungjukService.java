package joseph.basic.sungjuk;

//성적 서비스 v1
//입력, 처리, 출력, 기능 구현

public interface SungjukService {
    void displayMenu();
    SungJukVO readSungJuk();
    void computeSungJuk(SungJukVO sj);
    void printSungJuk(SungJukVO sj);


}
