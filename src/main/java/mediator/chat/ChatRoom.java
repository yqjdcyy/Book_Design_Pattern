package mediator.chat;

import java.util.Date;

/**
 * Creator: Yao
 * Date:    2018/1/31
 * For:
 * Other:
 */
public class ChatRoom {

    public static void showMessage(User user, String message) {
        System.out.printf("%s\t[%s]:\t%s\n", new Date(), user.getName(), message);
    }
}
