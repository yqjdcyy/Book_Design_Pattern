package proxy.cglib;

import org.junit.jupiter.api.Test;

class PersonProxyFactoryTest {

    @Test
    void getInstance() {

        final PersonService instance = PersonProxyFactory.getInstance();
        System.out.println(instance.getClass());
        instance.say();
    }
}