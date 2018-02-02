package builder;

import builder.caller.LocalVisitor;
import builder.caller.OtherVisitor;
import builder.work.NBABuilder;
import builder.work.Builder;

/**
 * Creator: Yao
 * Date:    2018/1/24
 * For:
 * Other:
 */
public class Main {

    public static void main(String[] args) {

        Builder builder = new NBABuilder();
        new LocalVisitor(builder).show();
        new OtherVisitor(builder).show();
    }
}
