package builder.work;

/**
 * Creator: Yao
 * Date:    2018/1/24
 * For:
 * Other:
 */
public class NBABuilder implements Builder {
    @Override
    public void buildHotel() {
        System.out.println("NBA.plan for hotel");
    }

    @Override
    public void buildRestaurant() {
        System.out.println("NBA.plan for restaurant");

    }

    @Override
    public void buildDay() {
        System.out.println("NBA.plan for dayy");
    }

    @Override
    public void buildHoliday() {
        System.out.println("NBA.plan for holiday");
    }

    @Override
    public void buildEvent() {
        System.out.println("NBA.plan for event");
    }
}
