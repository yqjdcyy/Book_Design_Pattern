package composite.basic.vo;

/**
 * Creator: Yao
 * Date:    2018/1/4
 * For:
 * Other:
 */
public class MenuLeaf extends MenuComponent {

    private String name;
    private String describe;
    private Double price;

    public MenuLeaf(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public MenuLeaf(String name, String describe, Double price) {
        this.name = name;
        this.describe = describe;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescribe() {
        return describe;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.printf("\tLeaf[%s-%s-%s]\n", name, describe, price);
    }
}
