package proxy.virtual;

import proxy.virtual.factory.PersonBeanFactory;
import proxy.virtual.vo.PersonBean;
import proxy.virtual.vo.PersonBeanImpl;

/**
 * Creator: Yao
 * Date:    2018/1/19
 * For:
 * Other:
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
