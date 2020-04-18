package proxy.dynamic.service.impl;

import proxy.dynamic.service.IUserService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理类
 *
 * @author qingju.yao
 * @date 2020/04/18
 */
public class UserServiceProxy implements InvocationHandler {

    private final IUserService userService;

    public UserServiceProxy(IUserService userService) {
        this.userService = userService;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = null;

        System.out.println("start");
        try {
            result = method.invoke(userService, args);
        } catch (Exception e) {
            System.err.println(e);
        }
        System.out.println("end");

        return result;
    }
}
