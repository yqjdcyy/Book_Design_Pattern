package chain;

import chain.vo.FinanceRequest;
import chain.vo.LeaveRequest;
import chain.work.CEO;
import chain.work.Handler;
import chain.work.Manager;

/**
 * Creator: Yao
 * Date:    2018/1/28
 * For:
 * Other:
 */
public class Main {

    public static void main(String[] args) {
        Handler handler = new Manager(new CEO(null));
        handler.handle(new LeaveRequest("A want to leave"));
        handler.handle(new FinanceRequest("B want to buy something"));
    }
}
