package joseph.basic.day19;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardServiceimpl implements BoardService {

    private static BoardDAO bdao;
    private static BoardService bsrv;

    private BoardServiceimpl() {
        bdao = BoardDAOImpl.getInstance();
    }//싱글톤으로 구현

    public static BoardService getInstance(){
        if(bsrv == null) bsrv = new BoardServiceimpl();
        return bsrv;
    }

    @Override
    public void newBoard() {
        Scanner sc = new Scanner(System.in);
        System.out.println("아이디 제목 본문순으로 입력하세요");
        String userid = sc.nextLine();
        String title = sc.nextLine();
        String contents = sc.nextLine();

        BoardVO bvo = new BoardVO(null,title,userid,null,null,null,contents);

        int cnt = bdao.insertBoard(bvo);
        if(cnt > 0) System.out.println("새로운 글이 등록되었어요!");
    }

    @Override
    public void readBoard() {
        String fmt = "%s %s %s %s %s %s \n";
        ArrayList<BoardVO> bdlist =
                (ArrayList<BoardVO>) bdao.selectBoard();

        StringBuffer sb = new StringBuffer();
        for(BoardVO b : bdlist){
            String result = String.format(fmt,
                    b.getBdno(),b.getTitle(),b.getUserid(),
                    b.getRegdate(),b.getViews(),b.getThumbup());
            sb.append(result);
        }
        System.out.println(sb.toString());
    }

    @Override
    public void readOneBoard() {
        String fmt = "%s %s %s %s %s %s\n %s";
        Scanner sc = new Scanner(System.in);
        System.out.print("조회할 게시물 번호를 입력하세요");
        int bdno = sc.nextInt();

        BoardVO b = bdao.selectOneBoard(bdno);
        String result = String.format(fmt,b.getBdno(),
                b.getTitle(),b.getUserid(),b.getRegdate(),
                b.getViews(),b.getThumbup(),b.getContents());

        System.out.printf(result);

        System.out.println("본 게시물을 추천하시겠습니다? (y/n)");
        String thumbup = sc.next();
        if(thumbup.toLowerCase().equals("y"))
            bdao.thumupBoard(bdno); //본문글 추천하기

    }

    @Override
    public void modifyBoard() {
        Scanner sc = new Scanner(System.in);

        System.out.println("수정할 게시글 번호는? ");
        String bdno = sc.nextLine();
        System.out.println("수정할 제목은");
        String title = sc.nextLine();
        System.out.println("수정할 본문글은?");
        String contents = sc.nextLine();

        BoardVO bvo = new BoardVO(bdno,title,null,null,
                null,null,contents);
        int cnt = bdao.updateBoard(bvo);
        if(cnt > 0) System.out.println("수정 완료!!");
    }

    @Override
    public void removeBoard() {
        Scanner sc = new Scanner(System.in);

        System.out.println("삭제할 게시글 번호는 ?");
        int bdno = sc.nextInt();

        int cnt = bdao.deleteBoard(bdno);
        if(cnt > 0) System.out.println("삭제완료");

    }
}
