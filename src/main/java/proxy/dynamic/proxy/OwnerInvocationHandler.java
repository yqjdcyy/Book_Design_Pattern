package proxy.dynamic.proxy;

import proxy.dynamic.vo.PersonBean;

import java.lang.reflect.*;

/**
 * 用户代理
 *
 * @author qingju.yao
 * @date 2020/4/17
 */
public class OwnerInvocationHandler implements java.lang.reflect.InvocationHandler {

    PersonBean person;

    public OwnerInvocationHandler(PersonBean person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {

        if (method.getName().equalsIgnoreCase("setHotOrNotRating")) {
            throw new IllegalAccessException();
        } else {
            try {
                return method.invoke(person, args);
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }

        return null;
    }
}
