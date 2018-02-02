package chain.work;

import chain.vo.LeaveRequest;
import chain.vo.Request;

/**
 * Creator: Yao
 * Date:    2018/1/28
 * For:
 * Other:
 */
public class Manager extends Handler {

    public Manager(Handler next) {
        super(next);
    }

    @Override
    public void handle(Request request) {

        if (request instanceof LeaveRequest) {
            System.out.printf("Manager handle [%s]\n", request.getName());
            return;
        }

        if (null != next) {
            next.handle(request);
        }
    }
}
