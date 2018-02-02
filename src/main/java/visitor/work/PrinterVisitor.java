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
public class PrinterVisitor implements Visitor {
    @Override
    public void visit(Wheel wheel) {
        System.out.printf("look at %s wheel\n", wheel.getName());
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("look at engine");

    }

    @Override
    public void visit(Body body) {
        System.out.println("look at body");

    }

    @Override
    public void visit(Car car) {
        System.out.println("look at car");
    }
}
