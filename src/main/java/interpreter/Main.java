package interpreter;

import interpreter.basic.Context;
import interpreter.basic.Expression;
import interpreter.method.Add;
import interpreter.method.Div;
import interpreter.method.Mul;
import interpreter.method.Sub;
import interpreter.vo.Constant;
import interpreter.vo.Variable;

/**
 * Creator: Yao
 * Date:    2018/1/31
 * For:
 * Other:
 */
public class Main {

    public static void main(String[] args) {

        // (x* y)/ (x- y+ 100)
        Context context = new Context();
        Variable x = new Variable();
        Variable y = new Variable();
        Constant c = new Constant(10);

        context.addValue(x, 200);
        context.addValue(y, 3);

        Expression expression = new Div(new Mul(x, y), new Add(new Sub(x, y), c));
        System.out.println(expression.interpret(context));
    }
}
