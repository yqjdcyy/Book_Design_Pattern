package interpreter.vo;

import interpreter.basic.Context;
import interpreter.basic.Expression;

/**
 * Creator: Yao
 * Date:    2018/1/31
 * For:
 * Other:
 */
public class Constant implements Expression {

    private double val;

    public Constant(double val) {
        this.val = val;
    }

    @Override
    public double interpret(Context context) {
        return this.val;
    }
}
