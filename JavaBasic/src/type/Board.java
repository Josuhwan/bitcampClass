package type;

import java.text.SimpleDateFormat;
import java.util.Calendar;

// 1. 캡슐화를 구현하시오

// 2. equals()를 구현하시오
// 3. 상세보기를 할 메소드를 구현하시오
// 3시 45분까지

public class Board {
    private int id;
    private String title;
    private String writer;
    private int writerId;
    private String content;
    private Calendar writtenDate;
    private Calendar updatedDate;

    // getter/setter
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getWriter() {
        return writer;
    }

    public int getWriterId() {
        return writerId;
    }

    public void setWriterId(int writerId) {
        this.writerId = writerId;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public Calendar getWrittenDate() {
        return writtenDate;
    }

    public void setWrittenDate(Calendar writtenDate) {
        this.writtenDate = writtenDate;
    }

    public Calendar getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Calendar updatedDate) {
        this.updatedDate = updatedDate;
    }

    public boolean equals(Object o) {
        if (o instanceof Board) {
            Board b = (Board) o;
            if (this.id == b.id) {
                return true;
            }
        }

        return false;
    }

    public void printInfo() {
        SimpleDateFormat sdf = new SimpleDateFormat("y-M-d H:m:s");
        System.out.println("===========================");
        System.out.println("제목: " + title);
        System.out.println("---------------------------");
        System.out.printf("번호: %03d번 작성자: %s\n", id, writer);
        System.out.println("작성일: " + sdf.format(writtenDate.getTime()));
        System.out.println("수정일: " + sdf.format(updatedDate.getTime()));
        System.out.println("---------------------------");
        System.out.println(content);
        System.out.println("===========================");
    }
}
