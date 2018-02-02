package composite.basic.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * Creator: Yao
 * Date:    2018/1/4
 * For:
 * Other:
 */
public class MenuComposite extends MenuComponent {

    private List<MenuComponent> list;
    private String name;

    public MenuComposite(String name) {
        this.name = name;
        list = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void add(MenuComponent component) {
        list.add(component);
    }

    @Override
    public void remove(MenuComponent component) {
        list.remove(component);
    }

    @Override
    public void get(int i) {
        list.get(i);
    }

    @Override
    public void print() {
        System.out.printf("Menu-%s\n", getName());
        for(MenuComponent p: list){
            p.print();
        }
    }
}
