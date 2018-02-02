package proxy.virtual.proxy;

import proxy.virtual.vo.PersonBean;

import java.lang.reflect.*;

/**
 * Creator: Yao
 * Date:    2018/1/19
 * For:
 * Other:
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
