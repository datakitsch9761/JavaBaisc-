package joseph.basic.day10;

import joseph.basic.sungjuk.SungJukServiceImpl;
import joseph.basic.sungjuk.SungJukVO;
import joseph.basic.sungjuk.SungjukService;

public class SungJukV5bMain {
    public static void main(String[] args) {

//        SungjukService sjsrv = new SungJukServiceImpl();
        SungjukService sjsrv =  SungJukServiceImpl.getInstance();

        SungJukVO sj = sjsrv.readSungJuk();
        sjsrv.computeSungJuk(sj);
        sjsrv.printSungJuk(sj);
    }
}
