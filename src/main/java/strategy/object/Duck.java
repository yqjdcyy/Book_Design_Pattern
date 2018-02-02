package strategy.object;

import strategy.behavior.IFlyBehavior;
import strategy.behavior.IQuackBehavior;

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
