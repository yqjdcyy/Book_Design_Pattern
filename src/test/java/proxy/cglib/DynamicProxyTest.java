package proxy.cglib;

import org.junit.jupiter.api.Test;
import proxy.dynamic.factory.UserServiceProxyFactory;
import proxy.dynamic.service.IUserService;
import sun.misc.ProxyGenerator;

import java.io.*;
import java.nio.file.Paths;


/**
 * Java.InvocationHandler 实现版本
 * <p>
 * 编译时无相关的类，直到运行时，才动态生成类字节码并加载到 JVM
 * 必须提供接口
 * <p>
 * Java[X]
 * Class[X]
 * Code[Y]
 * <p>
 * TODO YQJ:实际实现方案： https://blog.csdn.net/u011784767/article/details/78281384
 * implement interface & reflect
 *
 * @author qingju.yao
 * @date 2020/4/17
 */
public class DynamicProxyTest {

    @Test
    public void getInstance() {

        UserServiceProxyFactory.getInstance().say();
    }

    @Test
    public void printProxyClass() throws IOException {

        final byte[] bytes = ProxyGenerator.generateProxyClass("IUserService$Proxy", new Class[]{IUserService.class});
        final File target = Paths.get("target", "IUserService$Proxy.class").toFile();
        try (FileOutputStream fos = new FileOutputStream(target)) {

            fos.write(bytes);
            fos.flush();
            System.out.println("Proxy.content flush to " + target.getAbsolutePath());
        }
    }
}
