package proxy.virtual.proxy;

import proxy.virtual.vo.PersonBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Creator: Yao
 * Date:    2018/1/19
 * For:
 * Other:
 */
public class ClientInvocationHandler implements InvocationHandler {

    PersonBean person;

    public ClientInvocationHandler(PersonBean person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {


        if (method.getName().equalsIgnoreCase("setHotOrNotRating")) {
            try {
                return method.invoke(person, args);
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        } else {
            throw new IllegalAccessException();
        }

        return null;
    }
}
