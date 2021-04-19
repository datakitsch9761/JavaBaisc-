package joseph.basic.sungjuk;

//성적 서비스 v2
//입력, 처리, 출력, 수정,삭제 기능 구현
//프로그램 매뉴 출력 기능 추가

public interface SungJukServiceV2 {
    void displayMenu();
    void newSungJuk();
    void showSungJuk();
    void showOneSungJuk();
    void modifySungJuk();
    void removeSungJuk();
    void computeSungJuk(SungJukVO sj);


}