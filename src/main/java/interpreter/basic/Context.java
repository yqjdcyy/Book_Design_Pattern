package interpreter.basic;

import interpreter.vo.Variable;

import java.util.HashMap;
import java.util.Map;

/**
 * Creator: Yao
 * Date:    2018/1/31
 * For:
 * Other:
 */
public class Context {

    private Map map = new HashMap();

    public void addValue(Variable x, double y) {
        map.put(x, y);
    }

    public double lookupValue(Variable x) {
        return (double) map.get(x);
    }
}
