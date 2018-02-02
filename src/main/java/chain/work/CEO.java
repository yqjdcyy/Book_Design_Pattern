package chain.work;

import chain.vo.FinanceRequest;
import chain.vo.Request;

/**
 * Creator: Yao
 * Date:    2018/1/28
 * For:
 * Other:
 */
public class CEO extends Handler {


    public CEO(Handler next) {
        super(next);
    }

    @Override
    public void handle(Request request) {

        if (request instanceof FinanceRequest) {
            System.out.printf("CEO handle [%s]\n", request.getName());
            return;
        }

        if (null != next)
            next.handle(request);
    }
}
