package proxy.virtual.factory;

import proxy.virtual.proxy.ClientInvocationHandler;
import proxy.virtual.proxy.OwnerInvocationHandler;
import proxy.virtual.vo.PersonBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Creator: Yao
 * Date:    2018/1/19
 * For:
 * Other:
 */
public class PersonBeanFactory {

    public static PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                (InvocationHandler) new OwnerInvocationHandler(person)
        );
    }

    public static PersonBean getClientProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                (InvocationHandler) new ClientInvocationHandler(person)
        );
    }
}
