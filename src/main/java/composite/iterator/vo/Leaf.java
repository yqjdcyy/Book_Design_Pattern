package composite.iterator.vo;

/**
 * Creator: Yao
 * Date:    2018/1/5
 * For:
 * Other:
 */
public class Leaf extends Component {

    private String name;
    private Double price;

    public Leaf(String name, Double price) {
        this.name = name;
        this.price = price;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.printf("\tLeaf[%s,%s]\n", name, price);
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
