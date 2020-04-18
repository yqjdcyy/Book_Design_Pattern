package proxy.dynamic.service.impl;

import proxy.dynamic.service.IUserService;

/**
 * 实现类
 *
 * @author qingju.yao
 * @date 2020/04/18
 */
public class UserServiceImpl implements IUserService {
    @Override
    public void say() {
        System.out.println(UserServiceImpl.class.getSimpleName());
    }
}
