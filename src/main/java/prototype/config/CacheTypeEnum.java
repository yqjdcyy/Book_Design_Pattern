package prototype.config;

/**
 * Creator: Yao
 * Date:    2018/2/1
 * For:
 * Other:
 */
public enum CacheTypeEnum {

    Circle("circle"),
    Rectangle("rectangle"),
    Square("square");

    private String type;

    CacheTypeEnum(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
