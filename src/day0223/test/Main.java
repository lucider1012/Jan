package day0223.test;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, String[]> filmors = new HashMap<>();
        filmors.put("송강호", new String[] {"박쥐", "괴물", "관상"});
        filmors.put("김수현", new String[] {"도둑들", "수상한 그녀", "은밀하게 위대하게"});
        filmors.put("이병헌", new String[] {"지아이조", "레드", "광해"});
        int cnt = 0;
        System.out.print("검색할 배우: ");
        Scanner scanner = new Scanner(System.in);
        String act = scanner.next();

        Set<String> names = filmors.keySet();
        for (String name: names) {
            if (name.equals(act)) {
                System.out.println(Arrays.toString(filmors.get(name)));
                cnt++;
                break;
            }
        }
            if (cnt == 0)
            {
                System.out.println("해당 배우가 존재하지 않습니다.");
            }

    }
}






