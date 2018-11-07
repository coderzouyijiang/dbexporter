import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ABC {

    public static void main(String[] args) {
        Random random = new Random();
        String phone = "188" + (random.nextInt(90000000) + 10000000);

        Map<String, Object> vars = new HashMap<>();

//        String inviteSms = vars.get("inviteSms");
//        String content = inviteSms.get("content");
//        int start = content.indexOf("密码：");
//        String pwd = content.substring(start + 3, start + 9);
//
//        System
    }
}
