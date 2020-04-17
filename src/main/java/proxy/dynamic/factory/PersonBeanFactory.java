package proxy.dynamic.factory;

import proxy.dynamic.proxy.ClientInvocationHandler;
import proxy.dynamic.proxy.OwnerInvocationHandler;
import proxy.dynamic.vo.PersonBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 代理类生成
 *
 * @author qingju.yao
 * @date 2020/4/17
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
