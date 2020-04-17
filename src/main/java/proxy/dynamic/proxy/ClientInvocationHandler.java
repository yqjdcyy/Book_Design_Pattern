package proxy.dynamic.proxy;

import proxy.dynamic.vo.PersonBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 客户端代理
 *
 * @author qingju.yao
 * @date 2020/4/17
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
