package type;
// 1. 캡슐화를 구현하시오

// 2. equals()를 구현하시오
// 3. 상세보기를 할 메소드를 구현하시오
// 3시 45분까지

public class Board {
    private int id;
    private String title;
    private String writer;
    private String content;

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

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
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
        System.out.println("===========================");
        System.out.println("제목: " + title);
        System.out.println("---------------------------");
        System.out.printf("번호: %03d번 작성자: %s\n", id, writer);
        System.out.println("---------------------------");
        System.out.println(content);
        System.out.println("===========================");
    }
}
