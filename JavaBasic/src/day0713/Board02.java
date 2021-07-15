package day0713;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

import type.Board;
import type.User;
import util.ScannerUtil;

// 게시판에 회원 기능까지 추가한 버젼

public class Board02 {
    private static ArrayList<Board> boardList = new ArrayList<>();
    private static ArrayList<User> userList = new ArrayList<>();
    private static User logIn = null;
    private static Scanner scanner = new Scanner(System.in);
    private static int nextBoardId = 1001;
    private static int nextUserId = 1;

    public static void main(String[] args) {
        index();
    }

    private static void index() {
        String message = new String("1. 로그인 2. 회원가입 3. 종료");
        while (true) {
            int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);
            if (userChoice == 1) {
                // 로그인 메소드 호출
                // 해당 메소드는 User객체 logIn에
                // 로그인 성공시에 값을 저장한다.
                // 만약 저장된 값이 null이면 아무것도 하지 않지만
                // 그 외의 경우에는 showMenu 메소드를 실행시키낟.
                logIn();
                if (logIn != null) {
                    showMenu();
                }
            } else if (userChoice == 2) {
                // 회원가입 메소드 호출
                register();
            } else if (userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
    }

    private static void logIn() {
        String message = new String("ID: ");
        String username = ScannerUtil.nextLine(scanner, message);

        message = new String("PW: ");
        String password = ScannerUtil.nextLine(scanner, message);

        while (validate(username, password) == null) {
            System.out.println("일치하는 회원이 없습니다.");

            String yesNo = ScannerUtil.nextLine(scanner, "다시 시도하시겠습니까? y/n");

            if (yesNo.equalsIgnoreCase("n")) {
                break;
            }

            username = ScannerUtil.nextLine(scanner, "ID: ");
            password = ScannerUtil.nextLine(scanner, "PW: ");
        }

        logIn = validate(username, password);

    }

    private static User validate(String username, String password) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).auth(username, password)) {
                return userList.get(i);
            }
        }
        return null;
    }

    private static void register() {
        User u = new User();
        String message;
        u.setId(nextUserId++);

        // id 입력
        message = new String("ID를 입력해주세요.");
        String username = ScannerUtil.nextLine(scanner, message);

        // 해당 아이디가 중복인지 체크
        while (validateUsername(username)) {
            System.out.println("중복된 ID는 사용하실 수 없습니다.");
            System.out.println("만약 가입을 원하시지 않으면 -1을 입력해주세요.");
            username = ScannerUtil.nextLine(scanner, message);
            if (username.equals("-1")) {
                break;
            }
        }

        if (!username.equals("-1")) {
            // pw 입력
            message = new String("PW를 입력해주세요.");
            String password = ScannerUtil.nextLine(scanner, message);

            // 닉네임 입력
            message = new String("사용하고자 하는 닉네임을 입력해주세요.");
            String nickname = ScannerUtil.nextLine(scanner, message);

            u.setUsername(username);
            u.setPassword(password);
            u.setNickname(nickname);

            // userList에 추가
            userList.add(u);

        }

    }

    private static boolean validateUsername(String username) {
        for (int i = 0; i < userList.size(); i++) {
            User u = userList.get(i);

        }
        // 위의 for 문을 짧게 줄여서 쓰는 방법이 있는데
        // forEach 문이라고 부른다.
        // 단, 실제 리스트의 크기가 변경되거나 하면 에러가 발생하므로
        // 단순 값 비교나 출력에 사용하면 편하다.

        // forEach문은 다음과 같은 구조를 가진다.
        // for(클래스 객체이름 : 리스트와같이 모여있는 객체) {
        //
        // }
        for (User u : userList) {
            if (u.getUsername().equals(username)) {
                return true;
            }
        }

        return false;
    }

    private static void showMenu() {
        String message = new String("1. 입력 2. 출력 3. 로그아웃");
        while (true) {
            int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);
            if (userChoice == 1) {
                insert();
            } else if (userChoice == 2) {
                printAll();
            } else if (userChoice == 3) {
                System.out.println("로그아웃 되셨습니다.");
                logIn = null;
                break;
            }
        }
    }

    private static void insert() {
        Board b = new Board();
        String message;

        // 글 번호 등록
        b.setId(nextBoardId++);

        // 글 제목 등록
        message = new String("제목을 입력해주세요.");
        String title = ScannerUtil.nextLine(scanner, message);
        b.setTitle(title);

        // 글 작성자 등록
        b.setWriterId(logIn.getId());

        // 글 내용 등록
        message = new String("내용을 입력해주세요.");
        String content = ScannerUtil.nextLine(scanner, message);
        b.setContent(content);

        // 글 작성시간 등록
        b.setWrittenDate(Calendar.getInstance());

        // 글 수정시간 등록
        b.setUpdatedDate(Calendar.getInstance());

        logIn.setNickname(logIn.getNickname() + nextBoardId);

        boardList.add(b);
    }

    private static Board selectById(int id) {
        Board b = new Board();
        b.setId(id);
        if (boardList.contains(b)) {
            return boardList.get(boardList.indexOf(b));
        }
        return null;
    }

    private static void printAll() {
        if (boardList.isEmpty()) {
            System.out.println("아직 등록된 글이 존재하지 않습니다.");
        } else {
            for (int i = 0; i < boardList.size(); i++) {
                Board b = boardList.get(i);
                System.out.printf("%d번 글. %s\n", b.getId(), b.getTitle());
            }
            String message = new String("상세보기할 글 번호나 뒤로가실려면 0을 입력해주세요.");
            int userChoice = ScannerUtil.nextInt(scanner, message);

            while (selectById(userChoice) == null && userChoice != 0) {
                System.out.println("잘못 입력하셨습니다.");
                userChoice = ScannerUtil.nextInt(scanner, message);
            }

            if (userChoice != 0) {
                printOne(userChoice);
            }
        }
    }

    private static void printOne(int id) {
        Board b = selectById(id);
        printInfo(b);
        String message = new String("1. 수정 2. 삭제 3. 뒤로가기");
        int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);

        if (userChoice == 1) {
            update(id);
        } else if (userChoice == 2) {
            delete(id);
        } else if (userChoice == 3) {
            printAll();
        }
    }

    private static void update(int id) {
        Board b = selectById(id);
        String message;
        // 제목 수정
        message = new String("새로운 제목을 입력해주세요.");
        String title = ScannerUtil.nextLine(scanner, message);
        b.setTitle(title);

        // 내용 수정
        message = new String("새로운 내용을 입력해주세요.");
        String content = ScannerUtil.nextLine(scanner, message);
        b.setContent(content);

        // 수정시간 수정
        b.setUpdatedDate(Calendar.getInstance());

        printOne(id);
    }

    private static void delete(int id) {
        Board b = selectById(id);
        String message = new String("정말로 삭제하시겠습니까? y/n");
        String yesNo = ScannerUtil.nextLine(scanner, message);
        if (yesNo.equalsIgnoreCase("y")) {
            boardList.remove(b);
            printAll();
        } else {
            printOne(id);
        }
    }

    public static User selectUserById(int id) {
        User u = new User();
        u.setId(id);
        for (User origin : userList) {
            if (u.equals(origin)) {
                return origin;
            }
        }

        return null;
    }

    public static void printInfo(Board b) {
        SimpleDateFormat sdf = new SimpleDateFormat("y-M-d H:m:s");
        System.out.println("===========================");
        System.out.println("제목: " + b.getTitle());
        System.out.println("---------------------------");
        User u = selectUserById(b.getWriterId());
        System.out.printf("번호: %03d번 작성자: %s\n", b.getId(), u.getNickname());
        System.out.println("작성일: " + sdf.format(b.getWrittenDate().getTime()));
        System.out.println("수정일: " + sdf.format(b.getUpdatedDate().getTime()));
        System.out.println("---------------------------");
        System.out.println(b.getContent());
        System.out.println("===========================");
    }
}
