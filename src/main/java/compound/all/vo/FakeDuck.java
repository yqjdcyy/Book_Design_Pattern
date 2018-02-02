package compound.all.vo;

/**
 * Creator: Yao
 * Date:    2018/1/19
 * For:
 * Other:
 */
public class FakeDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("quack.fake");
    }
}
