package visitor.vo;

import visitor.work.Visitor;

/**
 * Creator: Yao
 * Date:    2018/2/1
 * For:
 * Other:
 */
public class Wheel {

    private String name;

    public Wheel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
