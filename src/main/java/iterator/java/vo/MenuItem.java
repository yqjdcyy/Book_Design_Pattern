package iterator.java.vo;

/**
 * Creator: Yao
 * Date:    2018/1/3
 * For:
 * Other:
 */
public class MenuItem {

    private String name;
    private String describe;
    private Double price;

    public MenuItem(String name, String describe, Double price) {
        this.name = name;
        this.describe = describe;
        this.price = price;
    }

    public MenuItem() {
    }

    public MenuItem(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", describe='" + describe + '\'' +
                ", price=" + price +
                '}';
    }
}
