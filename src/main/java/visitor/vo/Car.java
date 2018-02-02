package visitor.vo;

import visitor.work.Visitor;

import java.util.Arrays;
import java.util.List;

/**
 * Creator: Yao
 * Date:    2018/2/1
 * For:
 * Other:
 */
public class Car {

    private Engine engine;
    private Body body;
    private List<Wheel> wheels;

    public Car() {
        engine = new Engine();
        body = new Body();
        wheels = Arrays.asList(new Wheel("front left"), new Wheel("front right"), new Wheel("back left"), new Wheel("back right"));
    }


    public void accept(Visitor visitor) {
        visitor.visit(this);
        engine.accept(visitor);
        body.accept(visitor);
        for (Wheel p : wheels) {
            p.accept(visitor);
        }
    }
}
