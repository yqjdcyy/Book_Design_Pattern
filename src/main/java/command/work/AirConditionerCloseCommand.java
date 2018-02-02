package command.work;

import command.vo.AirConditioner;

/**
 * Creator: Yao
 * Date:    2017/12/26
 * For:
 * Other:
 */
public class AirConditionerCloseCommand implements Command {

    private AirConditioner airConditioner;

    public AirConditionerCloseCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.close();
    }
}
