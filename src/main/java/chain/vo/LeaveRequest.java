package chain.vo;

/**
 * Creator: Yao
 * Date:    2018/1/28
 * For:
 * Other:
 */
public class LeaveRequest implements Request {

    private String name;

    public LeaveRequest(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
