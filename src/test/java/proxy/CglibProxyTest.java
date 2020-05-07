package proxy;

import org.junit.jupiter.api.Test;
import proxy.cglib.PersonProxyFactory;
import proxy.cglib.PersonService;

/**
 * Cglib - Code Generation Library 实现版本
 * <p>
 * 编译时无相关的类，直到运行时，才动态生成子类的字节码并加载到 JVM
 * 底层使用字节码处理框架 ASM 封装实现，通过继承进行方法地重写
 * 无须提供接口，但必须有默认构建函数，且方法不能为 final 状态
 * <p>
 * Java[X]
 * Class[X]
 * Code[Y]
 * <p>
 *
 * @author qingju.yao
 * @date 2020/04/17
 */
class CglibProxyTest {

    @Test
    void getInstance() {

        final PersonService instance = PersonProxyFactory.getInstance();
        System.out.println(instance.getClass());
        instance.say();
    }
}