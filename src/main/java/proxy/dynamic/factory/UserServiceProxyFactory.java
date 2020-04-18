package proxy.dynamic.factory;

import proxy.dynamic.service.IUserService;
import proxy.dynamic.service.impl.UserServiceImpl;
import proxy.dynamic.service.impl.UserServiceProxy;

import java.lang.reflect.Proxy;

/**
 * 代理工厂
 *
 * @author qingju.yao
 * @date 2020/04/18
 */
public class UserServiceProxyFactory {

    public static IUserService getInstance() {

        return (IUserService) Proxy.newProxyInstance(
                UserServiceProxy.class.getClassLoader(),
                new Class[]{IUserService.class},
                new UserServiceProxy(new UserServiceImpl()));
    }
}
