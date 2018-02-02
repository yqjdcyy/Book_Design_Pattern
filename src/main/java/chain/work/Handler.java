package chain.work;

import chain.vo.Request;

/**
 * Creator: Yao
 * Date:    2018/1/28
 * For:
 * Other:
 */
public abstract class Handler {

    protected Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public abstract void handle(Request request);
}
