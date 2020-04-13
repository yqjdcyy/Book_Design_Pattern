package strategy.basic.object;

import strategy.basic.behavior.IFlyBehavior;
import strategy.basic.behavior.IQuackBehavior;

/**
 * Creator: Yao
 * Date:    2017/12/21
 * For:
 * Other:
 */
public abstract class Duck {

    protected IQuackBehavior quackBehavior;
    protected IFlyBehavior flyBehavior;

    abstract void display();

    public void quack() {
        quackBehavior.quack();
    }

    public void fly() {
        flyBehavior.fly();
    }
}
