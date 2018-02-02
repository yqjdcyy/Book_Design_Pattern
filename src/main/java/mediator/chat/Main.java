package mediator.chat;

/**
 * Creator: Yao
 * Date:    2018/1/31
 * For:
 * Other:
 */
public class Main {

    public static void main(String[] args) {

        User robert = new User("robert");
        User john = new User("john");

        robert.sendMessage("Hi, John!");
        john.sendMessage("Hi, Robert!");
        john.sendMessage("Where are you from?");
    }
}
