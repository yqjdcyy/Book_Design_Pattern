package proxy.dynamic;

import proxy.dynamic.factory.PersonBeanFactory;
import proxy.dynamic.vo.PersonBean;
import proxy.dynamic.vo.PersonBeanImpl;

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
public class Main {

    public static void main(String[] args) {

        PersonBean person = new PersonBeanImpl();

        PersonBean proxy = PersonBeanFactory.getClientProxy(person);
        try {
            proxy.getGender();
        } catch (Exception e) {
            System.out.println("Not auth for client.getGender");
        }
        proxy.setHotOrNotRating(1);

        proxy = PersonBeanFactory.getOwnerProxy(person);
        proxy.getGender();
        try {
            proxy.setHotOrNotRating(2);
        } catch (Exception e) {
            System.out.println("Not auth for Owner.setHotOrNotRating");
        }
    }
}
