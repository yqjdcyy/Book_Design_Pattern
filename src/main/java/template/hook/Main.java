package template.hook;

import template.hook.vo.Coffee;
import template.hook.vo.CoffeeHook;
import template.hook.vo.Tea;

/**
 * Creator: Yao
 * Date:    2017/12/29
 * For:
 * Other:
 */
public class Main {

    public static void main(String[] args) {

        new Coffee().doIt();
        new CoffeeHook().doIt();
        new Tea().doIt();
    }
}
