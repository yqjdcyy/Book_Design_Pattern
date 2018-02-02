package interpreter.vo;

import interpreter.basic.Context;
import interpreter.basic.Expression;

/**
 * Creator: Yao
 * Date:    2018/1/31
 * For:
 * Other:
 */
public class Variable implements Expression {

    @Override
    public double interpret(Context context) {
        return context.lookupValue(this);
    }
}
