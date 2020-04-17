package proxy.dynamic.vo;

/**
 * 用户模块实现类
 *
 * @author qingju.yao
 * @date 2020/4/17
 */
public class PersonBeanImpl implements PersonBean {

    private String name;
    private String gender;
    private int rating;
    private int ratingCount = 0;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public int getHotOrNotRating() {
        return 0 == ratingCount ? 0 : rating / ratingCount;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void setHotOrNotRating(int rating) {

        this.rating += rating;
        ratingCount++;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getRatingCount() {
        return ratingCount;
    }

    public void setRatingCount(int ratingCount) {
        this.ratingCount = ratingCount;
    }
}
