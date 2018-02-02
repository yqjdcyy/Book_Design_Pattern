package builder.caller;

import builder.work.Builder;

/**
 * Creator: Yao
 * Date:    2018/1/24
 * For:
 * Other:
 */
public class OtherVisitor implements Visitor {

    Builder builder;

    public OtherVisitor(Builder builder) {
        this.builder = builder;
    }

    @Override
    public void show() {
        System.out.println("Special plan for other visitor");
        builder.buildDay();
        builder.buildHotel();
        builder.buildRestaurant();
        System.out.println();
    }
}
