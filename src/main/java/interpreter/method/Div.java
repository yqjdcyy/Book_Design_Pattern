package interpreter.method;

import interpreter.basic.Context;
import interpreter.basic.Expression;

/**
 * Creator: Yao
 * Date:    2018/1/31
 * For:
 * Other:
 */
public class Div implements Expression {

    private Expression left, right;

    public Div(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double interpret(Context context) {
        return left.interpret(context) / right.interpret(context);
    }
}
