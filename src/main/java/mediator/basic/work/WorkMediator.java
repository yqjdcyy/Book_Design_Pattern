package mediator.basic.work;

import mediator.basic.vo.Colleague;

import java.util.HashMap;
import java.util.Map;

/**
 * Creator: Yao
 * Date:    2018/1/31
 * For:
 * Other:
 */
public class WorkMediator implements Mediator {

    private Map<Integer, Colleague> map;

    public WorkMediator() {
        map = new HashMap<>();
    }


    @Override
    public void operation(int key, String msg) {

        if (map.containsKey(key)) {
            map.get(key).receive(msg);
        }
    }

    @Override
    public void register(int key, Colleague colleague) {

        map.put(key, colleague);
    }
}
