package thisIsJavaChapter15.checkProblem07;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
    private List BoardList;

    public BoardDao() {
        BoardList = new ArrayList();
        BoardList.add(new Board("제목1", "내용1"));
        BoardList.add(new Board("제목2", "내용2"));
        BoardList.add(new Board("제목3", "내용3"));
    }

    public List<Board> getBoardList() {
        return this.BoardList;
    }
}
