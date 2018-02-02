package visitor.work;

import visitor.vo.Body;
import visitor.vo.Car;
import visitor.vo.Engine;
import visitor.vo.Wheel;

/**
 * Creator: Yao
 * Date:    2018/2/1
 * For:
 * Other:
 */
public interface Visitor {

    public void visit(Wheel wheel);
    public void visit(Engine wheel);
    public void visit(Body wheel);
    public void visit(Car wheel);
}
