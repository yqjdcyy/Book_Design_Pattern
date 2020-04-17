package proxy.dynamic.vo;

/**
 * 用户模块
 *
 * @author qingju.yao
 * @date 2020/4/17
 */
public interface PersonBean {

    String getName();

    String getGender();

    int getHotOrNotRating();

    void setName(String name);

    void setGender(String gender);

    void setHotOrNotRating(int rating);
}
