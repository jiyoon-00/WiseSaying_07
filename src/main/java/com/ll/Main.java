import com.ll.WiseSaying;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;s

public class Main {
    public static void main(String[] args) {
        System.out.println("== 명언 앱 ==");

        Scanner scanner = new Scanner(System.in);

        List<WiseSaying> wiseSaying = new ArrayList<>();

        int lastId = 0;
        while (true) {
            System.out.print("명령) ");
            String cmd = scanner.nextLine().trim();

            if (cmd.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else  if (cmd.equals("등록")) {
                System.out.print("명언: ");
                String wiseSayingContent = scanner.nextLine().trim();

                System.out.print("작가: ");
                String wiseSayingAuthor = scanner.nextLine().trim();

                int num = ++lastId;

                WiseSaying ws = new WiseSaying();

                ws.id = num;
                ws.Author = wiseSayingAuthor;
                ws.content = wiseSayingContent;

                wiseSaying.add(ws);

//               System.out.printf("%d번 명언이 등록되었습니다.\n", no);
                System.out.println("%d번 명언이 등록되었습니다.".formatted(num) );
            }else if (cmd.equals("목록")){
                System.out.println("번호 / 작가 / 명언");
                System.out.println("------------------------");

                //최근 등록 순서로 출력
                for (int i = wiseSaying.size(); i > 0; i--) {
                    WiseSaying ws = wiseSaying.get(i - 1);  // ✅
                    System.out.println("%d / %s / %s".formatted(ws.id,ws.Author,ws.content));
                }
            }
        }

        scanner.close();
    }


