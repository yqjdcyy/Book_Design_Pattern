package builder.caller;

import builder.work.Builder;

/**
 * Creator: Yao
 * Date:    2018/1/24
 * For:
 * Other:
 */
public class LocalVisitor implements Visitor {

    Builder builder;

    public LocalVisitor(Builder builder) {
        this.builder = builder;
    }


    @Override
    public void show() {
        System.out.println("Special plan for local visitor");
        builder.buildDay();
        builder.buildRestaurant();
        System.out.println();
    }
}
