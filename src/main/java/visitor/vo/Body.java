package visitor.vo;

import visitor.work.Visitor;

/**
 * Creator: Yao
 * Date:    2018/2/1
 * For:
 * Other:
 */
public class Body {

    void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
