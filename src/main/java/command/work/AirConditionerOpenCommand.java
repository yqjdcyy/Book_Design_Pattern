package command.work;

import command.vo.AirConditioner;

/**
 * Creator: Yao
 * Date:    2017/12/26
 * For:
 * Other:
 */
public class AirConditionerOpenCommand implements Command {

    private AirConditioner airConditioner;

    public AirConditionerOpenCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.open();
    }
}
